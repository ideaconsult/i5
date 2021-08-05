package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_density._6.ENDPOINTSTUDYRECORDDensity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_density._6.ENDPOINTSTUDYRECORDDensity.ResultsAndDiscussion.DensitySet.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class Density_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDDensity> {

	public Density_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDDensity studyrecord) {
		if (studyrecord.getResultsAndDiscussion() == null)
			return;
		
		if (studyrecord.getResultsAndDiscussion().getDensity() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getDensity().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				if (e.getType()==null)
					effect.setEndpoint("DENSITY");
				else
					effect.setEndpoint(p2Value(e.getType()));
				q2effectrecord(e.getDensity(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cTemperature, q2value(e.getTemp()));

				effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(e.getRemarksOnResults()));
				if (e.getKeyResult() != null)
					effect.getConditions().put(I5CONSTANTS.KeyResult, e.getKeyResult().getValue().booleanValue());
			}
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDDensity studyRecord) {
		if (studyRecord.getOverallRemarksAttachments() != null)
			papp.setInterpretationResult(
					joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
	}
}
