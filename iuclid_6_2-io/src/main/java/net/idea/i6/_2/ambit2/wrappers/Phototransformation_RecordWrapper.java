package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformation._2.ENDPOINTSTUDYRECORDPhototransformation;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformation._2.ENDPOINTSTUDYRECORDPhototransformation.ResultsAndDiscussion.Degradation.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformation._2.ENDPOINTSTUDYRECORDPhototransformation.ResultsAndDiscussion.Degradation.Entry.SamplingTime;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class Phototransformation_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPhototransformation> {

	public Phototransformation_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignProtocolParameters(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		super.assignProtocolParameters(papp);

	}

	@Override
	protected String dictionaryParams(String key) {
		if ("DetailsOnTestCondition".equals(key))
			return I5CONSTANTS.TestCondition;
		else
			return super.dictionaryParams(key);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPhototransformation studyrecord) {

		StringBuilder reactant = null;

		if (studyrecord.getResultsAndDiscussion().getDegradation() != null) {

			for (Entry e : studyrecord.getResultsAndDiscussion().getDegradation().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint("Degradation");
				q2effectrecord(e.getDegr(), effect);
				papp.addEffect(effect);
				try {
					effect.setErrorValue(e.getStDev().doubleValue());
				} catch (Exception x) {
				}
				effect.getConditions().put(I5CONSTANTS.cTimePoint, q2value(e.getSamplingTime()));
				effect.getConditions().put(I5CONSTANTS.TestCondition, e.getTestCondition());
			}
		}
		try {
			((IParams) papp.getParameters()).put(I5CONSTANTS.pReactant, reactant == null ? null : reactant.toString());
		} catch (Exception x) {
		}

		if (studyrecord.getResultsAndDiscussion().getDissipationParentCompound() != null) {
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_phototransformation._2.ENDPOINTSTUDYRECORDPhototransformation.ResultsAndDiscussion.DissipationParentCompound.Entry e : studyrecord
					.getResultsAndDiscussion().getDissipationParentCompound().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rPERCENTILE_DT50);
				papp.addEffect(effect);
				q2effectrecord(e.getDT50(), effect);
				effect.getConditions().put(I5CONSTANTS.TestCondition, e.getTestCondition());
				effect.getConditions().put(I5CONSTANTS.pReactant, reactant == null ? null : reactant.toString());

			}
		} else {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.rPERCENTILE_DT50);
			effect.getConditions().put(I5CONSTANTS.TestCondition, null);
			papp.addEffect(effect);
		}
	}

	protected static Value q2value(SamplingTime field) {
		Value v = new Value();
		if (field.getValue() != null)
			v.setLoValue(Double.parseDouble(field.getValue()));
		v.setUnits(getPhrase(field.getUnitCode(), field.getUnitOther()));
		return v;
	}
}
