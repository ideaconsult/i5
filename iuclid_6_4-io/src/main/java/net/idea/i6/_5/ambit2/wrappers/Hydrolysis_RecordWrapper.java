package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_adsorptiondesorption._5.ENDPOINTSTUDYRECORDAdsorptionDesorption.MaterialsAndMethods.StudyDesign.BatchEquilibriumOrOtherMethod.DurationOfAdsorptionEquilibration.Entry.Temp;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_hydrolysis._5.ENDPOINTSTUDYRECORDHydrolysis;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_hydrolysis._5.ENDPOINTSTUDYRECORDHydrolysis.ResultsAndDiscussion.DissipationHalfLifeOfParentCompound.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class Hydrolysis_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDHydrolysis> {

	public Hydrolysis_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDHydrolysis studyrecord) {
		if (studyrecord.getResultsAndDiscussion().getDissipationHalfLifeOfParentCompound() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getDissipationHalfLifeOfParentCompound().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getType()));
				q2effectrecord(e.getHalfLife(), effect);
				papp.addEffect(effect);

				// ph
				effect.getConditions().put(I5CONSTANTS.pH, e.getPh() == null ? null : e.getPh().getValue().doubleValue());

				// temperature
				effect.getConditions().put(I5CONSTANTS.cTemperature, q2value(e.getTemp()));

			}
	}

	protected static Value q2value(Temp field) {
		Value v = new Value();
		if (field.getValue() != null)
			try {
				v.setLoValue(Double.parseDouble(field.getValue()));
			} catch (Exception x) {
			}
		v.setUnits(getPhrase(field.getUnitCode(), field.getUnitOther()));
		return v;
	}

}
