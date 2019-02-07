package net.idea.i5._4.ambit2.sections.PC_PARTITION_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.PC_PARTITION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart.PCPARTITION.REFERENCE.Set;
import net.idea.i5.ambit2.phrases.Phrases;
import net.idea.i5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20120101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord, IParams, IParams> {

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.PC_PARTITION);
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
			return unmarshalled.getScientificPart().getPCPARTITION()
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
		if (unmarshalled.getScientificPart().getPCPARTITION().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getPCPARTITION()
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
		eu.europa.echa.schemas.iuclid5._20120101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
				.getScientificPart();
		if (sciPart.getPCPARTITION() == null)
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

		if (sciPart.getPCPARTITION().getGUIDELINE() != null)
			for (ScientificPart.PCPARTITION.GUIDELINE.Set set : sciPart
					.getPCPARTITION().getGUIDELINE().getSet())
				try {
					papp.getProtocol().addGuideline(
							getGuideline(set.getPHRASEOTHERGUIDELINE()
									.getGUIDELINEValue(), set
									.getPHRASEOTHERGUIDELINE()
									.getGUIDELINETXT()));
				} catch (Exception x) {
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
					I5CONSTANTS.methodType,
					getValue(sciPart.getPCPARTITION().getMETHODTYPE().getSet()
							.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue(),
							sciPart.getPCPARTITION().getMETHODTYPE().getSet()
									.getPHRASEOTHERLISTPOPFIX()
									.getLISTPOPFIXTXT()));
		} else {
			papp.getParameters().put(I5CONSTANTS.methodType, null);
		}

		for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart.PCPARTITION.PARTCOEFF.Set set : sciPart
				.getPCPARTITION().getPARTCOEFF().getSet()) {
			EffectRecord<String, IParams, String> effect = endpointCategory
					.createEffectRecord();
			try {
				effect.setEndpoint(set.getTYPE().getTYPEValue());
			} catch (Exception x) {
			}
			papp.addEffect(effect);

			if (set.getVALUEUNITTEMPVALUE() != null) {
				Value tvalue = new Value();
				if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE() != null) {
					tvalue.setLoValue(getNumber(set.getVALUEUNITTEMPVALUE()
							.getTEMPVALUE().getValue()));
				} else
					tvalue.setLoValue(null);

				if (set.getVALUEUNITTEMPVALUE().getTEMPUNIT() != null)
					tvalue.setUnits(Phrases.phrasegroup_A102.get(set
							.getVALUEUNITTEMPVALUE().getTEMPUNIT())); // here
				// the
				// unit
				// is
				// assumed
				// ...
				effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);
			} else
				effect.getConditions().put(I5CONSTANTS.cTemperature, null);

			if (set.getPRECISIONPHLOQUALIFIER() != null) {
				/*
				 * Change to go like this "conditions": {"pH": {"loValue" :
				 * 4},"Temperature":"25 C"},
				 */
				Value phvalue = new Value();
				if (set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE() != null) {
					phvalue.setLoQualifier(getQualifier(set
							.getPRECISIONPHLOQUALIFIER()
							.getPHLOQUALIFIERValue()));

					phvalue.setLoValue(getNumber(set
							.getPRECISIONPHLOQUALIFIER().getPHLOVALUE()
							.getValue()));
				} else
					phvalue.setLoValue(null);
				if (set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE() != null) {
					phvalue.setUpQualifier(getQualifier(set
							.getPRECISIONPHLOQUALIFIER()
							.getPHLOQUALIFIERValue()));
					phvalue.setUpValue(getNumber(set
							.getPRECISIONPHLOQUALIFIER().getPHUPVALUE()
							.getValue()));
				} else
					phvalue.setUpValue(null);
				effect.getConditions().put(I5CONSTANTS.pH, phvalue);

			} else {
				effect.getConditions().put(I5CONSTANTS.pH, null);
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
