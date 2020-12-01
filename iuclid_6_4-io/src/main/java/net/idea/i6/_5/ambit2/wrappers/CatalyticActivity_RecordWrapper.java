package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_catalyticactivity._5.ENDPOINTSTUDYRECORDCatalyticActivity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_catalyticactivity._5.ENDPOINTSTUDYRECORDCatalyticActivity.ResultsAndDiscussion.PhotocatalyticActivity.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class CatalyticActivity_RecordWrapper
    extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDCatalyticActivity> {

  public CatalyticActivity_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDCatalyticActivity studyrecord) {
    //
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
    effect.setTextValue(joinMultiTextField(studyrecord.getResultsAndDiscussion().getDescription()));
    effect.setEndpoint(I5CONSTANTS.pDESCRIPTION);
    papp.addEffect(effect);
    if (studyrecord.getResultsAndDiscussion().getPhotocatalyticActivity() != null)
      for (Entry entry : studyrecord.getResultsAndDiscussion().getPhotocatalyticActivity().getEntry()) {
        effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eCATALYTIC_ACTIVITY, entry.getMean(),
            entry.getStDev() == null ? null : entry.getStDev().getValue(), I5CONSTANTS.endpoint_type_MEAN);
        effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
      }
    if (studyrecord.getResultsAndDiscussion().getFrequency() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_catalyticactivity._5.ENDPOINTSTUDYRECORDCatalyticActivity.ResultsAndDiscussion.Frequency.Entry entry : studyrecord
          .getResultsAndDiscussion().getFrequency().getEntry()) {

        effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eTURNOVERFREQUENCY, entry.getMean(),
            entry.getStDev() == null ? null : entry.getStDev().getValue(), I5CONSTANTS.endpoint_type_MEAN);
        effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
      }
  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDCatalyticActivity studyRecord) {
    if (studyRecord.getOverallRemarksAttachments() != null)
      papp.setInterpretationResult(
          joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
  }
}
