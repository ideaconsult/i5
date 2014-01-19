package net.idea.i5._5.ambit2.sections.EC_ALGAETOX_SECTION;

import net.idea.i5._5.ambit2.sections.ECOTOXStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_ALGAETOX_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_ALGAETOX_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_ALGAETOX_SECTION.EndpointStudyRecord.ScientificPart.ECALGAETOX.REFERENCE.Set;

public class StudyRecordConverter extends ECOTOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_ALGAETOX_SECTION.EndpointStudyRecord>{

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.EC_ALGAETOX);
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
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_ALGAETOX_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getECALGAETOX()==null) return null;
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		
			parseReliability(papp,
					unmarshalled.getReliability().getValueID(),
					unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
					,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		if (sciPart.getECALGAETOX().getGUIDELINE()!=null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_ALGAETOX_SECTION.EndpointStudyRecord.ScientificPart.ECALGAETOX.GUIDELINE.Set set : sciPart.getECALGAETOX().getGUIDELINE().getSet()) 
				try {
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
				} catch (Exception x) {}
				
		if (sciPart.getECALGAETOX().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getECALGAETOX().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
	
		// citation
		if (sciPart.getECALGAETOX().getREFERENCE() != null)
			for (Set set : sciPart.getECALGAETOX().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) try {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				} catch (Exception x) {}
			}	
		
		//Exposure duration
		if (sciPart.getECALGAETOX().getEXPDURATION()!=null) {
			Params p = new Params();
			try {
				p.put(loValue, sciPart.getECALGAETOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getVALUE().getValue());
			} catch (Exception x) {p.put(loValue,null);}
			p.put(unit,sciPart.getECALGAETOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getUNITValue());
			papp.getParameters().put(cExposure,p);
		} else {
			papp.getParameters().put(cExposure,null);
		}
		
		if (sciPart.getECALGAETOX().getWATERTYPE()!=null) {
				papp.getParameters().put(cTestMedium,sciPart.getECALGAETOX().getWATERTYPE().getSet().getLISTRIGHTPOP().getLISTRIGHTPOPValue());
		} else 
			papp.getParameters().put(cTestMedium,null);
		
		if (sciPart.getECALGAETOX().getORGANISM()!=null) {
			papp.getParameters().put(cTestOrganism,sciPart.getECALGAETOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} else	
			papp.getParameters().put(cTestOrganism,null);
		
		papp.getParameters().put(cMeasuredConcentration,null);
		if (sciPart.getECALGAETOX().getNOMMEASCONC()!=null) try {
			papp.getParameters().put(cMeasuredConcentration,
					sciPart.getECALGAETOX().getNOMMEASCONC().getSet().getTEXTBELOW().getTEXTBELOW().getValue());
		} catch (Exception x) {
		}	
		//ENDPOINT
		if (sciPart.getECALGAETOX().getEFFCONC()!=null && sciPart.getECALGAETOX().getEFFCONC().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_ALGAETOX_SECTION.EndpointStudyRecord.ScientificPart.ECALGAETOX.EFFCONC.Set set : sciPart.getECALGAETOX().getEFFCONC().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			try {effect.setEndpoint(set.getPHRASEOTHERENDPOINT().getENDPOINTValue());} catch (Exception x) {}
			effect.setConditions(new Params());
			papp.addEffect(effect);

			effect.getConditions().put(cEffect,
					set.getPHRASEOTHERBASISEFFECT()==null?null:
					set.getPHRASEOTHERBASISEFFECT().getBASISEFFECTValue());
			
			effect.getConditions().put(cConcType,
					set.getPHRASEOTHEREFFCONCTYPE()==null?null:
					set.getPHRASEOTHEREFFCONCTYPE().getEFFCONCTYPEValue());
			
			if (set.getPRECISIONLOQUALIFIER()!=null) {
				effect.setUnit(set.getPRECISIONLOQUALIFIER().getUNITValue());
				
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
				p.put(loValue, set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONVALUE().getValue());
				p.put(unit,set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONUNITValue());
				effect.getConditions().put(cExposure,p);
			} else {
				effect.getConditions().put(cExposure,null);
			}
		}
		return record;
	}

}
