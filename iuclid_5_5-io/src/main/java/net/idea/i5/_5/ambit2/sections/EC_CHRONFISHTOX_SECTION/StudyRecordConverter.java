package net.idea.i5._5.ambit2.sections.EC_CHRONFISHTOX_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECCHRONFISHTOX.REFERENCE.Set;

public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord>{

	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getECCHRONFISHTOX()==null) return null;
		
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"ECOTOX","EC_CHRONFISHTOX_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID(),
					unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
					,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		if (sciPart.getECCHRONFISHTOX().getGUIDELINE()!=null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECCHRONFISHTOX.GUIDELINE.Set set : sciPart.getECCHRONFISHTOX().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getECCHRONFISHTOX().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getECCHRONFISHTOX().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
	
		// citation
		if (sciPart.getECCHRONFISHTOX().getREFERENCE() != null)
			for (Set set : sciPart.getECCHRONFISHTOX().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}	
		
		//Exposure duration
		if (sciPart.getECCHRONFISHTOX().getEXPDURATION()!=null) {
			Params p = new Params();
			p.put(loValue, sciPart.getECCHRONFISHTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getVALUE().getValue());
			p.put(unit,sciPart.getECCHRONFISHTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getUNITValue());
			papp.getParameters().put(cExposure,p);
		} else {
			papp.getParameters().put(cExposure,null);
		}
		
		if (sciPart.getECCHRONFISHTOX().getWATERTYPE()!=null) {
				papp.getParameters().put(cTestMedium,sciPart.getECCHRONFISHTOX().getWATERTYPE().getSet().getLISTRIGHTPOP().getLISTRIGHTPOPValue());
		} else 
			papp.getParameters().put(cTestMedium,null);
		
		if (sciPart.getECCHRONFISHTOX().getORGANISM()!=null) {
			papp.getParameters().put(cTestOrganism,sciPart.getECCHRONFISHTOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} else	
			papp.getParameters().put(cTestOrganism,null);
		
		papp.getParameters().put(cMeasuredConcentration,null);
		if (sciPart.getECCHRONFISHTOX().getNOMMEASCONC()!=null) try {
			papp.getParameters().put(cMeasuredConcentration,
					sciPart.getECCHRONFISHTOX().getNOMMEASCONC().getSet().getTEXTBELOW().getTEXTBELOW().getValue());
		} catch (Exception x) {
		}	
		//ENDPOINT
		if (sciPart.getECCHRONFISHTOX().getEFFCONC()!=null && sciPart.getECCHRONFISHTOX().getEFFCONC().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECCHRONFISHTOX.EFFCONC.Set set : sciPart.getECCHRONFISHTOX().getEFFCONC().getSet()) {
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
			
			if (set.getPRECISIONCONCLOQUALIFIER()!=null) {
				effect.setUnit(set.getPRECISIONCONCLOQUALIFIER().getCONCUNITValue());
				
				if (set.getPRECISIONCONCLOQUALIFIER().getCONCLOVALUE()!=null) try {
					effect.setLoValue(Double.parseDouble(set.getPRECISIONCONCLOQUALIFIER().getCONCLOVALUE().getValue()));
					effect.setLoQualifier(set.getPRECISIONCONCLOQUALIFIER().getCONCLOQUALIFIERValue());
				} catch (Exception x) {}
				if (set.getPRECISIONCONCLOQUALIFIER().getCONCUPVALUE()!=null) try {
					effect.setUpValue(Double.parseDouble(set.getPRECISIONCONCLOQUALIFIER().getCONCUPVALUE().getValue()));
					effect.setUpQualifier(set.getPRECISIONCONCLOQUALIFIER().getCONCUPQUALIFIERValue());
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
