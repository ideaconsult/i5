package net.idea.i5._4.ambit2.sections.TO_SENSITIZATION_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_SENSITIZATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord.ScientificPart.TOSENSITIZATION.GUIDELINE.Set;
import net.idea.i5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;

public class StudyRecordConverter
		extends
		TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord> {
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_SENSITIZATION);
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
			return unmarshalled.getScientificPart().getTOSENSITIZATION()
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
		if (unmarshalled.getScientificPart().getTOSENSITIZATION()
				.getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord.ScientificPart.TOSENSITIZATION.REFERENCE.Set set : unmarshalled
					.getScientificPart().getTOSENSITIZATION().getREFERENCE()
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
		eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
				.getScientificPart();
		if (sciPart.getTOSENSITIZATION() == null)
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

		if (sciPart.getTOSENSITIZATION().getGUIDELINE() != null)
			for (Set set : sciPart.getTOSENSITIZATION().getGUIDELINE().getSet())
				try {
					papp.getProtocol().addGuideline(
							getGuideline(set.getPHRASEOTHERGUIDELINE()
									.getGUIDELINEValue(), set
									.getPHRASEOTHERGUIDELINE()
									.getGUIDELINETXT()));
				} catch (Exception x) {
				}
		if (sciPart.getTOSENSITIZATION().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getTOSENSITIZATION().getMETHODNOGUIDELINE()
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

		// Sensitization
		try {
			papp.getParameters().put(
					I5CONSTANTS.cSpecies,
					getValue(
							sciPart.getTOSENSITIZATION().getORGANISM().getSet()
									.getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getTOSENSITIZATION().getORGANISM().getSet()
									.getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cSpecies, null);
		}

		try {
			papp.getParameters().put(
					I5CONSTANTS.cTypeMethod,
					getValue(sciPart.getTOSENSITIZATION()
							.getTYPEINVIVOINVITRO().getSet()
							.getPHRASEOTHERLISTPOP().getLISTPOPValue(), sciPart
							.getTOSENSITIZATION().getTYPEINVIVOINVITRO()
							.getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cTypeMethod, null);
		}

		try {
			papp.getParameters().put(
					I5CONSTANTS.cTypeStudy,
					getValue(
							sciPart.getTOSENSITIZATION().getSTUDYTYPE()
									.getSet().getPHRASEOTHERLISTPOP()
									.getLISTPOPValue(), sciPart
									.getTOSENSITIZATION().getSTUDYTYPE()
									.getSet().getPHRASEOTHERLISTPOP()
									.getLISTPOPTXT()));
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cTypeStudy, null);
		}

		if (sciPart.getTOSENSITIZATION().getRESULTS() != null) {
			for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord.ScientificPart.TOSENSITIZATION.RESULTS.Set set : sciPart
					.getTOSENSITIZATION().getRESULTS().getSet())
				try {
					EffectRecord<String, IParams, String> effect = endpointCategory
							.createEffectRecord();
					effect.getConditions().put(I5CONSTANTS.cDoses,
							set.getDOSE());
					if (set.getTIMEPOINT() != null)
						effect.getConditions().put(I5CONSTANTS.cTimePoint,
								set.getTIMEPOINT().getTIMEPOINT().getValue());
					if (set.getNUMBERTOTAL() != null)
						effect.getConditions().put(
								"Total No in group",
								set.getNUMBERTOTAL().getNUMBERTOTAL()
										.getValue());
					effect.getConditions().put("Group",
							set.getPHRASEOTHERGROUP().getGROUPValue());
					effect.setEndpoint("Number positive");
					try {
						effect.setLoValue(Integer.parseInt(set
								.getNUMBERPOSITIVE().getNUMBERPOSITIVE()
								.getValue()));
						if (set.getCLINICALOBSERV() != null)
							effect.setTextValue(set.getCLINICALOBSERV()
									.getCLINICALOBSERV().getValue());
					} catch (Exception x) {
						effect.setTextValue(set.getNUMBERPOSITIVE()
								.getNUMBERPOSITIVE().getValue());
					}
					papp.addEffect(effect);
				} catch (Exception x) {

				}
		}

		if (sciPart.getTOSENSITIZATION().getINTERPRETRSSUBMITTER() != null) {
			String otherValue = null;
			try {
				otherValue = sciPart.getTOSENSITIZATION()
						.getINTERPRETRSSUBMITTER().getSet()
						.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXTXT()
						.getValue();
			} catch (Exception x) {
			}
			;

			setInterpretationResult(papp, sciPart.getTOSENSITIZATION()
					.getINTERPRETRSSUBMITTER().getSet()
					.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue(),
					otherValue);

		} else
			setInterpretationResult(papp, null, null);
		

		if (papp.getInterpretationResult() == null || "".equals(papp.getInterpretationResult()))
			try {
				papp.setInterpretationResult(sciPart.getTOSENSITIZATION()
						.getAPPLCL().getSet().getTEXTAREABELOW()
						.getTEXTAREABELOW().getValue());
			} catch (Exception x) {
			}

		if (sciPart.getTOSENSITIZATION().getCRITERIASUBMITTER() != null) {
			papp.setInterpretationCriteria(getValue(sciPart
					.getTOSENSITIZATION().getCRITERIASUBMITTER().getSet()
					.getPHRASEOTHERLISTPOP().getLISTPOPValue(), sciPart
					.getTOSENSITIZATION().getCRITERIASUBMITTER().getSet()
					.getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} else
			papp.setInterpretationCriteria(null);
		return record;
	}
}
