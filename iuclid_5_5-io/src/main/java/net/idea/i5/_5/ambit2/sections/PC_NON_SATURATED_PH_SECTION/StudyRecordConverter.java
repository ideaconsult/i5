package net.idea.i5._5.ambit2.sections.PC_NON_SATURATED_PH_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord.ScientificPart.PCNONSATURATEDPH.REFERENCE.Set;

public class StudyRecordConverter
		extends
		AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord> {

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCNONSATURATEDPH()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"P-CHEM","PC_NON_SATURATED_PH_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		if (sciPart.getPCNONSATURATEDPH().getREFERENCE() != null)
			for (Set set : sciPart.getPCNONSATURATEDPH().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCNONSATURATEDPH().getGUIDELINE() != null)
			for (ScientificPart.PCNONSATURATEDPH.GUIDELINE.Set set : sciPart
					.getPCNONSATURATEDPH().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getPCNONSATURATEDPH().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCNONSATURATEDPH().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		if (sciPart.getPCNONSATURATEDPH().getPH()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord.ScientificPart.PCNONSATURATEDPH.PH.Set set : sciPart.getPCNONSATURATEDPH().getPH().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint("pH");
			effect.setConditions(new Params());
			papp.addEffect(effect);

			if (set.getVALUEUNITTEMPVALUE() != null) {
				Params tvalue = new Params();
				if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE()!= null) {
					tvalue.put(
							loValue,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
				}
				if (set.getVALUEUNITTEMPVALUE()!=null)
					tvalue.put(
							unit,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPUNITValue()));
				effect.getConditions().put(Temperature, tvalue);				
			} else
				effect.getConditions().put(Temperature, null);			
			
			if (set.getPRECISIONCONCLOQUALIFIER() != null) {
				Params phvalue = new Params();
				if (set.getPRECISIONCONCLOQUALIFIER().getCONCLOVALUE()!= null) {
					phvalue.put(loQualifier,
							(set.getPRECISIONCONCLOQUALIFIER().getCONCLOQUALIFIER() == null) ? null : 
							set.getPRECISIONCONCLOQUALIFIER().getCONCLOQUALIFIER());
					
					phvalue.put(
							loValue,getNumber(set.getPRECISIONCONCLOQUALIFIER().getCONCLOVALUE().getValue()));
				} else phvalue.put(loValue,null);
				if (set.getPRECISIONCONCLOQUALIFIER().getCONCUPVALUE()!= null) {
					phvalue.put(upQualifier,
							(set.getPRECISIONCONCLOQUALIFIER().getCONCUPQUALIFIERValue() == null) ? null : 
							set.getPRECISIONCONCLOQUALIFIER().getCONCUPQUALIFIERValue());					
					phvalue.put(
							upValue,getNumber(set.getPRECISIONCONCLOQUALIFIER().getCONCUPVALUE().getValue()));
				} else phvalue.put(upValue,null);
				effect.getConditions().put(cDoses, phvalue);

			} else {
				effect.getConditions().put(cDoses,null);
			}
			try{
				effect.getConditions().put(Remark, set.getREM().getREM().getValue());
			} catch (Exception x) {
				effect.getConditions().put(Remark,null);	
			}
			if (set.getPRECISIONLOQUALIFIER() != null) {
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
