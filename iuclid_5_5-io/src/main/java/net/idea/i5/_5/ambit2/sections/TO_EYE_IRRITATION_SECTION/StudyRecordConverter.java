package net.idea.i5._5.ambit2.sections.TO_EYE_IRRITATION_SECTION;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_EYE_IRRITATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_EYE_IRRITATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_EYE_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart.TOEYEIRRITATION.GUIDELINE.Set;

public class StudyRecordConverter
		extends
		TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_EYE_IRRITATION_SECTION.EndpointStudyRecord> {
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_EYE_IRRITATION);
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
			return unmarshalled.getScientificPart().getTOEYEIRRITATION()
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
		if (unmarshalled.getScientificPart().getTOEYEIRRITATION()
				.getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_EYE_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart.TOEYEIRRITATION.REFERENCE.Set set : unmarshalled
					.getScientificPart().getTOEYEIRRITATION().getREFERENCE()
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_EYE_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
				.getScientificPart();
		if (sciPart.getTOEYEIRRITATION() == null)
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

		if (sciPart.getTOEYEIRRITATION().getGUIDELINE() != null)
			for (Set set : sciPart.getTOEYEIRRITATION().getGUIDELINE().getSet())
				try {
					papp.getProtocol().addGuideline(
							getGuideline(set.getPHRASEOTHERGUIDELINE()
									.getGUIDELINEValue(), set
									.getPHRASEOTHERGUIDELINE()
									.getGUIDELINETXT()));
				} catch (Exception x) {
				}
		if (sciPart.getTOEYEIRRITATION().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getTOEYEIRRITATION().getMETHODNOGUIDELINE()
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

		parseReference(unmarshalled, papp);
		// papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());

		// Skin irritation/corrosion
		try {
			papp.getParameters().put(
					I5CONSTANTS.cSpecies,
					getValue(
							sciPart.getTOEYEIRRITATION().getORGANISM().getSet()
									.getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getTOEYEIRRITATION().getORGANISM().getSet()
									.getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cSpecies, null);
		}

		try {
			papp.getParameters().put(
					I5CONSTANTS.cTypeMethod,
					getValue(sciPart.getTOEYEIRRITATION()
							.getTYPEINVIVOINVITRO().getSet()
							.getPHRASEOTHERLISTPOP().getLISTPOPValue(), sciPart
							.getTOEYEIRRITATION().getTYPEINVIVOINVITRO()
							.getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cTypeMethod, null);
		}

		if (sciPart.getTOEYEIRRITATION().getOVERALLRS() != null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_EYE_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart.TOEYEIRRITATION.OVERALLRS.Set set : sciPart
					.getTOEYEIRRITATION().getOVERALLRS().getSet())
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
								set.getTIMEPOINT().getTIMEPOINT().getValue());
					} catch (Exception x) {
					}

					try {
						effect.getConditions().put(I5CONSTANTS.cMaxScore,
								set.getSCALE().getSCALE().getValue());
					} catch (Exception x) {
					}
					papp.addEffect(effect);
				} catch (Exception x) {

				}
		}

		if (sciPart.getTOEYEIRRITATION().getINTERPRETRSSUBMITTER() != null) {
			String otherValue = null;
			try {
				otherValue = sciPart.getTOEYEIRRITATION()
						.getINTERPRETRSSUBMITTER().getSet()
						.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXTXT()
						.getValue();
			} catch (Exception x) {
			}
			;

			setInterpretationResult(papp, sciPart.getTOEYEIRRITATION()
					.getINTERPRETRSSUBMITTER().getSet()
					.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue(),
					otherValue);

		} else
			setInterpretationResult(papp, null, null);

		if (papp.getInterpretationResult() == null || "".equals(papp.getInterpretationResult()))
			try {
				papp.setInterpretationResult(sciPart.getTOEYEIRRITATION()
						.getAPPLCL().getSet().getTEXTAREABELOW()
						.getTEXTAREABELOW().getValue());
			} catch (Exception x) {
			}

		if (sciPart.getTOEYEIRRITATION().getCRITERIASUBMITTER() != null) {
			papp.setInterpretationCriteria(getValue(sciPart
					.getTOEYEIRRITATION().getCRITERIASUBMITTER().getSet()
					.getPHRASEOTHERLISTPOP().getLISTPOPValue(), sciPart
					.getTOEYEIRRITATION().getCRITERIASUBMITTER().getSet()
					.getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} else
			papp.setInterpretationCriteria("");
		return record;
	}
}
