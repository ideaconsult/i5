package net.idea.i6._2.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.ENDPOINTSTUDYRECORDToxicityReproduction;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.EffectLevelsF1Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.EffectLevelsF2Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.EffectLevelsP0Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.EffectLevelsP1Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.LowestEffectiveDoseConc;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;

public class ToxicityReproduction_RecordWrapper
		extends RepeatedDoseToxicity_RecordWrapper<ENDPOINTSTUDYRECORDToxicityReproduction> {

	public ToxicityReproduction_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	protected String dictionaryParams(String key) {
		if (I5CONSTANTS.cSpecies.equals(key))
			return key;
		else
			return super.dictionaryParams(key);
		// else if ("Studytype".equals(key)) return I5CONSTANTS.cTypeStudy;

	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDToxicityReproduction studyrecord) {

		if (studyrecord.getResultsAndDiscussion().getResultsOfExaminationsParentalAnimals() != null)
			try {
				for (EffectLevelsP0Entry e : studyrecord.getResultsAndDiscussion()
						.getResultsOfExaminationsParentalAnimals().getEffectLevelsP0().getEfflevel().getEntry()) {
					EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint(p2Value(e.getEndpoint()));
					q2effectrecord(e.getEffectLevel(), effect);
					papp.addEffect(effect);
					effect.getConditions().put(I5CONSTANTS.cGeneration, "P");
					effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));
					effect.getConditions().put(I5CONSTANTS.cSpecies,
							((IParams) papp.getParameters()).get(I5CONSTANTS.cSpecies));
					effect.getConditions().put(I5CONSTANTS.ReproductiveEffectsObserved, null);
					effect.getConditions().put(I5CONSTANTS.RelationToOtherToxicEffects, null);

				}
			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage());
			}

		if (studyrecord.getResultsAndDiscussion().getResultsOfExaminationsOffspring() != null)
			try {
				for (EffectLevelsF1Entry e : studyrecord.getResultsAndDiscussion().getResultsOfExaminationsOffspring()
						.getEffectLevelsF1().getEfflevel().getEntry()) {
					EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint(p2Value(e.getEndpoint()));
					q2effectrecord(e.getEffectLevel(), effect);
					papp.addEffect(effect);
					effect.getConditions().put(I5CONSTANTS.cGeneration, "F1");
					effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));
					effect.getConditions().put(I5CONSTANTS.cSpecies,
							((IParams) papp.getParameters()).get(I5CONSTANTS.cSpecies));
					effect.getConditions().put(I5CONSTANTS.ReproductiveEffectsObserved, null);
					effect.getConditions().put(I5CONSTANTS.RelationToOtherToxicEffects, null);

				}
			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage());
			}
		if (studyrecord.getResultsAndDiscussion().getResultsF2Generation() != null)
			for (EffectLevelsF2Entry e : studyrecord.getResultsAndDiscussion().getResultsF2Generation()
					.getEffectLevelsF2().getEfflevel().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getEndpoint()));
				q2effectrecord(e.getEffectLevel(), effect);
				papp.addEffect(effect);
				effect.getConditions().put(I5CONSTANTS.cGeneration, p2Value(e.getGeneration()));
				effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));
				effect.getConditions().put(I5CONSTANTS.cSpecies,
						((IParams) papp.getParameters()).get(I5CONSTANTS.cSpecies));
				effect.getConditions().put(I5CONSTANTS.ReproductiveEffectsObserved, null);
				effect.getConditions().put(I5CONSTANTS.RelationToOtherToxicEffects, null);
			}

		if (studyrecord.getResultsAndDiscussion().getResultsP1SecondParentalGeneration() != null)
			for (EffectLevelsP1Entry e : studyrecord.getResultsAndDiscussion().getResultsP1SecondParentalGeneration()
					.getEffectLevelsP1().getEfflevel().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getEndpoint()));
				q2effectrecord(e.getEffectLevel(), effect);
				papp.addEffect(effect);
				effect.getConditions().put(I5CONSTANTS.cGeneration, "P1");
				effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));
				effect.getConditions().put(I5CONSTANTS.cSpecies,
						((IParams) papp.getParameters()).get(I5CONSTANTS.cSpecies));
				effect.getConditions().put(I5CONSTANTS.ReproductiveEffectsObserved, null);
				effect.getConditions().put(I5CONSTANTS.RelationToOtherToxicEffects, null);
			}

		if (studyrecord.getResultsAndDiscussion().getReproductiveToxicity() != null)
			for (Entry entry : studyrecord.getResultsAndDiscussion().getReproductiveToxicity().getReproductiveToxicity()
					.getEntry()) {

				String reproeffects = p2Value(entry.getReproductiveEffectsObserved());
				String relation2othertoxiceffects = p2Value(entry.getRelationToOtherToxicEffects());
				String treatmentRelated = p2Value(entry.getTreatmentRelated());
				String dr = p2Value(entry.getDoseResponseRelationship());
				String kr = p2Value(entry.getKeyResult());

				try {
					EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint("LOEL");
					if (entry.getLowestEffectiveDoseConc().getValue() != null
							&& !"".equals(entry.getLowestEffectiveDoseConc()))
						q2effectrecord(entry.getLowestEffectiveDoseConc(), effect);
					else
						effect.setTextValue("-");

					effect.getConditions().put(I5CONSTANTS.ReproductiveEffectsObserved, reproeffects);
					effect.getConditions().put(I5CONSTANTS.RelationToOtherToxicEffects, relation2othertoxiceffects);
					
					if (treatmentRelated != null)
						effect.getConditions().put(I5CONSTANTS.TreatmentRelated, treatmentRelated);
					if (dr != null)
						effect.getConditions().put(I5CONSTANTS.DoseResponseRelationship, dr);
					if (kr != null)
						effect.getConditions().put(I5CONSTANTS.KeyResult, kr);
					effect.getConditions().put(I5CONSTANTS.cSpecies,
							p2Value(studyrecord.getMaterialsAndMethods().getTestAnimals().getSpecies()));
					effect.getConditions().put(I5CONSTANTS.cSex,
							p2Value(studyrecord.getMaterialsAndMethods().getTestAnimals().getSex()));
					papp.addEffect(effect);
				} catch (Exception x) {
					x.printStackTrace();
				}

			}

	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDToxicityReproduction studyRecord) {
		papp.setInterpretationResult(null);
		papp.setInterpretationCriteria(null);
	}

	protected static void q2effectrecord(LowestEffectiveDoseConc field,
			EffectRecord<String, IParams, String> effectrecord) {

		if (field.getValue() != null)
			try {
				effectrecord.setLoValue(Double.parseDouble(field.getValue()));
			} catch (Exception x) {
				effectrecord.setTextValue(field.getValue());
			}
		if (field.getUnitCode() != null)
			effectrecord.setUnit(getPhrase(field.getUnitCode(), field.getUnitOther()));
	}

}
