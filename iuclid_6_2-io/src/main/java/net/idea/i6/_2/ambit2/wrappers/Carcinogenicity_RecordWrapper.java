package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2.ENDPOINTSTUDYRECORDCarcinogenicity;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2.EfflevelEntry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;

public class Carcinogenicity_RecordWrapper
		extends RepeatedDoseToxicity_RecordWrapper<ENDPOINTSTUDYRECORDCarcinogenicity> {

	public Carcinogenicity_RecordWrapper(Document doc) throws Exception {
		super(doc);

	}

	@Override
	protected String dictionaryParams(String key) {
		if (I5CONSTANTS.cSpecies.equals(key))
			return key;
		else if ("Studytype".equals(key))
			return I5CONSTANTS.cTypeStudy;
		else
			return super.dictionaryParams(key);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDCarcinogenicity studyrecord) {

		if (studyrecord.getResultsAndDiscussion().getEffectLevels() != null)

			for (EfflevelEntry e : studyrecord.getResultsAndDiscussion().getEffectLevels().getEfflevel().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(effect.getEndpoint()));
				q2effectrecord(e.getEffectLevel(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));

				effect.getConditions().put(I5CONSTANTS.cSpecies,
						((IParams) papp.getParameters()).get(I5CONSTANTS.cSpecies));

			}
	}

}
