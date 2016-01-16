package net.idea.i5._5.ambit2.sections.SURFACE_CHEMISTRY_SECTION;

import javax.xml.bind.JAXBElement;

import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord.ScientificPart.SURFACECHEMISTRY.REFERENCE.Set;


public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord,IParams,IParams> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.SURFACE_CHEMISTRY);
	}
	@Override
	protected boolean hasScientificPart(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getScientificPart()!=null;
	}
	@Override
	protected boolean isDataWaiving(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getDataWaiving()!=null;
	}
	@Override
	protected String getTestMaterialIdentity(EndpointStudyRecord unmarshalled) {
		try {
			return unmarshalled.getScientificPart().getSURFACECHEMISTRY().getIDENTITYOFTESTMATERIAL().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
			
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getSURFACECHEMISTRY().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getSURFACECHEMISTRY().getREFERENCE().getSet()) {
				try {
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				} catch (Exception x) {papp.setReference(null);}				
				try {
					if (set.getREFERENCEYEAR()!=null) try {
						papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
					} catch (Exception x) {}
					try {
						papp.setReferenceOwner(set.getREFERENCECOMPANYID().getREFERENCECOMPANYID().getValue());
					} catch (Exception x) {	papp.setReferenceOwner("");}					
					isReferenceTypeAccepted(set.getPHRASEOTHERREFERENCETYPE()==null?null:set.getPHRASEOTHERREFERENCETYPE().getREFERENCETYPE());					
					return;
				} catch (QACriteriaException x) {
					qax = x;
					continue;
				} catch (Exception x) {
					qax = new QACriteriaException(x.getMessage());
					continue;
				}

			}	
		else qax = new QACriteriaException("Empty reference!");
		if (qax!=null) throw qax;
	}			
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getSURFACECHEMISTRY()==null) return null;

		record.clear();
		Experiment<IParams, IParams> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled));
		record.addMeasurement(papp);
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		parseReference(unmarshalled, papp);
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getSURFACECHEMISTRY().getGUIDELINE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord.ScientificPart.SURFACECHEMISTRY.GUIDELINE.Set set : sciPart.getSURFACECHEMISTRY().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
		if (sciPart.getSURFACECHEMISTRY().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getSURFACECHEMISTRY().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		
		try {	
			papp.getParameters().put(I5CONSTANTS.cTypeMethod,
					sciPart.getSURFACECHEMISTRY().getMETHOD()==null?null:
					sciPart.getSURFACECHEMISTRY().getMETHOD().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cTypeMethod,null);
		}
		
		try {
			papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS,
				sciPart.getSURFACECHEMISTRY().getMETHODSDETAILSDATAEVAL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS,null);
		}
		/*
		papp.getParameters().put(cTestMaterialForm,
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM()==null?null:
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		*/
		try {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,sciPart.getSURFACECHEMISTRY().getSAMPLING().getSet().getFREETEXTBELOW().getFREETEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,null);
		}
		try {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,sciPart.getSURFACECHEMISTRY().getDATAGATHERINGINSTRUMENTS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,null);
		}
				
		CF cf_mode = new CF();
		if (sciPart.getSURFACECHEMISTRY().getCOATING()!=null) {
			// organic/inorganic
			try {
				cf_mode.coatingType = sciPart.getSURFACECHEMISTRY().getCOATING().getSet().getCOATING().getCOATINGValue();
			} catch (Exception x) {}
			// free text description
			try {
				cf_mode.coatingDesc = sciPart.getSURFACECHEMISTRY().getCOATING().getSet().getCOATINGDESC().getCOATINGDESC().getValue();
			} catch (Exception x) {
			}
		}
		if (sciPart.getSURFACECHEMISTRY().getCOATINGFUNCTIONALIZATION()!=null) {
			papp.setInterpretationCriteria(sciPart.getSURFACECHEMISTRY().getCOATINGFUNCTIONALIZATION().getSet().getLISTBELOWSEL().getLISTBELOWSELValue());
		}

		if (sciPart.getSURFACECHEMISTRY().getFUNCTIONALISATION()!=null) {
			try {
				cf_mode.functionalisationtype = sciPart.getSURFACECHEMISTRY().getFUNCTIONALISATION().getSet().getFUNCTIONALISATIONDESC().getFUNCTIONALISATIONDESC().getValue();
			} catch (Exception x) {
			}
		}		
		if (sciPart.getSURFACECHEMISTRY().getATOMICCOMPOSITIONTABLE()!=null) {
			parseElement(sciPart.getSURFACECHEMISTRY().getATOMICCOMPOSITIONTABLE(),papp,cf_mode);
		}

		if (sciPart.getSURFACECHEMISTRY().getFUNCTIONALGROUPSTABLE()!=null) {
			parseElement(sciPart.getSURFACECHEMISTRY().getFUNCTIONALGROUPSTABLE(),papp,cf_mode);
		}	
		try {
			papp.setInterpretationResult(sciPart.getSURFACECHEMISTRY().getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);
		
		}
		return record;
	}
	
	protected void parseElement(JAXBElement<Object> element,ProtocolApplication<Protocol,IParams,String,IParams,String> papp,CF cf_mode) {
		String endpoint = null;
		if (element.getValue() instanceof Node) {
			endpoint = ((Node) element.getValue()).getLocalName();
			//parseNode((Node) element.getValue(),">");
		}
		if (element.getValue() instanceof NodeList) {
			NodeList nodes = (NodeList)element.getValue();
			//i5:set
			for (int i=0; i < nodes.getLength(); i++) {
				Node set = nodes.item(i);
				if ("set".equals(set.getLocalName())) {
					EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint(endpoint);
					papp.addEffect(effect);
					NodeList r = set.getChildNodes();
					for (int j=0; j < r.getLength(); j++) try {
						EFFECT field = EFFECT.valueOf(r.item(j).getLocalName());
						field.setValue(effect,r.item(j).getChildNodes(),cf_mode);
					} catch (Exception x) {
						
					}
				} else {
					//don't know what's this
				}
			}
		}

	}
	enum P {
		//
		ELEMENT {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				//params.setLoValue(node.getTextContent());
				//params.setLoQualifier(" ");
				effect.setTextValue(node.getTextContent());
			}
			@Override
			public String getTag() {
				return "ELEMENT_OR_GROUP";
			}	
		},
		FUNCTIONAL_GROUP_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				if (node.getTextContent()!=null) {
					//params.setLoValue(node.getTextContent());
					//params.setLoQualifier(" ");
					effect.setTextValue(node.getTextContent());
				}	
			}
			@Override
			public String getTag() {
				return "ELEMENT_OR_GROUP";
			}			
		},
		FUNCTIONAL_GROUP_NOLABEL {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				if (node.getTextContent()!=null) {
					//params.setLoValue(node.getTextContent());
					//params.setLoQualifier(" ");
					effect.setTextValue(node.getTextContent());
				}
			}
			@Override
			public String getTag() {
				return "ELEMENT_OR_GROUP";
			}
		},		
		FRACTION_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				String q = node.getTextContent();
				effect.setLoQualifier("NOT_SPECIFIED".equals(q)?null:q);				
			}	
		},
		FRACTION_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
		},
		FRACTION_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				String q = node.getTextContent();
				effect.setUpQualifier("NOT_SPECIFIED".equals(q)?null:q);
			}	
		},
		FRACTION_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {}
			}				
		},
		STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setLoValue(node.getTextContent());	
				}
			}		
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}
		},
		FUNCT_GROUP_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setLoValue(node.getTextContent());	
				}
			}		
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}
		}
		;
		public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
		}
		public String getTag() {
			return name();
		}
	}
	enum EFFECT {
		//ATOMIC_COMPOSITION_TABLE
		ELEMENT {
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes,CF cf_mode) {
				Params params = (Params)effect.getConditions().get(I5CONSTANTS.pTYPE);
				if (params == null) {
					params = new Params();
					effect.getConditions().put(I5CONSTANTS.pTYPE,params);
				}
				params.setLoValue(I5CONSTANTS.pCOATING);params.setLoQualifier("  ");
				
				params = (Params)effect.getConditions().get(I5CONSTANTS.pDESCRIPTION);
				if (params == null) {
					params = new Params();
					effect.getConditions().put(I5CONSTANTS.pDESCRIPTION,params);
				}
				params.setLoValue(cf_mode.coatingType);params.setLoQualifier("  ");
				
				params = (Params)effect.getConditions().get(I5CONSTANTS.pCOATING_DESCRIPTION);
				if (params == null) {
					params = new Params();
					effect.getConditions().put(I5CONSTANTS.pCOATING_DESCRIPTION,params);
				}
				params.setLoValue(cf_mode.coatingDesc);	params.setLoQualifier("  ");			
				
				effect.setEndpoint(I5CONSTANTS.eATOMIC_COMPOSITION);
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.pELEMENT_OR_GROUP;
			}
		},
		PRECISION_FRACTION_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes,CF cf_mode) {
				useChildrenNodesEffect(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.eATOMIC_COMPOSITION;
			}
		},
		STD_DEVI_VALUE  {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes,CF cf_mode) {
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}				
		},
		FUNCTIONAL_GROUP {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes,CF cf_mode) {
				Params params = (Params)effect.getConditions().get(I5CONSTANTS.pTYPE);
				if (params == null) {
					params = new Params();
					effect.getConditions().put(I5CONSTANTS.pTYPE,params);
				}
				params.setLoValue(I5CONSTANTS.pFUNCTIONALIZATION);params.setLoQualifier("  ");
				
				params = (Params)effect.getConditions().get(I5CONSTANTS.pDESCRIPTION);
				if (params == null) {
					params = new Params();
					effect.getConditions().put(I5CONSTANTS.pDESCRIPTION,params);
				}
				params.setLoValue(cf_mode.functionalisationtype);params.setLoQualifier("  ");
						
				effect.setEndpoint(I5CONSTANTS.eFUNCTIONAL_GROUP);
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.pELEMENT_OR_GROUP;
			}
		},
		FUNCTIONAL_GROUP_NOLABEL {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes,CF cf_mode) {
				Params params = (Params)effect.getConditions().get(I5CONSTANTS.pTYPE);
				if (params == null) {
					params = new Params();
					effect.getConditions().put(I5CONSTANTS.pTYPE,params);
				}
				params.setLoValue(I5CONSTANTS.pFUNCTIONALIZATION);params.setLoQualifier("  ");
				
				params = (Params)effect.getConditions().get(I5CONSTANTS.pDESCRIPTION);
				if (params == null) {
					params = new Params();
					effect.getConditions().put(I5CONSTANTS.pDESCRIPTION,params);
				}
				params.setLoValue(cf_mode.functionalisationtype);params.setLoQualifier("  ");
				
				effect.setEndpoint(I5CONSTANTS.eFUNCTIONAL_GROUP);
				useChildrenNodesParams(effect, nodes);	
			}			
			@Override
			public String getTag() {
				return I5CONSTANTS.pELEMENT_OR_GROUP;
			}			
		},
		FUNCT_GROUP_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes,CF cf_mode) {
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}				
		},
		REMARKS {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,NodeList nodes,CF cf_mode) {
				if (nodes!=null)
					for (int i=0; i < nodes.getLength(); i++) {
						effect.getConditions().put(getTag(),nodes.item(i).getTextContent());
					}
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.Remark;
			}
		}		
		;
		public String getTag() {
			return name();
		}
		public void setValue(EffectRecord<String, IParams, String> effect,NodeList nodes,CF cf_mode) {
			
		}
		public void useChildrenNodesParams(EffectRecord<String, IParams, String> effect,
				NodeList nodes) {
			if (nodes!=null) {
				Params params = (Params)effect.getConditions().get(getTag());
				if (params == null) params = new Params();
				effect.getConditions().put(getTag(),params);
				for (int i=0; i < nodes.getLength(); i++) try {
					P p = P.valueOf(nodes.item(i).getLocalName().replace(".","_"));
					p.setValue(effect,params, nodes.item(i));
				} catch (Exception x) {}
			}	
		}		
		public void useChildrenNodesEffect(EffectRecord<String, IParams, String> effect,
				NodeList nodes) {
			if (nodes!=null) {
				for (int i=0; i < nodes.getLength(); i++) try {
					P p = P.valueOf(nodes.item(i).getLocalName().replace(".","_"));
					p.setValue(effect,null, nodes.item(i));
				} catch (Exception x) {}
			}	
		}
	}
	
	
}
class CF {
	// neither/coating/functionalisation/both
	enum cf {
		neither,
		coating,
		functionalisation,
		both;
		
	}
	String  coatingType = null;
	String  coatingDesc = null;		
	String functionalisationtype  = null;
}

