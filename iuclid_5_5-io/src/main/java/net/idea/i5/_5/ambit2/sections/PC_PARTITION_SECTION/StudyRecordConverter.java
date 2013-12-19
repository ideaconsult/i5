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

public class StudyRecordConverter
		extends
		AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord> {
	private static final String methodType = "Method type";
	private static final String phLower = "pH (lower)";
	private static final String phUpper = "pH (upper)";
	private static final String Temperature = "Temperature";

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCPARTITION()==null) return null;

		record.clear();
		ProtocolApplication<Protocol, Params, String, Params, String> papp = new ProtocolApplication<Protocol, Params, String, Params, String>(
				new Protocol(unmarshalled.getName()));
		papp.getProtocol().setTopCategory("P-CHEM");
		papp.getProtocol().setCategory("PC_PARTITION_SECTION");
		papp.setParameters(new Params());
		record.addtMeasurement(papp);
		// UUID
		papp.setDocumentUUID(unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getOwnerRef().getType()
				.equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCPARTITION().getGUIDELINE() != null)
			for (ScientificPart.PCPARTITION.GUIDELINE.Set set : sciPart
					.getPCPARTITION().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuidance(
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getPCPARTITION().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuidance(
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
				effect.getConditions().put(
						phLower,
						(set.getPRECISIONPHLOQUALIFIER()
								.getPHLOQUALIFIERValue() == null) ? "" : set
								.getPRECISIONPHLOQUALIFIER()
								.getPHLOQUALIFIERValue()
								+ " "
								+ set.getPRECISIONPHLOQUALIFIER()
										.getPHLOVALUE().getValue());
				effect.getConditions().put(
						phUpper,
						set.getPRECISIONPHLOQUALIFIER().getPHUPQUALIFIERValue()
								+ " "
								+ set.getPRECISIONPHLOQUALIFIER()
										.getPHUPVALUE().getValue());

			} else {
				effect.getConditions().put(phLower, "");
				effect.getConditions().put(phUpper, "");
			}

			if (set.getPRECISIONLOQUALIFIER() != null) {
				if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
					try {
						effect.setLoValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER()
								.getLOQUALIFIERValue());
					} catch (Exception x) {
					}
				if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
					try {
						effect.setUpValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getUPVALUE()
								.getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER()
								.getUPQUALIFIERValue());
					} catch (Exception x) {
					}
			}
		}

		System.out.println(papp);
		return record;
	}
}
