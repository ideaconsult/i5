package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_porosity._2.ENDPOINTSTUDYRECORDPorosity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_porosity._2.ENDPOINTSTUDYRECORDPorosity.ResultsAndDiscussion.Porosity.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class NM_Porosity_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPorosity> {

	public NM_Porosity_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPorosity studyrecord) {
		EffectRecord<String, IParams, String> effect;
		for (Entry entry : studyrecord.getResultsAndDiscussion().getPorosity().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.ePOROSITY, entry.getMean(),
					entry.getStDev() == null ? null : entry.getStDev().getValue(),null);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_porosity._2.ENDPOINTSTUDYRECORDPorosity.ResultsAndDiscussion.SpecificPoreVolume.Entry entry : studyrecord
				.getResultsAndDiscussion().getSpecificPoreVolume().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eSPECIFIC_PORE_VOLUME, entry.getMean(),
					entry.getStDev() == null ? null : entry.getStDev().getValue(),null);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}

		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_porosity._2.ENDPOINTSTUDYRECORDPorosity.ResultsAndDiscussion.ModalPoreDiameter.Entry entry : studyrecord
				.getResultsAndDiscussion().getModalPoreDiameter().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eMODAL_PORE_VOLUME, entry.getMean(),
					entry.getStDev() == null ? null : entry.getStDev().getValue(),null);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}

	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDPorosity studyRecord) {
		papp.setInterpretationResult(studyRecord.getOverallRemarksAttachments().getRemarksOnResults());
	}
}
