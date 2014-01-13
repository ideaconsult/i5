package net.idea.i5._5.ambit2.sections.PC_DISSOCIATION_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart.PCDISSOCIATION.REFERENCE.Set;

public class StudyRecordConverter
		extends
		AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord> {

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCDISSOCIATION()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"P-CHEM","PC_DISSOCIATION_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		if (sciPart.getPCDISSOCIATION().getREFERENCE() != null)
			for (Set set : sciPart.getPCDISSOCIATION().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCDISSOCIATION().getGUIDELINE() != null)
			for (ScientificPart.PCDISSOCIATION.GUIDELINE.Set set : sciPart
					.getPCDISSOCIATION().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getPCDISSOCIATION().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCDISSOCIATION().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}


		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart.PCDISSOCIATION.PKA.Set set : sciPart.getPCDISSOCIATION().getPKA().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(pKa);
			effect.setConditions(new Params());
			papp.addEffect(effect);

			if (set.getVALUEUNITTEMPVALUE() != null) {
				Params tvalue = new Params();
				if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE()!= null) {
					tvalue.put(
							loValue,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
				}
				if (set.getVALUEUNITTEMPVALUE()!=null)
					tvalue.put(
							unit,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPUNITValue()));
				effect.getConditions().put(Temperature, tvalue);				
			} else
				effect.getConditions().put(Temperature, null);
			

			if (set.getPRECISIONVALUELOQUALIFIER() != null) {
				if (set.getPRECISIONVALUELOQUALIFIER().getVALUELOVALUE() != null)
					try {
						effect.setLoQualifier(set.getPRECISIONVALUELOQUALIFIER().getVALUELOQUALIFIER());
						effect.setLoValue(Double.parseDouble(set
								.getPRECISIONVALUELOQUALIFIER().getVALUELOQUALIFIERValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONVALUELOQUALIFIER().getVALUELOQUALIFIERValue());
					}
				if (set.getPRECISIONVALUELOQUALIFIER().getVALUEUPVALUE() != null)
					try {
						effect.setUpQualifier(set.getPRECISIONVALUELOQUALIFIER().getVALUEUPQUALIFIER());						
						effect.setUpValue(Double.parseDouble(set
								.getPRECISIONVALUELOQUALIFIER().getVALUEUPQUALIFIERValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONVALUELOQUALIFIER().getVALUEUPQUALIFIERValue());
					}
			}
		}

		return record;
	}
	
	protected Object getNumber(Object value) {
		if (value == null) return null;
		if (value instanceof Number) return value;
		try {
			return Double.parseDouble(value.toString());
		} catch (Exception x) {
			return value;
		}
		
	}
}
