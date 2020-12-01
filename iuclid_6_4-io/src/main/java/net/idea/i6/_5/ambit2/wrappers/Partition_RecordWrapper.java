package net.idea.i6._5.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_partition._5.ENDPOINTSTUDYRECORDPartition;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_partition._5.ENDPOINTSTUDYRECORDPartition.ResultsAndDiscussion.Partcoeff.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_partition._5.ENDPOINTSTUDYRECORDPartition.ResultsAndDiscussion.Partcoeff.Entry.Ph;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_partition._5.ENDPOINTSTUDYRECORDPartition.ResultsAndDiscussion.Partcoeff.Entry.Temp;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class Partition_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDPartition> {

	public Partition_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDPartition studyrecord) {
	    if (studyrecord.getResultsAndDiscussion()==null) return;
		for (Entry e : studyrecord.getResultsAndDiscussion().getPartcoeff().getEntry()) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(p2Value(e.getType()));
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

	protected Value q2value(Ph field) {
		Value v = new Value();
		if (field.getLowerValue() != null)
			v.setLoValue(field.getLowerValue().doubleValue());
		if (field.getUpperValue() != null)
			v.setLoValue(field.getUpperValue().doubleValue());
		v.setLoQualifier(field.getLowerQualifier());
		v.setUpQualifier(field.getUpperQualifier());
		return v;
	}
	protected Value q2value(Temp field) {
		Value v = new Value();
		if (field.getValue() != null)
			v.setLoValue(Double.parseDouble(field.getValue()));
		v.setUnits(getPhrase(field.getUnitCode()));
		return v;
	}

}
