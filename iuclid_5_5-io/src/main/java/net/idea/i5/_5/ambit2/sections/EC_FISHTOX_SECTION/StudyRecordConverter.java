package net.idea.i5._5.ambit2.sections.EC_FISHTOX_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord;

public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord>{
	private static final String cSalinity = "Salinity";
	private static final String cExposure = "Exposure";
	private static final String cExposureUnit = "Exposure unit";
	private static final String cTestMedium = "Test Medium";
	private static final String cTestOrganism = "Test organism";
	private static final String cMeasuredConcentration = "Measured concentration";
	private static final String cEffect = "Effect";
	private static final String cConcType = "Conc type";
	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = new ProtocolApplication<Protocol,Params,String,Params,String>(new Protocol(unmarshalled.getName()));
		papp.getProtocol().setCategory("EC_FISHTOX_SECTION");
		papp.getProtocol().setTopCategory("ECOTOX");
		papp.setParameters(new Params());
		record.addtMeasurement(papp);
		//UUID
		papp.setDocumentUUID(unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getECFISHTOX().getGUIDELINE()!=null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECFISHTOX.GUIDELINE.Set set : sciPart.getECFISHTOX().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuidance(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getECFISHTOX().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuidance(sciPart.getECFISHTOX().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		if (sciPart.getECFISHTOX().getSALINITY()!=null) try {
			papp.getParameters().put(cSalinity, sciPart.getECFISHTOX().getSALINITY().getSet().getTEXTBELOW().getTEXTBELOW().getValue());
		} catch (Exception x) {}	
		//Exposure duration
		if (sciPart.getECFISHTOX().getEXPDURATION()!=null) {
			papp.getParameters().put(cExposure,
						sciPart.getECFISHTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getVALUE().getValue());
			papp.getParameters().put(cExposureUnit,
						sciPart.getECFISHTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getUNITValue());
		}
		if (sciPart.getECFISHTOX().getWATERTYPE()!=null) {
				papp.getParameters().put(cTestMedium,sciPart.getECFISHTOX().getWATERTYPE().getSet().getLISTRIGHTPOP().getLISTRIGHTPOPValue());
		}
		if (sciPart.getECFISHTOX().getORGANISM()!=null) {
			papp.getParameters().put(cTestOrganism,sciPart.getECFISHTOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		}	
		if (sciPart.getECFISHTOX().getNOMMEASCONC()!=null) try {
			papp.getParameters().put(cMeasuredConcentration,
					sciPart.getECFISHTOX().getNOMMEASCONC().getSet().getTEXTBELOW().getTEXTBELOW().getValue());
		} catch (Exception x) {}	
		//ENDPOINT
		if (sciPart.getECFISHTOX().getEFFCONC()!=null && sciPart.getECFISHTOX().getEFFCONC().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECFISHTOX.EFFCONC.Set set : sciPart.getECFISHTOX().getEFFCONC().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(set.getPHRASEOTHERENDPOINT().getENDPOINTValue());
			effect.setConditions(new Params());
			papp.addEffect(effect);

			effect.getConditions().put(cEffect,
					set.getPHRASEOTHERBASISEFFECT()==null?null:
					set.getPHRASEOTHERBASISEFFECT().getBASISEFFECTValue());
			
			effect.getConditions().put(cConcType,
					set.getPHRASEOTHEREFFCONCTYPE()==null?null:
					set.getPHRASEOTHEREFFCONCTYPE().getEFFCONCTYPEValue());
			
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
			
			if (set.getVALUEUNITEXPDURATIONVALUE()!=null) {
				effect.getConditions().put(cExposure,set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONVALUE().getValue());
				effect.getConditions().put(cExposureUnit,set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONUNITValue());
			}
		}
		System.out.println(papp);
		return record;
	}
}