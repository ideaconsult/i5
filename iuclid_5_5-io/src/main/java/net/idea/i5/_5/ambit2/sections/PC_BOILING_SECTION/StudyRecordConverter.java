package net.idea.i5._5.ambit2.sections.PC_BOILING_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart.PCBOILING.REFERENCE.Set;

public class StudyRecordConverter
		extends
		AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord> {
	private static final String BOILINGPOINT = "Boiling point";

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCBOILING()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"P-CHEM","PC_BOILING_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		if (sciPart.getPCBOILING().getREFERENCE() != null)
			for (Set set : sciPart.getPCBOILING().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCBOILING().getGUIDELINE() != null)
			for (ScientificPart.PCBOILING.GUIDELINE.Set set : sciPart
					.getPCBOILING().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getPCBOILING().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCBOILING().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}


		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart.PCBOILING.BOILINGPT.Set set : sciPart.getPCBOILING().getBOILINGPT().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(BOILINGPOINT);
			effect.setConditions(new Params());
			papp.addEffect(effect);
			try {
				effect.getConditions().put(DECOMPOSITION,	set.getPHRASEOTHERDECOMPINDICATOR().getDECOMPINDICATORValue());
			}  catch (Exception x) {
				effect.getConditions().put(DECOMPOSITION,null);
			}
			
			
			if (set.getPRECISIONPRESSURELOQUALIFIER() != null) {
				/* Change to go like this
				"conditions":	{"pH": {"loValue" : 4},"Temperature":"25 C"},
				*/
				Params vpvalue = new Params();
				if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOVALUE()!= null) {
					vpvalue.put(loQualifier,
							(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue() == null) ? null : 
							set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue());
					
					vpvalue.put(
							loValue,getNumber(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOVALUE().getValue()));
				}
				if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE()!= null) {
					vpvalue.put(upQualifier,
							(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPQUALIFIER() == null) ? null : 
							set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPQUALIFIERValue());					
					vpvalue.put(
							upValue,getNumber(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE().getValue()));
				}
				vpvalue.put(unit,set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUNITValue());
				effect.getConditions().put(VapourPressure, vpvalue);

			} else {
				effect.getConditions().put(VapourPressure,null);
			}

			
			if (set.getPRECISIONLOQUALIFIER() != null) {
				effect.setUnit(set.getPRECISIONLOQUALIFIER().getUNITValue());
				if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
					try {
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER()
								.getLOQUALIFIERValue());						
						effect.setLoValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue());
					}
				if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
					try {
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER()
								.getUPQUALIFIERValue());						
						effect.setUpValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getUPVALUE()
								.getValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue());
					}
			}
		}

		return record;
	}
	

}
