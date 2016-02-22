package net.idea.i5._4.ambit2.sections.TO_BIODEG_WATER_SIM_SECTION;

import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5.ambit2.sections.ENVFATEStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSIM.REFERENCE.Set;

public class StudyRecordConverter
	extends
	ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord> {
    public StudyRecordConverter() {
	super(I5_ROOT_OBJECTS.TO_BIODEG_WATER_SIM);
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
	    return unmarshalled.getScientificPart().getTOBIODEGWATERSIM().getTESTMATINDICATOR().getSet()
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
	if (unmarshalled.getScientificPart().getTOBIODEGWATERSIM().getREFERENCE() != null)
	    for (Set set : unmarshalled.getScientificPart().getTOBIODEGWATERSIM().getREFERENCE().getSet()) {
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
	eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled
		.getScientificPart();
	if (sciPart.getTOBIODEGWATERSIM() == null)
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
	if (sciPart.getTOBIODEGWATERSIM().getGUIDELINE() != null)
	    for (ScientificPart.TOBIODEGWATERSIM.GUIDELINE.Set set : sciPart.getTOBIODEGWATERSIM().getGUIDELINE()
		    .getSet()) {
		if (set.getPHRASEOTHERGUIDELINE() != null)
		    papp.getProtocol().addGuideline(
			    getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(), set
				    .getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));

	    }
	if (sciPart.getTOBIODEGWATERSIM().getMETHODNOGUIDELINE() != null)
	    try {
		papp.getProtocol().addGuideline(
			sciPart.getTOBIODEGWATERSIM().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW()
				.getTEXTAREABELOW().getValue());
	    } catch (Exception x) {
	    }

	// citation
	parseReference(unmarshalled, papp);
	// papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());

	// TEST TYPE
	
	try {
	    papp.getParameters().put(
		    I5CONSTANTS.cTestType,
		    getValue(sciPart.getTOBIODEGWATERSIM().getOXYGENCONDITIONS().getSet().getPHRASEOTHERLISTPOPFIX()
			    .getLISTPOPFIXValue(), sciPart.getTOBIODEGWATERSIM().getOXYGENCONDITIONS().getSet()
			    .getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXTXT()));
	} catch (Exception x) {
	    papp.getParameters().put(I5CONSTANTS.cTestType, null);
	}

	Params degradation = new Params();
	if (sciPart.getTOBIODEGWATERSIM().getDEGRAD() != null)
	    for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSIM.DEGRAD.Set set : sciPart
		    .getTOBIODEGWATERSIM().getDEGRAD().getSet()) {

		Value dValue = new Value();
		if (set.getPRECISIONLOQUALIFIER() != null) {
		    try {
			degradation.put(
				I5CONSTANTS.cDegradationParameter,
				getValue(set.getPHRASEOTHERPARAMETER().getPARAMETERValue(), set
					.getPHRASEOTHERPARAMETER().getPARAMETERTXT()));
		    } catch (Exception x) {
			degradation.put(I5CONSTANTS.cDegradationParameter, null);
		    }
		    dValue.setUnits("%");
		    if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
			try {
			    dValue.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
			    dValue.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
			} catch (Exception x) {
			    dValue.setLoValue(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
			}
		    else
			dValue.setLoValue(null);

		    if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
			try {
			    dValue.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
			    dValue.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
			} catch (Exception x) {
			    dValue.setUpValue(null);
			}
		    else
			dValue.setUpValue(null);
		}

		degradation.put(I5CONSTANTS.rDegradation, dValue);

		// sampling time
		if (set.getVALUEUNITTIMEPOINTVALUE() != null) {
		    Value tvalue = new Value();
		    if (set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE() != null) {
			tvalue.setLoValue(getNumber(set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE().getValue()));
		    } else
			tvalue.setLoValue(null);
		    if (set.getVALUEUNITTIMEPOINTVALUE() != null)
			tvalue.setUnits(set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTUNITValue());
		    degradation.put(I5CONSTANTS.cTimePoint, tvalue);
		} else
		    degradation.put(I5CONSTANTS.cTimePoint, null);
	    }

	if (sciPart.getTOBIODEGWATERSIM().getHALFLIFE() != null
		&& sciPart.getTOBIODEGWATERSIM().getHALFLIFE().getSet() != null
		&& sciPart.getTOBIODEGWATERSIM().getHALFLIFE().getSet().size() > 0) {
	    for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_BIODEG_WATER_SIM_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSIM.HALFLIFE.Set set : sciPart
		    .getTOBIODEGWATERSIM().getHALFLIFE().getSet()) {
		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		try {
		    effect.setEndpoint(getValue(set.getPHRASEOTHERTYPE().getTYPEValue(), set.getPHRASEOTHERTYPE()
			    .getTYPETXT()));
		} catch (Exception x) {
		    effect.setEndpoint(null);
		}
		// effect.getConditions().put("Compartment",
		// set.getPHRASEOTHERCOMPARTMENT().getCOMPARTMENTValue());
		effect.getConditions().putAll(degradation);
		
		try {
			effect.getConditions().put(
			    I5CONSTANTS.cTestType,
			    getValue(sciPart.getTOBIODEGWATERSIM().getOXYGENCONDITIONS().getSet().getPHRASEOTHERLISTPOPFIX()
				    .getLISTPOPFIXValue(), sciPart.getTOBIODEGWATERSIM().getOXYGENCONDITIONS().getSet()
				    .getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXTXT()));
		} catch (Exception x) {
			effect.getConditions().put(I5CONSTANTS.cTestType, null);
		}
		
		papp.addEffect(effect);

		// results
		if (set.getPRECISIONLOQUALIFIER() != null) {
		    effect.setUnit(set.getPRECISIONLOQUALIFIER().getUNITValue());

		    if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
			try {
			    effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
			    effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
			} catch (Exception x) {
			}
		    if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
			try {
			    effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
			    effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
			} catch (Exception x) {
			}
		}

	    }
	} else {
	    EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
	    effect.setEndpoint(null);
	    effect.getConditions().putAll(degradation);
	    papp.addEffect(effect);
	}

	return record;
    }
}
