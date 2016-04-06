package net.idea.i5._5.ambit2.sections.TO_SKIN_IRRITATION_SECTION;

import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart.TOSKINIRRITATION.GUIDELINE.Set;

public class StudyRecordConverter
		extends
		TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord> {
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_SKIN_IRRITATION);
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
			return unmarshalled.getScientificPart().getTOSKINIRRITATION()
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
		if (unmarshalled.getScientificPart().getTOSKINIRRITATION()
				.getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart.TOSKINIRRITATION.REFERENCE.Set set : unmarshalled
					.getScientificPart().getTOSKINIRRITATION().getREFERENCE()
					.getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
				.getScientificPart();
		if (sciPart.getTOSKINIRRITATION() == null)
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
		// TODO data owner - it's probably not in this file

		if (sciPart.getTOSKINIRRITATION().getGUIDELINE() != null)
			for (Set set : sciPart.getTOSKINIRRITATION().getGUIDELINE()
					.getSet())
				try {
					papp.getProtocol().addGuideline(
							getGuideline(set.getPHRASEOTHERGUIDELINE()
									.getGUIDELINEValue(), set
									.getPHRASEOTHERGUIDELINE()
									.getGUIDELINETXT()));
				} catch (Exception x) {
				}
		if (sciPart.getTOSKINIRRITATION().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getTOSKINIRRITATION().getMETHODNOGUIDELINE()
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

		// year

		parseReference(unmarshalled, papp);
		// papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());

		// Skin irritation/corrosion
		try {
			papp.getParameters().put(
					I5CONSTANTS.cSpecies,
					getValue(
							sciPart.getTOSKINIRRITATION().getORGANISM()
									.getSet().getPHRASEOTHERLISTPOP()
									.getLISTPOPValue(), sciPart
									.getTOSKINIRRITATION().getORGANISM()
									.getSet().getPHRASEOTHERLISTPOP()
									.getLISTPOPTXT()));
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cSpecies, null);
		}

		try {
			papp.getParameters().put(
					I5CONSTANTS.cTypeMethod,
					getValue(sciPart.getTOSKINIRRITATION()
							.getTYPEINVIVOINVITRO().getSet()
							.getPHRASEOTHERLISTPOP().getLISTPOPValue(), sciPart
							.getTOSKINIRRITATION().getTYPEINVIVOINVITRO()
							.getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cTypeMethod, null);
		}

		if (sciPart.getTOSKINIRRITATION().getOVERALLRS() != null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart.TOSKINIRRITATION.OVERALLRS.Set set : sciPart
					.getTOSKINIRRITATION().getOVERALLRS().getSet())
				try {
					EffectRecord<String, IParams, String> effect = endpointCategory
							.createEffectRecord();
					effect.setEndpoint(getValue(set.getPHRASEOTHERPARAMETER()
							.getPARAMETERValue(), set.getPHRASEOTHERPARAMETER()
							.getPARAMETERTXT()));
					try {
						effect.setLoQualifier(set
								.getPRECISIONSCORELOQUALIFIER()
								.getSCORELOQUALIFIERValue());
						effect.setUpQualifier(set
								.getPRECISIONSCORELOQUALIFIER()
								.getSCOREUPQUALIFIERValue());
					} catch (Exception x) {
					}
					try {
						effect.setLoValue(Double.parseDouble(set
								.getPRECISIONSCORELOQUALIFIER()
								.getSCORELOVALUE().getValue()));
					} catch (Exception x) {
						effect.setTextValue(set.getPRECISIONSCORELOQUALIFIER()
								.getSCORELOVALUE().getValue());
					}
					try {
						effect.setUpValue(Double.parseDouble(set
								.getPRECISIONSCORELOQUALIFIER()
								.getSCOREUPVALUE().getValue()));
					} catch (Exception x) {
					}

					if (set.getPHRASEOTHERBASIS() != null)
						try {
							effect.getConditions().put(
									I5CONSTANTS.cBasisForEffect,
									set.getPHRASEOTHERBASIS().getBASISValue());
						} catch (Exception x) {
						}

					if (set.getPHRASEOTHERREVERSIBILITY() != null)
						try {
							effect.getConditions().put(
									I5CONSTANTS.cReversibility,
									set.getPHRASEOTHERREVERSIBILITY()
											.getREVERSIBILITYValue());
						} catch (Exception x) {
						}

					try {
						effect.getConditions().put(I5CONSTANTS.cTimePoint,
								set.getTIMEPOINT());
					} catch (Exception x) {
					}

					try {
						effect.getConditions().put(I5CONSTANTS.cMaxScore,
								set.getSCALE().getSCALE().toString());
					} catch (Exception x) {
					}
					papp.addEffect(effect);
				} catch (Exception x) {

				}
		}
		if (sciPart.getTOSKINIRRITATION().getINTERPRETRSSUBMITTER() != null) {
			String otherValue = null;
			try {
				otherValue = sciPart.getTOSKINIRRITATION()
						.getINTERPRETRSSUBMITTER().getSet()
						.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXTXT()
						.getValue();
			} catch (Exception x) {
			}
			;

			setInterpretationResult(papp, sciPart.getTOSKINIRRITATION()
					.getINTERPRETRSSUBMITTER().getSet()
					.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue(),
					otherValue);

		} else
			setInterpretationResult(papp, null, null);

		if (sciPart.getTOSKINIRRITATION().getCRITERIASUBMITTER() != null) {
			papp.setInterpretationCriteria(getValue(sciPart
					.getTOSKINIRRITATION().getCRITERIASUBMITTER().getSet()
					.getPHRASEOTHERLISTPOP().getLISTPOPValue(), sciPart
					.getTOSKINIRRITATION().getCRITERIASUBMITTER().getSet()
					.getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} else
			papp.setInterpretationCriteria("");
		return record;
	}
}
