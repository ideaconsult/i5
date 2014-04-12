package net.idea.i5._5.ambit2.sections.SURFACE_CHEMISTRY_SECTION;

import javax.xml.bind.JAXBElement;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord.ScientificPart.SURFACECHEMISTRY.REFERENCE.Set;


public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord> {
	
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
					if (set.getREFERENCEAUTHOR()!=null && set.getREFERENCEAUTHOR().getREFERENCEAUTHOR()!=null)
						papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
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
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled));
		record.addtMeasurement(papp);
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		parseReference(unmarshalled, papp);
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getSURFACECHEMISTRY().getGUIDELINE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SURFACE_CHEMISTRY_SECTION.EndpointStudyRecord.ScientificPart.SURFACECHEMISTRY.GUIDELINE.Set set : sciPart.getSURFACECHEMISTRY().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
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
			papp.getParameters().put(cTypeMethod,
					sciPart.getSURFACECHEMISTRY().getMETHOD()==null?null:
					sciPart.getSURFACECHEMISTRY().getMETHOD().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue());
		} catch (Exception x) {
			papp.getParameters().put(cTypeMethod,null);
		}
		
		try {
			papp.getParameters().put("Method details",
				sciPart.getSURFACECHEMISTRY().getMETHODSDETAILSDATAEVAL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put("Method details",null);
		}
		/*
		papp.getParameters().put(cTestMaterialForm,
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM()==null?null:
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		*/
		try {
			papp.getParameters().put("SAMPLING",sciPart.getSURFACECHEMISTRY().getSAMPLING().getSet().getFREETEXTBELOW().getFREETEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put("SAMPLING",null);
		}
		try {
			papp.getParameters().put("DATA_GATHERING_INSTRUMENTS",sciPart.getSURFACECHEMISTRY().getDATAGATHERINGINSTRUMENTS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put("DATA_GATHERING_INSTRUMENTS",null);
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
	
	protected void parseElement(JAXBElement<Object> element,ProtocolApplication<Protocol,Params,String,Params,String> papp,CF cf_mode) {
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
					EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
					effect.setEndpoint(endpoint);
					effect.setConditions(new Params());
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
			public void setValue(EffectRecord<String, Params, String> effect,
					Params params, Node node) {
				params.put(AbstractStudyRecordConverter.loValue,node.getTextContent());
				params.put(AbstractStudyRecordConverter.loQualifier," ");
			}
			@Override
			public String getTag() {
				return "ELEMENT_OR_GROUP";
			}	
		},
		FUNCTIONAL_GROUP_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					Params params, Node node) {
				if (node.getTextContent()!=null) {
					params.put(AbstractStudyRecordConverter.loValue,node.getTextContent());
					params.put(AbstractStudyRecordConverter.loQualifier," ");
				}	
			}
			@Override
			public String getTag() {
				return "ELEMENT_OR_GROUP";
			}			
		},
		FUNCTIONAL_GROUP_NOLABEL {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					Params params, Node node) {
				if (node.getTextContent()!=null) {
					params.put(AbstractStudyRecordConverter.loValue,node.getTextContent());
					params.put(AbstractStudyRecordConverter.loQualifier," ");
				}
			}
			@Override
			public String getTag() {
				return "ELEMENT_OR_GROUP";
			}
		},		
		FRACTION_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				String q = node.getTextContent();
				effect.setLoQualifier("NOT_SPECIFIED".equals(q)?null:q);				
			}	
		},
		FRACTION_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
		},
		FRACTION_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				String q = node.getTextContent();
				effect.setUpQualifier("NOT_SPECIFIED".equals(q)?null:q);
			}	
		},
		FRACTION_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {}
			}				
		},
		STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(loValue,node.getTextContent());	
				}
			}		
			public String getTag() {
				return rSTD_DEV;
			}
		},
		FUNCT_GROUP_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(loValue,node.getTextContent());	
				}
			}		
			public String getTag() {
				return rSTD_DEV;
			}
		}
		;
		public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
		}
		public String getTag() {
			return name();
		}
	}
	enum EFFECT {
		//ATOMIC_COMPOSITION_TABLE
		ELEMENT {
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes,CF cf_mode) {
				Params params = (Params)effect.getConditions().get("TYPE");
				if (params == null) {
					params = new Params();
					effect.getConditions().put("TYPE",params);
				}
				params.put(loValue,"COATING");params.put(loQualifier,"  ");
				
				params = (Params)effect.getConditions().get("DESCRIPTION");
				if (params == null) {
					params = new Params();
					effect.getConditions().put("DESCRIPTION",params);
				}
				params.put(loValue,cf_mode.coatingType);params.put(loQualifier,"  ");
				
				params = (Params)effect.getConditions().get("COATING_DESCRIPTION");
				if (params == null) {
					params = new Params();
					effect.getConditions().put("COATING_DESCRIPTION",params);
				}
				params.put(loValue,cf_mode.coatingDesc);	params.put(loQualifier,"  ");			
				
				effect.setEndpoint("ATOMIC COMPOSITION");
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return "ELEMENT_OR_GROUP";
			}
		},
		PRECISION_FRACTION_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes,CF cf_mode) {
				useChildrenNodesEffect(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return "ATOMIC_COMPOSITION";
			}
		},
		STD_DEVI_VALUE  {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes,CF cf_mode) {
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return rSTD_DEV;
			}				
		},
		FUNCTIONAL_GROUP {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes,CF cf_mode) {
				Params params = (Params)effect.getConditions().get("TYPE");
				if (params == null) {
					params = new Params();
					effect.getConditions().put("TYPE",params);
				}
				params.put(loValue,"FUNCTIONALIZATION");params.put(loQualifier,"  ");
				
				params = (Params)effect.getConditions().get("DESCRIPTION");
				if (params == null) {
					params = new Params();
					effect.getConditions().put("DESCRIPTION",params);
				}
				params.put(loValue,cf_mode.functionalisationtype);params.put(loQualifier,"  ");
						
				effect.setEndpoint("FUNCTIONAL GROUP");
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return "ELEMENT_OR_GROUP";
			}
		},
		FUNCTIONAL_GROUP_NOLABEL {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes,CF cf_mode) {
				Params params = (Params)effect.getConditions().get("TYPE");
				if (params == null) {
					params = new Params();
					effect.getConditions().put("TYPE",params);
				}
				params.put(loValue,"FUNCTIONALIZATION");params.put(loQualifier,"  ");
				
				params = (Params)effect.getConditions().get("DESCRIPTION");
				if (params == null) {
					params = new Params();
					effect.getConditions().put("DESCRIPTION",params);
				}
				params.put(loValue,cf_mode.functionalisationtype);params.put(loQualifier,"  ");
				
				effect.setEndpoint("FUNCTIONAL GROUP");
				useChildrenNodesParams(effect, nodes);	
			}			
			@Override
			public String getTag() {
				return "ELEMENT_OR_GROUP";
			}			
		},
		FUNCT_GROUP_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes,CF cf_mode) {
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return rSTD_DEV;
			}				
		},
		REMARKS {
			@Override
			public void setValue(EffectRecord<String,Params,String> effect,NodeList nodes,CF cf_mode) {
				if (nodes!=null)
					for (int i=0; i < nodes.getLength(); i++) {
						effect.getConditions().put(name(),nodes.item(i).getTextContent());
					}
			}			
		}		
		;
		public String getTag() {
			return name();
		}
		public void setValue(EffectRecord<String,Params,String> effect,NodeList nodes,CF cf_mode) {
			
		}
		public void useChildrenNodesParams(EffectRecord<String, Params, String> effect,
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
		public void useChildrenNodesEffect(EffectRecord<String, Params, String> effect,
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

