package net.idea.i5._5.ambit2.sections.TO_BIODEG_WATER_SIM_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSIM.REFERENCE.Set;



public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord>{
	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOBIODEGWATERSIM()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"ENV FATE","TO_BIODEG_WATER_SIM_SECTION");
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
		if (sciPart.getTOBIODEGWATERSIM().getGUIDELINE()!=null)
			for (ScientificPart.TOBIODEGWATERSIM.GUIDELINE.Set set : sciPart.getTOBIODEGWATERSIM().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getTOBIODEGWATERSIM().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOBIODEGWATERSIM().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		if (sciPart.getTOBIODEGWATERSIM().getREFERENCE() != null)
			for (Set set : sciPart
					.getTOBIODEGWATERSIM().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}		

		//TEST TYPE
		papp.getParameters().put(cTestType,
				sciPart.getTOBIODEGWATERSIM().getOXYGENCONDITIONS()==null?null:
				sciPart.getTOBIODEGWATERSIM().getOXYGENCONDITIONS().getSet().getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());

		if (sciPart.getTOBIODEGWATERSIM().getHALFLIFE()!=null) 
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSIM.HALFLIFE.Set set : sciPart.getTOBIODEGWATERSIM().getHALFLIFE().getSet()) {
				papp.getParameters().put("Half-life",set.getPHRASEOTHERTYPE().getTYPEValue());
				
				Params hlvalue = new Params();
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) try {
						hlvalue.put(loValue,Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						hlvalue.put(loQualifier,set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					} catch (Exception x) {
						hlvalue.put(loValue,set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
					} else hlvalue.put(loValue,null);
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
						hlvalue.put(upValue,Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						hlvalue.put(upQualifier,set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					} catch (Exception x) {
						hlvalue.put(upValue,null);
					} else hlvalue.put(upValue,null);
				}	
				papp.getParameters().put("Half-life value",hlvalue);					
			}
		
		if (sciPart.getTOBIODEGWATERSIM().getDEGRAD()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSIM.DEGRAD.Set set : sciPart.getTOBIODEGWATERSIM().getDEGRAD().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint(cPercentDegradation);
				effect.setUnit("%");
				if (set.getPHRASEOTHERPARAMETER()!=null)
					effect.setEndpoint(set.getPHRASEOTHERPARAMETER().getPARAMETERValue());

				effect.setConditions(new Params());
				
				papp.addEffect(effect);
				//results
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
				
				//sampling time
				if (set.getVALUEUNITTIMEPOINTVALUE() != null) {
					Params tvalue = new Params();
					if (set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE()!= null) {
						tvalue.put(loValue,getNumber(set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE().getValue()));
					} else tvalue.put(loValue,null);
					if (set.getVALUEUNITTIMEPOINTVALUE()!=null)
						tvalue.put(unit,getNumber(set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTUNITValue()));
					effect.getConditions().put(cTimePoint, tvalue);				
				} else
					effect.getConditions().put(cTimePoint, null);						
				
			}
		} 		
		return record;
	}
}
