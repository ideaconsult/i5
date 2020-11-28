package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_pourdensity._5.ENDPOINTSTUDYRECORDPourDensity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_pourdensity._5.ENDPOINTSTUDYRECORDPourDensity.ResultsAndDiscussion.PourDensity.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class NM_PourDensity_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPourDensity> {

	public NM_PourDensity_RecordWrapper(Document doc) throws Exception {
		super(doc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPourDensity studyrecord) {
		EffectRecord<String, IParams, String> effect;
		for (Entry entry : studyrecord.getResultsAndDiscussion().getPourDensity().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.ePOUR_DENSITY, entry.getMean(),
					entry.getStDev() == null ? null : entry.getStDev().getValue(),I5CONSTANTS.endpoint_type_MEAN);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}
	}
	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDPourDensity studyRecord) {
		papp.setInterpretationResult(joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
	}
}
