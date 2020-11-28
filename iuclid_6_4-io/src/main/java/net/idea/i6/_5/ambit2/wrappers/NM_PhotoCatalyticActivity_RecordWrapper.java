package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_photocatalyticactivity._5.ENDPOINTSTUDYRECORDPhotocatalyticActivity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_photocatalyticactivity._5.ENDPOINTSTUDYRECORDPhotocatalyticActivity.ResultsAndDiscussion.PhotocatalyticActivity.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class NM_PhotoCatalyticActivity_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPhotocatalyticActivity> {

	public NM_PhotoCatalyticActivity_RecordWrapper(Document doc) throws Exception {
		super(doc);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPhotocatalyticActivity studyrecord) {
		//
		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setTextValue(studyrecord.getResultsAndDiscussion().getDescription());
		effect.setEndpoint(I5CONSTANTS.pDESCRIPTION);
		for (Entry entry : studyrecord.getResultsAndDiscussion().getPhotocatalyticActivity().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.ePHOTOCATALYTIC_ACTIVITY, entry.getMean(),entry.getStDev()==null?null:entry.getStDev().getValue(),I5CONSTANTS.endpoint_type_MEAN);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_photocatalyticactivity._5.ENDPOINTSTUDYRECORDPhotocatalyticActivity.ResultsAndDiscussion.TurnOverFrequency.Entry entry : studyrecord.getResultsAndDiscussion().getTurnOverFrequency().getEntry()) {
				
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eTURNOVERFREQUENCY, entry.getMean(),entry.getStDev()==null?null:entry.getStDev().getValue(),I5CONSTANTS.endpoint_type_MEAN);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}
	}
	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDPhotocatalyticActivity studyRecord) {
		papp.setInterpretationResult(joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
	}
}
