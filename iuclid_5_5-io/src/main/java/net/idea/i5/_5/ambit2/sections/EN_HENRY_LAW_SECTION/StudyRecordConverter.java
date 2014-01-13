package net.idea.i5._5.ambit2.sections.EN_HENRY_LAW_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord.ScientificPart.ENHENRYLAW.REFERENCE.Set;



public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord>{
	private static final String cTimePoint = "Sampling time";
	private static final String cPercentDegradation = "% Degradation";
	private static final String cTestType = "Test type";
	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getENHENRYLAW()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"ENV FATE","EN_HENRY_LAW_SECTION");
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
		if (sciPart.getENHENRYLAW().getGUIDELINE()!=null)
			for (ScientificPart.ENHENRYLAW.GUIDELINE.Set set : sciPart.getENHENRYLAW().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getENHENRYLAW().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getENHENRYLAW().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		if (sciPart.getENHENRYLAW().getREFERENCE() != null)
			for (Set set : sciPart
					.getENHENRYLAW().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}		

		//TEST TYPE

		if (sciPart.getENHENRYLAW().getHENRYSLAW()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord.ScientificPart.ENHENRYLAW.HENRYSLAW.Set set : sciPart.getENHENRYLAW().getHENRYSLAW().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint("Henry's Law const.");
				effect.setConditions(new Params());
				
				papp.addEffect(effect);
				
				if (set.getVALUEUNITPRESSUREVALUE() != null) {
					Params tvalue = new Params();
					if (set.getVALUEUNITPRESSUREVALUE()!= null) {
						tvalue.put(loValue,getNumber(set.getVALUEUNITPRESSUREVALUE().getPRESSUREVALUE().getValue()));
					}
					if (set.getVALUEUNITPRESSUREVALUE()!=null)
						tvalue.put(unit,getNumber(set.getVALUEUNITPRESSUREVALUE().getPRESSUREUNITValue()));
					
					effect.getConditions().put(Pressure, tvalue);				
				} else
					effect.getConditions().put(Pressure, null);				
				
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
				
				set.getTEMPVALUE()
				set.getVALUEUNITPRESSUREVALUE()
				set.getREM()


				
			}
		} 		
		return record;
	}
	

}
