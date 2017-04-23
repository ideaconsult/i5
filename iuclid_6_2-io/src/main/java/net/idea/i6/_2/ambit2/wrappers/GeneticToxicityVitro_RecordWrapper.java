package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_genetictoxicityvitro._2.ENDPOINTSTUDYRECORDGeneticToxicityVitro;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_genetictoxicityvitro._2.ENDPOINTSTUDYRECORDGeneticToxicityVitro.ResultsAndDiscussion.TestRs;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_genetictoxicityvitro._2.ENDPOINTSTUDYRECORDGeneticToxicityVitro.ResultsAndDiscussion.TestRs.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;

public class GeneticToxicityVitro_RecordWrapper
		extends RepeatedDoseToxicity_RecordWrapper<ENDPOINTSTUDYRECORDGeneticToxicityVitro> {

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
			effect.setTextValue(getPhrase(e.getGenotoxicity().getValue()));
			papp.addEffect(effect);

			try {
				effect.getConditions().put(I5CONSTANTS.cMetabolicActivation,
						getPhrase(e.getMetActIndicator().getValue()));
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.cMetabolicActivation, null);
			}
			if (e.getOrganism() != null)
				try {
					effect.getConditions().put(I5CONSTANTS.cSpecies, getPhrase(e.getOrganism().getValue()));
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
		super.assignInterpretationResult(papp, studyRecord);
		if (papp.getInterpretationResult() != null)
			papp.setInterpretationResult(studyRecord.getResultsAndDiscussion().getResultsDetails());
	}
}
