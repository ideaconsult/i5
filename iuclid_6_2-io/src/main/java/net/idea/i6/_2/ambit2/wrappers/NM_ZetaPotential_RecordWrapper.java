package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential.ResultsAndDiscussion.IsoElectricPoint.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class NM_ZetaPotential_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDZetaPotential> {

	public NM_ZetaPotential_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}
	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDZetaPotential studyrecord) {
		EffectRecord<String, IParams, String> effect ;
		for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential.ResultsAndDiscussion.ZetaPotential.Entry entry : studyrecord.getResultsAndDiscussion().getZetaPotential().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eZETA_POTENTIAL, entry.getPotential(),entry.getStDev()==null?null:entry.getStDev().getValue(),null);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
			effect.getConditions().put(I5CONSTANTS.cMEDIUM, entry.getMedium());
			if (entry.getPh()!=null)
			effect.getConditions().put(I5CONSTANTS.pH, entry.getPh().doubleValue());
		}
		for (Entry entry : studyrecord.getResultsAndDiscussion().getIsoElectricPoint().getEntry()) {
			effect = addEffectRecord_meanstdev(papp, I5CONSTANTS.eISOELECTRIC_POINT, entry.getPoint(),entry.getStDev()==null?null:entry.getStDev().doubleValue(),null);
			effect.getConditions().put(I5CONSTANTS.Remark, p2Value(entry.getRemarksOnResults()));
			effect.getConditions().put(I5CONSTANTS.cMEDIUM, entry.getMedium());
		}
	}
	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDZetaPotential studyRecord) {
		papp.setInterpretationResult(studyRecord.getOverallRemarksAttachments().getRemarksOnResults());
	}

}
