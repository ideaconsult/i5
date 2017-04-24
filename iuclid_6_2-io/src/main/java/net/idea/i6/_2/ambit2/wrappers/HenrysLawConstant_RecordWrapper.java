package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_henryslawconstant._2.ENDPOINTSTUDYRECORDHenrysLawConstant;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_henryslawconstant._2.ENDPOINTSTUDYRECORDHenrysLawConstant.ResultsAndDiscussion.HenrysLawConstantH.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_henryslawconstant._2.ENDPOINTSTUDYRECORDHenrysLawConstant.ResultsAndDiscussion.HenrysLawConstantH.Entry.AtmPressure;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_henryslawconstant._2.ENDPOINTSTUDYRECORDHenrysLawConstant.ResultsAndDiscussion.HenrysLawConstantH.Entry.Temp;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class HenrysLawConstant_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDHenrysLawConstant> {

	public HenrysLawConstant_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDHenrysLawConstant studyrecord) {
		// I5_ROOT_OBJECTS.EN_HENRY_LAW
		if (studyrecord.getResultsAndDiscussion().getHenrysLawConstantH() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getHenrysLawConstantH().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.HLC);
				q2effectrecord(e.getH(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.Pressure, q2value(e.getAtmPressure()));
				effect.getConditions().put(I5CONSTANTS.Remark, p2Value(e.getRemarksOnResults()));
				effect.getConditions().put(I5CONSTANTS.cTemperature, q2value(e.getTemp()));

			}
	}

	private Value q2value(AtmPressure field) {
		Value v = new Value();
		if (field.getValue() != null)
			v.setLoValue(Double.parseDouble(field.getValue()));
		v.setUnits(getPhrase(field.getUnitCode(), field.getUnitOther()));
		return v;
	}

	private Value q2value(Temp field) {

		Value v = new Value();
		if (field.getValue() != null)
			v.setLoValue(Double.parseDouble(field.getValue()));
		v.setUnits(getPhrase(field.getUnitCode(), field.getUnitOther()));
		return v;
	}

}
