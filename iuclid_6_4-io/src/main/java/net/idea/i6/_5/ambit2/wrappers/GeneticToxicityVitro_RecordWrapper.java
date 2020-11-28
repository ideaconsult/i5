package net.idea.i6._5.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_genetictoxicityvitro._5.ENDPOINTSTUDYRECORDGeneticToxicityVitro;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_genetictoxicityvitro._5.ENDPOINTSTUDYRECORDGeneticToxicityVitro.ResultsAndDiscussion.TestRs;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_genetictoxicityvitro._5.ENDPOINTSTUDYRECORDGeneticToxicityVitro.ResultsAndDiscussion.TestRs.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;

public class GeneticToxicityVitro_RecordWrapper
		extends RepeatedDoseToxicity_RecordWrapper<ENDPOINTSTUDYRECORDGeneticToxicityVitro> {
	private static final String _MIGRATED_GENOTOXTYPE = "MIGRATED_GENOTOXTYPE";

	public GeneticToxicityVitro_RecordWrapper(Document doc) throws Exception {
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
			params.put(I5CONSTANTS.cTypeStudy, p2Value(getStudyRecord().getAdministrativeData().getEndpoint()).trim());
			params.put(I5CONSTANTS.cTypeGenotoxicity,
					joinMultiTextField(getStudyRecord().getAdministrativeData().getEndpoint().getRemarks())
							.replace(msg.getString(_MIGRATED_GENOTOXTYPE), "").trim());
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage());
		}
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDGeneticToxicityVitro studyrecord) {

		studyrecord.getResultsAndDiscussion().getResultsDetails();
		TestRs resutls = studyrecord.getResultsAndDiscussion().getTestRs();
		for (Entry e : resutls.getEntry()) {
			/*
			 * e.getCytotoxicity() e.getCytotoxicity() e.getMetActIndicator()
			 * e.getNegContrValid() e.getOrganism() e.getPosContrValid()
			 * e.getRemarksOnResults() e.getVehContrValid()
			 */
			EffectRecord<String, IParams, String> effect = endpointCategory.mapIUCLID5().createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.eGenotoxicity);
			effect.setTextValue(p2Value(e.getGenotoxicity()));
			papp.addEffect(effect);

			try {
				effect.getConditions().put(I5CONSTANTS.cMetabolicActivation, p2Value(e.getMetActIndicator()));
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.cMetabolicActivation, null);
			}
			if (e.getOrganism() != null)
				try {
					effect.getConditions().put(I5CONSTANTS.cSpecies, p2Value(e.getOrganism()));
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.cSpecies, null);
				}

			// copied to conditions
			effect.getConditions().put(I5CONSTANTS.cTypeStudy,
					((IParams) papp.getParameters()).get(I5CONSTANTS.cTypeStudy));

		}

	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDGeneticToxicityVitro studyRecord) {
		// i6 migrated into a different field
		papp.setInterpretationResult(
				joinMultiTextFieldLarge(studyRecord.getApplicantSummaryAndConclusion().getConclusions())
						.replace(msg.getString(_MIGRATED), ""));
		papp.setInterpretationCriteria(
				joinMultiTextFieldLarge(studyRecord.getApplicantSummaryAndConclusion().getConclusions()));
	}
}
