package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinsoil._2.ENDPOINTSTUDYRECORDBiodegradationInSoil;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinsoil._2.ENDPOINTSTUDYRECORDBiodegradationInSoil.ResultsAndDiscussion.Degradation.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class BiodegradationInSoil_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDBiodegradationInSoil> {

	public BiodegradationInSoil_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDBiodegradationInSoil studyrecord) {
		if (studyrecord.getResultsAndDiscussion().getDegradation() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getDegradation().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getParameter()));
				q2effectrecord(e.getDegr(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cSoilNo, p2Value(e.getSoilNo()));
				effect.getConditions().put(I5CONSTANTS.cTestType,
						p2Value(studyrecord.getMaterialsAndMethods().getTestType()));

			}
	}

}
