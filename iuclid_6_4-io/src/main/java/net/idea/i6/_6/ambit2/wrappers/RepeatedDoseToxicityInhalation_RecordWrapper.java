package net.idea.i6._6.ambit2.wrappers;

import java.lang.reflect.Method;
import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._6.ENDPOINTSTUDYRECORDRepeatedDoseToxicityInhalation;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._6.ENDPOINTSTUDYRECORDRepeatedDoseToxicityInhalation.ResultsAndDiscussion.EffectLevels.Efflevel.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._6.ENDPOINTSTUDYRECORDRepeatedDoseToxicityInhalation.ResultsAndDiscussion.TargetSystemOrganToxicitySet.TargetSystemOrganToxicity.Entry.LowestEffectiveDoseConc;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;

public class RepeatedDoseToxicityInhalation_RecordWrapper
		extends RepeatedDoseToxicity_RecordWrapper<ENDPOINTSTUDYRECORDRepeatedDoseToxicityInhalation> {

	public RepeatedDoseToxicityInhalation_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignProtocolParameters(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		super.assignProtocolParameters(papp);
		try {
			IParams params = ((IParams) papp.getParameters());
			params.put(I5CONSTANTS.cTestType, p2Value(getStudyRecord().getAdministrativeData().getEndpoint()).trim());
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage());
		}
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDRepeatedDoseToxicityInhalation studyrecord) {
	    if (studyrecord.getResultsAndDiscussion()==null) return;
		if (studyrecord.getResultsAndDiscussion().getEffectLevels() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getEffectLevels().getEfflevel().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				q2effectrecord(e.getEffectLevel(), effect);
				try {
					effect.setEndpoint(p2Value(e.getEndpoint()));
				} catch (Exception x) {
					effect.setEndpoint(null);
				}
				papp.addEffect(effect);
				try {
					effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.cSex, null);
				}
				try {
					effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getBasedOn()));
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.cConcType, null);
				}
				try {
				effect.getConditions().put(I5CONSTANTS.cSpecies,
						p2Value(studyrecord.getMaterialsAndMethods().getTestAnimals().getSpecies()));
				} catch (Exception x) {
					
				}
				effect.getConditions().put(I5CONSTANTS.cTestType,
						((IParams) papp.getParameters()).get(I5CONSTANTS.cTestType));
				effect.getConditions().put(I5CONSTANTS.cTestType,
						((IParams) papp.getParameters()).get(I5CONSTANTS.cTestType));
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
						}
				} catch (Exception x) {
					logger.log(Level.WARNING, x.getMessage(), x);
				}
		}
		if (studyrecord.getResultsAndDiscussion().getTargetSystemOrganToxicity() != null) {
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._6.ENDPOINTSTUDYRECORDRepeatedDoseToxicityInhalation.ResultsAndDiscussion.TargetSystemOrganToxicitySet.TargetSystemOrganToxicity.Entry entry : studyrecord
					.getResultsAndDiscussion().getTargetSystemOrganToxicity().getTargetSystemOrganToxicity()
					.getEntry()) {
				String criticaleffects = p2Value(entry.getCriticalEffectsObserved());
				String organ = p2Value(entry.getOrgan());
				String system = p2Value(entry.getSystem());
				String treatmentRelated = p2Value(entry.getTreatmentRelated());
				String dr = p2Value(entry.getDoseResponseRelationship());
				Boolean kr = entry.getKeyResult()==null?null:entry.getKeyResult().getValue();
				if (entry.getLowestEffectiveDoseConc()!=null && entry.getLowestEffectiveDoseConc().getValue() != null
						&& !"".equals(entry.getLowestEffectiveDoseConc()))
					try {
						EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
						effect.setEndpoint("LOEL");
						if (entry.getLowestEffectiveDoseConc().getValue() != null
								&& !"".equals(entry.getLowestEffectiveDoseConc()))
							q2effectrecord(entry.getLowestEffectiveDoseConc(), effect);
						else
							effect.setTextValue("-");

						effect.getConditions().put(I5CONSTANTS.CriticalEffectsObserved, criticaleffects);

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
						effect.getConditions().put(I5CONSTANTS.cSex,
								p2Value(studyrecord.getMaterialsAndMethods().getTestAnimals().getSex()));
						papp.addEffect(effect);
					} catch (Exception x) {

					}

			}
		}

	}

	protected void q2effectrecord(LowestEffectiveDoseConc field,
			EffectRecord<String, IParams, String> effectrecord) {

		if (field.getValue() != null)
			try {
				effectrecord.setLoValue(Double.parseDouble(field.getValue()));
			} catch (Exception x) {
				effectrecord.setTextValue(field.getValue());
			}
		if (field.getUnitCode() != null)
			effectrecord.setUnit(getPhrase(field.getUnitCode(), joinMultiTextFieldSmall(field.getUnitOther())));
	}

}
