package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_eyeirritation._5.ENDPOINTSTUDYRECORDEyeIrritation;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_eyeirritation._5.ENDPOINTSTUDYRECORDEyeIrritation.ResultsAndDiscussion.InVivo.IrritationCorrosionResults.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class EyeIrritation_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDEyeIrritation> {

	public EyeIrritation_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	protected String dictionaryParams(String key) {
		if (I5CONSTANTS.cSpecies.equals(key)) return key;
		else return super.dictionaryParams(key);
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDEyeIrritation studyrecord) {
		//studyrecord.getResultsAndDiscussion().getResultsOfExVivoInVitroStudy()
		if (studyrecord.getResultsAndDiscussion().getInVitro() != null) {
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_eyeirritation._5.ENDPOINTSTUDYRECORDEyeIrritation.ResultsAndDiscussion.InVitro.ResultsOfExVivoInVitroStudy.Entry e : studyrecord.getResultsAndDiscussion().getInVitro().getResultsOfExVivoInVitroStudy().getEntry()) {
				
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getIrritationParameter()));
				q2effectrecord(e.getValue(), effect);
				papp.addEffect(effect);
				
				effect.getConditions().put("negative_controls", p2Value(e.getNegativeControlsValid().getValue()));
				effect.getConditions().put("positive_controls", p2Value(e.getPositiveControlsValid().getValue()));
				effect.getConditions().put("vehicle_controls", p2Value(e.getVehicleControlsValid().getValue()));
				
				effect.getConditions().put(I5CONSTANTS.cBasisForEffect, p2Value(e.getRunExperiment()));
				
			}
			((IParams) papp.getParameters()).put(I5CONSTANTS.cTypeMethod, "in vitro");
		}
		if (studyrecord.getResultsAndDiscussion().getInVivo() != null) {
			for (Entry e : studyrecord.getResultsAndDiscussion().getInVivo().getIrritationCorrosionResults().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getParameter()));
				q2effectrecord(e.getScore(), effect);
				papp.addEffect(effect);
				
				effect.getConditions().put(I5CONSTANTS.cBasisForEffect, p2Value(e.getBasis()));
				effect.getConditions().put(I5CONSTANTS.cReversibility, p2Value(e.getReversibility()));
				effect.getConditions().put(I5CONSTANTS.cTimePoint, p2Value(e.getTimePoint()));
				effect.getConditions().put(I5CONSTANTS.Remark, joinMultiTextField(e.getRemarksOnResults().getRemarks()));
				try {
					effect.getConditions().put(I5CONSTANTS.cMaxScore, p2Value(e.getScale().getValue().intValue()));
				} catch (Exception x) {
				}
				
			}
			((IParams) papp.getParameters()).put(I5CONSTANTS.cTypeMethod, "in vivo");
		}		

		if (studyrecord.getResultsAndDiscussion().getResultsOfExVivoInVitroStudy() != null) {
			for (Entry e : studyrecord.getResultsAndDiscussion().getResultsOfExVivoInVitroStudy().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getParameter()));
				q2effectrecord(e.getScore(), effect);
				effect.getConditions().put(I5CONSTANTS.cTimePoint, p2Value(e.getTimePoint()));
				effect.getConditions().put(I5CONSTANTS.cBasisForEffect, p2Value(e.getBasis()));
				effect.getConditions().put(I5CONSTANTS.cReversibility, p2Value(e.getReversibility()));
				effect.getConditions().put(I5CONSTANTS.cReversibility, p2Value(e.getReversibility()));
				effect.getConditions().put(I5CONSTANTS.Remark, joinMultiTextField(e.getRemarksOnResults().getRemarks()));
				try {
					effect.getConditions().put(I5CONSTANTS.cMaxScore, p2Value(e.getScale().getValue().intValue()));
				} catch (Exception x) {
				}
				papp.addEffect(effect);
				

			}
			((IParams) papp.getParameters()).put(I5CONSTANTS.cTypeMethod, "in vitro");
		}
	}
}
