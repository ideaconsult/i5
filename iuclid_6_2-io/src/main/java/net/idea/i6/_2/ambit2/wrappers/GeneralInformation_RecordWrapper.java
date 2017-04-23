package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_generalinformation._2.ENDPOINTSTUDYRECORDGeneralInformation;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class GeneralInformation_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDGeneralInformation> {

	public GeneralInformation_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDGeneralInformation studyrecord) {
		if (studyrecord.getResultsAndDiscussion() == null)
			return;
		StringBuilder physstate = null;

		if (studyrecord.getResultsAndDiscussion().getSubstancePhysicalState() != null)
			physstate.append(getPhrase(studyrecord.getResultsAndDiscussion().getSubstancePhysicalState().getValue(),
					studyrecord.getResultsAndDiscussion().getSubstancePhysicalState().getOther()));

		String form = null;

		try {
			form = getPhrase(studyrecord.getResultsAndDiscussion().getSubstanceType().getValue(),
					studyrecord.getResultsAndDiscussion().getSubstanceType().getOther());
		} catch (Exception x) {

		}

		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(physstate == null ? null : physstate.toString());
		effect.getConditions().put(I5CONSTANTS.Remark, form == null ? "" : form.toString());
		papp.addEffect(effect);
	}
}
