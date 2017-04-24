package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialarthropods._2.ENDPOINTSTUDYRECORDToxicityToTerrestrialArthropods;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialarthropods._2.ENDPOINTSTUDYRECORDToxicityToTerrestrialArthropods.ResultsAndDiscussion.EffectConcentrations.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class ToxicityToTerrestrialArthropods_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDToxicityToTerrestrialArthropods> {

	public ToxicityToTerrestrialArthropods_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}
	@Override
	protected String dictionaryParams(String key) {
		if ("TestOrganismsSpecies".equals(key))
			return I5CONSTANTS.cTestOrganism;
		return super.dictionaryParams(key);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDToxicityToTerrestrialArthropods studyrecord) {
		// I5_ROOT_OBJECTS.EC_HONEYBEESTOX
		if (studyrecord.getResultsAndDiscussion().getEffectConcentrations() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getEffectConcentrations().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getEndpoint()));
				q2effectrecord(e.getEffectConc(), effect);
				papp.addEffect(effect);
				effect.getConditions().put(I5CONSTANTS.cEffect, p2Value(e.getBasisForEffect()));
				effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getConcBasedOn()));
				effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration,q2value(e.getEffectConc()));
				effect.getConditions().put(I5CONSTANTS.cExposure, e.getDuration());
			}
	}

}
