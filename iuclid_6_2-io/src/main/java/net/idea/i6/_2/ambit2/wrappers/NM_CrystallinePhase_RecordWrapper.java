package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_crystallinephase._2.ENDPOINTSTUDYRECORDCrystallinePhase;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_crystallinephase._2.ENDPOINTSTUDYRECORDCrystallinePhase.ResultsAndDiscussion.CrystallinePhase.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class NM_CrystallinePhase_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDCrystallinePhase> {

	public NM_CrystallinePhase_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp, ENDPOINTSTUDYRECORDCrystallinePhase studyRecord) {
		try {
			papp.setInterpretationResult(studyRecord.getResultsAndDiscussion().getCrystallographicComposition());
		} catch (Exception x) {
			papp.setInterpretationResult(null);
		}

	}

	@Override
	protected String dictionaryParams(String key) {
		if (I5CONSTANTS.cSpecies.equals(key))
			return key;
		return super.dictionaryParams(key);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDCrystallinePhase studyrecord) {
		for (Entry entry : studyrecord.getResultsAndDiscussion().getCrystallinePhase().getEntry()) {
			int endpointGroup = 1;
			if (entry.getBravaisLattice() != null) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rCRYSTALLINE_PHASE_BRAVAIS_LATTICE);
				effect.setTextValue(
						getPhrase(entry.getBravaisLattice().getValue(), entry.getBravaisLattice().getOther()));
				effect.setEndpointGroup(endpointGroup);
				papp.addEffect(effect);
			}
			if (entry.getCrystalSystem() != null) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTAL_SYSTEM);
				effect.setTextValue(
						getPhrase(entry.getCrystalSystem().getValue(), entry.getCrystalSystem().getOther()));
				effect.setEndpointGroup(endpointGroup);
				papp.addEffect(effect);
			}
			if (entry.getSpaceGroup() != null) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rCRYSTALLINE_PHASE_SPACE_GROUP);
				effect.setTextValue(entry.getSpaceGroup());
				effect.setEndpointGroup(endpointGroup);
				papp.addEffect(effect);
			}
			if (entry.getPointGroup() != null) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rCRYSTALLINE_PHASE_POINT_GROUP);
				effect.setTextValue(entry.getPointGroup());
				effect.setEndpointGroup(endpointGroup);
				papp.addEffect(effect);
			}
			if (entry.getSpaceGroup() != null) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rCRYSTALLINE_PHASE_SPACE_GROUP);
				effect.setTextValue(entry.getSpaceGroup());
				effect.setEndpointGroup(endpointGroup);
				papp.addEffect(effect);
			}
			if (entry.getCommonName() != null) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.eCRYSTALLINE_PHASE);
				effect.setTextValue(entry.getCommonName());
				effect.setEndpointGroup(endpointGroup);
				papp.addEffect(effect);
			}
			if (entry.getCrystallographicPlanes() != null) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTGRPH_PLANES);
				effect.setTextValue(entry.getCrystallographicPlanes());
				effect.setEndpointGroup(endpointGroup);
				papp.addEffect(effect);
			}
			if (entry.getCrystallographicPlanes() != null) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTGRPH_PLANES);
				effect.setTextValue(entry.getCrystallographicPlanes());
				effect.setEndpointGroup(endpointGroup);
				papp.addEffect(effect);
			}
			if (entry.getRemarksOnResults() != null) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.Remark);
				effect.setTextValue(
						getPhrase(entry.getRemarksOnResults().getValue(), entry.getRemarksOnResults().getOther()));
				effect.setEndpointGroup(endpointGroup);
				papp.addEffect(effect);
			}
			// entry.getKeyResult()
			endpointGroup++;
			// entry.getRemarksOnResults()
		}

	}

}