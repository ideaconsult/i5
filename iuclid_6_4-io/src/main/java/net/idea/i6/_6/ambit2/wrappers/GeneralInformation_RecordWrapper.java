package net.idea.i6._6.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_generalinformation._6.ENDPOINTSTUDYRECORDGeneralInformation;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_generalinformation._6.ENDPOINTSTUDYRECORDGeneralInformation.ResultsAndDiscussion.FormBlock.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class GeneralInformation_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDGeneralInformation> {

	public GeneralInformation_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDGeneralInformation studyrecord) {
		if (studyrecord.getResultsAndDiscussion() == null)
			return;
		String physstate = null;
		try {
			physstate = p2Value(studyrecord.getResultsAndDiscussion().getSubstancePhysicalState());
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.Physstate);
			if (physstate!=null)
			effect.setTextValue(physstate.toString());
			// Physical state at 20°C and 1013 hPa

			effect.setConditions(new Params());
			Value<Double> t = new Value<Double>();
			t.setUnits("\u2103");
			t.setLoValue(20.0);
			effect.getConditions().put(I5CONSTANTS.cTemperature, t);
			Value<Double> pressure = new Value<Double>();
			pressure.setUnits("hPa");
			pressure.setLoValue(1013.0);
			effect.getConditions().put(I5CONSTANTS.AtmPressure, pressure);
			try {
			effect.getConditions().put(I5CONSTANTS.Remark,
					joinMultiTextField(studyrecord.getResultsAndDiscussion().getSubstancePhysicalState().getRemarks()));
			} catch (Exception x) {}
			papp.addEffect(effect);

		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage(), x);
		}
		if (studyrecord.getResultsAndDiscussion()!=null && studyrecord.getResultsAndDiscussion().getFormBlock()!=null)
		for (Entry e : studyrecord.getResultsAndDiscussion().getFormBlock().getEntry()) {
			if (e.getForm() != null)
				try {
					EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint(I5CONSTANTS.Form);
					effect.setTextValue(p2Value(e.getForm()));
					papp.addEffect(effect);

				} catch (Exception x) {
					logger.log(Level.WARNING, x.getMessage(), x);
				}
			if (e.getSubstanceColour() != null)
				try {
					EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint(I5CONSTANTS.Color);
					effect.setTextValue(joinMultiTextFieldMultiLine(e.getSubstanceColour()));
					papp.addEffect(effect);

				} catch (Exception x) {
					logger.log(Level.WARNING, x.getMessage(), x);
				}
			if (e.getOdour() != null)
				try {
					EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint(I5CONSTANTS.Odor);
					effect.setTextValue(p2Value(e.getOdour()));
					papp.addEffect(effect);

				} catch (Exception x) {
					logger.log(Level.WARNING, x.getMessage(), x);
				}

		}

	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDGeneralInformation studyRecord) {
		try {
			papp.setInterpretationResult(p2Value(studyRecord.getResultsAndDiscussion().getSubstanceType()));
		} catch (Exception x) {
			papp.setInterpretationResult("");
		}
	}
}
