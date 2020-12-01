package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_crystallitegrainsize._5.ENDPOINTSTUDYRECORDCrystalliteGrainSize;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_crystallitegrainsize._5.ENDPOINTSTUDYRECORDCrystalliteGrainSize.ResultsAndDiscussion.CrystalliteGrainSize.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class CrystalliteGrainSize_RecordWrapper
    extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDCrystalliteGrainSize> {

  public CrystalliteGrainSize_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDCrystalliteGrainSize studyrecord) {
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    if (studyrecord.getResultsAndDiscussion().getMaterialIsotropic() != null) {
      EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
      effect.setTextValue(getPhrase(studyrecord.getResultsAndDiscussion().getMaterialIsotropic().getValue()));
      effect.setEndpoint(I5CONSTANTS.pMATERIAL_ISOTROPIC);
      papp.addEffect(effect);
    }

    // studyrecord.getResultsAndDiscussion().getMaterialIsotropic();
    if (studyrecord.getResultsAndDiscussion().getCrystalliteGrainSize() != null) {
      for (Entry entry : studyrecord.getResultsAndDiscussion().getCrystalliteGrainSize().getEntry()) {
        EffectRecord<String, IParams, String> effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eCRYSTALLITE_SIZE,
            entry.getMean(), entry.getStDev() == null ? null : entry.getStDev().getValue(),
            I5CONSTANTS.endpoint_type_MEAN);
        effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
      }
    }
  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp,
      ENDPOINTSTUDYRECORDCrystalliteGrainSize studyRecord) {
    if (studyRecord.getOverallRemarksAttachments() != null)
      papp.setInterpretationResult(
          joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
  }
}
