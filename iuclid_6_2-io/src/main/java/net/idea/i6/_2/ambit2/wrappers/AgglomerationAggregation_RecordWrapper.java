package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._2.ENDPOINTSTUDYRECORDAgglomerationAggregation;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._2.ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class AgglomerationAggregation_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDAgglomerationAggregation> {

	public AgglomerationAggregation_RecordWrapper(Document doc) throws Exception {
		super(doc);

	}

	protected void addConditions(EffectRecord effect, String medium, PhysicalQuantityRangeField ph, String remarks) {
		IParams p = new Params();
		p.put(I5CONSTANTS.cMEDIUM, medium);
		p.put(I5CONSTANTS.pH, q2value(ph));
		p.put(I5CONSTANTS.Remark, remarks);
		effect.setConditions(p);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDAgglomerationAggregation studyrecord) {
		for (Entry entry : studyrecord.getResultsAndDiscussion().getAgglomerationAggregationDiameter().getEntry())
			try {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.eAGGLO_AGGR_DIAM);
				effect.setEndpointType("MEAN");
				q2effectrecord(entry.getMeanDiameter(), effect);
				try {
					effect.setErrorValue(Double.parseDouble(entry.getStDev().getValue()));
					effect.setErrQualifier("sd");
				} catch (Exception x) {
				}

				addConditions(effect, entry.getMedium(), entry.getPh(),
						getPhrase(entry.getRemarksOnResults().getValue(), entry.getRemarksOnResults().getOther()));
				papp.addEffect(effect);
			} catch (Exception x) {
			}
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._2.ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry entry : studyrecord
				.getResultsAndDiscussion().getAgglomerationAggregationSize().getEntry())
			try {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(getPhrase(entry.getPercentile().getValue(), entry.getPercentile().getOther()));
				effect.setEndpointType("PERCENTILE");
				q2effectrecord(entry.getMean(), effect);

				addConditions(effect, entry.getMedium(), entry.getPh(),
						getPhrase(entry.getRemarksOnResults().getValue(), entry.getRemarksOnResults().getOther()));
				papp.addEffect(effect);

			} catch (Exception x) {
			}
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._2.ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry entry : studyrecord
				.getResultsAndDiscussion().getDistributionDifferentPassages().getEntry()) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.eAGGLO_AGGR_SIZE_DIST);
			q2effectrecord(entry.getSize(), effect);
			papp.addEffect(effect);
			IParams p = new Params();
			p.put(I5CONSTANTS.Remark,getPhrase(entry.getRemarksOnResults().getRemarks(),entry.getRemarksOnResults().getOther()));
			effect.setConditions(p);
		}
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._2.ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry entry : studyrecord
				.getResultsAndDiscussion().getIndex().getEntry()) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.eAGGLO_AGGREGATION_ID);
			effect.setEndpointType("MEAN");
			q2effectrecord(entry.getMean(), effect);
			try {
				effect.setErrorValue(entry.getStDev().doubleValue());
				effect.setErrQualifier("sd");
			} catch (Exception x) {
			}

			addConditions(effect, entry.getMedium(), entry.getPh(),
					getPhrase(entry.getRemarksOnResults().getValue(), entry.getRemarksOnResults().getOther()));
			papp.addEffect(effect);

		}
		// studyrecord.getResultsAndDiscussion().getAnyOtherInformationOnResultsInclTables().getOtherInformation()
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDAgglomerationAggregation studyRecord) {
		papp.setInterpretationResult(studyRecord.getOverallRemarksAttachments().getRemarksOnResults());
		
	}
}
