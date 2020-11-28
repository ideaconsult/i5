package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_aspectratioshape._5.ENDPOINTSTUDYRECORDAspectRatioShape;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_aspectratioshape._5.ENDPOINTSTUDYRECORDAspectRatioShape.ResultsAndDiscussion.ShapeDescription.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class NM_AspectRatioShape extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDAspectRatioShape> {

	public NM_AspectRatioShape(Document doc) throws Exception {
		super(doc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDAspectRatioShape studyrecord) {
		EffectRecord<String, IParams, String> effect;

		for (Entry entry : studyrecord
				.getResultsAndDiscussion().getShapeDescription().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eSHAPE, entry.getPercentageValue(),
					entry.getStDev() == null ? null : entry.getStDev().getValue(), I5CONSTANTS.endpoint_type_PERCENT);
			effect.setTextValue(I5CONSTANTS.eSHAPE_DESCRIPTIVE);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_aspectratioshape._5.ENDPOINTSTUDYRECORDAspectRatioShape.ResultsAndDiscussion.AspectRatio.Entry entry : studyrecord
				.getResultsAndDiscussion().getAspectRatio().getEntry()) {

			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eASPECT_RATIO_X, entry.getXDimension(),
					entry.getXDimensionDeviation() == null ? null : entry.getXDimensionDeviation().getValue().doubleValue(), null);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eASPECT_RATIO_Y, entry.getYDimension(),
					entry.getXDimensionDeviation() == null ? null : entry.getYDimensionDeviation().getValue().doubleValue(), null);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eASPECT_RATIO_Z, entry.getZDimension(),
					entry.getXDimensionDeviation() == null ? null : entry.getZDimensionDeviation().getValue().doubleValue(), null);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));

		}
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDAspectRatioShape studyRecord) {
		papp.setInterpretationResult(joinMultiTextField(studyRecord.getOverallRemarksAttachments().getRemarksOnResults()));
	}
}
