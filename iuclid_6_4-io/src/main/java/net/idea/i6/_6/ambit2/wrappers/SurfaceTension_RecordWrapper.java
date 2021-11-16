package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_surfacetension._6.ENDPOINTSTUDYRECORDSurfaceTension;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_surfacetension._6.ENDPOINTSTUDYRECORDSurfaceTension.ResultsAndDiscussion.SurfaceTension.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class SurfaceTension_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSurfaceTension> {

	public SurfaceTension_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSurfaceTension studyrecord) {
		if (studyrecord.getResultsAndDiscussion() == null)
			return;

		if (studyrecord.getResultsAndDiscussion().getSurfaceTension() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getSurfaceTension().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();

				effect.setEndpoint(I5CONSTANTS.eSURFACE_TENSION);

				q2effectrecord(e.getTension(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cTemperature, q2value(e.getTemp()));
				if (e.getConc()!=null)
					effect.getConditions().put(I5CONSTANTS.cConc, q2value(e.getConc()));
				effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(e.getRemarksOnResults()));
				if (e.getKeyResult() != null)
					effect.getConditions().put(I5CONSTANTS.KeyResult, e.getKeyResult().getValue().booleanValue());
			}
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDSurfaceTension studyRecord) {
		if (studyRecord.getOverallRemarksAttachments() != null)
			papp.setInterpretationResult(
					joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
	}
}
