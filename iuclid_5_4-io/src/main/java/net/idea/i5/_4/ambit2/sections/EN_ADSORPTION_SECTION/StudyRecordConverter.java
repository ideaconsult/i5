package net.idea.i5._4.ambit2.sections.EN_ADSORPTION_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_ADSORPTION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart.ENADSORPTION.REFERENCE.Set;
import net.idea.i5.ambit2.phrases.Phrases;
import net.idea.i5.ambit2.sections.ENVFATEStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;

public class StudyRecordConverter
	extends
	ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord> {

    public StudyRecordConverter() {
	super(I5_ROOT_OBJECTS.EN_ADSORPTION);
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
	    return unmarshalled.getScientificPart().getENADSORPTION().getTESTMATINDICATOR().getSet().getLISTBELOWSEL()
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
	if (unmarshalled.getScientificPart().getENADSORPTION().getREFERENCE() != null)
	    for (Set set : unmarshalled.getScientificPart().getENADSORPTION().getREFERENCE().getSet()) {
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
	eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
		.getScientificPart();
	if (sciPart.getENADSORPTION() == null)
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
	if (sciPart.getENADSORPTION().getGUIDELINE() != null)
	    for (ScientificPart.ENADSORPTION.GUIDELINE.Set set : sciPart.getENADSORPTION().getGUIDELINE().getSet()) {
		if (set.getPHRASEOTHERGUIDELINE() != null)
		    papp.getProtocol().addGuideline(
			    getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(), set
				    .getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));

	    }
	if (sciPart.getENADSORPTION().getMETHODNOGUIDELINE() != null)
	    try {
		papp.getProtocol().addGuideline(
			sciPart.getENADSORPTION().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW()
				.getValue());
	    } catch (Exception x) {
	    }

	// citation
	parseReference(unmarshalled, papp);

	if (sciPart.getENADSORPTION().getRESULTSBATCHDETAILS() != null) {
	    for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart.ENADSORPTION.ADSORPTIONKOC.Set set : sciPart
		    .getENADSORPTION().getADSORPTIONKOC().getSet()) {
		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(set.getPHRASEOTHERTYPE().getTYPEValue());
		papp.addEffect(effect);

		// temperature
		if (set.getVALUEUNITTEMPVALUE() != null) {
		    Value tvalue = new Value();
		    if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE() != null) {
			tvalue.setLoValue(getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
		    }
		    tvalue.setUnits(Phrases.phrasegroup_A102.get(set.getVALUEUNITTEMPVALUE().getTEMPUNIT())); // here
													      // the
													      // unit
													      // is
													      // assumed
													      // ...
		    effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);
		} else
		    effect.getConditions().put(I5CONSTANTS.cTemperature, null);

		try {
		    effect.getConditions().put(I5CONSTANTS.Remark, set.getREMARKS().getREMARKS().getValue());
		} catch (Exception x) {
		    effect.getConditions().put(I5CONSTANTS.Remark, null);
		}

		if (set.getPRECISIONOCLOQUALIFIER() != null) {
		    Value oc = new Value(); // % organic carbon
		    oc.setUnits("%");
		    if (set.getPRECISIONOCLOQUALIFIER().getOCLOVALUE() != null)
			try {
			    oc.setLoValue(Double.parseDouble(set.getPRECISIONOCLOQUALIFIER().getOCLOVALUE().getValue()));
			    oc.setLoQualifier(set.getPRECISIONOCLOQUALIFIER().getOCLOQUALIFIER());
			} catch (Exception x) {
			}

		    if (set.getPRECISIONOCLOQUALIFIER().getOCUPVALUE() != null)
			try {
			    oc.setUpValue(Double.parseDouble(set.getPRECISIONOCLOQUALIFIER().getOCUPVALUE().getValue()));
			    oc.setUpQualifier(set.getPRECISIONOCLOQUALIFIER().getOCUPQUALIFIERValue());
			} catch (Exception x) {
			}
		    effect.getConditions().put(I5CONSTANTS.rOrgCarbonPercent, null);
		}

		if (set.getPRECISIONLOQUALIFIER() != null) {
		    if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
			try {
			    effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
			    effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
			} catch (Exception x) {
			}
		    if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
			try {
			    effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
			    effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
			} catch (Exception x) {
			}
		}

	    }
	}
	return record;
    }
}
