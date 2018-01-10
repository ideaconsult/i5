package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_solubilityorganic._2.ENDPOINTSTUDYRECORDSolubilityOrganic;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_solubilityorganic._2.ENDPOINTSTUDYRECORDSolubilityOrganic.ResultsAndDiscussion.SolubilityOrganic.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_solubilityorganic._2.ENDPOINTSTUDYRECORDSolubilityOrganic.ResultsAndDiscussion.SolubilityOrganic.Entry.Temp;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class SolubilityOrganic_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSolubilityOrganic> {

	public SolubilityOrganic_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSolubilityOrganic studyrecord) {
		if (studyrecord.getResultsAndDiscussion().getSolubilityOrganic() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getSolubilityOrganic().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.eSOLUBILITY_ORG_SOLVENT);
				papp.addEffect(effect);
				q2effectrecord(e.getSolubility(), effect);

				effect.getConditions().put(I5CONSTANTS.cTemperature, q2value(e.getTemp()));
				effect.getConditions().put(I5CONSTANTS.Remark, p2Value(e.getRemarksOnResults()));
				effect.getConditions().put(I5CONSTANTS.cSolvent, p2Value(e.getMedium()));

			}
	}

	private Value q2value(Temp temp) {
		if (temp == null || temp.getValue() == null)
			return null;
		Value v = new Value();
		v.setLoValue(Double.parseDouble(temp.getValue()));
		v.setUnits(getPhrase(temp.getUnitCode(), temp.getUnitOther()));
		return v;
	}

}
