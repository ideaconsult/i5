package net.idea.i5._5.ambit2.sections.TO_GENETIC_IN_VITRO_SECTION;

import net.idea.i5._5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VITRO_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VITRO_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VITRO_SECTION.EndpointStudyRecord.ScientificPart.TOGENETICINVITRO.GUIDELINE.Set;


public class StudyRecordConverter extends TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VITRO_SECTION.EndpointStudyRecord>{

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_GENETIC_IN_VITRO);
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
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VITRO_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOGENETICINVITRO()==null) return null;
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
					unmarshalled.getDocumentReferencePK(),
					unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file

		if (sciPart.getTOGENETICINVITRO().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOGENETICINVITRO().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {}
			
		if (sciPart.getTOGENETICINVITRO().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOGENETICINVITRO().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
		}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		
		// year
		//sciPart.getTOGENETICINVITRO().getGENDATASOURCEHD()
		if (sciPart.getTOGENETICINVITRO().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_GENETIC_IN_VITRO_SECTION.EndpointStudyRecord.ScientificPart.TOGENETICINVITRO.REFERENCE.Set set : sciPart
					.getTOGENETICINVITRO().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.getParameters().put(cYear,set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				} else papp.getParameters().put(cYear,null);
			}

		
		papp.getParameters().put(cTypeGenotoxicity,
				sciPart.getTOGENETICINVITRO().getGENOTOXICITYTYPE()==null?null:
				sciPart.getTOGENETICINVITRO().getGENOTOXICITYTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		
		papp.getParameters().put(cTypeStudy,
				sciPart.getTOGENETICINVITRO().getSTUDYTYPE()==null?null:
				sciPart.getTOGENETICINVITRO().getSTUDYTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		
		try {
		papp.getParameters().put(cTargetGene,
				sciPart.getTOGENETICINVITRO().getTARGETGENE()==null?null:
				sciPart.getTOGENETICINVITRO().getTARGETGENE().getSet().getTEXTBELOW().getTEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(cTargetGene,null);	
		}
		
		//papp.getParameters().put(cMetabolicActivationSystem,null);
		//endpoint
		//sciPart.getTOGENETICINVITRO().getGENOTOXICITYTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue()
		
		if ( sciPart.getTOGENETICINVITRO().getORGANISM()!= null &&  sciPart.getTOGENETICINVITRO().getORGANISM().getSet()!=null)
		for (EndpointStudyRecord.ScientificPart.TOGENETICINVITRO.ORGANISM.Set set : sciPart.getTOGENETICINVITRO().getORGANISM().getSet()) {
			try {
				papp.getParameters().put(cSpecies,set.getPHRASEOTHERORGANISM().getORGANISMTXT().getValue());
			} catch (Exception x) { papp.getParameters().put(cSpecies,null);}
			try {
				papp.getParameters().put(cMetabolicActivationSystem,set.getMETABOLICACTSYSTEM().getMETABOLICACTSYSTEM().getValue());
			} catch (Exception x) {	papp.getParameters().put(cMetabolicActivationSystem,null);}

		}
		else {
			papp.getParameters().put(cSpecies,null);
			papp.getParameters().put(cMetabolicActivationSystem,null);
		}
		
		// endpoint
		// effect level
		if (sciPart.getTOGENETICINVITRO().getTESTRS() != null)
			for (EndpointStudyRecord.ScientificPart.TOGENETICINVITRO.TESTRS.Set set : sciPart.getTOGENETICINVITRO().getTESTRS().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint("Genotoxicity");
				try {effect.setTextValue(set.getPHRASEOTHERGENOTOXICITY().getGENOTOXICITYValue());} catch (Exception x) {}
				effect.setConditions(new Params());
				papp.addEffect(effect);
				try {
					effect.getConditions().put(cMetabolicActivation,set.getMETACTINDICATOR().getMETACTINDICATORValue());
				} catch (Exception x) {
					effect.getConditions().put(cMetabolicActivation,null);
				}
				if (set.getPHRASEOTHERORGANISM()==null) try {
					effect.getConditions().put(cSpecies,set.getPHRASEOTHERTESTSYSTEM().getTESTSYSTEMTXT().getValue());
				} catch (Exception x) { effect.getConditions().put(cSpecies,null);} 
				else  try {
					effect.getConditions().put(cSpecies,set.getPHRASEOTHERORGANISM().getORGANISMTXT().getValue());
				} catch (Exception x) { effect.getConditions().put(cSpecies,null);}
			}
		StringBuilder interpretation = null;
		if (sciPart.getTOGENETICINVITRO().getINTERPRETRSSUBMITTER() != null) {
			if (sciPart.getTOGENETICINVITRO().getINTERPRETRSSUBMITTER().getSet()!=null) 
				for (EndpointStudyRecord.ScientificPart.TOGENETICINVITRO.INTERPRETRSSUBMITTER.Set set : sciPart.getTOGENETICINVITRO().getINTERPRETRSSUBMITTER().getSet()) {
					if (interpretation==null) interpretation = new StringBuilder();
					interpretation.append(set.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
				}
		}
		papp.setInterpretationResult(interpretation==null?null:interpretation.toString());
		
		return record;
	}
}
