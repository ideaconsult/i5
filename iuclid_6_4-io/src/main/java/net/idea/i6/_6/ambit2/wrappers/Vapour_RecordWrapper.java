package net.idea.i6._6.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_vapour._6.ENDPOINTSTUDYRECORDVapour;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_vapour._6.ENDPOINTSTUDYRECORDVapour.ResultsAndDiscussion.Vapourpr.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_vapour._6.ENDPOINTSTUDYRECORDVapour.ResultsAndDiscussion.Vapourpr.Entry.TempQualifier;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

/**
 * @TODO more properties to be read
 * @author nina
 *
 */
public class Vapour_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDVapour> {

  public Vapour_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDVapour studyrecord) {
    if (studyrecord.getResultsAndDiscussion()==null) return;
    if (studyrecord.getResultsAndDiscussion().getVapourpr()==null) return;
    for (Entry e : studyrecord.getResultsAndDiscussion().getVapourpr().getEntry()) {
      EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
      effect.setEndpoint(I5CONSTANTS.eVapourPressure);
      papp.addEffect(effect);

      try {
        effect.getConditions().put(I5CONSTANTS.cTemperature, q2value(e.getTempQualifier()));
      } catch (Exception x) {
        effect.getConditions().put(I5CONSTANTS.cTemperature, null);
        logger.log(Level.FINE, x.getMessage(), x);
      }

      try {
        q2effectrecord(e.getPressure(), effect);
      } catch (Exception x) {
      }

    }
  }

  protected Value q2value(TempQualifier field) {

    if (field == null)
      return null;
    Value v = new Value();
    v.setLoQualifier(field.getQualifier());
    if (field.getValue()!=null)
    v.setLoValue(field.getValue().doubleValue());
    v.setUnits(getPhrase(field.getUnitCode()));
    return v;
  }

}
