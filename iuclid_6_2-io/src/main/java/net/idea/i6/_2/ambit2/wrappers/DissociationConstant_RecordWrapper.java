package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_dissociationconstant._2.ENDPOINTSTUDYRECORDDissociationConstant;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_dissociationconstant._2.ENDPOINTSTUDYRECORDDissociationConstant.ResultsAndDiscussion.DissociationConstant.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_dissociationconstant._2.ENDPOINTSTUDYRECORDDissociationConstant.ResultsAndDiscussion.DissociationConstant.Entry.Temp;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class DissociationConstant_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDDissociationConstant> {

	public DissociationConstant_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDDissociationConstant studyrecord) {
		if (studyrecord.getResultsAndDiscussion().getDissociationConstant() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getDissociationConstant().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.pKa);
				q2effectrecord(e.getPka(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cTemperature, q2value(e.getTemp()));
				effect.getConditions().put(I5CONSTANTS.rNo, p2Value(e.getNo()));
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
