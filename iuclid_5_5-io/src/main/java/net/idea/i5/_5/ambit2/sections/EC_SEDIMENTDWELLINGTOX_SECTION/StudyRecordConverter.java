package net.idea.i5._5.ambit2.sections.EC_SEDIMENTDWELLINGTOX_SECTION;

import net.idea.i5._5.ambit2.sections.ECOTOXStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SEDIMENTDWELLINGTOX_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SEDIMENTDWELLINGTOX_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SEDIMENTDWELLINGTOX_SECTION.EndpointStudyRecord.ScientificPart.ECSEDIMENTDWELLINGTOX.REFERENCE.Set;

public class StudyRecordConverter extends ECOTOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SEDIMENTDWELLINGTOX_SECTION.EndpointStudyRecord>{

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.EC_SEDIMENTDWELLINGTOX);
	}
	@Override
	protected boolean hasScientificPart(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getScientificPart()!=null;
	}
	@Override
	protected boolean isDataWaiving(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getDataWaiving()!=null;
	}
	@Override
	protected String getTestMaterialIdentity(EndpointStudyRecord unmarshalled) {
		try {
			return unmarshalled.getScientificPart().getECSEDIMENTDWELLINGTOX().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getECSEDIMENTDWELLINGTOX().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getECSEDIMENTDWELLINGTOX().getREFERENCE().getSet()) {
				try {
					if (set.getREFERENCEAUTHOR()!=null)
						papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
					if (set.getREFERENCEYEAR()!=null) try {
						papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
					} catch (Exception x) {}
					try {
						papp.setReferenceOwner(set.getREFERENCECOMPANYID().getREFERENCECOMPANYID().getValue());
					} catch (Exception x) {	papp.setReferenceOwner("");}					
					isReferenceTypeAccepted(set.getPHRASEOTHERREFERENCETYPE()==null?null:set.getPHRASEOTHERREFERENCETYPE().getREFERENCETYPE());					
					return;
				} catch (QACriteriaException x) {
					qax = x;
					continue;
				} catch (Exception x) {
					qax = new QACriteriaException(x.getMessage());
					continue;
				}

			}	
		else qax = new QACriteriaException("Empty reference!");
		if (qax!=null) throw qax;
	}		
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SEDIMENTDWELLINGTOX_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getECSEDIMENTDWELLINGTOX()==null) return null;
		
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		
		parseReliability(papp, unmarshalled.getReliability().getValueID(),
					unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
					,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
					getTestMaterialIdentity(unmarshalled));
		record.addtMeasurement(papp);		
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		if (sciPart.getECSEDIMENTDWELLINGTOX().getGUIDELINE()!=null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SEDIMENTDWELLINGTOX_SECTION.EndpointStudyRecord.ScientificPart.ECSEDIMENTDWELLINGTOX.GUIDELINE.Set set : sciPart.getECSEDIMENTDWELLINGTOX().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x){}
		if (sciPart.getECSEDIMENTDWELLINGTOX().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getECSEDIMENTDWELLINGTOX().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
	
		// citation
		parseReference(unmarshalled, papp);		
		//Exposure duration
		if (sciPart.getECSEDIMENTDWELLINGTOX().getEXPDURATION()!=null) {
			Params p = new Params();
			try {p.setLoValue( sciPart.getECSEDIMENTDWELLINGTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getVALUE().getValue());}
			catch (Exception x) {p.setLoValue( null);}
			try {p.setUnits(sciPart.getECSEDIMENTDWELLINGTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getUNITValue());} catch (Exception x){}
			papp.getParameters().put(I5CONSTANTS.cExposure,p);
		} else {
			papp.getParameters().put(I5CONSTANTS.cExposure,null);
		}
		
		if (sciPart.getECSEDIMENTDWELLINGTOX().getWATERTYPE()!=null) {
				papp.getParameters().put(I5CONSTANTS.cTestMedium,sciPart.getECSEDIMENTDWELLINGTOX().getWATERTYPE().getSet().getLISTRIGHTPOP().getLISTRIGHTPOPValue());
		} else 
			papp.getParameters().put(I5CONSTANTS.cTestMedium,null);
		
		try {
			papp.getParameters().put(I5CONSTANTS.cTestOrganism,
					getValue(sciPart.getECSEDIMENTDWELLINGTOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getECSEDIMENTDWELLINGTOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { 
			papp.getParameters().put(I5CONSTANTS.cTestOrganism,null);
		}		
		//ENDPOINT
		if (sciPart.getECSEDIMENTDWELLINGTOX().getEFFCONC()!=null && sciPart.getECSEDIMENTDWELLINGTOX().getEFFCONC().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SEDIMENTDWELLINGTOX_SECTION.EndpointStudyRecord.ScientificPart.ECSEDIMENTDWELLINGTOX.EFFCONC.Set set : sciPart.getECSEDIMENTDWELLINGTOX().getEFFCONC().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			try {
				effect.setEndpoint(getValue(
					set.getPHRASEOTHERENDPOINT().getENDPOINTValue(),
					set.getPHRASEOTHERENDPOINT().getENDPOINTTXT()
					));
			} catch (Exception x) {effect.setEndpoint(null);}
			effect.setConditions(new Params());
			papp.addEffect(effect);

			try {
				String basis = set.getPHRASEOTHERBASISEFFECT().getBASISEFFECTValue();
				if (basis.startsWith("other:")) basis = set.getPHRASEOTHERBASISEFFECT().getBASISEFFECTTXT().getValue();
				effect.getConditions().put(I5CONSTANTS.cEffect,basis);
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.cEffect,null);	
			}
			
			effect.getConditions().put(I5CONSTANTS.cConcType,
					set.getPHRASEOTHEREFFCONCTYPE()==null?null:
					set.getPHRASEOTHEREFFCONCTYPE().getEFFCONCTYPEValue());
			
			effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration,
					set.getBASISCONC()==null?null:
					set.getBASISCONC().getBASISCONCValue());
			
			
			if (set.getPRECISIONLOQUALIFIER()!=null) {
				effect.setUnit(getUnit(set.getPRECISIONLOQUALIFIER().getUNITValue(),
						set.getPRECISIONLOQUALIFIER().getUNITTXT()==null?null:
						set.getPRECISIONLOQUALIFIER().getUNITTXT().getValue()));
				
				if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) try {
					effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
					effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
				} catch (Exception x) {}
				if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
					effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
					effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
				} catch (Exception x) {}
			}	
			
			if (set.getVALUEUNITEXPDURATIONVALUE()!=null) {
				Params p = new Params();
				p.setLoValue(set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONVALUE().getValue());
				p.setUnits(set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONUNITValue());
				effect.getConditions().put(I5CONSTANTS.cExposure,p);
			} else {
				effect.getConditions().put(I5CONSTANTS.cExposure,null);
			}
		} else {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(I5CONSTANTS.eBCF);
			effect.setConditions(new Params());
			papp.addEffect(effect);
			effect.getConditions().put(I5CONSTANTS.cEffect,null);
			effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration,null);
			effect.getConditions().put(I5CONSTANTS.cConcType,null);
			effect.getConditions().put(I5CONSTANTS.cExposure,null);
		}
		return record;
	}
}
