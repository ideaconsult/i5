package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_dustiness._2.ENDPOINTSTUDYRECORDDustiness;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class NM_NanomaterialDustiness extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDDustiness> {

	public NM_NanomaterialDustiness(Document doc) throws Exception {
		super(doc);
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDDustiness studyrecord) {
		EffectRecord<String, IParams, String> effect;

		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_dustiness._2.ENDPOINTSTUDYRECORDDustiness.ResultsAndDiscussion.DustinessIndex.Entry entry : studyrecord.getResultsAndDiscussion().getDustinessIndex().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eDUSTINEX, entry.getMean(),entry.getStDev()==null?null:entry.getStDev().getValue(),I5CONSTANTS.endpoint_type_MEAN);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}
	}
	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDDustiness studyRecord) {
		papp.setInterpretationResult(studyRecord.getOverallRemarksAttachments().getRemarksOnResults());
	}

}
