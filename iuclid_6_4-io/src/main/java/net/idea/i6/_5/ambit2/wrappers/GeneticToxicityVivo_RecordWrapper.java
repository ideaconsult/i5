package net.idea.i6._5.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_genetictoxicityvivo._5.ENDPOINTSTUDYRECORDGeneticToxicityVivo;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_genetictoxicityvivo._5.ENDPOINTSTUDYRECORDGeneticToxicityVivo.ResultsAndDiscussion.TestRs.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;

public class GeneticToxicityVivo_RecordWrapper
		extends RepeatedDoseToxicity_RecordWrapper<ENDPOINTSTUDYRECORDGeneticToxicityVivo> {

	public GeneticToxicityVivo_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	protected String dictionaryParams(String key) {
		if ("Species".equals(key))
			return key;
		else if ("Studytype".equals(key))
			return I5CONSTANTS.cTypeStudy;
		else
			return super.dictionaryParams(key);
	}

	@Override
	public void assignProtocolParameters(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		super.assignProtocolParameters(papp);
		try {
			IParams params = ((IParams) papp.getParameters());
			try {
			params.put(I5CONSTANTS.cTypeStudy, p2Value(getStudyRecord().getAdministrativeData().getEndpoint()).trim());
			} catch (Exception x) {}
			params.put(I5CONSTANTS.cTypeGenotoxicity,
					joinMultiTextField(getStudyRecord().getAdministrativeData().getEndpoint().getRemarks()));
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage());
		}
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDGeneticToxicityVivo studyrecord) {
		if (studyrecord.getResultsAndDiscussion()==null || studyrecord.getResultsAndDiscussion().getTestRs() == null)
			return;
		for (Entry e : studyrecord.getResultsAndDiscussion().getTestRs().getEntry()) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.eGenotoxicity);
			effect.setTextValue(p2Value(e.getGenotoxicity()));
			papp.addEffect(effect);
			effect.getConditions().put(I5CONSTANTS.cToxicity, p2Value(e.getToxicity()));
			effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));

			// copied to conditions
			try {
			effect.getConditions().put(I5CONSTANTS.cTypeStudy,
					((IParams) papp.getParameters()).get(I5CONSTANTS.cTypeStudy));
			} catch (Exception x) {}
		}
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDGeneticToxicityVivo studyRecord) {
		if (studyRecord.getApplicantSummaryAndConclusion() != null) {
			papp.setInterpretationResult(
					joinMultiTextFieldLarge(studyRecord.getApplicantSummaryAndConclusion().getConclusions())
							.replace(msg.getString(_MIGRATED), ""));
			papp.setInterpretationCriteria(
					joinMultiTextFieldLarge(studyRecord.getApplicantSummaryAndConclusion().getConclusions()));
		}
	}
}
