package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._2.ENDPOINTSTUDYRECORDSkinSensitisation;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._2.ENDPOINTSTUDYRECORDSkinSensitisation.ResultsAndDiscussion.TraditionalSensitisationTest.ResultsOfTest.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

/**
 * 
 * @author nina
 *
 */
public class SkinSensitisation_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSkinSensitisation> {

	public SkinSensitisation_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDSkinSensitisation studyRecord) {
		super.assignInterpretationResult(papp, studyRecord);
		papp.setInterpretationResult(
				p2Value(studyRecord.getApplicantSummaryAndConclusion().getInterpretationOfResults()));
		papp.setInterpretationCriteria(
				studyRecord.getApplicantSummaryAndConclusion().getInterpretationOfResults().getRemarks());
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSkinSensitisation studyRecord) {

		// TODO should be different protocol application
		if (studyRecord.getResultsAndDiscussion().getTraditionalSensitisationTest() != null)
			for (Entry e : studyRecord.getResultsAndDiscussion().getTraditionalSensitisationTest().getResultsOfTest()
					.getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint("ClinicalObservation");
				effect.setTextValue(e.getClinicalObservations());
				papp.addEffect(effect);
			}

		if (studyRecord.getResultsAndDiscussion().getInVitroInChemico() != null)
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._2.ENDPOINTSTUDYRECORDSkinSensitisation.ResultsAndDiscussion.InVitroInChemico.Results.Entry e : studyRecord
					.getResultsAndDiscussion().getInVitroInChemico().getResults().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				q2effectrecord(e.getValue(), effect);
				effect.setEndpoint(p2Value(e.getParameter()));
				papp.addEffect(effect);
			}

		if (studyRecord.getResultsAndDiscussion().getInVivoLLNA() != null)
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinsensitisation._2.ENDPOINTSTUDYRECORDSkinSensitisation.ResultsAndDiscussion.InVivoLLNA.Results.Entry e : studyRecord
					.getResultsAndDiscussion().getInVivoLLNA().getResults().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				q2effectrecord(e.getValue(), effect);
				effect.setEndpoint(p2Value(e.getParameter()));
				papp.addEffect(effect);

			}
	}
}
