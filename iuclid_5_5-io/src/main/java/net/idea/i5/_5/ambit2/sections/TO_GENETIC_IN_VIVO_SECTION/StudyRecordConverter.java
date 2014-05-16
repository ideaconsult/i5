package net.idea.i5._5.ambit2.sections.TO_GENETIC_IN_VIVO_SECTION;

import net.idea.i5._5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VIVO_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VIVO_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VIVO_SECTION.EndpointStudyRecord.ScientificPart.TOGENETICINVIVO.GUIDELINE.Set;



public class StudyRecordConverter extends TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VIVO_SECTION.EndpointStudyRecord>{

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_GENETIC_IN_VIVO);
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
			return unmarshalled.getScientificPart().getTOGENETICINVIVO().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getTOGENETICINVIVO().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VIVO_SECTION.EndpointStudyRecord.ScientificPart.TOGENETICINVIVO.REFERENCE.Set set : unmarshalled.getScientificPart().getTOGENETICINVIVO().getREFERENCE().getSet()) {
				try {
					if (set.getREFERENCEAUTHOR()!=null)
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
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VIVO_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOGENETICINVIVO()==null) return null;
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
					unmarshalled.getDocumentReferencePK(),
					unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled));
		record.addMeasurement(papp);
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file

		if (sciPart.getTOGENETICINVIVO().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOGENETICINVIVO().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
			
		if (sciPart.getTOGENETICINVIVO().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOGENETICINVIVO().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
		}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		
		// year
		
		parseReference(unmarshalled, papp);
		papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());

		try {
			papp.getParameters().put(I5CONSTANTS.cTypeGenotoxicity,
					getValue(sciPart.getTOGENETICINVIVO().getGENOTOXICITYTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getTOGENETICINVIVO().getGENOTOXICITYTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { 
			papp.getParameters().put(I5CONSTANTS.cTypeGenotoxicity,null);
		}	
		
		try {
			papp.getParameters().put(I5CONSTANTS.cTypeStudy,
					getValue(sciPart.getTOGENETICINVIVO().getSTUDYTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getTOGENETICINVIVO().getSTUDYTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { 
			papp.getParameters().put(I5CONSTANTS.cTypeStudy,null);
		}			
		try {
			papp.getParameters().put(I5CONSTANTS.cRouteAdm,
					getValue(sciPart.getTOGENETICINVIVO().getROUTE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getTOGENETICINVIVO().getROUTE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
			
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cRouteAdm,null);	
		}
		
		//papp.getParameters().put(cMetabolicActivationSystem,null);
		//endpoint
		//sciPart.getTOGENETICINVIVO().getGENOTOXICITYTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue()
		
		if ( sciPart.getTOGENETICINVIVO().getORGANISM()!= null &&  sciPart.getTOGENETICINVIVO().getORGANISM().getSet()!=null)
			try {
				papp.getParameters().put(I5CONSTANTS.cSpecies,
						getValue(
						sciPart.getTOGENETICINVIVO().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue()
						,
						sciPart.getTOGENETICINVIVO().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()
						));
			} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cSpecies,null);}
		else 
			papp.getParameters().put(I5CONSTANTS.cSpecies,null);
		
		
		// endpoint
		// effect level
		if (sciPart.getTOGENETICINVIVO().getTESTRS() != null)
			for (EndpointStudyRecord.ScientificPart.TOGENETICINVIVO.TESTRS.Set set : sciPart.getTOGENETICINVIVO().getTESTRS().getSet()) {
				EffectRecord<String, Params, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.eGenotoxicity);
				try {effect.setTextValue(set.getPHRASEOTHERGENOTOXICITY().getGENOTOXICITYValue());} catch (Exception x) {}
				papp.addEffect(effect);
				try {
					effect.getConditions().put(I5CONSTANTS.cToxicity,set.getPHRASEOTHERTOXICITY().getTOXICITYValue());
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.cToxicity,null);
				}
				if (set.getSEX()==null) try {
					effect.getConditions().put(I5CONSTANTS.cSex,set.getSEX().getSEXValue());
				} catch (Exception x) { effect.getConditions().put(I5CONSTANTS.cSex,null);} 
				else 
					effect.getConditions().put(I5CONSTANTS.cSex,null);

			}
		if (sciPart.getTOGENETICINVIVO().getINTERPRETRSSUBMITTER() != null) {
			String otherValue = null;
			try { 
				otherValue = sciPart.getTOGENETICINVIVO().getINTERPRETRSSUBMITTER().getSet().
					getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXTXT().getValue();
			} catch (Exception x) {
			};
			
			setInterpretationResult(papp, 
					sciPart.getTOGENETICINVIVO().getINTERPRETRSSUBMITTER().getSet()
					.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue(),
					otherValue
			);

		} else setInterpretationResult(papp,null,null);		
		
		return record;
	}
}
