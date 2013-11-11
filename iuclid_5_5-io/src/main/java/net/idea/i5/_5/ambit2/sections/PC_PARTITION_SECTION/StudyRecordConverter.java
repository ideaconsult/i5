package net.idea.i5._5.ambit2.sections.PC_PARTITION_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart;


public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord>{
	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = new ProtocolApplication<Protocol,Params,String,Params,String>(new Protocol(unmarshalled.getName()));
		papp.getProtocol().setCategory("PC_PARTITION_SECTION");
		papp.setParameters(new Params());
		record.addtMeasurement(papp);
		//UUID
		papp.setDocumentUUID(unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getPCPARTITION().getGUIDELINE()!=null)
			for (ScientificPart.PCPARTITION.GUIDELINE.Set set : sciPart.getPCPARTITION().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuidance(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getPCPARTITION().getMETHODNOGUIDELINE()!=null)
			papp.getProtocol().addGuidance(sciPart.getPCPARTITION().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		//Exposure duration
		if (sciPart.getPCPARTITION().getMETHODTYPE()!=null) {
			papp.getParameters().put("Method type",
					sciPart.getPCPARTITION().getMETHODTYPE().getSet().getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		}

		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart.PCPARTITION.PARTCOEFF.Set set: sciPart.getPCPARTITION().getPARTCOEFF().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(set.getTYPE().getTYPEValue());
			effect.setConditions(new Params());
			papp.addEffect(effect);
			
			if (set.getVALUEUNITTEMPVALUE()!=null) {
				effect.getConditions().put("Temperature",
						(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()==null?"":set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue())
						+ " " + set.getVALUEUNITTEMPVALUE().getTEMPUNITValue());
			}
			if (set.getPRECISIONPHLOQUALIFIER()!=null) {
				effect.getConditions().put("PH (lower)",
						(set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue()==null)?"":set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue() 
						+ " " + set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE().getValue());

				effect.getConditions().put("PH (upper)",
						set.getPRECISIONPHLOQUALIFIER().getPHUPQUALIFIERValue() + " " + set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE().getValue());

			}
			
			if (set.getPRECISIONLOQUALIFIER()!=null) {
				if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) {
					effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
					effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
				}
				if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) {
					effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
					effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
				}
			}				
		}
	
		System.out.println(papp);
		return record;
	}
}
