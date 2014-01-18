package net.idea.i5._5.ambit2.sections.EC_SOILDWELLINGTOX_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SOILDWELLINGTOX_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SOILDWELLINGTOX_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SOILDWELLINGTOX_SECTION.EndpointStudyRecord.ScientificPart.ECSOILDWELLINGTOX.REFERENCE.Set;

public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SOILDWELLINGTOX_SECTION.EndpointStudyRecord>{

	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SOILDWELLINGTOX_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getECSOILDWELLINGTOX()==null) return null;
		
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"ECOTOX","EC_SOILDWELLINGTOX_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID(),
					unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
					,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		if (sciPart.getECSOILDWELLINGTOX().getGUIDELINE()!=null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SOILDWELLINGTOX_SECTION.EndpointStudyRecord.ScientificPart.ECSOILDWELLINGTOX.GUIDELINE.Set set : sciPart.getECSOILDWELLINGTOX().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getECSOILDWELLINGTOX().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getECSOILDWELLINGTOX().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
	
		// citation
		if (sciPart.getECSOILDWELLINGTOX().getREFERENCE() != null)
			for (Set set : sciPart.getECSOILDWELLINGTOX().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}	
		
		//Exposure duration
		if (sciPart.getECSOILDWELLINGTOX().getEXPDURATION()!=null) {
			Params p = new Params();
			try {p.put(loValue, sciPart.getECSOILDWELLINGTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getVALUE().getValue());} 
			catch (Exception x) {p.put(loValue, null);}
			try {p.put(unit,sciPart.getECSOILDWELLINGTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getUNITValue());} catch (Exception x) {}
			papp.getParameters().put(cExposure,p);
		} else {
			papp.getParameters().put(cExposure,null);
		}
		
		if (sciPart.getECSOILDWELLINGTOX().getSUBSTRATETYPE()!=null) {
				papp.getParameters().put(cTestMedium,sciPart.getECSOILDWELLINGTOX().getSUBSTRATETYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} else 
			papp.getParameters().put(cTestMedium,null);
		
		if (sciPart.getECSOILDWELLINGTOX().getORGANISM()!=null) {
			papp.getParameters().put(cTestOrganism,sciPart.getECSOILDWELLINGTOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} else	
			papp.getParameters().put(cTestOrganism,null);
		
		papp.getParameters().put(cMeasuredConcentration,null);
		if (sciPart.getECSOILDWELLINGTOX().getNOMMEASCONC()!=null) try {
			papp.getParameters().put(cMeasuredConcentration,
					sciPart.getECSOILDWELLINGTOX().getNOMMEASCONC().getSet().getTEXTBELOW().getTEXTBELOW().getValue());
		} catch (Exception x) {
		}	
		//ENDPOINT
		if (sciPart.getECSOILDWELLINGTOX().getEFFCONC()!=null && sciPart.getECSOILDWELLINGTOX().getEFFCONC().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SOILDWELLINGTOX_SECTION.EndpointStudyRecord.ScientificPart.ECSOILDWELLINGTOX.EFFCONC.Set set : sciPart.getECSOILDWELLINGTOX().getEFFCONC().getSet()) {
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
				Params p = new Params();
				p.put(loValue, set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONVALUE().getValue());
				p.put(unit,set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONUNITValue());
				effect.getConditions().put(cExposure,p);
			} else {
				effect.getConditions().put(cExposure,null);
			}
		}
		return record;
	}
}
