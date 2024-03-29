package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_hydrolysis._6.ENDPOINTSTUDYRECORDHydrolysis;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_hydrolysis._6.ENDPOINTSTUDYRECORDHydrolysis.ResultsAndDiscussion.DissipationHalfLifeOfParentCompound.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class Hydrolysis_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDHydrolysis> {

	public Hydrolysis_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDHydrolysis studyrecord) {
	    if (studyrecord.getResultsAndDiscussion()==null) return;
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
	@Override
	public void assignProtocolParameters(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		// TODO Auto-generated method stub
		super.assignProtocolParameters(papp);
	}


}
