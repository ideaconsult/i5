package net.idea.i5._5.ambit2.sections.ASPECT_RATIO_SHAPE_SECTION;

import javax.xml.bind.JAXBElement;

import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord.ScientificPart.ASPECTRATIOSHAPE.REFERENCE.Set;


public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord,Params,Params> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE);
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
			return unmarshalled.getScientificPart().getASPECTRATIOSHAPE().getTESTMATEQSUBMSUB().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
			
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getASPECTRATIOSHAPE().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getASPECTRATIOSHAPE().getREFERENCE().getSet()) {
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
		if (sciPart.getASPECTRATIOSHAPE()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
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
		
		if (sciPart.getASPECTRATIOSHAPE().getGUIDELINE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord.ScientificPart.ASPECTRATIOSHAPE.GUIDELINE.Set set : sciPart.getASPECTRATIOSHAPE().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {		
			}
			
		if (sciPart.getASPECTRATIOSHAPE().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getASPECTRATIOSHAPE().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		try {
			papp.getParameters().put(I5CONSTANTS.cTypeMethod,
					sciPart.getASPECTRATIOSHAPE().getMETHOD()==null?null:
					sciPart.getASPECTRATIOSHAPE().getMETHOD().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cTypeMethod,null);
		}

		try {
			papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS,
				sciPart.getASPECTRATIOSHAPE().getMETHODSDETAILSDATAEVAL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS,null);
		}
		/*
		papp.getParameters().put(cTestMaterialForm,
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM()==null?null:
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		*/

		try {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,sciPart.getASPECTRATIOSHAPE().getSAMPLING().getSet().getFREETEXTBELOW().getFREETEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,null);			
		}
		try {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,sciPart.getASPECTRATIOSHAPE().getDATAGATHERINGINSTRUMENTS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,null);
		}
				
		
		if (sciPart.getASPECTRATIOSHAPE().getSHAPEDESCRIPTION()!=null) {
			parseElement(sciPart.getASPECTRATIOSHAPE().getSHAPEDESCRIPTION(),papp);
		}
		if (sciPart.getASPECTRATIOSHAPE().getASPECTRATIO()!=null) {
			parseElement(sciPart.getASPECTRATIOSHAPE().getASPECTRATIO(),papp);
		}
		try {
			papp.setInterpretationResult(sciPart.getASPECTRATIOSHAPE().getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);			
		}
		return record;
	}
	
	protected void parseElement(JAXBElement<Object> element,ProtocolApplication<Protocol,Params,String,Params,String> papp) {
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
					EffectRecord<String, Params, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint(endpoint);
					Params xyz = new Params(null);xyz.setLoQualifier("  ");
					effect.getConditions().put(EFFECT.PRECISION_X_LOQUALIFIER.getTag(), xyz);
					xyz = new Params(null);xyz.setLoQualifier("  ");
					effect.getConditions().put(EFFECT.PRECISION_Y_LOQUALIFIER.getTag(), xyz);
					xyz = new Params(null);xyz.setLoQualifier("  ");
					effect.getConditions().put(EFFECT.PRECISION_Z_LOQUALIFIER.getTag(), xyz);
					papp.addEffect(effect);
					NodeList r = set.getChildNodes();
					for (int j=0; j < r.getLength(); j++) try {
						EFFECT field = EFFECT.valueOf(r.item(j).getLocalName());
						field.setValue(effect,r.item(j).getChildNodes());
					} catch (Exception x) {
						
					}
				} else {
					//don't know what's this
				}
			}
		}

	}
	enum P {
		SHAPE_DESCRIPTIVE_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.setLoValue(node.getTextContent());
				params.setLoQualifier(" ");
			}	
		},
		SHAPE_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
		},
		SHAPE_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				String q = node.getTextContent();
				effect.setUnit("NOT_SPECIFIED".equals(q)?null:q);
			}	
		},
		STD_DEV_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setLoValue(node.getTextContent());
				}
			}				
		},
		STD_DEV_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.setUnits(node.getTextContent());
			}			
		},
		X_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.setLoQualifier(node.getTextContent());
			}				
		},
		X_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setLoValue(node.getTextContent());
				}
			}				
		},
		X_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.setUpQualifier(node.getTextContent());
			}							
		},
		X_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setUpValue(node.getTextContent());
				}
			}				
		},
		X_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setLoValue(node.getTextContent());
				}
			}
			@Override
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}
		},
		//y
		Y_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.setLoQualifier(node.getTextContent());
			}				
		},
		Y_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setLoValue(node.getTextContent());
				}
			}				
		},
		Y_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.setUpQualifier(node.getTextContent());
			}							
		},
		Y_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setUpValue(node.getTextContent());
				}
			}				
		},
		Y_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setLoValue(node.getTextContent());
				}
			}
			@Override
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}
		},
		//z
		Z_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.setLoQualifier(node.getTextContent());
			}				
		},
		Z_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setLoValue(node.getTextContent());
				}
			}				
		},
		Z_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.setUpQualifier(node.getTextContent());
			}							
		},
		Z_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setUpValue(node.getTextContent());
				}
			}				
		},
		Z_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setLoValue(node.getTextContent());
				}
			}
			@Override
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
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
		//i5:ZETA_POTENTIAL_TABLE
		PHRASEOTHER_SHAPE_DESCRIPTIVE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return "SHAPE_DESCRIPTIVE";
			}
		},
		SHAPE_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint(I5CONSTANTS.eSHAPE);
				useChildrenNodesEffect(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.eSHAPE;
			}
		},
		PHRASEOTHER_SHAPE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint(I5CONSTANTS.eSHAPE);
				useChildrenNodesEffect(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.eSHAPE;
			}			
		},
		VALUEUNIT_STD_DEV_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}			
		},
		PRECISION_X_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint(I5CONSTANTS.eASPECT_RATIO);
				useChildrenNodesParams(effect, nodes);
			}	
			public String getTag() {
				return I5CONSTANTS.eASPECT_RATIO_X;
			}			
		},
		PRECISION_Y_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint(I5CONSTANTS.eASPECT_RATIO);
				useChildrenNodesParams(effect, nodes);		
			}	
			public String getTag() {
				return I5CONSTANTS.eASPECT_RATIO_Y;
			}			
		},
		PRECISION_Z_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint(I5CONSTANTS.eASPECT_RATIO);
				useChildrenNodesParams(effect, nodes);
			}	
			public String getTag() {
				return I5CONSTANTS.eASPECT_RATIO_Z;
			}			
		},
		REMARKS {
			@Override
			public void setValue(EffectRecord<String,Params,String> effect,NodeList nodes) {
				if (nodes!=null)
					for (int i=0; i < nodes.getLength(); i++) {
						effect.getConditions().put(getTag(),nodes.item(i).getTextContent());
					}
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.Remark;
			}
		};
		public String getTag() {
			return name();
		}
		public void setValue(EffectRecord<String,Params,String> effect,NodeList nodes) {
			
		}
		public void useChildrenNodesParams(EffectRecord<String, Params, String> effect,
				NodeList nodes) {
			if (nodes!=null) {
				Params params = new Params();
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
