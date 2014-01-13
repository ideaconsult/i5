package net.idea.i5._5.ambit2.sections.TO_PHOTOTRANS_AIR_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart.TOPHOTOTRANSAIR.REFERENCE.Set;



public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord>{
	private static final String cTimePoint = "Sampling time";
	private static final String cPercentDegradation = "% Degradation";
	private static final String cTestType = "Test type";
	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOPHOTOTRANSAIR()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"ENV FATE","TO_PHOTOTRANS_AIR_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),
				unmarshalled.getStudyResultType().getValueID()
			);
		record.addtMeasurement(papp);
	
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		if (sciPart.getTOPHOTOTRANSAIR().getGUIDELINE()!=null)
			for (ScientificPart.TOPHOTOTRANSAIR.GUIDELINE.Set set : sciPart.getTOPHOTOTRANSAIR().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getTOPHOTOTRANSAIR().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOPHOTOTRANSAIR().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		if (sciPart.getTOPHOTOTRANSAIR().getREFERENCE() != null)
			for (Set set : sciPart
					.getTOPHOTOTRANSAIR().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}		

		//TEST TYPE
		papp.getParameters().put(cTestType,
				sciPart.getTOPHOTOTRANSAIR().getOXYGENCONDITIONS()==null?null:
				sciPart.getTOPHOTOTRANSAIR().getOXYGENCONDITIONS().getSet().getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());

		if (sciPart.getTOPHOTOTRANSAIR().getINTERPRETRESULTSSUBM()!=null) {
			papp.setInterpretationResult(sciPart.getTOPHOTOTRANSAIR().getINTERPRETRESULTSSUBM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} else
			papp.setInterpretationResult(null);
		
		papp.setInterpretationCriteria(null);
		if (sciPart.getTOPHOTOTRANSAIR().getRESULTSDETAILS()!=null) try {
			papp.setInterpretationCriteria(sciPart.getTOPHOTOTRANSAIR().getRESULTSDETAILS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}
		

		if (sciPart.getTOPHOTOTRANSAIR().getDEGRAD()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart.TOPHOTOTRANSAIR.DEGRAD.Set set : sciPart.getTOPHOTOTRANSAIR().getDEGRAD().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint(cPercentDegradation);
				effect.setUnit("%");
				if (set.getPHRASEOTHERPARAMETER()!=null)
					effect.setEndpoint(set.getPHRASEOTHERPARAMETER().getPARAMETERValue());

				effect.setConditions(new Params());
				
				papp.addEffect(effect);
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					} catch (Exception x) {}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					} catch (Exception x) {}
				}	
				
				if (set.getVALUEUNITTIMEPOINTVALUE()!=null)
					effect.getConditions().put(cTimePoint,
							(set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE()==null?null:set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE().getValue())+
							" " + 
							(set.getVALUEUNITTIMEPOINTVALUE()==null?null:set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTUNITValue()));	

				
			}
		} 		
		return record;
	}
}
