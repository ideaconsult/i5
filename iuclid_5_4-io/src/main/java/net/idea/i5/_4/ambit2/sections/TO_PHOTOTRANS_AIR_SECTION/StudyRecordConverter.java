package net.idea.i5._4.ambit2.sections.TO_PHOTOTRANS_AIR_SECTION;

import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5.ambit2.sections.ENVFATEStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart.TOPHOTOTRANSAIR.REFERENCE.Set;

public class StudyRecordConverter
		extends
		ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord> {
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_PHOTOTRANS_AIR);
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
			return unmarshalled.getScientificPart().getTOPHOTOTRANSAIR()
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
		if (unmarshalled.getScientificPart().getTOPHOTOTRANSAIR()
				.getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart()
					.getTOPHOTOTRANSAIR().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
				.getScientificPart();
		if (sciPart.getTOPHOTOTRANSAIR() == null)
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
		if (sciPart.getTOPHOTOTRANSAIR().getGUIDELINE() != null)
			for (ScientificPart.TOPHOTOTRANSAIR.GUIDELINE.Set set : sciPart
					.getTOPHOTOTRANSAIR().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE() != null)
					papp.getProtocol().addGuideline(
							getGuideline(set.getPHRASEOTHERGUIDELINE()
									.getGUIDELINEValue(), set
									.getPHRASEOTHERGUIDELINE()
									.getGUIDELINETXT()));

			}
		if (sciPart.getTOPHOTOTRANSAIR().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getTOPHOTOTRANSAIR().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		// citation

		parseReference(unmarshalled, papp);
		// papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());

		StringBuilder reactant = null;
		papp.getParameters().put(I5CONSTANTS.pReactant, null);
		if (sciPart.getTOPHOTOTRANSAIR().getRATECONSTANT() != null) {

			for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart.TOPHOTOTRANSAIR.RATECONSTANT.Set set : sciPart
					.getTOPHOTOTRANSAIR().getRATECONSTANT().getSet()) {
				if (reactant == null)
					reactant = new StringBuilder();
				else
					reactant.append(", ");
				reactant.append(set.getPHRASEOTHERTYPE().getTYPEValue());
			}
		}
		papp.getParameters().put(I5CONSTANTS.pReactant,
				reactant == null ? null : reactant.toString());

		if (sciPart.getTOPHOTOTRANSAIR().getDISSIP() != null) {
			for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart.TOPHOTOTRANSAIR.DISSIP.Set set : sciPart
					.getTOPHOTOTRANSAIR().getDISSIP().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory
						.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rPERCENTILE_DT50);
				papp.addEffect(effect);
				try {
					effect.getConditions().put(
							I5CONSTANTS.TestCondition,
							set.getTESTCONDITION().getTESTCONDITION()
									.getValue());
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.TestCondition, null);
				}

				effect.getConditions().put(I5CONSTANTS.pReactant,
						reactant == null ? null : reactant.toString());

				// results
				if (set.getPRECISIONHALFLIFELOQUALIFIER() != null) {
					effect.setUnit(set.getPRECISIONHALFLIFELOQUALIFIER()
							.getHALFLIFEUNITValue());
					if (set.getPRECISIONHALFLIFELOQUALIFIER()
							.getHALFLIFELOVALUE() != null)
						try {
							effect.setLoQualifier(set
									.getPRECISIONHALFLIFELOQUALIFIER()
									.getHALFLIFELOQUALIFIERValue());
							effect.setLoValue(Double.parseDouble(set
									.getPRECISIONHALFLIFELOQUALIFIER()
									.getHALFLIFELOVALUE().getValue()));
						} catch (Exception x) {
							effect.setTextValue(set
									.getPRECISIONHALFLIFELOQUALIFIER()
									.getHALFLIFELOVALUE().getValue());
						}
					if (set.getPRECISIONHALFLIFELOQUALIFIER()
							.getHALFLIFEUPVALUE() != null)
						try {
							effect.setUpQualifier(set
									.getPRECISIONHALFLIFELOQUALIFIER()
									.getHALFLIFEUPQUALIFIERValue());
							effect.setUpValue(Double.parseDouble(set
									.getPRECISIONHALFLIFELOQUALIFIER()
									.getHALFLIFEUPVALUE().getValue()));
						} catch (Exception x) {
							effect.setTextValue(set
									.getPRECISIONHALFLIFELOQUALIFIER()
									.getHALFLIFEUPVALUE().getValue());
						}
				}

			}
		} else {
			EffectRecord<String, IParams, String> effect = endpointCategory
					.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.rPERCENTILE_DT50);
			effect.getConditions().put(I5CONSTANTS.TestCondition, null);
			papp.addEffect(effect);
		}

		return record;
	}
}
