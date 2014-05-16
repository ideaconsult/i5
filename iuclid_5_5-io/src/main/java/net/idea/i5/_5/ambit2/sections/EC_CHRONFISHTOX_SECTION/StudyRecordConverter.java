package net.idea.i5._5.ambit2.sections.EC_CHRONFISHTOX_SECTION;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECCHRONFISHTOX.REFERENCE.Set;

public class StudyRecordConverter extends ECOTOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord>{

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.EC_CHRONFISHTOX);
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
			return unmarshalled.getScientificPart().getECCHRONFISHTOX().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getECCHRONFISHTOX().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getECCHRONFISHTOX().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getECCHRONFISHTOX()==null) return null;
		
		
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
		if (sciPart.getECCHRONFISHTOX().getGUIDELINE()!=null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECCHRONFISHTOX.GUIDELINE.Set set : sciPart.getECCHRONFISHTOX().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));

			}
		if (sciPart.getECCHRONFISHTOX().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getECCHRONFISHTOX().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
	
		// citation
		parseReference(unmarshalled, papp);
		
		//Exposure duration
		if (sciPart.getECCHRONFISHTOX().getEXPDURATION()!=null) {
			Params p = new Params();
			try {p.setLoValue( sciPart.getECCHRONFISHTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getVALUE().getValue());}
			catch (Exception x) {p.setLoValue(null);}
			try {p.setUnits(sciPart.getECCHRONFISHTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getUNITValue());}
			catch (Exception x) {}
			papp.getParameters().put(I5CONSTANTS.cExposure,p);
		} else {
			papp.getParameters().put(I5CONSTANTS.cExposure,null);
		}
		
		if (sciPart.getECCHRONFISHTOX().getWATERTYPE()!=null) {
				papp.getParameters().put(I5CONSTANTS.cTestMedium,sciPart.getECCHRONFISHTOX().getWATERTYPE().getSet().getLISTRIGHTPOP().getLISTRIGHTPOPValue());
		} else 
			papp.getParameters().put(I5CONSTANTS.cTestMedium,null);
		
		try {
			papp.getParameters().put(I5CONSTANTS.cTestOrganism,
					getValue(sciPart.getECCHRONFISHTOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getECCHRONFISHTOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { 
			papp.getParameters().put(I5CONSTANTS.cTestOrganism,null);
		}
		
		//ENDPOINT
		if (sciPart.getECCHRONFISHTOX().getEFFCONC()!=null && sciPart.getECCHRONFISHTOX().getEFFCONC().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONFISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECCHRONFISHTOX.EFFCONC.Set set : sciPart.getECCHRONFISHTOX().getEFFCONC().getSet()) {
			EffectRecord<String, Params, String> effect = endpointCategory.createEffectRecord();
			try {
				effect.setEndpoint(getValue(
					set.getPHRASEOTHERENDPOINT().getENDPOINTValue(),
					set.getPHRASEOTHERENDPOINT().getENDPOINTTXT()
					));
			} catch (Exception x) {}
			papp.addEffect(effect);

			try {
				effect.getConditions().put(I5CONSTANTS.cEffect,
					getValue(set.getPHRASEOTHERBASISEFFECT().getBASISEFFECTValue(),
							set.getPHRASEOTHERBASISEFFECT().getBASISEFFECTTXT()));
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.cEffect,null);
			}
			
			try {
				effect.getConditions().put(I5CONSTANTS.cConcType,
					getValue(set.getPHRASEOTHEREFFCONCTYPE().getEFFCONCTYPEValue(),
							set.getPHRASEOTHEREFFCONCTYPE().getEFFCONCTYPETXT()));
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.cConcType,null);
			}
			
			effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration,
					set.getBASISCONC()==null?null:
					set.getBASISCONC().getBASISCONCValue());
			
			
			if (set.getPRECISIONCONCLOQUALIFIER()!=null) {
				effect.setUnit(set.getPRECISIONCONCLOQUALIFIER().getCONCUNITValue());
				
				
				if (set.getPRECISIONCONCLOQUALIFIER().getCONCLOVALUE()!=null) try {
					effect.setLoValue(Double.parseDouble(set.getPRECISIONCONCLOQUALIFIER().getCONCLOVALUE().getValue()));
					effect.setLoQualifier(set.getPRECISIONCONCLOQUALIFIER().getCONCLOQUALIFIERValue());
				} catch (Exception x) {}
				if (set.getPRECISIONCONCLOQUALIFIER().getCONCUPVALUE()!=null) try {
					effect.setUpValue(Double.parseDouble(set.getPRECISIONCONCLOQUALIFIER().getCONCUPVALUE().getValue()));
					effect.setUpQualifier(set.getPRECISIONCONCLOQUALIFIER().getCONCUPQUALIFIERValue());
				} catch (Exception x) {}
			}	
			
			if (set.getVALUEUNITEXPDURATIONVALUE()!=null) {
				Params p = new Params();
				try {
					p.setLoValue( set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONVALUE().getValue());
				} catch (Exception x) { p.setLoValue( null);}
				try {p.setUnits(set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONUNITValue());}
				catch (Exception x) {}
				effect.getConditions().put(I5CONSTANTS.cExposure,p);
			} else {
				effect.getConditions().put(I5CONSTANTS.cExposure,null);
			}
		}
		return record;
	}
}
