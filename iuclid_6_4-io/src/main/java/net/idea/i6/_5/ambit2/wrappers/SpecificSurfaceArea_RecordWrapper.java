package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_specificsurfacearea._5.ENDPOINTSTUDYRECORDSpecificSurfaceArea;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_specificsurfacearea._5.ENDPOINTSTUDYRECORDSpecificSurfaceArea.ResultsAndDiscussion.SpecificSurfaceArea.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class SpecificSurfaceArea_RecordWrapper
    extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSpecificSurfaceArea> {

  public SpecificSurfaceArea_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSpecificSurfaceArea studyrecord) {
    EffectRecord<String, IParams, String> effect;
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    if (studyrecord.getResultsAndDiscussion().getSpecificSurfaceArea() != null)
      for (Entry entry : studyrecord.getResultsAndDiscussion().getSpecificSurfaceArea().getEntry()) {
        effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.SPECIFIC_SURFACE_AREA, entry.getSurfaceArea(),
            entry.getStDev() == null ? null : entry.getStDev().getValue(), null);
        effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
      }
  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDSpecificSurfaceArea studyRecord) {
    papp.setInterpretationResult(joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
  }

}
