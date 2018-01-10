package net.idea.i6._2.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_vapour._2.ENDPOINTSTUDYRECORDVapour;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_vapour._2.ENDPOINTSTUDYRECORDVapour.ResultsAndDiscussion.Vapourpr.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class Vapour_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDVapour> {

	public Vapour_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDVapour studyrecord) {
		for (Entry e : studyrecord.getResultsAndDiscussion().getVapourpr().getEntry()) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.eVapourPressure);
			papp.addEffect(effect);

			try {
				effect.getConditions().put(I5CONSTANTS.cTemperature, q2value(e.getTempQualifier()));
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.cTemperature, null);
				logger.log(Level.FINE, x.getMessage(), x);
			}

			try {
				q2effectrecord(e.getPressure(), effect);
			} catch (Exception x) {
			}

		}
	}
}
