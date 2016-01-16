package net.idea.i5._5.ambit2.sections.AGGLOMERATION_AGGREGATION_SECTION;

import javax.xml.bind.JAXBElement;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.AGGLOMERATION_AGGREGATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.AGGLOMERATION_AGGREGATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.AGGLOMERATION_AGGREGATION_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.AGGLOMERATION_AGGREGATION_SECTION.EndpointStudyRecord.ScientificPart.AGGLOMERATIONAGGREGATION.REFERENCE.Set;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.AGGLOMERATION_AGGREGATION_SECTION.EndpointStudyRecord,IParams,IParams> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.AGGLOMERATION_AGGREGATION);
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
			return unmarshalled.getScientificPart().getAGGLOMERATIONAGGREGATION().getIDENTITYOFTESTMATERIAL().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
			
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getAGGLOMERATIONAGGREGATION().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getAGGLOMERATIONAGGREGATION().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.AGGLOMERATION_AGGREGATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getAGGLOMERATIONAGGREGATION()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,IParams,String,IParams,String> papp = createProtocolApplication(
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
		
		if (sciPart.getAGGLOMERATIONAGGREGATION().getGUIDELINE() != null)
			for (ScientificPart.AGGLOMERATIONAGGREGATION.GUIDELINE.Set set : sciPart.getAGGLOMERATIONAGGREGATION().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
		if (sciPart.getAGGLOMERATIONAGGREGATION().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getAGGLOMERATIONAGGREGATION().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		papp.getParameters().put(I5CONSTANTS.cTypeMethod,
					sciPart.getAGGLOMERATIONAGGREGATION().getMETHOD()==null?null:
					sciPart.getAGGLOMERATIONAGGREGATION().getMETHOD().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue());
		
		papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS,
				sciPart.getAGGLOMERATIONAGGREGATION().getMETHODSDETAILSDATAEVAL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		/*
		papp.getParameters().put(cTestMaterialForm,
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM()==null?null:
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		*/
		try {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,sciPart.getAGGLOMERATIONAGGREGATION().getSAMPLING().getSet().getFREETEXTBELOW().getFREETEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,null);
		}
		try {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,sciPart.getAGGLOMERATIONAGGREGATION().getDATAGATHERINGINSTRUMENTS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,null);
		}
				
		
		if (sciPart.getAGGLOMERATIONAGGREGATION().getAGGLOAGGRDIAM()!=null) {
			parseElement(sciPart.getAGGLOMERATIONAGGREGATION().getAGGLOAGGRDIAM(),papp);
		}
		if (sciPart.getAGGLOMERATIONAGGREGATION().getAGGLOAGGRSIZE()!=null) {
			parseElement(sciPart.getAGGLOMERATIONAGGREGATION().getAGGLOAGGRSIZE(),papp);
		}	
		if (sciPart.getAGGLOMERATIONAGGREGATION().getAGGLOAGGRSIZEDIST()!=null) {
			parseElement(sciPart.getAGGLOMERATIONAGGREGATION().getAGGLOAGGRSIZEDIST(),papp);
		}
		if (sciPart.getAGGLOMERATIONAGGREGATION().getAGGLOAGGREGATIONIDX()!=null) {
			parseElement(sciPart.getAGGLOMERATIONAGGREGATION().getAGGLOAGGREGATIONIDX(),papp);
		}
		try {
			papp.setInterpretationResult(sciPart.getAGGLOMERATIONAGGREGATION().getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);			
		}
		return record;
	}
	
	protected void parseElement(JAXBElement<Object> element,ProtocolApplication<Protocol,IParams,String,IParams,String> papp) {
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
					Params sn = new Params("");sn.setLoQualifier("");
					effect.getConditions().put(P.SEQ_NUM_value.getTag(),sn);
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
		//i5:AGGLO_AGGREGATION_IDX
		MEAN_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setLoQualifier(node.getTextContent());
			}	
		},
		MEAN_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
		},
		MEAN_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setUpQualifier(node.getTextContent());
			}	
		},
		MEAN_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {}
			}				
		},
		STD_DEV {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {params.setLoValue(node.getTextContent());}
			}	
		},
		//i5:PRECISION_MEAN_SIZE_LOQUALIFIER
		PERCENTILE_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.getConditions().put(I5CONSTANTS.cPERCENTILE,new Params(node.getTextContent()));
				effect.setEndpoint(effect.getEndpoint()+"."+node.getTextContent());
			}					
		},
		MEAN_SIZE_LOQUALIFIER,
		MEAN_SIZE_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setLoQualifier(node.getTextContent());
			}			
		},
		MEAN_SIZE_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}		
		},
		MEAN_SIZE_UPQUALIFIER,
		MEAN_SIZE_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setUpQualifier(node.getTextContent());
			}			
		},
		MEAN_SIZE_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}			
		},
		MEAN_SIZE_UNIT,
		MEAN_SIZE_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setUnit(node.getTextContent());
			}			
		},
		MEAN_SIZE_UNIT_TXT,		
		//i5:PRECISION_MEAN_DIAM_LOQUALIFIER
		MEAN_DIAM_LOQUALIFIER,
		MEAN_DIAM_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setLoQualifier(node.getTextContent());
			}			
		},
		MEAN_DIAM_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}		
		},
		MEAN_DIAM_UPQUALIFIER,
		MEAN_DIAM_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setUpQualifier(node.getTextContent());
			}			
		},
		MEAN_DIAM_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}			
		},
		MEAN_DIAM_UNIT,
		MEAN_DIAM_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setUnit(node.getTextContent());
			}			
		},
		MEAN_DIAM_UNIT_TXT,
		STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				params.setLoValue(node.getTextContent());
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}
		},
		//i5:VALUEUNIT_STD_DEVI_VALUE
		STD_DEVI_UNIT,
		STD_DEVI_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				params.setUnits(node.getTextContent());
			}			
		},
		STD_DEVI_UNIT_TXT {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				if ("other:".equals(params.getUnits()))
						params.setUnits(node.getTextContent());
			}
		},
		//i5:VALUEUNIT_STD_DEV_VALUE
		STD_DEV_VALUE {
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
		STD_DEV_UNIT,
		STD_DEV_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				params.setUnits(node.getTextContent());
			}			
		},
		STD_DEV_UNIT_TXT,	
		//i5:PRECISION_PH_LOQUALIFIER
		PH_LOQUALIFIER,
		PH_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				params.setLoQualifier(node.getTextContent());
			}			
		},
		PH_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				params.setLoValue(node.getTextContent());
			}
		},
		PH_UPQUALIFIER,
		PH_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				params.setUpQualifier(node.getTextContent());
			}						
		},
		PH_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				params.setUpValue(node.getTextContent());
			}
		},
		//i5:AGGLO_AGGR_SIZE_DIST
		//size is mean for i5:AGGLO_AGGR_SIZE_DIST
		SIZE_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setUnit(node.getTextContent());
			}			
		},
		SEQ_NUM_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				params.setLoValue(node.getTextContent());
				params.setLoQualifier("");
			}
			@Override
			public String getTag() {
				return I5CONSTANTS.cSEQ_NUM;
			}
		},
		SIZE_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setLoQualifier(node.getTextContent());
			}
		},
		SIZE_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				effect.setUpQualifier(node.getTextContent());
			}
		},				
		SIZE_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
			
		},
		SIZE_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
			
		},
		//this is stdev for i5:AGGLO_AGGR_SIZE_DIST
		DIST_LOQUALIFIER,
		DIST_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				params.setLoQualifier(node.getTextContent());
			}			
		},
		DIST_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					params.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(name(),node.getTextContent());	
				}
			}	
		},
		DIST_UPQUALIFIER,
		DIST_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				params.setUpQualifier( node.getTextContent());
			}
		},
		DIST_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					params.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.setUpValue(node.getTextContent());	
				}
			}				
		},
		DIST_UNIT,
		DIST_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				params.setUnits( node.getTextContent());
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
		//i5:AGGLO_AGGREGATION_IDX
		PRECISION_MEAN_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesEffect(effect, nodes);	
			}	
		},
		STD_DEV {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);	
			}	
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}			
		},
		//i5:AGGLO_AGGR_SIZE_DIST
		SEQ_NUM {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return I5CONSTANTS.cSEQ_NUM;
			}
		},
		PRECISION_SIZE_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesEffect(effect, nodes);	
			}			
			public String getTag() {
				return "Size";
			}
		},
		PRECISION_DIST_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);	
			}
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}
		},
		//i5:AGGLO_AGGR_DIAM
		PRECISION_MEAN_DIAM_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesEffect(effect, nodes);	
			}			
			public String getTag() {
				return "Diameter";
			}
		},
		VALUEUNIT_STD_DEVI_VALUE { 
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);
			}
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}			
		},		
		//i5:AGGLO_AGGR_SIZE
		PHRASEOTHER_PERCENTILE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);
			}
		},
		PRECISION_MEAN_SIZE_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesEffect(effect, nodes);
			}
			@Override
			public String getTag() {
				return "Size";
			}
		},
		VALUEUNIT_STD_DEV_VALUE { //now this is good Schema design, isn't it
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);
			}			
			@Override
				public String getTag() {
					return I5CONSTANTS.rSTD_DEV;
				}
		},		
		PRECISION_PH_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);
			}
			@Override
			public String getTag() {
				return I5CONSTANTS.pH;
			}
		},
		MEDIUM {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,NodeList nodes) {
				if (nodes!=null)
					for (int i=0; i < nodes.getLength(); i++) {
						effect.getConditions().put(name(),nodes.item(i).getTextContent());
					}
			}
		},
		REMARKS {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,NodeList nodes) {
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
		public void setValue(EffectRecord<String, IParams, String> effect,NodeList nodes) {
			
		}
		public void useChildrenNodesParams(EffectRecord<String, IParams, String> effect,
				NodeList nodes) {
			if (nodes!=null) {
				IParams params = new Params();
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
