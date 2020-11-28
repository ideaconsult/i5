package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformationinair._5.ENDPOINTSTUDYRECORDPhototransformationInAir;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformationinair._5.ENDPOINTSTUDYRECORDPhototransformationInAir.ResultsAndDiscussion.DegradationRateConstant.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class PhototransformationInAir_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPhototransformationInAir> {

	public PhototransformationInAir_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignProtocolParameters(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		super.assignProtocolParameters(papp);
		
	}
	@Override
	protected String dictionaryParams(String key) {
		if ("DetailsOnTestCondition".equals(key)) return I5CONSTANTS.TestCondition; 
		else return super.dictionaryParams(key);
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPhototransformationInAir studyrecord) {

		StringBuilder reactant = null;

		if (studyrecord.getResultsAndDiscussion().getDegradationRateConstant() != null) {

			for (Entry e : studyrecord
					.getResultsAndDiscussion().getDegradationRateConstant().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rDegradation);
				papp.addEffect(effect);
				q2effectrecord(e.getRateConstant(), effect);
				papp.addEffect(effect);
				if (reactant == null)
					reactant = new StringBuilder();
				else
					reactant.append(", ");
				reactant.append(getPhrase(e.getReactionWith().getValue(), e.getReactionWith().getOther()));
			}
		}
		try {
			((IParams) papp.getParameters()).put(I5CONSTANTS.pReactant, reactant == null ? null : reactant.toString());
		} catch (Exception x) {
		}

		if (studyrecord.getResultsAndDiscussion().getDissipationParentCompound() != null) {
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformationinair._5.ENDPOINTSTUDYRECORDPhototransformationInAir.ResultsAndDiscussion.DissipationParentCompound.Entry e : studyrecord.getResultsAndDiscussion().getDissipationParentCompound().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rPERCENTILE_DT50);
				papp.addEffect(effect);

				q2effectrecord(e.getDT50(), effect);

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
