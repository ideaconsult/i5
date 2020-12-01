package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_dustiness._5.ENDPOINTSTUDYRECORDDustiness;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_dustiness._5.ENDPOINTSTUDYRECORDDustiness.ResultsAndDiscussion.DustinessIndex.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class Dustiness_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDDustiness> {

  public Dustiness_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDDustiness studyrecord) {
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    EffectRecord<String, IParams, String> effect;
    if (studyrecord.getResultsAndDiscussion().getDustinessIndex() != null)
      for (Entry entry : studyrecord.getResultsAndDiscussion().getDustinessIndex().getEntry()) {
        effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eDUSTINEX, entry.getMean(),
            entry.getStDev() == null ? null : entry.getStDev().getValue(), I5CONSTANTS.endpoint_type_MEAN);
        effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
      }
  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDDustiness studyRecord) {
    if (studyRecord.getOverallRemarksAttachments() != null)
      papp.setInterpretationResult(
          joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
  }

}
