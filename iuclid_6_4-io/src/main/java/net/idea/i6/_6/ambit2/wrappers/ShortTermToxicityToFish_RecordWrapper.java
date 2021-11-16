package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_shorttermtoxicitytofish._6.ENDPOINTSTUDYRECORDShortTermToxicityToFish;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_shorttermtoxicitytofish._6.ENDPOINTSTUDYRECORDShortTermToxicityToFish.ResultsAndDiscussion.EffectConcentrations.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class ShortTermToxicityToFish_RecordWrapper
    extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDShortTermToxicityToFish> {

  public ShortTermToxicityToFish_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  protected String dictionaryParams(String key) {
    if ("TestOrganismsSpecies".equals(key))
      return I5CONSTANTS.cTestOrganism;
    return super.dictionaryParams(key);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDShortTermToxicityToFish studyrecord) {
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    if (studyrecord.getResultsAndDiscussion().getEffectConcentrations() != null)
      for (Entry e : studyrecord.getResultsAndDiscussion().getEffectConcentrations().getEntry()) {

        EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
        q2effectrecord(e.getEffectConc(), effect);
        try {
          effect.setEndpoint(p2Value(e.getEndpoint()));
        } catch (Exception x) {
          effect.setEndpoint(null);
        }
        papp.addEffect(effect);

        effect.getConditions().put(I5CONSTANTS.cEffect, p2Value(e.getBasisForEffect()));
        effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getConcBasedOn()));
        effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration, p2Value(e.getNominalMeasured()));
        effect.getConditions().put(I5CONSTANTS.cExposure, q2value(e.getDuration()));
      }

  }

}
