package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_crystallitegrainsize._2.ENDPOINTSTUDYRECORDCrystalliteGrainSize;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class NM_CrystalliteGrainSize_RecordWraper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDCrystalliteGrainSize> {

	public NM_CrystalliteGrainSize_RecordWraper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDCrystalliteGrainSize studyrecord) {
		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setTextValue(getPhrase(studyrecord.getResultsAndDiscussion().getMaterialIsotropic().getValue(),
				studyrecord.getResultsAndDiscussion().getMaterialIsotropic().getOther()));
		effect.setEndpoint(I5CONSTANTS.pMATERIAL_ISOTROPIC);
		papp.addEffect(effect);

		studyrecord.getResultsAndDiscussion().getMaterialIsotropic();
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_crystallitegrainsize._2.ENDPOINTSTUDYRECORDCrystalliteGrainSize.ResultsAndDiscussion.CrystalliteGrainSize.Entry entry : studyrecord
				.getResultsAndDiscussion().getCrystalliteGrainSize().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eCRYSTALLITE_SIZE, entry.getMean(),
					entry.getStDev() == null ? null : entry.getStDev().getValue(), I5CONSTANTS.endpoint_type_MEAN);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDCrystalliteGrainSize studyRecord) {
		papp.setInterpretationResult(studyRecord.getOverallRemarksAttachments().getRemarksOnResults());
	}
}
