package net.idea.i5._5.ambit2.sections.PC_DISSOCIATION_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart.PCDISSOCIATION.REFERENCE.Set;
import net.idea.i5._5.ambit2.Phrases;
import net.idea.i5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;

public class StudyRecordConverter
	extends
	PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord, IParams, IParams> {

    public StudyRecordConverter() {
	super(I5_ROOT_OBJECTS.PC_DISSOCIATION);
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
	    return unmarshalled.getScientificPart().getPCDISSOCIATION().getTESTMATINDICATOR().getSet()
		    .getLISTBELOWSEL().getLISTBELOWSEL();
	} catch (Exception x) {
	    return null;
	}
    }

    @Override
    protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp)
	    throws QACriteriaException {
	// citation
	QACriteriaException qax = null;
	if (unmarshalled.getScientificPart().getPCDISSOCIATION().getREFERENCE() != null)
	    for (Set set : unmarshalled.getScientificPart().getPCDISSOCIATION().getREFERENCE().getSet()) {
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
	eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
		.getScientificPart();
	if (sciPart.getPCDISSOCIATION() == null)
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

	if (sciPart.getPCDISSOCIATION().getGUIDELINE() != null)
	    for (ScientificPart.PCDISSOCIATION.GUIDELINE.Set set : sciPart.getPCDISSOCIATION().getGUIDELINE().getSet()) {
		papp.getProtocol().addGuideline(
			getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(), set.getPHRASEOTHERGUIDELINE()
				.getGUIDELINETXT()));

	    }
	if (sciPart.getPCDISSOCIATION().getMETHODNOGUIDELINE() != null)
	    try {
		papp.getProtocol().addGuideline(
			sciPart.getPCDISSOCIATION().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW()
				.getTEXTAREABELOW().getValue());
	    } catch (Exception x) {
	    }

	if (sciPart.getPCDISSOCIATION().getPKA() != null && sciPart.getPCDISSOCIATION().getPKA().getSet() != null)
	    for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart.PCDISSOCIATION.PKA.Set set : sciPart
		    .getPCDISSOCIATION().getPKA().getSet()) {
		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(I5CONSTANTS.pKa);
		papp.addEffect(effect);

		if (set.getVALUEUNITTEMPVALUE() != null) {
		    Value tvalue = new Value();
		    if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE() != null) {
			tvalue.setLoValue(getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
		    } else
			tvalue.setLoValue(null);
		    if (set.getVALUEUNITTEMPVALUE() != null)
			tvalue.setUnits(Phrases.phrasegroup_A102.get(set.getVALUEUNITTEMPVALUE().getTEMPUNIT()));
		    effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);
		} else
		    effect.getConditions().put(I5CONSTANTS.cTemperature, null);

		if (set.getNO() != null) {
		    Value nvalue = new Value();
		    nvalue.setLoValue(set.getNO().getNOValue());
		    effect.getConditions().put(I5CONSTANTS.rNo, nvalue);
		} else
		    effect.getConditions().put(I5CONSTANTS.rNo, null);

		if (set.getPRECISIONVALUELOQUALIFIER() != null) {
		    if (set.getPRECISIONVALUELOQUALIFIER().getVALUELOVALUE() != null)
			try {
			    effect.setLoQualifier(getQualifier(set.getPRECISIONVALUELOQUALIFIER()
				    .getVALUELOQUALIFIERValue()));
			    effect.setLoValue(Double.parseDouble(set.getPRECISIONVALUELOQUALIFIER().getVALUELOVALUE()
				    .getValue()));
			} catch (Exception x) {
			    effect.setTextValue(set.getPRECISIONVALUELOQUALIFIER().getVALUELOQUALIFIERValue());
			}
		    if (set.getPRECISIONVALUELOQUALIFIER().getVALUEUPVALUE() != null)
			try {
			    effect.setUpQualifier(getQualifier(set.getPRECISIONVALUELOQUALIFIER()
				    .getVALUEUPQUALIFIERValue()));
			    effect.setUpValue(Double.parseDouble(set.getPRECISIONVALUELOQUALIFIER().getVALUEUPVALUE()
				    .getValue()));
			} catch (Exception x) {
			    effect.setTextValue(set.getPRECISIONVALUELOQUALIFIER().getVALUEUPQUALIFIERValue());
			}
		}
	    }

	return record;
    }

}
