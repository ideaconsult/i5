package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_porosity._6.ENDPOINTSTUDYRECORDPorosity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_porosity._6.ENDPOINTSTUDYRECORDPorosity.ResultsAndDiscussion.Porosity.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class Porosity_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPorosity> {

  public Porosity_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPorosity studyrecord) {
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    EffectRecord<String, IParams, String> effect;
    if (studyrecord.getResultsAndDiscussion().getPorosity() != null)
      for (Entry entry : studyrecord.getResultsAndDiscussion().getPorosity().getEntry()) {
        effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.ePOROSITY, entry.getMean(),
            entry.getStDev() == null ? null : entry.getStDev().getValue(), null);
        effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
      }
    if (studyrecord.getResultsAndDiscussion().getSpecificPoreVolume() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_porosity._6.ENDPOINTSTUDYRECORDPorosity.ResultsAndDiscussion.SpecificPoreVolume.Entry entry : studyrecord
          .getResultsAndDiscussion().getSpecificPoreVolume().getEntry()) {
        effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eSPECIFIC_PORE_VOLUME, entry.getMean(),
            entry.getStDev() == null ? null : entry.getStDev().getValue(), null);
        effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
      }
    if (studyrecord.getResultsAndDiscussion().getModalPoreDiameter() != null)
     
    for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_porosity._6.ENDPOINTSTUDYRECORDPorosity.ResultsAndDiscussion.ModalPoreDiameter.Entry entry : studyrecord
        .getResultsAndDiscussion().getModalPoreDiameter().getEntry()) {
      effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eMODAL_PORE_VOLUME, entry.getMean(),
          entry.getStDev() == null ? null : entry.getStDev().getValue(), null);
      effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
      if (entry.getKeyResult() != null)
        effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
    }

  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDPorosity studyRecord) {
    if (studyRecord.getOverallRemarksAttachments() != null)
      papp.setInterpretationResult(
          joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
  }
}
