package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterandsedimentsimulationtests._6.ENDPOINTSTUDYRECORDBiodegradationInWaterAndSedimentSimulationTests;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterandsedimentsimulationtests._6.ENDPOINTSTUDYRECORDBiodegradationInWaterAndSedimentSimulationTests.ResultsAndDiscussion.Degradation.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterandsedimentsimulationtests._6.ENDPOINTSTUDYRECORDBiodegradationInWaterAndSedimentSimulationTests.ResultsAndDiscussion.Degradation.Entry.Degr;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterandsedimentsimulationtests._6.ENDPOINTSTUDYRECORDBiodegradationInWaterAndSedimentSimulationTests.ResultsAndDiscussion.Degradation.Entry.SamplingTime;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class BiodegradationInWaterAndSedimentSimulationTests_RecordWrapper
    extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDBiodegradationInWaterAndSedimentSimulationTests> {

  public BiodegradationInWaterAndSedimentSimulationTests_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp,
      ENDPOINTSTUDYRECORDBiodegradationInWaterAndSedimentSimulationTests studyrecord) {
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    Params degradation = new Params();
    if (studyrecord.getResultsAndDiscussion().getDegradation() != null)
      for (Entry e : studyrecord.getResultsAndDiscussion().getDegradation().getEntry()) {
        if (e.getSamplingTime() != null)
          degradation.put(I5CONSTANTS.cTimePoint, q2value(e.getSamplingTime()));
        if (e.getParameter() != null)
          degradation.put(I5CONSTANTS.cDegradationParameter, p2Value(e.getParameter()));
        if (e.getDegr() != null)
          degradation.put(I5CONSTANTS.rDegradation, q2value(e.getDegr()));

        // we have decided previously to copy this to conditions
        if (papp.getParameters() != null)
          degradation.put(I5CONSTANTS.cTestType, ((IParams) papp.getParameters()).get(I5CONSTANTS.cTestType));
      }

    if (studyrecord.getResultsAndDiscussion().getHalfLifeOfParentCompound50DisappearanceTimeDT50() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterandsedimentsimulationtests._6.ENDPOINTSTUDYRECORDBiodegradationInWaterAndSedimentSimulationTests.ResultsAndDiscussion.HalfLifeOfParentCompound50DisappearanceTimeDT50.Entry entry : studyrecord
          .getResultsAndDiscussion().getHalfLifeOfParentCompound50DisappearanceTimeDT50().getEntry()) {
        EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
        q2effectrecord(entry.getHalfLife(), effect);
        effect.setEndpoint(I5CONSTANTS.rPERCENTILE_DT50);
        effect.getConditions().put(I5CONSTANTS.pTYPE, p2Value(entry.getType()));
        effect.getConditions().putAll(degradation);
        if (entry.getKeyResult() != null)
          effect.getConditions().put(I5CONSTANTS.KeyResult, entry.getKeyResult().getValue().booleanValue());
        papp.addEffect(effect);

      }

  }

  protected Value q2value(SamplingTime field) {
	  if (field==null) return null;
    Value v = new Value();
    if (field.getValue() != null)
      v.setLoValue(Double.parseDouble(field.getValue()));

    v.setUnits(getPhrase(field.getUnitCode()));
    return v;
  }

  protected Value q2value(Degr field) {
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
