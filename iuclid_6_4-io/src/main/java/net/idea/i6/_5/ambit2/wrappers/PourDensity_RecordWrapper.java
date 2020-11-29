package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_pourdensity._5.ENDPOINTSTUDYRECORDPourDensity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_pourdensity._5.ENDPOINTSTUDYRECORDPourDensity.ResultsAndDiscussion.PourDensity.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class PourDensity_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPourDensity> {

	public PourDensity_RecordWrapper(Document doc) throws Exception {
		super(doc);

	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPourDensity studyrecord) {
		if (studyrecord.getResultsAndDiscussion().getPourDensity() != null)
			for (Entry e : studyrecord
					.getResultsAndDiscussion().getPourDensity().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.ePOUR_DENSITY);
				papp.addEffect(effect);
				q2effectrecord(e.getMean(), effect);
				papp.addEffect(effect);
				try {
					effect.setErrorValue(Double.parseDouble(e.getStDev().getValue()));
				} catch (Exception x) {
				}

				effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(e.getRemarksOnResults()));

			}
	}
}
