package net.idea.i6._2.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_partition._2.ENDPOINTSTUDYRECORDPartition;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_partition._2.ENDPOINTSTUDYRECORDPartition.ResultsAndDiscussion.Partcoeff.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_partition._2.ENDPOINTSTUDYRECORDPartition.ResultsAndDiscussion.Partcoeff.Entry.Temp;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class Partition_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPartition> {

	public Partition_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPartition studyrecord) {

		for (Entry e : studyrecord.getResultsAndDiscussion().getPartcoeff().getEntry()) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(getPhrase(e.getType().getValue(),e.getType().getOther()));
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


			q2effectrecord(e.getPartition(), effect);
		}
	}
	protected static Value q2value(Temp field) {
		Value v = new Value();
		v.setLoValue(field.getValue());
		v.setUnits(getPhrase(field.getUnitCode(), field.getUnitOther()));
		return v;
	}

}
