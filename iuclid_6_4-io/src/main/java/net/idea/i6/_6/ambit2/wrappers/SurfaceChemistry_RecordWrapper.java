package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_surfacechemistry._6.ENDPOINTSTUDYRECORDSurfaceChemistry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_surfacechemistry._6.ENDPOINTSTUDYRECORDSurfaceChemistry.ResultsAndDiscussion.CoatingSet.AtomicComposition.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class SurfaceChemistry_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSurfaceChemistry> {

  public SurfaceChemistry_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSurfaceChemistry studyrecord) {
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    EffectRecord<String, IParams, String> effect;
    if (studyrecord.getResultsAndDiscussion().getCoatingFunctionalisation() != null) {
      effect = endpointCategory.createEffectRecord();
      effect.setEndpoint(I5CONSTANTS.pHasCOATING);
      effect.setTextValue(p2Value(studyrecord.getResultsAndDiscussion().getCoatingFunctionalisation()));
      papp.addEffect(effect);
    }

    if (studyrecord.getResultsAndDiscussion().getCoating() != null) {
      effect = endpointCategory.createEffectRecord();
      effect.setEndpoint(I5CONSTANTS.pCOATING_DESCRIPTION);
      effect.setTextValue(
          p2Value(joinMultiTextFieldSmall(studyrecord.getResultsAndDiscussion().getCoating().getCoatingDescription())));
      papp.addEffect(effect);

      if (studyrecord.getResultsAndDiscussion().getCoating().getAtomicComposition() != null)
        for (Entry entry : studyrecord.getResultsAndDiscussion().getCoating().getAtomicComposition().getEntry()) {
          effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.pCOATING, entry.getFraction(),
              entry.getStDev() == null ? null : entry.getStDev().getValue().doubleValue(), "FRACTION");
          effect.setTextValue(joinMultiTextFieldSmall(entry.getElement()));
          effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
          if (entry.getKeyResult() != null)
            effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
        }
    }

    if (studyrecord.getResultsAndDiscussion().getFunctionalisation() != null) {
      effect = endpointCategory.createEffectRecord();
      effect.setEndpoint(I5CONSTANTS.pHasFUNCTIONALIZATION);
      effect.setTextValue(joinMultiTextFieldSmall(
          studyrecord.getResultsAndDiscussion().getFunctionalisation().getFunctionalisationDescription()));
      papp.addEffect(effect);
      if (studyrecord.getResultsAndDiscussion().getFunctionalisation().getFunctionalGroup() != null)
        for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_surfacechemistry._6.ENDPOINTSTUDYRECORDSurfaceChemistry.ResultsAndDiscussion.Functionalisation.FunctionalGroup.Entry entry : studyrecord
            .getResultsAndDiscussion().getFunctionalisation().getFunctionalGroup().getEntry()) {
          effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.pFUNCTIONALIZATION, entry.getFraction(),
              entry.getStDev() == null ? null : entry.getStDev().getValue().doubleValue(), "FRACTION");
          effect.setTextValue(entry.getGroup());
          effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
          if (entry.getKeyResult() != null)
            effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
        }
    }

  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDSurfaceChemistry studyRecord) {
    if (studyRecord.getOverallRemarksAttachments() != null)
      papp.setInterpretationResult(
          joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
  }
}
