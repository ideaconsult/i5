package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformationinsoil._2.ENDPOINTSTUDYRECORDPhotoTransformationInSoil;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class PhotoTransformationInSoil_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPhotoTransformationInSoil> {

	public PhotoTransformationInSoil_RecordWrapper(Document doc) throws Exception {
		super(doc);

	}
	@Override
	protected String dictionaryParams(String key) {
		if ("DetailsOnTestCondition".equals(key)) return I5CONSTANTS.TestCondition; 
		else return super.dictionaryParams(key);
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPhotoTransformationInSoil studyrecord) {

		StringBuilder reactant = null;

		if (studyrecord.getResultsAndDiscussion().getDegradation() != null) {

			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformationinsoil._2.ENDPOINTSTUDYRECORDPhotoTransformationInSoil.ResultsAndDiscussion.Degradation.Entry e : studyrecord
					.getResultsAndDiscussion().getDegradation().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rDegradationRateConstant);
				papp.addEffect(effect);
				q2effectrecord(e.getDegradationPercent(), effect);
				papp.addEffect(effect);
				try {
					effect.setErrorValue(e.getStDev().doubleValue());
				} catch (Exception x) {
				}
			}
		}
		try {
			((IParams) papp.getParameters()).put(I5CONSTANTS.pReactant, reactant == null ? null : reactant.toString());
		} catch (Exception x) {
		}

		if (studyrecord.getResultsAndDiscussion().getDissipationHalfLife() != null) {
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformationinsoil._2.ENDPOINTSTUDYRECORDPhotoTransformationInSoil.ResultsAndDiscussion.DissipationHalfLife.Entry e : studyrecord.getResultsAndDiscussion().getDissipationHalfLife().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rPERCENTILE_DT50);
				papp.addEffect(effect);

				q2effectrecord(e.getHalfLife(), effect);

				try {
					effect.getConditions().put(I5CONSTANTS.TestCondition, e.getTestCondition());
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.TestCondition, null);
				}

				effect.getConditions().put(I5CONSTANTS.pReactant, reactant == null ? null : reactant.toString());

			}
		} else {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.rPERCENTILE_DT50);
			effect.getConditions().put(I5CONSTANTS.TestCondition, null);
			papp.addEffect(effect);
		}
	}

}
