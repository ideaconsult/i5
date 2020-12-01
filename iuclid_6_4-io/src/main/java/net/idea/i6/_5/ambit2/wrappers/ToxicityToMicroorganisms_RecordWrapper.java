package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytomicroorganisms._5.ENDPOINTSTUDYRECORDToxicityToMicroorganisms;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytomicroorganisms._5.ENDPOINTSTUDYRECORDToxicityToMicroorganisms.ResultsAndDiscussion.EffectConcentrations.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytomicroorganisms._5.ENDPOINTSTUDYRECORDToxicityToMicroorganisms.ResultsAndDiscussion.EffectConcentrations.Entry.Duration;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class ToxicityToMicroorganisms_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDToxicityToMicroorganisms> {

	public ToxicityToMicroorganisms_RecordWrapper(Document doc) throws Exception {
		super(doc);

	}

	@Override
	protected String dictionaryParams(String key) {
		if ("TestOrganismsSpecies".equals(key))
			return I5CONSTANTS.cTestOrganism;
		return super.dictionaryParams(key);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDToxicityToMicroorganisms studyrecord) {
	    if (studyrecord.getResultsAndDiscussion()==null) return;
		if (studyrecord.getResultsAndDiscussion().getEffectConcentrations() == null)
			return;

		for (Entry e : studyrecord.getResultsAndDiscussion().getEffectConcentrations().getEntry()) {

			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			q2effectrecord(e.getEffectConc(), effect);
			effect.setEndpoint(getPhrase(e.getEndpoint().getValue(),joinMultiTextFieldSmall( e.getEndpoint().getOther())));
			papp.addEffect(effect);

			effect.getConditions().put(I5CONSTANTS.cEffect, p2Value(e.getBasisForEffect()));

			effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getConcBasedOn().getValue()));
			effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration,p2Value(e.getNominalMeasured()));

			effect.getConditions().put(I5CONSTANTS.cExposure, q2value(e.getDuration()));
		}
	}

	protected static Value q2value(Duration field) {
		try {
			Value v = new Value();
			v.setLoValue(Double.parseDouble(field.getValue()));
			v.setUnits(getPhrase(field.getUnitCode()));
			return v;
		} catch (Exception x) {
			return null;
		}

	}
}
