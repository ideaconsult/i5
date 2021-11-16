package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytosoilmacroorganismsexceptarthropods._6.ENDPOINTSTUDYRECORDToxicityToSoilMacroorganismsExceptArthropods;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytosoilmacroorganismsexceptarthropods._6.ENDPOINTSTUDYRECORDToxicityToSoilMacroorganismsExceptArthropods.ResultsAndDiscussion.EffectConcentrations.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytosoilmacroorganismsexceptarthropods._6.ENDPOINTSTUDYRECORDToxicityToSoilMacroorganismsExceptArthropods.ResultsAndDiscussion.EffectConcentrations.Entry.Duration;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytosoilmacroorganismsexceptarthropods._6.ENDPOINTSTUDYRECORDToxicityToSoilMacroorganismsExceptArthropods.ResultsAndDiscussion.EffectConcentrations.Entry.EffectConc;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class ToxicityToSoilMacroorganismsExceptArthropods_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDToxicityToSoilMacroorganismsExceptArthropods> {

	public ToxicityToSoilMacroorganismsExceptArthropods_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	protected String dictionaryParams(String key) {
		if ("TestOrganismsSpecies".equals(key))
			return I5CONSTANTS.cTestOrganism;
		else if ("Species".equals(key))
			return I5CONSTANTS.cTestOrganism;

		return super.dictionaryParams(key);

	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDToxicityToSoilMacroorganismsExceptArthropods studyrecord) {
		if (studyrecord.getResultsAndDiscussion()==null ) return;
		
		if (studyrecord.getResultsAndDiscussion().getEffectConcentrations() != null)
		for (Entry e : studyrecord.getResultsAndDiscussion().getEffectConcentrations().getEntry()) {

			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			q2effectrecord(e.getEffectConc(), effect);
			effect.setEndpoint(p2Value(e.getEndpoint()));
			papp.addEffect(effect);

			effect.getConditions().put(I5CONSTANTS.cEffect, p2Value(e.getBasisForEffect()));
			effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getConcBasedOn()));
			effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration, p2Value(e.getNominalMeasured()));
			effect.getConditions().put(I5CONSTANTS.cExposure, q2value(e.getDuration()));
		}
	}

	protected void q2effectrecord(EffectConc field, EffectRecord<String, IParams, String> effectrecord) {

		if (field == null)
			return;
		Value v = new Value();
		if (field.getLowerValue() != null)
			v.setLoValue(field.getLowerValue().doubleValue());
		if (field.getUpperValue() != null)
			v.setLoValue(field.getUpperValue().doubleValue());
		v.setLoQualifier(field.getLowerQualifier());
		v.setUpQualifier(field.getUpperQualifier());
		effectrecord.setUnit(getPhrase(field.getUnitCode(), joinMultiTextFieldSmall(field.getUnitOther())));

	}

	protected static Value q2value(Duration field) {
		try {
			Value v = new Value();
			v.setLoValue(Double.parseDouble(field.getValue()));
			v.setUnits(getPhrase(field.getUnitCode()));
			return v;
		} catch (Exception x) {
			return null;
		}

	}
}
