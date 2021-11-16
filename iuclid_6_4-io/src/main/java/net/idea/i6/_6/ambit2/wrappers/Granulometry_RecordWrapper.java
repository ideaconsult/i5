package net.idea.i6._6.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._6.ENDPOINTSTUDYRECORDGranulometry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._6.ENDPOINTSTUDYRECORDGranulometry.ResultsAndDiscussion.ParticleSize.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._6.ambit2.EndpointStudyRecordWrapper;

public class Granulometry_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDGranulometry> {

	public Granulometry_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDGranulometry studyrecord) {
	   if (studyrecord.getResultsAndDiscussion()==null) return;
		if (studyrecord.getResultsAndDiscussion().getParticleSize() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getParticleSize().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getPercentile()));
				papp.addEffect(effect);
				q2effectrecord(e.getMean(), effect);
				if (e.getStDev()!=null) {
				  effect.setErrorValue( e.getStDev().getValue().doubleValue());
				  effect.setErrQualifier("SD");
				}
				effect.getConditions().put(I5CONSTANTS.Remark, remarks2Value(e.getRemarksOnResults()));
				try {
					effect.setErrorValue(e.getStDev().getValue().doubleValue());
				} catch (Exception x) {
				}
			}
		int n = 0;
		if (studyrecord.getResultsAndDiscussion().getParticleSizeDistribution() != null)

			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_granulometry._6.ENDPOINTSTUDYRECORDGranulometry.ResultsAndDiscussion.ParticleSizeDistribution.Entry entry : studyrecord
					.getResultsAndDiscussion().getParticleSizeDistribution().getEntry()) {

				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.pPARTICLESIZE);
				effect.setEndpointGroup(n);
				q2effectrecord(entry.getSize(), effect);
				papp.addEffect(effect);
				IParams p = new Params();
				p.put(I5CONSTANTS.Remark,remarks2Value(entry.getRemarksOnResults()));
				effect.setConditions(p);

				effect = endpointCategory.createEffectRecord();
				effect.setEndpointGroup(n);
				effect.setEndpoint(I5CONSTANTS.pDISTRIBUTION);
				q2effectrecord(entry.getDistribution(), effect);
				papp.addEffect(effect);
				p = new Params();
				p.put(I5CONSTANTS.Remark,remarks2Value(entry.getRemarksOnResults()));
				effect.setConditions(p);
				n++;
			}

		if (studyrecord.getResultsAndDiscussion().getAerodynamicDiameter() != null) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.eAERODYNAMIC_DIAMETER);
			effect.setEndpointType(I5CONSTANTS.endpoint_type_MEDIAN_MASS);
			q2effectrecord(studyrecord.getResultsAndDiscussion().getAerodynamicDiameter(), effect);
			try {
				effect.setErrorValue(studyrecord.getResultsAndDiscussion().getGeometricStandardDeviation()
						.getLowerValue().doubleValue());
				effect.setErrQualifier(I5CONSTANTS.pGSD);
			} catch (Exception x) {

			}
			papp.addEffect(effect);
		}

		// studyrecord.getResultsAndDiscussion().getGeometricStandardDeviation();
	}

}
