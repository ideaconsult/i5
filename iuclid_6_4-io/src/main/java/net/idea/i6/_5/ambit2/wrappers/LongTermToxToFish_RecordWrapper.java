package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_longtermtoxtofish._5.ENDPOINTSTUDYRECORDLongTermToxToFish;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_longtermtoxtofish._5.ENDPOINTSTUDYRECORDLongTermToxToFish.MaterialsAndMethods.StudyDesign.TotalExposureDuration;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_longtermtoxtofish._5.ENDPOINTSTUDYRECORDLongTermToxToFish.ResultsAndDiscussion.EffectConcentrations.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class LongTermToxToFish_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDLongTermToxToFish> {

	public LongTermToxToFish_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDLongTermToxToFish studyrecord) {
	    if (studyrecord.getResultsAndDiscussion()==null) return;
		if (studyrecord.getResultsAndDiscussion().getEffectConcentrations() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getEffectConcentrations().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getEndpoint()));
				q2effectrecord(e.getEffectConc(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cEffect, p2Value(e.getBasisForEffect()));
				effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getConcBasedOn()));
				effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration, p2Value(e.getNominalMeasured()));
				effect.getConditions().put(I5CONSTANTS.cExposure,
						p2value(studyrecord.getMaterialsAndMethods().getStudyDesign().getTotalExposureDuration()));

			}
		
	}

	private Object p2value(TotalExposureDuration field) {
		Value v = new Value();
		if (field.getValue() != null)
			try {
				v.setLoValue(Double.parseDouble(field.getValue()));
			} catch (Exception x) {
			}
		v.setUnits(getPhrase(field.getUnitCode()));
		return v;
	}

}
