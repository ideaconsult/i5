package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_acutetoxicityoral._6.ENDPOINTSTUDYRECORDAcuteToxicityOral;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_acutetoxicityoral._6.ENDPOINTSTUDYRECORDAcuteToxicityOral.ResultsAndDiscussion.EffectLevels.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class AcuteToxicityOral_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDAcuteToxicityOral> {

  public AcuteToxicityOral_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  protected String dictionaryParams(String key) {
    if (I5CONSTANTS.cSpecies.equals(key))
      return key;
    return super.dictionaryParams(key);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDAcuteToxicityOral studyrecord) {
    if (studyrecord.getResultsAndDiscussion()==null || studyrecord.getResultsAndDiscussion().getEffectLevels() == null)
      return;
    for (Entry e : studyrecord.getResultsAndDiscussion().getEffectLevels().getEntry()) {
      EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
      effect.setEndpoint(p2Value(e.getEndpoint()));
      q2effectrecord(e.getEffectLevel(), effect);
      papp.addEffect(effect);

      effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));

      effect.getConditions().put(I5CONSTANTS.cSpecies, ((IParams) papp.getParameters()).get(I5CONSTANTS.cSpecies));

    }
  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDAcuteToxicityOral studyRecord) {
    if (studyRecord.getApplicantSummaryAndConclusion() != null) {
      papp.setInterpretationResult(
          p2Value(studyRecord.getApplicantSummaryAndConclusion().getInterpretationOfResults()));
      papp.setInterpretationCriteria(
          joinMultiTextField(studyRecord.getApplicantSummaryAndConclusion().getInterpretationOfResults().getRemarks()));
    }
  }

}
