package net.idea.i6._6.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_melting._6.ENDPOINTSTUDYRECORDMelting;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_melting._6.ENDPOINTSTUDYRECORDMelting.ResultsAndDiscussion.MeltingPointSet.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class Melting_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDMelting> {

  public Melting_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDMelting studyrecord) {
    if (studyrecord.getResultsAndDiscussion() == null)
      return;

    EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
    effect.setEndpoint(I5CONSTANTS.eMELTINGPOINT);
    papp.addEffect(effect);

    try {
      for (Entry e : studyrecord.getResultsAndDiscussion().getMeltingPoint().getEntry()) {

        // pressure should be a condition
        // decomposition and sublimation are actually readouts not
        // conditions...
        try {
          effect.getConditions().put(I5CONSTANTS.rDECOMPOSITION, p2Value(e.getDecompIndicator()));
        } catch (Exception x) {
          effect.getConditions().put(I5CONSTANTS.rDECOMPOSITION, null);
        }
        try {
          effect.getConditions().put(I5CONSTANTS.rSUBLIMATION, p2Value(e.getSublimationIndicator()));
        } catch (Exception x) {
          effect.getConditions().put(I5CONSTANTS.rSUBLIMATION, null);
        }

        effect.getConditions().put(I5CONSTANTS.Pressure, q2value(e.getPressure()));
        effect.getConditions().put("Sublimation T", q2value(e.getSublimationTemp()));
        effect.getConditions().put("Decomposition T", q2value(e.getDecompTemp()));

        effect.setTextValue(remarks2Value(e.getRemarksOnResults()));
        q2effectrecord(e.getMeltingPoint(), effect);

      }
    } catch (Exception x) {
      logger.log(Level.WARNING, x.getMessage(), x);
    }

  }
}
