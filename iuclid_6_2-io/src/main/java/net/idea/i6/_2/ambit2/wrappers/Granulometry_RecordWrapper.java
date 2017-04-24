package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._2.ENDPOINTSTUDYRECORDGranulometry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._2.ENDPOINTSTUDYRECORDGranulometry.ResultsAndDiscussion.ParticleSize.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class Granulometry_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDGranulometry> {

	public Granulometry_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDGranulometry studyrecord) {
		if (studyrecord.getResultsAndDiscussion().getParticleSize() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getParticleSize().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getPercentile()));
				papp.addEffect(effect);
				q2effectrecord(e.getMean(), effect);
				effect.getConditions().put(I5CONSTANTS.Remark, p2Value(e.getRemarksOnResults()));
				try {
					effect.setErrorValue(e.getStDev().doubleValue());
				} catch (Exception x) {
				}
			}
		if (studyrecord.getResultsAndDiscussion().getParticleSizeDistribution() != null)
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._2.ENDPOINTSTUDYRECORDGranulometry.ResultsAndDiscussion.ParticleSizeDistribution.Entry e : studyrecord
					.getResultsAndDiscussion().getParticleSizeDistribution().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.pPARTICLESIZE);
				q2effectrecord(e.getSize(), effect);
				effect.getConditions().put(I5CONSTANTS.pDISTRIBUTION, q2value(e.getDistribution()));
				effect.getConditions().put(I5CONSTANTS.Remark, p2Value(e.getRemarksOnResults()));
				q2effectrecord(studyrecord.getResultsAndDiscussion().getAerodynamicDiameter(), effect);
			}

		if (studyrecord.getResultsAndDiscussion().getAerodynamicDiameter() != null) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.pMMAD);
			q2effectrecord(studyrecord.getResultsAndDiscussion().getAerodynamicDiameter(), effect);
			papp.addEffect(effect);
		}

		// studyrecord.getResultsAndDiscussion().getGeometricStandardDeviation();
	}

}
