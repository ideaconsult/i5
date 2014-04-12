package net.idea.i5._5.ambit2.sections.SPECIFIC_SURFACE_AREA_SECTION;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord.ScientificPart.SPECIFICSURFACEAREA.REFERENCE.Set;


public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.SPECIFIC_SURFACE_AREA);
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
			return unmarshalled.getScientificPart().getSPECIFICSURFACEAREA().getTESTMATEQSUBMSUB().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
			
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getSPECIFICSURFACEAREA().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getSPECIFICSURFACEAREA().getREFERENCE().getSet()) {
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
		if (sciPart.getSPECIFICSURFACEAREA()==null) return null;

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
		
		if (sciPart.getSPECIFICSURFACEAREA().getGUIDELINE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord.ScientificPart.SPECIFICSURFACEAREA.GUIDELINE.Set set : sciPart.getSPECIFICSURFACEAREA().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {}
		if (sciPart.getSPECIFICSURFACEAREA().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getSPECIFICSURFACEAREA().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		papp.getParameters().put(I5CONSTANTS.cTypeMethod,
					sciPart.getSPECIFICSURFACEAREA().getSSAMETHOD()==null?null:
					sciPart.getSPECIFICSURFACEAREA().getSSAMETHOD().getSet().getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		
		try {
			papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS,
				sciPart.getSPECIFICSURFACEAREA().getMETHODSDETAILSDATAEVAL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS,null);
		}
		try {
			papp.getParameters().put(I5CONSTANTS.pTESTMAT_FORM,
				sciPart.getSPECIFICSURFACEAREA().getTESTMATFORM()==null?null:
				sciPart.getSPECIFICSURFACEAREA().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pTESTMAT_FORM,null);
		}
		try {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,sciPart.getSPECIFICSURFACEAREA().getSAMPLING().getSet().getFREETEXTBELOW().getFREETEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,null);
		}
		try {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,sciPart.getSPECIFICSURFACEAREA().getDATAGATHERINGINSTRUMENTS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,null);
		}
				
		
		if (sciPart.getSPECIFICSURFACEAREA().getSPECIFICSURFACEAREA()!=null) {
			parseElement(sciPart.getSPECIFICSURFACEAREA().getSPECIFICSURFACEAREA(),papp);
		}
		try {
			papp.setInterpretationResult(sciPart.getSPECIFICSURFACEAREA().getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);			
		}
		return record;
	}
	
	protected void parseElement(JAXBElement<Object> element,ProtocolApplication<Protocol,Params,String,Params,String> papp) {
		String endpoint = null;
		if (element.getValue() instanceof NodeList) {
			NodeList nodes = (NodeList)element.getValue();
			endpoint = ((Node) element.getValue()).getLocalName();
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
		SPECIFIC_SURFACE_AREA_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				String q = node.getTextContent();
				effect.setLoQualifier("NOT_SPECIFIED".equals(q)?null:q);				
			}	
		},
		SPECIFIC_SURFACE_AREA_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
		},
		SPECIFIC_SURFACE_AREA_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				String q = node.getTextContent();
				effect.setUpQualifier("NOT_SPECIFIED".equals(q)?null:q);
			}	
		},
		SPECIFIC_SURFACE_AREA_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {}
			}				
		},
		SPECIFIC_SURFACE_AREA_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				String q = node.getTextContent();
				effect.setUnit("NOT_SPECIFIED".equals(q)?null:q);
			}				
		},
		SPECIFIC_SURFACE_AREA_UNIT_TXT {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				String q = node.getTextContent();
				if ("other:".equals(effect.getUnit())) effect.setUnit("NOT_SPECIFIED".equals(q)?null:q);
			}				
		},
		SSA_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(I5CONSTANTS.loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(I5CONSTANTS.loValue,node.getTextContent());	
				}
			}		
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}			
		},
		SSA_STD_DEVI_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(I5CONSTANTS.unit,node.getTextContent());
			}				
		},
		SSA_STD_DEVI_UNIT_TXT {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				if ("other:".equals(params.get(I5CONSTANTS.unit)))
						params.put(I5CONSTANTS.unit,node.getTextContent());
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
		//
		PRECISION_SPECIFIC_SURFACE_AREA_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				useChildrenNodesEffect(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return null;
			}
		},
		VALUEUNIT_SSA_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);	
			}	
			public String getTag() {
				return I5CONSTANTS.rSTD_DEV;
			}			
		},
		REMARKS {
			@Override
			public void setValue(EffectRecord<String,Params,String> effect,NodeList nodes) {
				if (nodes!=null)
					for (int i=0; i < nodes.getLength(); i++) {
						effect.getConditions().put(name(),nodes.item(i).getTextContent());
					}
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
