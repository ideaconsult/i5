package net.idea.i5._5.ambit2.sections.TO_CARCINOGENICITY_SECTION;

import net.idea.i5._5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_CARCINOGENICITY_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_CARCINOGENICITY_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_CARCINOGENICITY_SECTION.EndpointStudyRecord.ScientificPart.TOCARCINOGENICITY.GUIDELINE.Set;


public class StudyRecordConverter extends TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_CARCINOGENICITY_SECTION.EndpointStudyRecord>{
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_CARCINOGENICITY);
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_CARCINOGENICITY_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOCARCINOGENICITY()==null) return null;
		
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

		if (sciPart.getTOCARCINOGENICITY().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOCARCINOGENICITY().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {}
		if (sciPart.getTOCARCINOGENICITY().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOCARCINOGENICITY().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		
		// year
		if (sciPart.getTOCARCINOGENICITY().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_CARCINOGENICITY_SECTION.EndpointStudyRecord.ScientificPart.TOCARCINOGENICITY.REFERENCE.Set set : sciPart
					.getTOCARCINOGENICITY().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.getParameters().put(cYear,set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				} else papp.getParameters().put(cYear,null);
			}

		// Repeated tox oral
		papp.getParameters().put(cSpecies,
					sciPart.getTOCARCINOGENICITY().getORGANISM()==null?null:
					sciPart.getTOCARCINOGENICITY().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		

		try {
			papp.getParameters().put(cRouteAdm,
					sciPart.getTOCARCINOGENICITY().getROUTE()==null?null:
					sciPart.getTOCARCINOGENICITY().getROUTE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} catch (Exception x) { papp.getParameters().put(cRouteAdm,null);}		
		
		StringBuilder doses = null;
		if (sciPart.getTOCARCINOGENICITY().getDOSES()!=null && sciPart.getTOCARCINOGENICITY().getDOSES().getSet() != null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_CARCINOGENICITY_SECTION.EndpointStudyRecord.ScientificPart.TOCARCINOGENICITY.DOSES.Set set : sciPart.getTOCARCINOGENICITY().getDOSES().getSet()) {
			if (doses==null) doses = new StringBuilder();
			else doses.append(";");
			doses.append(set.getCONCENTRATIONS().getCONCENTRATIONS().getValue());
		}
		papp.getParameters().put(cDoses,doses==null?null:doses.toString());
		// endpoint
		// effect level
		if (sciPart.getTOCARCINOGENICITY().getEFFLEVEL() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_CARCINOGENICITY_SECTION.EndpointStudyRecord.ScientificPart.TOCARCINOGENICITY.EFFLEVEL.Set set : sciPart.getTOCARCINOGENICITY().getEFFLEVEL().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint(set.getPHRASEOTHERENDPOINT().getENDPOINTValue());
				effect.setConditions(new Params());
				papp.addEffect(effect);
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					effect.setUnit(set.getPRECISIONLOQUALIFIER().getUNITValue());
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					} catch (Exception x) {}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					} catch (Exception x) {}
				}
				
				effect.getConditions().put(cEffectType,set.getPHRASEOTHEREFFECTTYPE()==null?null:set.getPHRASEOTHEREFFECTTYPE().getEFFECTTYPEValue());
			}
		papp.setInterpretationResult(null); 
		papp.setInterpretationCriteria(null); 
		return record;
	}
}
