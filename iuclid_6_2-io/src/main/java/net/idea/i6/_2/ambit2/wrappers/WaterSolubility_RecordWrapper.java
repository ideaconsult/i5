package net.idea.i6._2.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_watersolubility._2.ENDPOINTSTUDYRECORDWaterSolubility;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_watersolubility._2.ENDPOINTSTUDYRECORDWaterSolubility.ResultsAndDiscussion.WaterSolubility.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_watersolubility._2.ENDPOINTSTUDYRECORDWaterSolubility.ResultsAndDiscussion.WaterSolubility.Entry.Temp;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class WaterSolubility_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDWaterSolubility> {

	public WaterSolubility_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDWaterSolubility studyrecord) {

		for (Entry e : studyrecord.getResultsAndDiscussion().getWaterSolubility().getEntry()) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.eWaterSolubility);
			papp.addEffect(effect);

			try {
				effect.getConditions().put(I5CONSTANTS.cTemperature, q2value(e.getTemp()));
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.cTemperature, null);
				logger.log(Level.FINE, x.getMessage(), x);
			}

			try {
				effect.getConditions().put(I5CONSTANTS.pH, q2value(e.getPh()));
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.pH, null);
				logger.log(Level.FINE, x.getMessage(), x);
			}

			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(e.getRemarksOnResults()));

			q2effectrecord(e.getSolubility(), effect);
		}

	}

	protected static Value q2value(Temp field) {
		Value v = new Value();
		v.setLoValue(field.getValue());
		v.setUnits(getPhrase(field.getUnitCode(), field.getUnitOther()));
		return v;
	}

}
