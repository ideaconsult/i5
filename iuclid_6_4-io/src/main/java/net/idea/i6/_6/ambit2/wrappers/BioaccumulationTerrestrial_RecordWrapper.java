package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_bioaccumulationterrestrial._6.ENDPOINTSTUDYRECORDBioaccumulationTerrestrial;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_bioaccumulationterrestrial._6.ENDPOINTSTUDYRECORDBioaccumulationTerrestrial.ResultsAndDiscussion.BioaccumulationFactor.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class BioaccumulationTerrestrial_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDBioaccumulationTerrestrial> {

	public BioaccumulationTerrestrial_RecordWrapper(Document doc) throws Exception {
		super(doc);

	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDBioaccumulationTerrestrial studyrecord) {
		if (studyrecord.getResultsAndDiscussion()==null) return;
		if (studyrecord.getResultsAndDiscussion().getBioaccumulationFactor() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getBioaccumulationFactor().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getType()));
				q2effectrecord(e.getValue(), effect);
				// not sure where to get concentrations from- decided to remove
				// the field
				// effect.getConditions().put(I5CONSTANTS.cDoses,null);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cBioaccBasis, p2Value(e.getBasis()));
				

			}

	}

}
