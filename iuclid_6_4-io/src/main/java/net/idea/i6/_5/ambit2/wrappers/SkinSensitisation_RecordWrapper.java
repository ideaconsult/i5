package net.idea.i6._5.ambit2.wrappers;

import java.math.BigDecimal;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
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
        ((IParams) papp.getParameters()).put(I5CONSTANTS.cTypeMethod, I5CONSTANTS.p_invivo);

        if (e.getNoWithReactions()!=null) {
          effect.setEndpoint(I5CONSTANTS.e_nowithreactions);
          effect.setLoValue(e.getNoWithReactions().getValue().intValue());
        }

        // e_totalnoingroup
        if (e.getTotalNoInGroup() != null) {
          ambit2.base.data.study.Value t = new ambit2.base.data.study.Value();
          t.setLoValue(e.getTotalNoInGroup().getValue().intValue());
          effect.getConditions().put(I5CONSTANTS.e_totalnoingroup, t);
        }

        if (e.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, e.getKeyResult().getValue().booleanValue());
        if (e.getHoursAfterChallenge() != null) {
          ambit2.base.data.study.Value t = new ambit2.base.data.study.Value();
          t.setLoValue(e.getHoursAfterChallenge().getValue().intValue());
          t.setUnits("h");
          effect.getConditions().put(I5CONSTANTS.e_hoursafterchallenge, t);
        }
        if (e.getClinicalObservations() != null) {
          effect.getConditions().put(I5CONSTANTS.e_observation, joinMultiTextFieldSmall(e.getClinicalObservations()));
        }
        if (e.getReading() != null) {
          effect.setEndpointType(p2Value(e.getReading()));
        }
        // getPhrase(p2Value(e.getReading()))
        papp.addEffect(effect);

      }

    if (studyRecord.getResultsAndDiscussion().getInVitroInChemico() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._5.ENDPOINTSTUDYRECORDSkinSensitisation.ResultsAndDiscussion.InVitroInChemico.Results.Entry e : studyRecord
          .getResultsAndDiscussion().getInVitroInChemico().getResults().getEntry()) {
        EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
        ((IParams) papp.getParameters()).put(I5CONSTANTS.cTypeMethod, I5CONSTANTS.p_chemico);
        q2effectrecord(e.getValue(), effect);

        effect.setEndpoint(p2Value(e.getParameter()));
        papp.addEffect(effect);
      }

    if (studyRecord.getResultsAndDiscussion().getInVivoLLNA() != null) {
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._5.ENDPOINTSTUDYRECORDSkinSensitisation.ResultsAndDiscussion.InVivoLLNA.Results.Entry e : studyRecord
          .getResultsAndDiscussion().getInVivoLLNA().getResults().getEntry()) {
        EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
        ((IParams) papp.getParameters()).put(I5CONSTANTS.cTypeMethod, I5CONSTANTS.p_invivo);
        if (e.getValue() != null) {
          q2effectrecord(e.getValue(), effect);

          effect.setEndpoint(getPhrase(p2Value(e.getParameter())));

          if (e.getVariability() != null)
            effect.getConditions().put(I5CONSTANTS.e_variability, joinMultiTextFieldSmall(e.getVariability()));
          if (e.getTestGroupRemarks() != null)
            effect.getConditions().put(I5CONSTANTS.e_testgroup, joinMultiTextFieldSmall(e.getTestGroupRemarks()));
          if (e.getRemarksOnResults() != null)
            effect.getConditions().put(I5CONSTANTS.Remark, p2Value(e.getRemarksOnResults()));
          if (e.getKeyResult() != null)
            effect.getConditions().put(I5CONSTANTS.KeyResult, e.getKeyResult().getValue().booleanValue());
          papp.addEffect(effect);
        }
      }
      if (studyRecord.getResultsAndDiscussion().getInVivoLLNA().getCellularProliferationDataObservations() != null) {
        EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
        effect.setEndpoint(I5CONSTANTS.e_observation);
        effect.setTextValue(joinMultiTextFieldLarge(
            studyRecord.getResultsAndDiscussion().getInVivoLLNA().getCellularProliferationDataObservations()));
        papp.addEffect(effect);
      }
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
