package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._5.ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._5.ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity.ResultsAndDiscussion.DevelopmentalToxicitySet.DevelopmentalToxicity.Entry.LowestEffectiveDoseConc;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._5.ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity.ResultsAndDiscussion.ResultsMaternalAnimals.EffectLevelsMaternalAnimals.Efflevel.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._5.ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity.ResultsAndDiscussion.ResultsMaternalAnimals.EffectLevelsMaternalAnimals.Efflevel.Entry.Basis;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithLargeTextRemarks;

public class DevelopmentalToxicityTeratogenicity_RecordWrapper
		extends RepeatedDoseToxicity_RecordWrapper<ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity> {

	public DevelopmentalToxicityTeratogenicity_RecordWrapper(Document doc) throws Exception {
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

	public void assignEffectLevels(ambit2.base.data.study.ProtocolApplication papp,
			ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity studyrecord) {

		if (studyrecord.getResultsAndDiscussion().getResultsMaternalAnimals() != null)

			for (Entry e : studyrecord.getResultsAndDiscussion()
					.getResultsMaternalAnimals().getEffectLevelsMaternalAnimals().getEfflevel().getEntry()) {

				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				q2effectrecord(e.getEffectLevel(), effect);
				effect.setEndpoint(p2Value(e.getEndpoint()));
				papp.addEffect(effect);

				StringBuilder basis4effectlevel = null;
				if (e.getBasis() != null)
					for (Basis b : e.getBasis()) {
						if (basis4effectlevel == null)
							basis4effectlevel = new StringBuilder();
						else
							basis4effectlevel.append(" ");
						basis4effectlevel.append(p2Value(b));
					}

				effect.getConditions().put(I5CONSTANTS.cEffectType,
						basis4effectlevel == null ? null : basis4effectlevel.toString());
				effect.getConditions().put(I5CONSTANTS.cSpecies,
						((IParams) papp.getParameters()).get(I5CONSTANTS.cSpecies));
				effect.getConditions().put(I5CONSTANTS.DevelopmentalEffectsObserved, null);
				effect.getConditions().put(I5CONSTANTS.RelationToOtherToxicEffects,null);

			}
		if (studyrecord.getResultsAndDiscussion().getResultsFetuses() != null)
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._5.ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity.ResultsAndDiscussion.ResultsFetuses.EffectLevelsFetuses.Efflevel.Entry e : studyrecord.getResultsAndDiscussion().getResultsFetuses()
					.getEffectLevelsFetuses().getEfflevel().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				q2effectrecord(e.getEffectLevel(), effect);
				effect.setEndpoint(p2Value(e.getEndpoint()));
				papp.addEffect(effect);

				StringBuilder basis4effectlevel = null;
				if (e.getBasis() != null)
					for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._5.ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity.ResultsAndDiscussion.ResultsFetuses.EffectLevelsFetuses.Efflevel.Entry.Basis b : e.getBasis()) {
						if (basis4effectlevel == null)
							basis4effectlevel = new StringBuilder();
						else
							basis4effectlevel.append(" ");
						basis4effectlevel.append(p2Value(b));
					}
				effect.getConditions().put(I5CONSTANTS.cEffectType,
						basis4effectlevel == null ? null : basis4effectlevel.toString());
				effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));
				effect.getConditions().put(I5CONSTANTS.cSpecies,
						((IParams) papp.getParameters()).get(I5CONSTANTS.cSpecies));
				effect.getConditions().put(I5CONSTANTS.DevelopmentalEffectsObserved, null);
				effect.getConditions().put(I5CONSTANTS.RelationToOtherToxicEffects,null);
			}

		if (studyrecord.getResultsAndDiscussion().getDevelopmentalToxicity() != null)
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._5.ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity.ResultsAndDiscussion.DevelopmentalToxicitySet.DevelopmentalToxicity.Entry entry : studyrecord.getResultsAndDiscussion().getDevelopmentalToxicity()
					.getDevelopmentalToxicity().getEntry()) {
				String deveffects = p2Value(entry.getDevelopmentalEffectsObserved());
				String relation2othertoxiceffects = p2Value(entry.getRelationToMaternalToxicity());
				String treatmentRelated = p2Value(entry.getTreatmentRelated());
				String dr = p2Value(entry.getDoseResponseRelationship());
				String kr = p2Value(entry.getKeyResult());

				try {
					EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
					effect.setEndpoint("LOEL");
					if (entry.getLowestEffectiveDoseConc()!=null && entry.getLowestEffectiveDoseConc().getValue() != null
							&& !"".equals(entry.getLowestEffectiveDoseConc()))
						q2effectrecord(entry.getLowestEffectiveDoseConc(), effect);
					else
						effect.setTextValue("-");

					effect.getConditions().put(I5CONSTANTS.DevelopmentalEffectsObserved, deveffects);
					effect.getConditions().put(I5CONSTANTS.RelationToOtherToxicEffects, relation2othertoxiceffects);

					if (treatmentRelated != null)
						effect.getConditions().put(I5CONSTANTS.TreatmentRelated, treatmentRelated);
					if (dr != null)
						effect.getConditions().put(I5CONSTANTS.DoseResponseRelationship, dr);
					if (kr != null)
						effect.getConditions().put(I5CONSTANTS.KeyResult, kr);
					effect.getConditions().put(I5CONSTANTS.cSpecies,
							p2Value(studyrecord.getMaterialsAndMethods().getTestAnimals().getSpecies()));
					
					papp.addEffect(effect);
				} catch (Exception x) {
					x.printStackTrace();
				}
			}
	};

	@Override
	public void assignInterpretationResult(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDDevelopmentalToxicityTeratogenicity studyRecord) {
		papp.setInterpretationCriteria(null);
		papp.setInterpretationResult(null);
	}

	protected void q2effectrecord(LowestEffectiveDoseConc field,
			EffectRecord<String, IParams, String> effectrecord) {

		if (field == null)
			return;

		if (field.getValue() != null)
			try {
				effectrecord.setLoValue(Double.parseDouble(field.getValue()));
			} catch (Exception x) {
				// now we have string value with units ...
				effectrecord.setTextValue(field.getValue());
			}

		effectrecord.setUnit(getPhrase(field.getUnitCode(), joinMultiTextFieldSmall(field.getUnitOther())));

	}
}
