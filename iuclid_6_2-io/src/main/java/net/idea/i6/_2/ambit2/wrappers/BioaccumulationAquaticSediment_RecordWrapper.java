package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_bioaccumulationaquaticsediment._2.ENDPOINTSTUDYRECORDBioaccumulationAquaticSediment;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_bioaccumulationaquaticsediment._2.ENDPOINTSTUDYRECORDBioaccumulationAquaticSediment.ResultsAndDiscussion.BioaccumulationFactor.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class BioaccumulationAquaticSediment_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDBioaccumulationAquaticSediment> {

	public BioaccumulationAquaticSediment_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDBioaccumulationAquaticSediment studyrecord) {
		if (studyrecord.getResultsAndDiscussion().getBioaccumulationFactor()!=null) {
			for (Entry e : studyrecord.getResultsAndDiscussion().getBioaccumulationFactor().getEntry()) {
				
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				try {effect.setEndpoint(p2Value(e.getType()));} catch (Exception x) {}
				papp.addEffect(effect);
				
				/* ???
				try {
					effect.getConditions().put(I5CONSTANTS.cRoute, studyrecord.get);
				} catch (Exception x) { effect.getConditions().put(I5CONSTANTS.cRoute,null);}
				*/

				
				try {
					effect.getConditions().put(I5CONSTANTS.cBioaccBasis, p2Value(e.getBasis()));
				} catch (Exception x) { effect.getConditions().put(I5CONSTANTS.cBioaccBasis,null);}
				try {
					effect.getConditions().put(I5CONSTANTS.cDoses, q2value(e.getConcInEnvironmentDose()));

				} catch (Exception x) { effect.getConditions().put(I5CONSTANTS.cDoses,null);}
				
				q2effectrecord(e.getValue(),effect);
				
			}
		} else {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.eBCF);
			papp.addEffect(effect);
			effect.getConditions().put(I5CONSTANTS.cBioaccBasis,null);
			effect.getConditions().put(I5CONSTANTS.cDoses,null);
		}
	}
}
