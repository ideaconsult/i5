package net.idea.i6._5.ambit2.wrappers;

import java.lang.reflect.Method;
import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._5.ENDPOINTSTUDYRECORDCarcinogenicity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._5.ENDPOINTSTUDYRECORDCarcinogenicity.ResultsAndDiscussion.EffectLevels.Efflevel.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;

public class Carcinogenicity_RecordWrapper
		extends RepeatedDoseToxicity_RecordWrapper<ENDPOINTSTUDYRECORDCarcinogenicity> {

	public Carcinogenicity_RecordWrapper(Document doc) throws Exception {
		super(doc);

	}

	@Override
	protected String dictionaryParams(String key) {
		if (I5CONSTANTS.cSpecies.equals(key))
			return key;
		else if ("Studytype".equals(key))
			return I5CONSTANTS.cTypeStudy;
		else
			return super.dictionaryParams(key);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDCarcinogenicity studyrecord) {
	    if (studyrecord.getResultsAndDiscussion()==null) return;
		if (studyrecord.getResultsAndDiscussion().getEffectLevels() != null)

			for (Entry e : studyrecord.getResultsAndDiscussion().getEffectLevels().getEfflevel().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				
				effect.setEndpoint(p2Value(e.getEndpoint()));
				q2effectrecord(e.getEffectLevel(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));

				effect.getConditions().put(I5CONSTANTS.cSpecies,
						((IParams) papp.getParameters()).get(I5CONSTANTS.cSpecies));
				effect.getConditions().put(I5CONSTANTS.Organ, null);
				effect.getConditions().put(I5CONSTANTS.CriticalEffectsObserved, null);

			}

		if (importResultsOfExaminations && studyrecord.getResultsAndDiscussion().getResultsOfExaminations() != null) {

			Method[] allMethods = studyrecord.getResultsAndDiscussion().getResultsOfExaminations().getClass()
					.getDeclaredMethods();
			for (Method m : allMethods)
				try {
					if (m.getName().startsWith("get"))
						try {
							Object r = m.invoke(studyrecord.getResultsAndDiscussion().getResultsOfExaminations());
							if (r == null)
								continue;
							String key = m.getName();
							IParams p = new Params();
							Object value = _getMethodValue(r, p);
							if (value != null && !"".equals(value)) {
								EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
								effect.setEndpoint(dictionaryEndpoint(methodname2key(key)));
								effect.setTextValue(p2Value(value));
								papp.addEffect(effect);
							}
						} catch (Exception xx) {
							xx.printStackTrace();
						}
				} catch (Exception x) {
					logger.log(Level.WARNING, x.getMessage(), x);
				}
		}
		if (studyrecord.getResultsAndDiscussion().getTargetSystemOrganToxicity() != null) {
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._5.ENDPOINTSTUDYRECORDCarcinogenicity.ResultsAndDiscussion.TargetSystemOrganToxicitySet.TargetSystemOrganToxicity.Entry entry : studyrecord.getResultsAndDiscussion()
					.getTargetSystemOrganToxicity().getTargetSystemOrganToxicity().getEntry()) {

				String criticaleffects = p2Value(entry.getCriticalEffectsObserved());
				String organ = p2Value(entry.getOrgan());
				String system = p2Value(entry.getSystem());
				String treatmentRelated = p2Value(entry.getTreatmentRelated());
				String dr = p2Value(entry.getDoseResponseRelationship());
				Boolean kr = entry.getKeyResult()==null?null:entry.getKeyResult().getValue();

					try {
						EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
						effect.setEndpoint("LOEL");

						if (entry.getLowestEffectiveDoseConc().getValue() != null
								&& !"".equals(entry.getLowestEffectiveDoseConc()))
							q2effectrecord(entry.getLowestEffectiveDoseConc(), effect);
						else
							effect.setTextValue("-");

						effect.getConditions().put(I5CONSTANTS.CriticalEffectsObserved, criticaleffects);
						
						
						q2effectrecord(entry.getLowestEffectiveDoseConc(), effect);
						if (system != null)
							effect.getConditions().put(I5CONSTANTS.System, system);

						effect.getConditions().put(I5CONSTANTS.Organ, organ);
						if (treatmentRelated != null)
							effect.getConditions().put(I5CONSTANTS.TreatmentRelated, treatmentRelated);
						if (dr != null)
							effect.getConditions().put(I5CONSTANTS.DoseResponseRelationship, dr);
						if (kr != null)
							effect.getConditions().put(I5CONSTANTS.KeyResult, kr.booleanValue());
						effect.getConditions().put(I5CONSTANTS.cSpecies,
								p2Value(studyrecord.getMaterialsAndMethods().getTestAnimals().getSpecies()));
						papp.addEffect(effect);
					} catch (Exception x) {
						x.printStackTrace();
					}

				

			}
		}
	}

}
