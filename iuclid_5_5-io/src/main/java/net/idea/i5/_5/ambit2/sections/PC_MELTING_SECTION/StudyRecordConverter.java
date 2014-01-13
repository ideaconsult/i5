package net.idea.i5._5.ambit2.sections.PC_MELTING_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_MELTING_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_MELTING_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_MELTING_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_MELTING_SECTION.EndpointStudyRecord.ScientificPart.PCMELTING.REFERENCE.Set;

public class StudyRecordConverter
		extends
		AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_MELTING_SECTION.EndpointStudyRecord> {



	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_MELTING_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCMELTING()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"P-CHEM","PC_MELTING_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		if (sciPart.getPCMELTING().getREFERENCE() != null)
			for (Set set : sciPart.getPCMELTING().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCMELTING().getGUIDELINE() != null)
			for (ScientificPart.PCMELTING.GUIDELINE.Set set : sciPart
					.getPCMELTING().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getPCMELTING().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCMELTING().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}
		/*
		if (sciPart.getPCMELTING().getMETHODTYPE() != null) {
			papp.getParameters().put(
					methodType,
					sciPart.getPCMELTING().getMETHODTYPE().getSet()
							.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		} else {
			papp.getParameters().put(methodType, null);
		}
		*/

		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_MELTING_SECTION.EndpointStudyRecord.ScientificPart.PCMELTING.MELTINGPT.Set set : sciPart.getPCMELTING().getMELTINGPT().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(MELTINGPOINT);
			effect.setConditions(new Params());
			papp.addEffect(effect);
			
			//pressure should be a condition
			//decomposition and sublimation are actually readouts not conditions...
			try {
				effect.getConditions().put(DECOMPOSITION,	set.getPHRASEOTHERDECOMPINDICATOR().getDECOMPINDICATORValue());
			} catch (Exception x) {
				effect.getConditions().put(DECOMPOSITION,null);
			}
			try {
				effect.getConditions().put(SUBLIMATION,	set.getPHRASEOTHERSUBLIMATIONINDICATOR().getSUBLIMATIONINDICATORValue());
			} catch (Exception x) {
				effect.getConditions().put(SUBLIMATION,null);
			}
			
			if (set.getPRECISIONLOQUALIFIER() != null) {
				effect.setUnit(set.getPRECISIONLOQUALIFIER().getUNITValue());
				if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
					try {
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER()
								.getLOQUALIFIERValue());						
						effect.setLoValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue());
					}
				if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
					try {
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER()
								.getUPQUALIFIERValue());						
						effect.setUpValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getUPVALUE()
								.getValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue());
					}
			}
		}
		return record;
	}

}
