package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_longtermtoxicitytoaquainv._5.ENDPOINTSTUDYRECORDLongTermToxicityToAquaInv;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_longtermtoxicitytoaquainv._5.ENDPOINTSTUDYRECORDLongTermToxicityToAquaInv.ResultsAndDiscussion.EffectConcentrations.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytosoilmacroorganismsexceptarthropods._5.ENDPOINTSTUDYRECORDToxicityToSoilMacroorganismsExceptArthropods.ResultsAndDiscussion.EffectConcentrations.Entry.Duration;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class LongTermToxicityToAquaInv_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDLongTermToxicityToAquaInv> {

	public LongTermToxicityToAquaInv_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	protected String dictionaryParams(String key) {
		if ("TestOrganismsSpecies".equals(key))
			return I5CONSTANTS.cTestOrganism;
		else
			return super.dictionaryParams(key);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDLongTermToxicityToAquaInv studyrecord) {

		if (studyrecord.getResultsAndDiscussion().getEffectConcentrations() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getEffectConcentrations().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getEndpoint()));
				q2effectrecord(e.getEffectConc(), effect);
				papp.addEffect(effect);
				effect.getConditions().put(I5CONSTANTS.cEffect, p2Value(e.getBasisForEffect()));
				effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getConcBasedOn()));
				effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration, p2Value(e.getNominalMeasured()));
				effect.getConditions().put(I5CONSTANTS.cExposure, q2value(e.getDuration()));
			}

	}

	private Value q2value(Duration field) {
		Value v = new Value();
		if (field.getValue() != null)
			try {
				v.setLoValue(Double.parseDouble(field.getValue()));
			} catch (Exception x) {
			}
		v.setUnits(getPhrase(field.getUnitCode(), field.getUnitOther()));
		return v;
	}
}
