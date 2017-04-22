package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_watersolubility._2.ENDPOINTSTUDYRECORDWaterSolubility;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class WaterSolubility_RecordWrapper extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDWaterSolubility>{

	public WaterSolubility_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}
	
	@Override
	public void assignEffectLevels(ProtocolApplication papp) {
		ENDPOINTSTUDYRECORDWaterSolubility record = getStudyRecord();
		
		
		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(I5CONSTANTS.eWaterSolubility);
		papp.addEffect(effect);
		/*
		for (Entry e : record.getResultsAndDiscussion().getWaterSolubility().getEntry()) {
			e.getConcBasedOn()
			e.getIncubationDuration()
			e.getLoadingOfAqueousPhase()
			e.getPh()
			e.getRemarksOnResults()
			e.getSolubility()
			e.getTemp()
			
			if (set.getVALUEUNITTEMPVALUE() != null) {
			    Value tvalue = new Value();
			    if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE() != null) {
				tvalue.setLoValue(getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
			    }
			    if (set.getVALUEUNITTEMPVALUE() != null)
				tvalue.setUnits(Phrases.phrasegroup_A102.get(set.getVALUEUNITTEMPVALUE().getTEMPUNIT()));
			    effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);
			} else
			    effect.getConditions().put(I5CONSTANTS.cTemperature, null);

			if (set.getPRECISIONPHLOQUALIFIER() != null) {
			    Value phvalue = new Value();
			    if (set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE() != null) {
				phvalue.setLoQualifier((set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue() == null) ? null
					: set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue());

				phvalue.setLoValue(getNumber(set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE().getValue()));
			    } else
				phvalue.setLoValue(null);
			    if (set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE() != null) {
				phvalue.setUpQualifier((set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue() == null) ? null
					: set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue());
				phvalue.setUpValue(getNumber(set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE().getValue()));
			    } else
				phvalue.setUpValue(null);
			    effect.getConditions().put(I5CONSTANTS.pH, phvalue);

			} else {
			    effect.getConditions().put(I5CONSTANTS.pH, null);
			}
			try {
			    effect.getConditions().put(I5CONSTANTS.Remark, set.getREM().getREM().getValue());
			} catch (Exception x) {
			    effect.getConditions().put(I5CONSTANTS.Remark, null);
			}
			if (set.getPRECISIONLOQUALIFIER() != null) {
			    effect.setUnit(getUnit(set.getPRECISIONLOQUALIFIER().getUNITValue(), set.getPRECISIONLOQUALIFIER()
				    .getUNITTXT() == null ? null : set.getPRECISIONLOQUALIFIER().getUNITTXT().getValue()));

			    if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
				try {
				    effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
				    effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
				} catch (Exception x) {
				    effect.setTextValue(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
				}
			    if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
				try {
				    effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
				    effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
				} catch (Exception x) {
				    effect.setTextValue(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
				}
			}

			
		}
					
			*/
	}

}
