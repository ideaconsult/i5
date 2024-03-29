package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._6.ENDPOINTSTUDYRECORDAgglomerationAggregation;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._6.ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._6.ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Ph;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class AgglomerationAggregation_RecordWrapper
    extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDAgglomerationAggregation> {

  public AgglomerationAggregation_RecordWrapper(Document doc) throws Exception {
    super(doc);

  }

  protected void addPH(EffectRecord effect, String medium, Value phvalue, String remarks) {
    IParams p = new Params();
    p.put(I5CONSTANTS.cMEDIUM, medium);
    p.put(I5CONSTANTS.pH, phvalue);
    p.put(I5CONSTANTS.Remark, remarks);
    effect.setConditions(p);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDAgglomerationAggregation studyrecord) {
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    if (studyrecord.getResultsAndDiscussion().getAgglomerationAggregationDiameter() != null)
      for (Entry entry : studyrecord.getResultsAndDiscussion().getAgglomerationAggregationDiameter().getEntry())
        try {
          EffectRecord<String, IParams, String> effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eAGGLO_AGGR_DIAM,
              entry.getMeanDiameter(), Double.parseDouble(entry.getStDev().getValue()), I5CONSTANTS.endpoint_type_MEAN);
          addPH(effect, joinMultiTextFieldLarge(entry.getMedium()), q2value(entry.getPh()),
              remarks2Value(entry.getRemarksOnResults()));
        } catch (Exception x) {
        }
    if (studyrecord.getResultsAndDiscussion().getAgglomerationAggregationSize() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._6.ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry entry : studyrecord
          .getResultsAndDiscussion().getAgglomerationAggregationSize().getEntry())
        try {

          EffectRecord<String, IParams, String> effect = addEffectRecord_meanstdev(papp,
              getPhrase(entry.getPercentile().getValue(), joinMultiTextFieldSmall(entry.getPercentile().getOther())),
              entry.getMean(), entry.getStDev() == null ? null : entry.getStDev().getValue(),
              I5CONSTANTS.endpoint_type_MEAN);
          addPH(effect, joinMultiTextFieldLarge(entry.getMedium()), q2value(entry.getPh()),
              remarks2Value(entry.getRemarksOnResults()));
          papp.addEffect(effect);

        } catch (Exception x) {
        }
    int n = 1;
    if (studyrecord.getResultsAndDiscussion().getDistributionDifferentPassages() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._6.ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry entry : studyrecord
          .getResultsAndDiscussion().getDistributionDifferentPassages().getEntry()) {
        EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
        effect.setEndpoint(I5CONSTANTS.eAGGLO_AGGR_SIZE);
        effect.setEndpointGroup(n);
        q2effectrecord(entry.getSize(), effect);
        papp.addEffect(effect);
        IParams p = new Params();
        p.put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        p.put(I5CONSTANTS.cSEQ_NUM, p2Value(entry.getSequenceNumber()));
        effect.setConditions(p);

        effect = endpointCategory.createEffectRecord();
        effect.setEndpointGroup(n);
        effect.setEndpoint(I5CONSTANTS.eAGGLO_AGGR_DISTRIBUTION);
        q2effectrecord(entry.getDistribution(), effect);
        papp.addEffect(effect);
        p = new Params();
        p.put(I5CONSTANTS.Remark, remarks2Value(entry.getRemarksOnResults()));
        p.put(I5CONSTANTS.cSEQ_NUM, getPhrase(entry.getSequenceNumber().getValue()));
        effect.setConditions(p);
        n++;
      }
    if (studyrecord.getResultsAndDiscussion().getIndex() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._6.ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry entry : studyrecord
          .getResultsAndDiscussion().getIndex().getEntry()) {
        EffectRecord<String, IParams, String> effect = addEffectRecord_meanstdev(papp,
            I5CONSTANTS.eAGGLO_AGGREGATION_ID, entry.getMean(),
            entry.getStDev() == null ? null : entry.getStDev().getValue().doubleValue(),
            I5CONSTANTS.endpoint_type_MEAN);

        addPH(effect, joinMultiTextFieldLarge(entry.getMedium()), q2value(entry.getPh()), getPhrase(
            entry.getRemarksOnResults().getValue(), joinMultiTextFieldSmall(entry.getRemarksOnResults().getOther())));
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
        papp.addEffect(effect);

      }
  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp,
      ENDPOINTSTUDYRECORDAgglomerationAggregation studyRecord) {
    papp.setInterpretationResult(joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));

  }

  protected Value q2value(Ph field) {
	  if (field==null) return null;
    Value v = new Value();
    if (field.getLowerValue() != null)
      v.setLoValue(field.getLowerValue().doubleValue());
    if (field.getUpperValue() != null)
      v.setLoValue(field.getUpperValue().doubleValue());
    v.setLoQualifier(field.getLowerQualifier());
    v.setUpQualifier(field.getUpperQualifier());
    return v;
  }
}
