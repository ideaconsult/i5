package net.idea.i6._5.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_sedimenttoxicity._5.ENDPOINTSTUDYRECORDSedimentToxicity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_sedimenttoxicity._5.ENDPOINTSTUDYRECORDSedimentToxicity.ResultsAndDiscussion.EffectConcentrations.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;

public class SedimentToxicity_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSedimentToxicity> {

	public SedimentToxicity_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	/*
	 * if (sciPart.getECSEDIMENTDWELLINGTOX().getEXPDURATION() != null) { Value
	 * p = new Value(); try {
	 * p.setLoValue(sciPart.getECSEDIMENTDWELLINGTOX().getEXPDURATION().getSet()
	 * .getVALUEUNITVALUE() .getVALUE().getValue()); } catch (Exception x) {
	 * p.setLoValue(null); } try {
	 * p.setUnits(sciPart.getECSEDIMENTDWELLINGTOX().getEXPDURATION().getSet().
	 * getVALUEUNITVALUE() .getUNITValue()); } catch (Exception x) { }
	 * papp.getParameters().put(I5CONSTANTS.cExposure, p); } else {
	 * papp.getParameters().put(I5CONSTANTS.cExposure, null); }
	 * 
	 * if (sciPart.getECSEDIMENTDWELLINGTOX().getWATERTYPE() != null) {
	 * papp.getParameters() .put(I5CONSTANTS.cTestMedium,
	 * sciPart.getECSEDIMENTDWELLINGTOX().getWATERTYPE().getSet().
	 * getLISTRIGHTPOP() .getLISTRIGHTPOPValue()); } else
	 * papp.getParameters().put(I5CONSTANTS.cTestMedium, null);
	 * 
	 * try { papp.getParameters().put( I5CONSTANTS.cTestOrganism,
	 * getValue(sciPart.getECSEDIMENTDWELLINGTOX().getORGANISM().getSet().
	 * getPHRASEOTHERLISTPOP() .getLISTPOPValue(),
	 * sciPart.getECSEDIMENTDWELLINGTOX().getORGANISM().getSet()
	 * .getPHRASEOTHERLISTPOP().getLISTPOPTXT())); } catch (Exception x) {
	 * papp.getParameters().put(I5CONSTANTS.cTestOrganism, null); }
	 */

	@Override
	protected String dictionaryParams(String key) {
		if ("TestOrganismsSpecies".equals(key))
			return I5CONSTANTS.cTestOrganism;
		else if ("Species".equals(key))
			return I5CONSTANTS.cTestOrganism;
		else if ("ExposurePhase".equals(key))
			return I5CONSTANTS.cExposure;

		return super.dictionaryParams(key);

	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSedimentToxicity studyrecord) {
		// I5_ROOT_OBJECTS.EC_SEDIMENTDWELLINGTOX
		if (studyrecord.getResultsAndDiscussion()==null) return;
		if (studyrecord.getResultsAndDiscussion().getEffectConcentrations() != null)
			for (Entry e : studyrecord.getResultsAndDiscussion().getEffectConcentrations().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getEndpoint()));
				q2effectrecord(e.getEffectConc(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cEffect, p2Value(e.getBasisForEffect()));
				effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getConcBasedOn()));
				effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration, p2Value(e.getNominalMeasured()));

				effect.getConditions().put(I5CONSTANTS.cExposure,
						((IParams) papp.getParameters()).get(I5CONSTANTS.cExposure));
			}
	}

}
