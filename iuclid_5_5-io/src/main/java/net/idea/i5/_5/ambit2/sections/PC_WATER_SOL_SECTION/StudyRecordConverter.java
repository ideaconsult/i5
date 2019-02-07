package net.idea.i5._5.ambit2.sections.PC_WATER_SOL_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord.ScientificPart.PCWATERSOL.REFERENCE.Set;
import net.idea.i5._5.ambit2.Phrases;
import net.idea.i5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;

public class StudyRecordConverter
	extends
	PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord, IParams, IParams> {
    public StudyRecordConverter() {
	super(I5_ROOT_OBJECTS.PC_WATER_SOL);
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
	    return unmarshalled.getScientificPart().getPCWATERSOL().getTESTMATINDICATOR().getSet().getLISTBELOWSEL()
		    .getLISTBELOWSEL();
	} catch (Exception x) {
	    return null;
	}
    }

    @Override
    protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp)
	    throws QACriteriaException {
	// citation
	QACriteriaException qax = null;
	if (unmarshalled.getScientificPart().getPCWATERSOL().getREFERENCE() != null)
	    for (Set set : unmarshalled.getScientificPart().getPCWATERSOL().getREFERENCE().getSet()) {
		try {
		    papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
		} catch (Exception x) {
		    papp.setReference(null);
		}
		try {
		    if (set.getREFERENCEYEAR() != null)
			try {
			    papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
			} catch (Exception x) {
			}
		    try {
			papp.setReferenceOwner(set.getREFERENCECOMPANYID().getREFERENCECOMPANYID().getValue());
		    } catch (Exception x) {
			papp.setReferenceOwner("");
		    }
		    isReferenceTypeAccepted(set.getPHRASEOTHERREFERENCETYPE() == null ? null : set
			    .getPHRASEOTHERREFERENCETYPE().getREFERENCETYPE());
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
    public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record)
	    throws AmbitException {
	if (super.transform2record(unmarshalled, record) == null)
	    return null;
	eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
		.getScientificPart();
	if (sciPart.getPCWATERSOL() == null)
	    return null;

	record.clear();
	Experiment<IParams, IParams> papp = createProtocolApplication(unmarshalled.getDocumentReferencePK(),
		unmarshalled.getName());
	parseReliability(papp, unmarshalled.getReliability().getValueID(), unmarshalled.isRobustStudy(),
		unmarshalled.isUsedForClassification(), unmarshalled.isUsedForMSDS(), unmarshalled.getPurposeFlag()
			.getValueID(), unmarshalled.getStudyResultType().getValueID(),
		getTestMaterialIdentity(unmarshalled));
	record.addMeasurement(papp);

	// UUID
	if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
	    setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
	}

	// citation
	parseReference(unmarshalled, papp);

	if (sciPart.getPCWATERSOL().getGUIDELINE() != null)
	    for (ScientificPart.PCWATERSOL.GUIDELINE.Set set : sciPart.getPCWATERSOL().getGUIDELINE().getSet())
		try {
		    papp.getProtocol().addGuideline(
			    getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(), set
				    .getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
		} catch (Exception x) {
		}
	if (sciPart.getPCWATERSOL().getMETHODNOGUIDELINE() != null)
	    try {
		papp.getProtocol().addGuideline(
			sciPart.getPCWATERSOL().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW()
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
		    I5CONSTANTS.methodType,
		    getValue(sciPart.getPCWATERSOL().getMETHODTYPE().getSet().getPHRASEOTHERLISTPOPFIX()
			    .getLISTPOPFIXValue(), sciPart.getPCWATERSOL().getMETHODTYPE().getSet()
			    .getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXTXT()));
	} else {
	    papp.getParameters().put(I5CONSTANTS.methodType, null);
	}

	if (sciPart.getPCWATERSOL().getWATERSOL() != null)
	    for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_WATER_SOL_SECTION.EndpointStudyRecord.ScientificPart.PCWATERSOL.WATERSOL.Set set : sciPart
		    .getPCWATERSOL().getWATERSOL().getSet()) {
		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(I5CONSTANTS.eWaterSolubility);
		papp.addEffect(effect);

		if (set.getVALUEUNITTEMPVALUE() != null) {
		    Value tvalue = new Value();
		    if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE() != null) {
			tvalue.setLoValue(getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
		    }
		    if (set.getVALUEUNITTEMPVALUE() != null)
			tvalue.setUnits(Phrases.phrasegroup_A102.get(set.getVALUEUNITTEMPVALUE().getTEMPUNIT()));
		    effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);
		} else
		    effect.getConditions().put(I5CONSTANTS.cTemperature, null);

		if (set.getPRECISIONPHLOQUALIFIER() != null) {
		    Value phvalue = new Value();
		    if (set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE() != null) {
			phvalue.setLoQualifier((set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue() == null) ? null
				: set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue());

			phvalue.setLoValue(getNumber(set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE().getValue()));
		    } else
			phvalue.setLoValue(null);
		    if (set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE() != null) {
			phvalue.setUpQualifier((set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue() == null) ? null
				: set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue());
			phvalue.setUpValue(getNumber(set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE().getValue()));
		    } else
			phvalue.setUpValue(null);
		    effect.getConditions().put(I5CONSTANTS.pH, phvalue);

		} else {
		    effect.getConditions().put(I5CONSTANTS.pH, null);
		}
		try {
		    effect.getConditions().put(I5CONSTANTS.Remark, set.getREM().getREM().getValue());
		} catch (Exception x) {
		    effect.getConditions().put(I5CONSTANTS.Remark, null);
		}
		if (set.getPRECISIONLOQUALIFIER() != null) {
		    effect.setUnit(getUnit(set.getPRECISIONLOQUALIFIER().getUNITValue(), set.getPRECISIONLOQUALIFIER()
			    .getUNITTXT() == null ? null : set.getPRECISIONLOQUALIFIER().getUNITTXT().getValue()));

		    if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
			try {
			    effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
			    effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
			} catch (Exception x) {
			    effect.setTextValue(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
			}
		    if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
			try {
			    effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
			    effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
			} catch (Exception x) {
			    effect.setTextValue(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
			}
		}

	    }
	return record;
    }

}
