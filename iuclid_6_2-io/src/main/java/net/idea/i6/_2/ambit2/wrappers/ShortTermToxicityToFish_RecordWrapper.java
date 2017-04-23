package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_shorttermtoxicitytofish._2.ENDPOINTSTUDYRECORDShortTermToxicityToFish;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_shorttermtoxicitytofish._2.ENDPOINTSTUDYRECORDShortTermToxicityToFish.ResultsAndDiscussion.EffectConcentrations.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_shorttermtoxicitytofish._2.ENDPOINTSTUDYRECORDShortTermToxicityToFish.ResultsAndDiscussion.EffectConcentrations.Entry.Duration;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class ShortTermToxicityToFish_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDShortTermToxicityToFish> {

	public ShortTermToxicityToFish_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	protected String dictionaryParams(String key) {
		if ("TestOrganismsSpecies".equals(key)) return I5CONSTANTS.cTestOrganism;
		return super.dictionaryParams(key);
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDShortTermToxicityToFish studyrecord) {

		if (studyrecord.getResultsAndDiscussion().getEffectConcentrations() == null)
			return;
		for (Entry e : studyrecord.getResultsAndDiscussion().getEffectConcentrations().getEntry()) {

			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			try {
				effect.setEndpoint(getPhrase(e.getEndpoint().getValue(), e.getEndpoint().getOther()));
			} catch (Exception x) {
				effect.setEndpoint(null);
			}
			papp.addEffect(effect);

			try {
				effect.getConditions().put(I5CONSTANTS.cEffect,
						getPhrase(e.getBasisForEffect().getValue(), e.getBasisForEffect().getOther()));
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.cEffect, null);
			}

			try {

				effect.getConditions().put(I5CONSTANTS.cConcType,
						getPhrase(e.getConcBasedOn().getValue(), e.getConcBasedOn().getOther()));
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.cConcType, null);
			}
			effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration,
					e.getEffectConc() == null ? null : q2value(e.getEffectConc()));

			effect.getConditions().put(I5CONSTANTS.cExposure, q2value(e.getDuration()));
		}

	}

	protected static Value q2value(Duration field) {
		try {
			Value v = new Value();
			v.setLoValue(Double.parseDouble(field.getValue()));
			v.setUnits(getPhrase(field.getUnitCode(), field.getUnitOther()));
			return v;
		} catch (Exception x) {
			return null;
		}

	}
}
