package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinsoil._6.ENDPOINTSTUDYRECORDBiodegradationInSoil;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinsoil._6.ENDPOINTSTUDYRECORDBiodegradationInSoil.MaterialsAndMethods.StudyDesign.SoilProperties.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class BiodegradationInSoil_RecordWrapper
    extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDBiodegradationInSoil> {
  protected Params soil = new Params();

  public BiodegradationInSoil_RecordWrapper(Document doc) throws Exception {
    super(doc);
  }

  @Override
  public void assignProtocolParameters(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
    super.assignProtocolParameters(papp);
    papp.getParameters().remove(I5CONSTANTS.cSoilNo);
    papp.getParameters().remove(I5CONSTANTS.cSoilType);
    papp.getParameters().remove(I5CONSTANTS.cOCContent);
    papp.getParameters().remove(I5CONSTANTS.pH);

  }

  protected Params getSoilParams(Params soil, String soilno) {
    Params p = (Params) soil.get(soilno);
    if (p == null) {
      p = new Params();
      p.put(I5CONSTANTS.cSoilNo, soilno);
      soil.put(soilno, p);
    }
    return p;
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDBiodegradationInSoil studyrecord) {
    if (studyrecord.getMaterialsAndMethods() != null && studyrecord.getMaterialsAndMethods().getStudyDesign() != null
        && studyrecord.getMaterialsAndMethods().getStudyDesign().getSoilProperties() != null)
      for (Entry e : studyrecord.getMaterialsAndMethods().getStudyDesign().getSoilProperties().getEntry()) {
        String soilno = p2Value(e.getSoilNo());
        Params p = getSoilParams(soil, soilno);
        p.put(I5CONSTANTS.cSoilType, p2Value(e.getSoilType()));
        p.put(I5CONSTANTS.cOCContent, q2value(e.getOrgC()));
        p.put(I5CONSTANTS.pH, q2value(e.getPh()));
        // e.getSand()
        // e.getSilt()
        // e.getClay()
      }

    if (studyrecord.getResultsAndDiscussion()!=null && studyrecord.getResultsAndDiscussion().getDegradation() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinsoil._6.ENDPOINTSTUDYRECORDBiodegradationInSoil.ResultsAndDiscussion.Degradation.Entry e : studyrecord
          .getResultsAndDiscussion().getDegradation().getEntry()) {

        String soilno = p2Value(e.getSoilNo());
        Params p = getSoilParams(soil, soilno);
        p.put(I5CONSTANTS.rDegradation, q2value(e.getDegr()));
        p.put(I5CONSTANTS.cTimePoint, p2Value(e.getParameter()));
        if (e.getKeyResult() != null)
          p.put(I5CONSTANTS.KeyResult, e.getKeyResult().getValue().booleanValue());
        soil.put(soilno, p);
      }

    if (studyrecord.getResultsAndDiscussion()!=null && studyrecord.getResultsAndDiscussion().getHalfLifeOfParentCompound() != null)
      for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinsoil._6.ENDPOINTSTUDYRECORDBiodegradationInSoil.ResultsAndDiscussion.HalfLifeOfParentCompound.Entry e : studyrecord
          .getResultsAndDiscussion().getHalfLifeOfParentCompound().getEntry())
        try {
          String soilno = p2Value(e.getSoilNo());
          Params p = getSoilParams(soil, soilno);
          EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
          effect.setEndpoint(p2Value(e.getType()));
          q2effectrecord(e.getHalfLife(), effect);
          effect.getConditions().putAll(p);
          effect.getConditions().put(I5CONSTANTS.cTestType,
              p2Value(studyrecord.getMaterialsAndMethods().getTestType()));
          papp.addEffect(effect);
        } catch (Exception x) {

        }
    /*
     * EffectRecord<String, IParams, String> effect =
     * endpointCategory.createEffectRecord();
     * effect.setEndpoint(p2Value(e.getParameter())); q2effectrecord(e.getDegr(),
     * effect); papp.addEffect(effect);
     * 
     * effect.getConditions().put(I5CONSTANTS.cSoilNo, p2Value(e.getSoilNo()));
     * effect.getConditions().put(I5CONSTANTS.cTestType,
     * p2Value(studyrecord.getMaterialsAndMethods().getTestType()));
     * 
     */
  }

}
