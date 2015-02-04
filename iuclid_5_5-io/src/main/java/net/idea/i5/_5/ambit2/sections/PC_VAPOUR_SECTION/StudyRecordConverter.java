package net.idea.i5._5.ambit2.sections.PC_VAPOUR_SECTION;

import net.idea.i5._5.ambit2.Phrases;
import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart.PCVAPOUR.REFERENCE.Set;

public class StudyRecordConverter
	extends
	PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord, IParams, IParams> {
    public StudyRecordConverter() {
	super(I5_ROOT_OBJECTS.PC_VAPOUR);
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
	    return unmarshalled.getScientificPart().getPCVAPOUR().getTESTMATINDICATOR().getSet().getLISTBELOWSEL()
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
	if (unmarshalled.getScientificPart().getPCVAPOUR().getREFERENCE() != null)
	    for (Set set : unmarshalled.getScientificPart().getPCVAPOUR().getREFERENCE().getSet()) {
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
	else
	    qax = new QACriteriaException("Empty reference!");
	if (qax != null)
	    throw qax;
    }

    @Override
    public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record)
	    throws AmbitException {
	if (super.transform2record(unmarshalled, record) == null)
	    return null;
	eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
		.getScientificPart();
	if (sciPart.getPCVAPOUR() == null)
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

	if (sciPart.getPCVAPOUR().getGUIDELINE() != null)
	    for (ScientificPart.PCVAPOUR.GUIDELINE.Set set : sciPart.getPCVAPOUR().getGUIDELINE().getSet())
		try {
		    papp.getProtocol().addGuideline(
			    getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(), set
				    .getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
		} catch (Exception x) {
		}
	if (sciPart.getPCVAPOUR().getMETHODNOGUIDELINE() != null)
	    try {
		papp.getProtocol().addGuideline(
			sciPart.getPCVAPOUR().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW()
				.getValue());
	    } catch (Exception x) {
	    }
	/*
	 * if (sciPart.getPCVAPOUR().getTRANSITION().getSet()!=null) for
	 * (eu.europa
	 * .echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION
	 * .EndpointStudyRecord.ScientificPart.PCVAPOUR.TRANSITION.Set set :
	 * sciPart.getPCVAPOUR().getTRANSITION().getSet()) {
	 * 
	 * }
	 */

	if (sciPart.getPCVAPOUR().getVAPOURPR() != null && sciPart.getPCVAPOUR().getVAPOURPR().getSet() != null)
	    for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart.PCVAPOUR.VAPOURPR.Set set : sciPart
		    .getPCVAPOUR().getVAPOURPR().getSet()) {
		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(I5CONSTANTS.eVapourPressure);
		papp.addEffect(effect);

		if (set.getVALUEUNITTEMPVALUE() != null) {
		    Value tvalue = new Value();
		    if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE() != null) {
			tvalue.setLoValue(getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
		    } else
			tvalue.setLoValue(null);
		    if (set.getVALUEUNITTEMPVALUE() != null)
			try {
			    tvalue.setUnits(Phrases.phrasegroup_A102.get(set.getVALUEUNITTEMPVALUE().getTEMPUNIT()));
			} catch (Exception x) {
			}

		    if (set.getTEMPQUALIFIER() != null)
			tvalue.setLoQualifier(set.getTEMPQUALIFIER().getTEMPQUALIFIERValue());

		    effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);
		} else
		    effect.getConditions().put(I5CONSTANTS.cTemperature, null);

		if (set.getPRECISIONPRESSURELOQUALIFIER() != null) {
		    effect.setUnit(Phrases.phrasegroup_P02.get(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUNIT()));

		    if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOVALUE() != null) {
			try {
			    effect.setLoQualifier(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue());
			} catch (Exception x) {
			}
			try {
			    effect.setLoValue(Double.parseDouble(set.getPRECISIONPRESSURELOQUALIFIER()
				    .getPRESSURELOVALUE().getValue()));
			} catch (Exception x) {
			    effect.setTextValue(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue());
			}
		    }
		    if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE() != null) {
			try {
			    effect.setUpQualifier(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPQUALIFIERValue());
			} catch (Exception x) {
			}
			try {
			    effect.setUpValue(Double.parseDouble(set.getPRECISIONPRESSURELOQUALIFIER()
				    .getPRESSUREUPVALUE().getValue()));
			} catch (Exception x) {
			    effect.setTextValue(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE().getValue());
			}
		    }
		}
	    }

	return record;
    }

}
