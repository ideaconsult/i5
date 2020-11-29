package net.idea.i6._5.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_boilingpoint._5.ENDPOINTSTUDYRECORDBoilingPoint;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_boilingpoint._5.ENDPOINTSTUDYRECORDBoilingPoint.ResultsAndDiscussion.BoilingPointSet.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class BoilingPoint_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDBoilingPoint> {

	public BoilingPoint_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDBoilingPoint studyrecord) {
		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(I5CONSTANTS.BOILINGPOINT);
		papp.addEffect(effect);
		
		try {
			for (Entry e : studyrecord.getResultsAndDiscussion().getBoilingPoint().getEntry()) {
				//pressure should be a condition
				//decomposition and sublimation are actually readouts not conditions...
				try {
					effect.getConditions().put(I5CONSTANTS.rDECOMPOSITION,	p2Value(e.getDecomposition()));
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.rDECOMPOSITION,null);
				}
				
				effect.getConditions().put(I5CONSTANTS.AtmPressure,q2value(e.getPressure()));
				effect.getConditions().put("Decomposition T",q2value(e.getDecompositionTemp()));
				
				effect.setTextValue(remarks2Value(e.getRemarksOnResults()));
				q2effectrecord(e.getBoilingPoint(),effect);

			}
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage(),x);
		}
	}

}
