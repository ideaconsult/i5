package net.idea.i5._5.ambit2.sections.PC_WATER_SOL_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord.ScientificPart.PCWATERSOL.REFERENCE.Set;

public class StudyRecordConverter
		extends
		AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord> {

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCWATERSOL()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"P-CHEM","PC_WATER_SOL_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		if (sciPart.getPCWATERSOL().getREFERENCE() != null)
			for (Set set : sciPart.getPCWATERSOL().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) try {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				} catch (Exception x) {}
			}			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCWATERSOL().getGUIDELINE() != null)
			for (ScientificPart.PCWATERSOL.GUIDELINE.Set set : sciPart.getPCWATERSOL().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {}
		if (sciPart.getPCWATERSOL().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCWATERSOL().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}
		/*
		 * if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
		 * record.setReferenceSubstanceUUID
		 * (sciPart.getECFISHTOX().getREFERENCESUBSTANCE
		 * ().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue()) }
		 */
		// Exposure duration
		if (sciPart.getPCWATERSOL().getMETHODTYPE() != null) {
			papp.getParameters().put(
					methodType,
					sciPart.getPCWATERSOL().getMETHODTYPE().getSet()
							.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		} else {
			papp.getParameters().put(methodType, null);
		}
		if (sciPart.getPCWATERSOL().getWATERSOL()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord.ScientificPart.PCWATERSOL.WATERSOL.Set set : sciPart.getPCWATERSOL().getWATERSOL().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(WaterSolubility);
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
			
			if (set.getPRECISIONPHLOQUALIFIER() != null) {
				Params phvalue = new Params();
				if (set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE()!= null) {
					phvalue.put(loQualifier,
							(set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue() == null) ? null : 
							set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue());
					
					phvalue.put(
							loValue,getNumber(set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE().getValue()));
				} else phvalue.put(loValue,null);
				if (set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE()!= null) {
					phvalue.put(upQualifier,
							(set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue() == null) ? null : 
							set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue());					
					phvalue.put(
							upValue,getNumber(set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE().getValue()));
				} else phvalue.put(upValue,null);
				effect.getConditions().put(ph, phvalue);

			} else {
				effect.getConditions().put(ph,null);
			}
			try{
				effect.getConditions().put(Remark, set.getREM().getREM().getValue());
			} catch (Exception x) {
				effect.getConditions().put(Remark,null);	
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
