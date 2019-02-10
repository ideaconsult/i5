package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_radicalformationpotential._2.ENDPOINTSTUDYRECORDRadicalFormationPotential;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_radicalformationpotential._2.ENDPOINTSTUDYRECORDRadicalFormationPotential.ResultsAndDiscussion.RadicalFormationPotential.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class NM_RadicalFormation_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDRadicalFormationPotential> {

	public NM_RadicalFormation_RecordWrapper(Document doc) throws Exception {
		super(doc);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDRadicalFormationPotential studyrecord) {
		int n=1;
		for (Entry e : studyrecord.getResultsAndDiscussion().getRadicalFormationPotential().getEntry()) {
			EffectRecord r = endpointCategory.createEffectRecord();
			r.setEndpointGroup(n);
			r.setEndpoint(I5CONSTANTS.eRadicalFormation_Observations);
			r.setTextValue(e.getDescriptionObservations());
			papp.addEffect(r);
			
			r = endpointCategory.createEffectRecord();
			r.setEndpointGroup(n);
			r.setEndpoint(I5CONSTANTS.eRadicalFormation_Quantitative);
			r.setTextValue(e.getQuantitativeDescription());
			papp.addEffect(r);

			r = endpointCategory.createEffectRecord();
			r.setEndpointGroup(n);
			r.setEndpoint(e.getRemarks());
			r.setTextValue(I5CONSTANTS.Remark);
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
