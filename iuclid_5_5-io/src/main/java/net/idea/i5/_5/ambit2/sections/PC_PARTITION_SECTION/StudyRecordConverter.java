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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart.PCPARTITION.REFERENCE.Set;

public class StudyRecordConverter
		extends
		AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord> {
	private static final String methodType = "Method type";
	private static final String ph = "pH";
	private static final String Temperature = "Temperature";

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCPARTITION()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"P-CHEM","PC_PARTITION_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		if (sciPart.getPCPARTITION().getREFERENCE() != null)
			for (Set set : sciPart.getPCPARTITION().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCPARTITION().getGUIDELINE() != null)
			for (ScientificPart.PCPARTITION.GUIDELINE.Set set : sciPart
					.getPCPARTITION().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getPCPARTITION().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCPARTITION().getMETHODNOGUIDELINE()
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
		if (sciPart.getPCPARTITION().getMETHODTYPE() != null) {
			papp.getParameters().put(
					methodType,
					sciPart.getPCPARTITION().getMETHODTYPE().getSet()
							.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		} else {
			papp.getParameters().put(methodType, null);
		}

		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart.PCPARTITION.PARTCOEFF.Set set : sciPart
				.getPCPARTITION().getPARTCOEFF().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(set.getTYPE().getTYPEValue());
			effect.setConditions(new Params());
			papp.addEffect(effect);

			if (set.getVALUEUNITTEMPVALUE() != null) {
				effect.getConditions()
						.put(Temperature,
								(set.getVALUEUNITTEMPVALUE().getTEMPVALUE()
										.getValue() == null ? "" : set
										.getVALUEUNITTEMPVALUE().getTEMPVALUE()
										.getValue())
										+ " "
										+ set.getVALUEUNITTEMPVALUE()
												.getTEMPUNITValue());
			} else
				effect.getConditions().put(Temperature, null);
			if (set.getPRECISIONPHLOQUALIFIER() != null) {
				/* Change to go like this
				"conditions":	{"pH": {"loValue" : 4},"Temperature":"25 C"},
				*/
				Params phvalue = new Params();
				if (set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE()!= null) {
					phvalue.put("loQualifier",
							(set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue() == null) ? null : 
							set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue());
					
					phvalue.put(
							"loValue",getNumber(set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE().getValue()));
				}
				if (set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE()!= null) {
					phvalue.put("upQualifier",
							(set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue() == null) ? null : 
							set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue());					
					phvalue.put(
							"upValue",getNumber(set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE().getValue()));
				}
				effect.getConditions().put(ph, phvalue);

			} else {
				effect.getConditions().put(ph,null);
			}

			if (set.getPRECISIONLOQUALIFIER() != null) {
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
