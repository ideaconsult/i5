package net.idea.i6._5.ambit2.wrappers;

import java.math.BigDecimal;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._5.ENDPOINTSTUDYRECORDSkinSensitisation;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._5.ENDPOINTSTUDYRECORDSkinSensitisation.ResultsAndDiscussion.InVivoLLNA.Results.Entry.Value;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._5.ENDPOINTSTUDYRECORDSkinSensitisation.ResultsAndDiscussion.TraditionalSensitisationTest.ResultsOfTest.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

/**
 * 
 * @author nina
 *
 */
public class SkinSensitisation_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSkinSensitisation> {

  public SkinSensitisation_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDSkinSensitisation studyRecord) {
    super.assignInterpretationResult(papp, studyRecord);
    if (studyRecord.getApplicantSummaryAndConclusion() != null) {
      papp.setInterpretationResult(
          p2Value(studyRecord.getApplicantSummaryAndConclusion().getInterpretationOfResults()));
      papp.setInterpretationCriteria(
          joinMultiTextField(studyRecord.getApplicantSummaryAndConclusion().getInterpretationOfResults().getRemarks()));
    }
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSkinSensitisation studyRecord) {
    if (studyRecord.getResultsAndDiscussion() == null)
      return;
    // TODO should be different protocol application
    if (studyRecord.getResultsAndDiscussion().getTraditionalSensitisationTest() != null)
      for (Entry e : studyRecord.getResultsAndDiscussion().getTraditionalSensitisationTest().getResultsOfTest()
          .getEntry()) {
        EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
        effect.setEndpoint("ClinicalObservation");
        effect.setTextValue(e.getClinicalObservations());
        papp.addEffect(effect);
      }

    if (studyRecord.getResultsAndDiscussion().getInVitroInChemico() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._5.ENDPOINTSTUDYRECORDSkinSensitisation.ResultsAndDiscussion.InVitroInChemico.Results.Entry e : studyRecord
          .getResultsAndDiscussion().getInVitroInChemico().getResults().getEntry()) {
        EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
        q2effectrecord(e.getValue(), effect);
        effect.setEndpoint(p2Value(e.getParameter()));
        papp.addEffect(effect);
      }

    if (studyRecord.getResultsAndDiscussion().getInVivoLLNA() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._5.ENDPOINTSTUDYRECORDSkinSensitisation.ResultsAndDiscussion.InVivoLLNA.Results.Entry e : studyRecord
          .getResultsAndDiscussion().getInVivoLLNA().getResults().getEntry()) {
        EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
        q2effectrecord(e.getValue(), effect);
        effect.setEndpoint(p2Value(e.getParameter()));
        papp.addEffect(effect);

      }
  }

  protected void q2effectrecord(Value field, EffectRecord<String, IParams, String> effectrecord) {
    if (field == null)
      return;

    try {
      effectrecord.setLoQualifier(field.getLowerQualifier());
    } catch (Exception x) {
      x.printStackTrace();
    }
    try {
      effectrecord.setUpQualifier(field.getUpperQualifier());
    } catch (Exception x) {
      x.printStackTrace();
    }
    try {
      Object loValue = field.getLowerValue();
      if (loValue != null)
        effectrecord.setLoValue(((BigDecimal) loValue).doubleValue());
    } catch (Exception x) {
      x.printStackTrace();
    }
    try {
      Object upValue = field.getUpperValue();
      if (upValue != null)
        effectrecord.setUpValue(((BigDecimal) upValue).doubleValue());
    } catch (Exception x) {
      x.printStackTrace();
    }

  }
}
