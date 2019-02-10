package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_specificsurfacearea._2.ENDPOINTSTUDYRECORDSpecificSurfaceArea;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class NM_SpecificSurfaceArea_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSpecificSurfaceArea> {

	public NM_SpecificSurfaceArea_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSpecificSurfaceArea studyrecord) {
		EffectRecord<String, IParams, String> effect;
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_specificsurfacearea._2.ENDPOINTSTUDYRECORDSpecificSurfaceArea.ResultsAndDiscussion.SpecificSurfaceArea.Entry entry : studyrecord
				.getResultsAndDiscussion().getSpecificSurfaceArea().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.SPECIFIC_SURFACE_AREA, entry.getSurfaceArea(),
					entry.getStDev() == null ? null : entry.getStDev().getValue(),null);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDSpecificSurfaceArea studyRecord) {
		papp.setInterpretationResult(studyRecord.getOverallRemarksAttachments().getRemarksOnResults());
	}

}
