package net.idea.i5._5.ambit2.sections.PC_BOILING_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart.PCBOILING.REFERENCE.Set;
import net.idea.i5._5.ambit2.Phrases;
import net.idea.i5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord, IParams, IParams> {

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.PC_BOILING);
	}

	@Override
	protected boolean hasScientificPart(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getScientificPart() != null;
	}

	@Override
	protected boolean isDataWaiving(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getDataWaiving() != null;
	}

	@Override
	protected String getTestMaterialIdentity(EndpointStudyRecord unmarshalled) {
		try {
			return unmarshalled.getScientificPart().getPCBOILING()
					.getTESTMATINDICATOR().getSet().getLISTBELOWSEL()
					.getLISTBELOWSEL();
		} catch (Exception x) {
			return null;
		}
	}

	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled,
			ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getPCBOILING().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getPCBOILING()
					.getREFERENCE().getSet()) {
				try {
					papp.setReference(set.getREFERENCEAUTHOR()
							.getREFERENCEAUTHOR().getValue());
				} catch (Exception x) {
					papp.setReference(null);
				}
				try {
					if (set.getREFERENCEYEAR() != null)
						try {
							papp.setReferenceYear(set.getREFERENCEYEAR()
									.getREFERENCEYEAR().getValue());
						} catch (Exception x) {
						}
					try {
						papp.setReferenceOwner(set.getREFERENCECOMPANYID()
								.getREFERENCECOMPANYID().getValue());
					} catch (Exception x) {
						papp.setReferenceOwner("");
					}
					isReferenceTypeAccepted(set.getPHRASEOTHERREFERENCETYPE() == null ? null
							: set.getPHRASEOTHERREFERENCETYPE()
									.getREFERENCETYPE());
					return;
				} catch (QACriteriaException x) {
					qax = x;
					continue;
				} catch (Exception x) {
					qax = new QACriteriaException(x.getMessage());
					continue;
				}

			}
		else if (!isReferenceTypeAccepted(null))
			qax = new QACriteriaException("Empty reference!");
		if (qax != null)
			throw qax;
	}

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record) == null)
			return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
				.getScientificPart();
		if (sciPart.getPCBOILING() == null)
			return null;

		record.clear();
		Experiment<IParams, IParams> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(), unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID(),
				unmarshalled.isRobustStudy(),
				unmarshalled.isUsedForClassification(),
				unmarshalled.isUsedForMSDS(), unmarshalled.getPurposeFlag()
						.getValueID(), unmarshalled.getStudyResultType()
						.getValueID(), getTestMaterialIdentity(unmarshalled));
		record.addMeasurement(papp);

		// UUID
		if (unmarshalled.getOwnerRef().getType()
				.equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}

		// citation
		parseReference(unmarshalled, papp);
		// TODO data owner - it's probably not in this file

		if (sciPart.getPCBOILING().getGUIDELINE() != null)
			for (ScientificPart.PCBOILING.GUIDELINE.Set set : sciPart
					.getPCBOILING().getGUIDELINE().getSet())
				try {
					papp.getProtocol().addGuideline(
							getGuideline(set.getPHRASEOTHERGUIDELINE()
									.getGUIDELINEValue(), set
									.getPHRASEOTHERGUIDELINE()
									.getGUIDELINETXT()));
				} catch (Exception x) {
				}
		if (sciPart.getPCBOILING().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCBOILING().getMETHODNOGUIDELINE().getSet()
								.getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		if (sciPart.getPCBOILING().getBOILINGPT() != null
				&& sciPart.getPCBOILING().getBOILINGPT().getSet() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart.PCBOILING.BOILINGPT.Set set : sciPart
					.getPCBOILING().getBOILINGPT().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory
						.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.BOILINGPOINT);
				papp.addEffect(effect);
				try {
					effect.getConditions().put(
							I5CONSTANTS.rDECOMPOSITION,
							set.getPHRASEOTHERDECOMPINDICATOR()
									.getDECOMPINDICATORValue());
				} catch (Exception x) {
					effect.getConditions()
							.put(I5CONSTANTS.rDECOMPOSITION, null);
				}

				if (set.getPRECISIONPRESSURELOQUALIFIER() != null) {

					Value vpvalue = new Value();
					if (set.getPRECISIONPRESSURELOQUALIFIER()
							.getPRESSURELOVALUE() != null) {
						vpvalue.setLoQualifier((set
								.getPRECISIONPRESSURELOQUALIFIER()
								.getPRESSURELOQUALIFIERValue() == null) ? null
								: set.getPRECISIONPRESSURELOQUALIFIER()
										.getPRESSURELOQUALIFIERValue());
						vpvalue.setLoValue(getNumber(set
								.getPRECISIONPRESSURELOQUALIFIER()
								.getPRESSURELOVALUE().getValue()));
					} else
						vpvalue.setLoValue(null);

					if (set.getPRECISIONPRESSURELOQUALIFIER()
							.getPRESSUREUPVALUE() != null) {
						vpvalue.setUpQualifier((set
								.getPRECISIONPRESSURELOQUALIFIER()
								.getPRESSUREUPQUALIFIER() == null) ? null : set
								.getPRECISIONPRESSURELOQUALIFIER()
								.getPRESSUREUPQUALIFIERValue());
						vpvalue.setUpValue(getNumber(set
								.getPRECISIONPRESSURELOQUALIFIER()
								.getPRESSUREUPVALUE().getValue()));
					} else
						vpvalue.setUpValue(null);
					if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUNIT() != null)
						vpvalue.setUnits(Phrases.phrasegroup_P02.get(set
								.getPRECISIONPRESSURELOQUALIFIER()
								.getPRESSUREUNIT()));
					effect.getConditions()
							.put(I5CONSTANTS.AtmPressure, vpvalue);

				} else {
					effect.getConditions().put(I5CONSTANTS.AtmPressure, null);
				}

				if (set.getPRECISIONLOQUALIFIER() != null) {
					effect.setUnit(Phrases.phrasegroup_A102.get(set
							.getPRECISIONLOQUALIFIER().getUNIT()));
					// effect.setUnit(set.getPRECISIONLOQUALIFIER().getUNITValue());

					if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
						try {
							effect.setLoQualifier(set.getPRECISIONLOQUALIFIER()
									.getLOQUALIFIERValue());
							effect.setLoValue(Double.parseDouble(set
									.getPRECISIONLOQUALIFIER().getLOVALUE()
									.getValue()));
						} catch (Exception x) {
							effect.setTextValue(set.getPRECISIONLOQUALIFIER()
									.getLOVALUE().getValue());
						}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
						try {
							effect.setUpQualifier(set.getPRECISIONLOQUALIFIER()
									.getUPQUALIFIERValue());
							effect.setUpValue(Double.parseDouble(set
									.getPRECISIONLOQUALIFIER().getUPVALUE()
									.getValue()));
						} catch (Exception x) {
							effect.setTextValue(set.getPRECISIONLOQUALIFIER()
									.getLOVALUE().getValue());
						}
				}
			}

		return record;
	}

}
