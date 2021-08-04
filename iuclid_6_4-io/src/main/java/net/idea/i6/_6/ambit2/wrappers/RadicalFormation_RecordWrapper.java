package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_radicalformationpotential._6.ENDPOINTSTUDYRECORDRadicalFormationPotential;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_radicalformationpotential._6.ENDPOINTSTUDYRECORDRadicalFormationPotential.ResultsAndDiscussion.RadicalFormationPotential.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class RadicalFormation_RecordWrapper
    extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDRadicalFormationPotential> {

  public RadicalFormation_RecordWrapper(Document doc) throws Exception {
    super(doc);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDRadicalFormationPotential studyrecord) {
    int n = 1;
    if (studyrecord.getResultsAndDiscussion() == null)
      return;
    if (studyrecord.getResultsAndDiscussion().getRadicalFormationPotential() != null)
      for (Entry e : studyrecord.getResultsAndDiscussion().getRadicalFormationPotential().getEntry()) {
        EffectRecord r = endpointCategory.createEffectRecord();
        r.setEndpointGroup(n);
        r.setEndpoint(I5CONSTANTS.eRadicalFormation_Observations);
        r.setTextValue(joinMultiTextField(e.getDescriptionObservations()));
        if (e.getKeyResult() != null)
          ((IParams)r.getConditions()).put(I5CONSTANTS.KeyResult, e.getKeyResult().getValue().booleanValue());
        papp.addEffect(r);

        r = endpointCategory.createEffectRecord();
        r.setEndpointGroup(n);
        r.setEndpoint(I5CONSTANTS.eRadicalFormation_Quantitative);
        r.setTextValue(joinMultiTextField(e.getQuantitativeDescription()));
        if (e.getKeyResult() != null)
          ((IParams)r.getConditions()).put(I5CONSTANTS.KeyResult, e.getKeyResult().getValue().booleanValue());
        papp.addEffect(r);

        r = endpointCategory.createEffectRecord();
        r.setEndpointGroup(n);
        r.setTextValue(joinMultiTextField(e.getRemarks()));
        r.setEndpoint(I5CONSTANTS.Remark);
        if (e.getKeyResult() != null)
          ((IParams)r.getConditions()).put(I5CONSTANTS.KeyResult, e.getKeyResult().getValue().booleanValue());        
        papp.addEffect(r);
        

        n++;
      }
  }

  @Override
  public void assignInterpretationResult(ProtocolApplication papp,
      ENDPOINTSTUDYRECORDRadicalFormationPotential studyRecord) {
    // TODO Auto-generated method stub
    super.assignInterpretationResult(papp, studyRecord);
  }
}
