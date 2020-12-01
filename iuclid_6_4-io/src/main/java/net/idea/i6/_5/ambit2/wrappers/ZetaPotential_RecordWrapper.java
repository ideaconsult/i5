package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._5.ENDPOINTSTUDYRECORDZetaPotential;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class ZetaPotential_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDZetaPotential> {

  public ZetaPotential_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDZetaPotential studyrecord) {
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    EffectRecord<String, IParams, String> effect;
    if (studyrecord.getResultsAndDiscussion().getZetaPotential() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._5.ENDPOINTSTUDYRECORDZetaPotential.ResultsAndDiscussion.ZetaPotential.Entry entry : studyrecord
          .getResultsAndDiscussion().getZetaPotential().getEntry()) {
        effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eZETA_POTENTIAL, entry.getPotential(),
            entry.getStDev() == null ? null : entry.getStDev().getValue(), I5CONSTANTS.endpoint_type_MEAN);
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());

        effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        effect.getConditions().put(I5CONSTANTS.cMEDIUM, joinMultiTextFieldLarge(entry.getMedium()));
        if (entry.getPh() != null)
          effect.getConditions().put(I5CONSTANTS.pH, entry.getPh().getValue().doubleValue());
      }
    if (studyrecord.getResultsAndDiscussion().getIsoElectricPoint() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._5.ENDPOINTSTUDYRECORDZetaPotential.ResultsAndDiscussion.IsoElectricPoint.Entry entry : studyrecord
          .getResultsAndDiscussion().getIsoElectricPoint().getEntry()) {
        effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eISOELECTRIC_POINT, entry.getPoint(),
            entry.getStDev() == null ? null : entry.getStDev().getValue().doubleValue(),
            I5CONSTANTS.endpoint_type_MEAN);
        effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        effect.getConditions().put(I5CONSTANTS.cMEDIUM, joinMultiTextFieldLarge(entry.getMedium()));
      }
  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDZetaPotential studyRecord) {
    if (studyRecord.getOverallRemarksAttachments() != null)
      papp.setInterpretationResult(
          joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
  }

}
