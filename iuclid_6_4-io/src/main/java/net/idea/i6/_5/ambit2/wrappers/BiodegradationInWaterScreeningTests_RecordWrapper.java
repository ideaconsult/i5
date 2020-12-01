package net.idea.i6._5.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterscreeningtests._5.ENDPOINTSTUDYRECORDBiodegradationInWaterScreeningTests;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterscreeningtests._5.ENDPOINTSTUDYRECORDBiodegradationInWaterScreeningTests.ResultsAndDiscussion.Degradation.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterscreeningtests._5.ENDPOINTSTUDYRECORDBiodegradationInWaterScreeningTests.ResultsAndDiscussion.Degradation.Entry.SamplingTime;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class BiodegradationInWaterScreeningTests_RecordWrapper
    extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDBiodegradationInWaterScreeningTests> {

  public BiodegradationInWaterScreeningTests_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp,
      ENDPOINTSTUDYRECORDBiodegradationInWaterScreeningTests studyrecord) {
    if (studyrecord.getResultsAndDiscussion()==null || studyrecord.getResultsAndDiscussion().getDegradation() == null)
      return;

    for (Entry e : studyrecord.getResultsAndDiscussion().getDegradation().getEntry()) {
      EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
      effect.setUnit("%");
      q2effectrecord(e.getDegr(), effect);
      effect.setEndpoint(I5CONSTANTS.ePercentDegradation);
      try {
        effect.setEndpoint(p2Value(e.getParameter()));
      } catch (Exception x) {
      }
      papp.addEffect(effect);
      if (e.getSamplingTime() != null)
        effect.getConditions().put(I5CONSTANTS.cTimePoint, q2value(e.getSamplingTime()));
      // we have decided previously to copy this to conditions
      effect.getConditions().put(I5CONSTANTS.cTestType, ((IParams) papp.getParameters()).get(I5CONSTANTS.cTestType));

    }

  }

  /**
   * @TODO interpretationof results
   */
  @Override
  public void assignInterpretationResult(ProtocolApplication papp,
      ENDPOINTSTUDYRECORDBiodegradationInWaterScreeningTests studyRecord) {
    try {
      if (studyRecord.getApplicantSummaryAndConclusion() != null
          && studyRecord.getApplicantSummaryAndConclusion().getInterpretationOfResults() != null) {
        papp.setInterpretationResult(
            p2Value(studyRecord.getApplicantSummaryAndConclusion().getInterpretationOfResults()));
        papp.setInterpretationCriteria(joinMultiTextField(
            studyRecord.getApplicantSummaryAndConclusion().getInterpretationOfResults().getRemarks()));
      }

    } catch (Exception x) {
      logger.log(Level.WARNING, x.getMessage(), x);
    }
  }

  protected static Value q2value(SamplingTime field) {
    Value v = new Value();
    if (field.getValue() != null)
      v.setLoValue(Double.parseDouble(field.getValue()));
    v.setUnits(getPhrase(field.getUnitCode()));
    return v;
  }

}
