package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_longtermtoxicitytoaquainv._2.ENDPOINTSTUDYRECORDLongTermToxicityToAquaInv;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_longtermtoxicitytoaquainv._2.ENDPOINTSTUDYRECORDLongTermToxicityToAquaInv.ResultsAndDiscussion.EffectConcentrations.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class LongTermToxicityToAquaInv_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDLongTermToxicityToAquaInv> {

	public LongTermToxicityToAquaInv_RecordWrapper(Document doc) throws Exception {
		super(doc);
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
				effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration,p2Value(e.getNominalMeasured()));
				effect.getConditions().put(I5CONSTANTS.cExposure, p2Value(e.getDuration()));
			}

	}

}
