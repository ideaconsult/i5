package net.idea.i5._5.ambit2.sections.CRYSTALLITE_AND_GRAIN_SIZE_SECTION;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLITE_AND_GRAIN_SIZE_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLITE_AND_GRAIN_SIZE_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLITE_AND_GRAIN_SIZE_SECTION.EndpointStudyRecord.ScientificPart.CRYSTALLITEANDGRAINSIZE.GUIDELINE.Set;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLITE_AND_GRAIN_SIZE_SECTION.EndpointStudyRecord> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.CRYSTALLITE_AND_GRAIN_SIZE);
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
			return "Yes"; //??
			//unmarshalled.getScientificPart().getCRYSTALLITEANDGRAINSIZE().getTESTMAT().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected boolean isTestMaterialIdentityAccepted(String testMaterialCode)
			throws QACriteriaException {
		return true;
	}
			
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getCRYSTALLITEANDGRAINSIZE().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLITE_AND_GRAIN_SIZE_SECTION.EndpointStudyRecord.ScientificPart.CRYSTALLITEANDGRAINSIZE.REFERENCE.Set set : unmarshalled.getScientificPart().getCRYSTALLITEANDGRAINSIZE().getREFERENCE().getSet()) {
				try {
					if ((set.getREFERENCEAUTHOR()!=null) && set.getREFERENCEAUTHOR().getREFERENCEAUTHOR()!=null)
						papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
					if (set.getREFERENCEYEAR()!=null && set.getREFERENCEYEAR().getREFERENCEYEAR()!=null) try {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLITE_AND_GRAIN_SIZE_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getCRYSTALLITEANDGRAINSIZE()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				null);
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		parseReference(unmarshalled, papp);			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getCRYSTALLITEANDGRAINSIZE().getGUIDELINE() != null)
			for (Set set : sciPart.getCRYSTALLITEANDGRAINSIZE().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {}
		if (sciPart.getCRYSTALLITEANDGRAINSIZE().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getCRYSTALLITEANDGRAINSIZE().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		try {
			papp.getParameters().put(cTypeMethod,
					sciPart.getCRYSTALLITEANDGRAINSIZE().getMETHOD()==null?null:
					sciPart.getCRYSTALLITEANDGRAINSIZE().getMETHOD().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue());
		} catch (Exception x) {
			papp.getParameters().put(cTypeMethod,null);
		}
		try {
			papp.getParameters().put(pMETHODDETAILS,
				sciPart.getCRYSTALLITEANDGRAINSIZE().getMETHODSDETAILSDATAEVAL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(pMETHODDETAILS,null);
		}

		try {
			papp.getParameters().put(pSAMPLING,sciPart.getCRYSTALLITEANDGRAINSIZE().getSAMPLING().getSet().getFREETEXTBELOW().getFREETEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(pSAMPLING,null);
		}
		try {
			papp.getParameters().put(pDATA_GATHERING_INSTRUMENTS,sciPart.getCRYSTALLITEANDGRAINSIZE().getDATAGATHERINGINSTRUMENTS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(pDATA_GATHERING_INSTRUMENTS,null);
		}
				
		try {
			papp.getParameters().put(pMATERIAL_ISOTROPIC,
			sciPart.getCRYSTALLITEANDGRAINSIZE().getMATERIALISOTROPIC().getSet().getLISTBELOWSEL().getLISTBELOWSELValue());
		} catch (Exception x) {
			papp.getParameters().put(pMATERIAL_ISOTROPIC,null);
		}
		try {
			papp.getParameters().put(pTESTMAT_FORM,
			sciPart.getCRYSTALLITEANDGRAINSIZE().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		} catch (Exception x) {
			papp.getParameters().put(pTESTMAT_FORM,null);
		}
		if (sciPart.getCRYSTALLITEANDGRAINSIZE().getCRYSTALLITEANDGRAINSIZE()!=null) try {
			parseElement(sciPart.getCRYSTALLITEANDGRAINSIZE().getCRYSTALLITEANDGRAINSIZE(),papp);
		} catch (Exception x) {}
		try {
			papp.setInterpretationResult(sciPart.getCRYSTALLITEANDGRAINSIZE().getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);			
		}
		return record;
	}
	
	protected void parseElement(JAXBElement<Object> element,ProtocolApplication<Protocol,Params,String,Params,String> papp) {
		String endpoint = null;
		endpoint = "MEAN DIAMETER";
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
		MEAN_DIAM_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				effect.setLoQualifier(node.getTextContent());
			}	
		},
		MEAN_DIAM_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
		},
		MEAN_DIAM_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				effect.setUpQualifier(node.getTextContent());
			}	
		},
		MEAN_DIAM_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {}
			}				
		},
		STD_DEV {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {params.put(loValue,node.getTextContent());}
			}	
		},
		MEAN_DIAM_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				effect.setUnit(node.getTextContent());
			}			
		},
		STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(loValue,node.getTextContent());
			}	
			@Override
			public String getTag() {
				return "STD_DEV";
			}
		},
		STD_DEVI_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(AbstractStudyRecordConverter.unit,node.getTextContent());
			}			
		},
		STD_DEVI_UNIT_TXT 
		
		;
		public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
		}
		public String getTag() {
			return name();
		}
	}
	enum EFFECT {
		PRECISION_MEAN_DIAM_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				useChildrenNodesEffect(effect, nodes);	
			}	
		},
		VALUEUNIT_STD_DEVI_VALUE { 
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);
			}
			public String getTag() {
				return "STD_DEV";
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
