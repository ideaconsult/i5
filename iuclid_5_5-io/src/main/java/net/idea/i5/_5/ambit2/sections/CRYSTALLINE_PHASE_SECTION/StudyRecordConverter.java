package net.idea.i5._5.ambit2.sections.CRYSTALLINE_PHASE_SECTION;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLINE_PHASE_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLINE_PHASE_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLINE_PHASE_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLINE_PHASE_SECTION.EndpointStudyRecord.ScientificPart.CRYSTALLINEPHASE.GUIDELINE.Set;


public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLINE_PHASE_SECTION.EndpointStudyRecord,Params,Params> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.CRYSTALLINE_PHASE);
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
			return unmarshalled.getScientificPart().getCRYSTALLINEPHASE().getTESTMATEQSUBMSUB().getSet().getLISTBELOWSEL().getLISTBELOWSELValue();
		} catch (Exception x) {
			return null;	
		}
	}	
			
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getCRYSTALLINEPHASE().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.CRYSTALLINE_PHASE_SECTION.EndpointStudyRecord.ScientificPart.CRYSTALLINEPHASE.REFERENCE.Set set : unmarshalled.getScientificPart().getCRYSTALLINEPHASE().getREFERENCE().getSet()) {
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
		if (sciPart.getCRYSTALLINEPHASE()==null) return null;

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
		
		if (sciPart.getCRYSTALLINEPHASE().getGUIDELINE() != null)
			for (Set set : sciPart.getCRYSTALLINEPHASE().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
		if (sciPart.getCRYSTALLINEPHASE().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getCRYSTALLINEPHASE().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		papp.getParameters().put(I5CONSTANTS.cTypeMethod,
					sciPart.getCRYSTALLINEPHASE().getMETHOD()==null?null:
					sciPart.getCRYSTALLINEPHASE().getMETHOD().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue());
		
		try {
			papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS,
				sciPart.getCRYSTALLINEPHASE().getMETHODSDETAILSDATAEVAL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS,null);
		}
		try {
			papp.getParameters().put(I5CONSTANTS.pTESTMAT_FORM,
				sciPart.getCRYSTALLINEPHASE().getTESTMATFORM()==null?null:
				sciPart.getCRYSTALLINEPHASE().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORMNM22().getTESTMATFORMNM22Value());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pTESTMAT_FORM,null);
		}
		try {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,sciPart.getCRYSTALLINEPHASE().getSAMPLING().getSet().getFREETEXTBELOW().getFREETEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING,null);
		}
		try {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,sciPart.getCRYSTALLINEPHASE().getDATAGATHERINGINSTRUMENTS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,null);
		}
				
		
		if (sciPart.getCRYSTALLINEPHASE().getCRYSTALLINEPHASERES()!=null) try {
			parseElement(sciPart.getCRYSTALLINEPHASE().getCRYSTALLINEPHASERES(),papp,I5CONSTANTS.eCRYSTALLINE_PHASE);
		} catch (Exception x) {
			x.printStackTrace();
		}
	
		try {
			papp.setInterpretationResult(sciPart.getCRYSTALLINEPHASE().getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);			
		}
		return record;
	}
	
	protected void parseElement(JAXBElement<Object> element,ProtocolApplication<Protocol,Params,String,Params,String> papp,String endpoint) {
		if (element.getValue() instanceof NodeList) {
			NodeList nodes = (NodeList)element.getValue();
			//i5:set
			for (int i=0; i < nodes.getLength(); i++) {
				Node set = nodes.item(i);
				if ("set".equals(set.getLocalName())) {
					EffectRecord<String, Params, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint(endpoint);
					effect.getConditions().put(I5CONSTANTS.rCRYSTALLINE_PHASE_COMMON_NAME,new Params(null));
					effect.getConditions().put(I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTAL_SYSTEM,new Params(null));
					effect.getConditions().put(I5CONSTANTS.rCRYSTALLINE_PHASE_BRAVAIS_LATTICE,new Params(null));
					effect.getConditions().put(I5CONSTANTS.rCRYSTALLINE_PHASE_POINT_GROUP,new Params(null));
					effect.getConditions().put(I5CONSTANTS.rCRYSTALLINE_PHASE_SPACE_GROUP,new Params(null));
					effect.getConditions().put(I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTGRPH_PLANES,new Params(null));
					
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
		COMMON_NAME {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_COMMON_NAME;
			}
		},
		CRYSTAL_SYSTEM_value {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTAL_SYSTEM;
			}
		},
		BRAVAIS_LATTICE_value {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_BRAVAIS_LATTICE;
			}
		},
		POINT_GROUP {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_POINT_GROUP;
			}
		},
		SPACE_GROUP {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_SPACE_GROUP;
			}
		},
		CRYSTGRPH_PLANES {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTGRPH_PLANES;
			}
		}		
		;
		public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
			params.setLoValue(node.getTextContent());
			params.setLoQualifier(" ");
		}
		public String getTag() {
			return name();
		}
	}
	enum EFFECT {
		COMMON_NAME {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_COMMON_NAME;
			}
		},
		PHRASEOTHER_CRYSTAL_SYSTEM {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTAL_SYSTEM;
			}
		},
		BRAVAIS_LATTICE {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_BRAVAIS_LATTICE;
			}
		},
		POINT_GROUP {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_POINT_GROUP;
			}
		},
		SPACE_GROUP {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_SPACE_GROUP;
			}
		},
		CRYSTGRPH_PLANES {
			@Override
			public String getTag() {
				return I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTGRPH_PLANES;
			}
		}
		;
		public String getTag() {
			return name();
		}
		public void setValue(EffectRecord<String,Params,String> effect,NodeList nodes) {
			useChildrenNodesParams(effect, nodes);
		}
		public void useChildrenNodesParams(EffectRecord<String, Params, String> effect,
				NodeList nodes) {
			if (nodes!=null) {
				Params params = (Params) effect.getConditions().get(getTag()); 
				if (params==null) {
					params = new Params();
					effect.getConditions().put(getTag(),params);
				}
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
