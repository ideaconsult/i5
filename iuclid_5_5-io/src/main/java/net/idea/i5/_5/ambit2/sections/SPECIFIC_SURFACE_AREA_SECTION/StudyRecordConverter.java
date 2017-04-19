package net.idea.i5._5.ambit2.sections.SPECIFIC_SURFACE_AREA_SECTION;

import javax.xml.bind.JAXBElement;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord.ScientificPart.SPECIFICSURFACEAREA.REFERENCE.Set;
import net.idea.i5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;


public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord,IParams,IParams> {
	
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
		else if (!isReferenceTypeAccepted(null)) qax = new QACriteriaException("Empty reference!");
		if (qax!=null) throw qax;
	}			
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getSPECIFICSURFACEAREA()==null) return null;

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
		
		if (sciPart.getSPECIFICSURFACEAREA().getGUIDELINE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.SPECIFIC_SURFACE_AREA_SECTION.EndpointStudyRecord.ScientificPart.SPECIFICSURFACEAREA.GUIDELINE.Set set : sciPart.getSPECIFICSURFACEAREA().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
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
	
	protected void parseElement(JAXBElement<Object> element,ProtocolApplication<Protocol,IParams,String,IParams,String> papp) {
		String endpoint = null;
		if (element.getValue() instanceof NodeList) {
			NodeList nodes = (NodeList)element.getValue();
			endpoint = ((Node) element.getValue()).getLocalName();
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
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				String q = node.getTextContent();
				effect.setLoQualifier("NOT_SPECIFIED".equals(q)?null:q);				
			}	
		},
		SPECIFIC_SURFACE_AREA_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
		},
		SPECIFIC_SURFACE_AREA_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				String q = node.getTextContent();
				effect.setUpQualifier("NOT_SPECIFIED".equals(q)?null:q);
			}	
		},
		SPECIFIC_SURFACE_AREA_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {}
			}				
		},
		SPECIFIC_SURFACE_AREA_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				String q = node.getTextContent();
				effect.setUnit("NOT_SPECIFIED".equals(q)?null:q);
			}				
		},
		SPECIFIC_SURFACE_AREA_UNIT_TXT {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				String q = node.getTextContent();
				if ("other:".equals(effect.getUnit())) effect.setUnit("NOT_SPECIFIED".equals(q)?null:q);
			}				
		},
		SSA_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
				try {
					effect.setErrorValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
	
				}
			}		
			public String getTag() {
				return null;
			}			
		},
		SSA_STD_DEVI_UNIT_value,
		SSA_STD_DEVI_UNIT_TXT 
		;
		public void setValue(EffectRecord<String, IParams, String> effect,IParams params,Node node) {
		}
		public String getTag() {
			return name();
		}
	}
	enum EFFECT {
		//
		PRECISION_SPECIFIC_SURFACE_AREA_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, IParams, String> effect,
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
			public void setValue(EffectRecord<String, IParams, String> effect,
					NodeList nodes) {
				useChildrenNodesEffect(effect, nodes);	
			}	
			public String getTag() {
				return null;
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
