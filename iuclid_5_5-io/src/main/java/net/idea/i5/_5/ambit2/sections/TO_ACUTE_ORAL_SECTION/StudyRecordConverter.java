package net.idea.i5._5.ambit2.sections.TO_ACUTE_ORAL_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEORAL.GUIDELINE.Set;


public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord>{
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = new ProtocolApplication<Protocol,Params,String,Params,String>(new Protocol(unmarshalled.getName()));
		papp.getProtocol().setCategory("TO_ACUTE_ORAL_SECTION");
		papp.setParameters(new Params());
		record.addtMeasurement(papp);
		//UUID
		papp.setDocumentUUID(unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOACUTEORAL().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOACUTEORAL().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuidance(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getTOACUTEORAL().getMETHODNOGUIDELINE()!=null)
			papp.getProtocol().addGuidance(sciPart.getTOACUTEORAL().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		
		// year
		if (sciPart.getTOACUTEORAL().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEORAL.REFERENCE.Set set : sciPart
					.getTOACUTEORAL().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.getParameters().put("Reference",set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null)
					papp.getParameters().put("Year",set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
			}
		// Acute tox oral
		if (sciPart.getTOACUTEORAL().getORGANISM()!=null)
			papp.getParameters().put("Species",sciPart.getTOACUTEORAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		// Sex
		if (sciPart.getTOACUTEORAL().getSEX() != null) {
			papp.getParameters().put("Sex",sciPart.getTOACUTEORAL().getSEX().getSet().getLISTBELOWPOP().getLISTBELOWPOPValue());
		}
		// endpoint
		// effect level
		if (sciPart.getTOACUTEORAL().getEFFLEVEL() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEORAL.EFFLEVEL.Set set : sciPart.getTOACUTEORAL().getEFFLEVEL().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint(set.getPHRASEOTHERENDPOINT().getENDPOINTValue());
				effect.setConditions(new Params());
				papp.addEffect(effect);
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					effect.setUnit(set.getPRECISIONLOQUALIFIER().getUNITValue());
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					}
				}
				if (set.getSEX() != null)
					effect.getConditions().put("Sex",set.getSEX().getSEXValue());

				/*
				if (set.getPHRASEOTHEREFFCONCTYPE() != null)
					System.out.println(set.getPHRASEOTHEREFFCONCTYPE().getEFFCONCTYPEValue());
				if (set.getPRECISIONCONFLIMITSLOQUALIFIER() != null) {
					System.out.println(set.getPRECISIONCONFLIMITSLOQUALIFIER()
							.getCONFLIMITSLOQUALIFIER());
					System.out.println(set.getPRECISIONCONFLIMITSLOQUALIFIER()
							.getCONFLIMITSUPQUALIFIER());
					System.out.println(set.getPRECISIONCONFLIMITSLOQUALIFIER()
							.getCONFLIMITSLOVALUE());
					System.out.println(set.getPRECISIONCONFLIMITSLOQUALIFIER()
							.getCONFLIMITSUPVALUE());
				}
								System.out.println(set.getPHRASEOTHEREFFCONCTYPE());
				*/

			}
		if (sciPart.getTOACUTEORAL().getINTERPRETRSSUBMITTER() != null) {
			papp.getParameters().put("Interpretation of the results", 
					sciPart.getTOACUTEORAL().getINTERPRETRSSUBMITTER().getSet()
					.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		}
		if (sciPart.getTOACUTEORAL().getCRITERIASUBMITTER() != null) {
			papp.getParameters().put("Criteria for interpretation of the results", 
					sciPart.getTOACUTEORAL().getCRITERIASUBMITTER()
					.getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		}

		System.out.println(papp);
		return record;
	}
}
