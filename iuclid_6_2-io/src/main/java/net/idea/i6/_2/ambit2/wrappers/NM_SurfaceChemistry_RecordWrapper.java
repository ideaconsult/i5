package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_surfacechemistry._2.ENDPOINTSTUDYRECORDSurfaceChemistry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_surfacechemistry._2.ENDPOINTSTUDYRECORDSurfaceChemistry.ResultsAndDiscussion.Coating.AtomicComposition.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class NM_SurfaceChemistry_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSurfaceChemistry> {

	public NM_SurfaceChemistry_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSurfaceChemistry studyrecord) {
		EffectRecord<String, IParams, String> effect;
		effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(I5CONSTANTS.pCOATING);
		effect.setTextValue(getPhrase(studyrecord.getResultsAndDiscussion().getCoatingFunctionalisation().getValue(),studyrecord.getResultsAndDiscussion().getCoatingFunctionalisation().getOther()));
		papp.addEffect(effect);

		effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(I5CONSTANTS.pCOATING_DESCRIPTION);
		effect.setTextValue(getPhrase(studyrecord.getResultsAndDiscussion().getCoating().getCoating().getValue(),studyrecord.getResultsAndDiscussion().getCoating().getCoating().getOther()));
		papp.addEffect(effect);		
		for (Entry entry : studyrecord.getResultsAndDiscussion().getCoating().getAtomicComposition().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eFRACTION, entry.getFraction(),
					entry.getStDev() == null ? null : entry.getStDev().doubleValue(),null);
			effect.setTextValue(entry.getElement());
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}
		
		effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(I5CONSTANTS.pFUNCTIONALIZATION);
		effect.setTextValue(studyrecord.getResultsAndDiscussion().getFunctionalisation().getFunctionalisationDescription());
		papp.addEffect(effect);
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_surfacechemistry._2.ENDPOINTSTUDYRECORDSurfaceChemistry.ResultsAndDiscussion.Functionalisation.FunctionalGroup.Entry entry : studyrecord.getResultsAndDiscussion().getFunctionalisation().getFunctionalGroup().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eFRACTION, entry.getFraction(),
					entry.getStDev() == null ? null : entry.getStDev().doubleValue(),null);
			effect.setTextValue(entry.getGroup());
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
		}		
	}
	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDSurfaceChemistry studyRecord) {
		papp.setInterpretationResult(studyRecord.getOverallRemarksAttachments().getRemarksOnResults());
	}
}
