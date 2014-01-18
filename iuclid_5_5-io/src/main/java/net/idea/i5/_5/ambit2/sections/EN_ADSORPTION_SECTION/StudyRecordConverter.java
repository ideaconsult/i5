package net.idea.i5._5.ambit2.sections.EN_ADSORPTION_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart.ENADSORPTION.REFERENCE.Set;


public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord>{
	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getENADSORPTION()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"ENV FATE","EN_ADSORPTION_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),
				unmarshalled.getStudyResultType().getValueID()
			);
		record.addtMeasurement(papp);
	
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		if (sciPart.getENADSORPTION().getGUIDELINE()!=null)
			for (ScientificPart.ENADSORPTION.GUIDELINE.Set set : sciPart.getENADSORPTION().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getENADSORPTION().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getENADSORPTION().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		if (sciPart.getENADSORPTION().getREFERENCE() != null)
			for (Set set : sciPart.getENADSORPTION().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}		
	

		if (sciPart.getENADSORPTION().getRESULTSBATCHDETAILS()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart.ENADSORPTION.ADSORPTIONKOC.Set 
					set : sciPart.getENADSORPTION().getADSORPTIONKOC().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint(set.getPHRASEOTHERTYPE().getTYPEValue());
				effect.setConditions(new Params());
				papp.addEffect(effect);
				
				//temperature
				if (set.getVALUEUNITTEMPVALUE() != null) {
					Params tvalue = new Params();
					if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE()!= null) {
						tvalue.put(loValue,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
					}
					tvalue.put(unit,set.getVALUEUNITTEMPVALUE().getTEMPUNITValue()); //here the unit is assumed ...
					effect.getConditions().put(Temperature, tvalue);				
				} else
					effect.getConditions().put(Temperature, null);	
				
				try {
					effect.getConditions().put(Remark, set.getREMARKS().getREMARKS().getValue());
				} catch (Exception x) {
					effect.getConditions().put(Remark,null);
				}
				
				if (set.getPRECISIONOCLOQUALIFIER()!=null) {
					Params oc = new Params(); //% organic carbon
					oc.put(unit,"%");
					if (set.getPRECISIONOCLOQUALIFIER().getOCLOVALUE()!=null) try {
						oc.put(loValue,Double.parseDouble(set.getPRECISIONOCLOQUALIFIER().getOCLOVALUE().getValue()));
						oc.put(loQualifier, set.getPRECISIONOCLOQUALIFIER().getOCLOQUALIFIER());
					} catch (Exception x) {}
					
					if (set.getPRECISIONOCLOQUALIFIER().getOCUPVALUE()!=null) try {
						oc.put(upValue,Double.parseDouble(set.getPRECISIONOCLOQUALIFIER().getOCUPVALUE().getValue()));
						oc.put(upQualifier, set.getPRECISIONOCLOQUALIFIER().getOCUPQUALIFIERValue());
					} catch (Exception x) {
					}
					effect.getConditions().put(OrgCarbonPercent,null);
				}					
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					} catch (Exception x) {}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					} catch (Exception x) {}
				}	
				
			}
		} 		
		return record;
	}
}
