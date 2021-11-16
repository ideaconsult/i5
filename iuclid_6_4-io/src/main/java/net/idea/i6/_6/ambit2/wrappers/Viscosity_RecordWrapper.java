package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_viscosity._6.ENDPOINTSTUDYRECORDViscosity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_viscosity._6.ENDPOINTSTUDYRECORDViscosity.ResultsAndDiscussion.ViscositySet.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class Viscosity_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDViscosity> {

	public Viscosity_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDViscosity studyrecord) {
		if (studyrecord.getResultsAndDiscussion() == null)
			return;

		if (studyrecord.getResultsAndDiscussion().getViscosity() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getViscosity().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();

				effect.setEndpoint(I5CONSTANTS.eVISCOSITY);

				q2effectrecord(e.getViscosity(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cTemperature, p2Value(e.getTemp()));

				effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(e.getRemarksOnResults()));
				if (e.getKeyResult() != null)
					effect.getConditions().put(I5CONSTANTS.KeyResult, e.getKeyResult().getValue().booleanValue());
			}
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDViscosity studyRecord) {
		if (studyRecord.getOverallRemarksAttachments() != null)
			papp.setInterpretationResult(
					joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
	}
}
