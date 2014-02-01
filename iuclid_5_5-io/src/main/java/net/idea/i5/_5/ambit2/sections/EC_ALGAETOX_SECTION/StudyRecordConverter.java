package net.idea.i5._5.ambit2.sections.EC_ALGAETOX_SECTION;

import net.idea.i5._5.ambit2.QACriteriaException;
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
	protected String getTestMaterialIdentity(EndpointStudyRecord unmarshalled) {
		try {
			return unmarshalled.getScientificPart().getECALGAETOX().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getECALGAETOX().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getECALGAETOX().getREFERENCE().getSet()) {
				try {
					if (set.getREFERENCEAUTHOR()!=null)
						papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
					if (set.getREFERENCEYEAR()!=null) try {
						papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
					} catch (Exception x) {}
					isReferenceTypeAccepted(set.getPHRASEOTHERREFERENCETYPE().getREFERENCETYPE());					
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
		
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_ALGAETOX_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getECALGAETOX()==null) return null;
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		
			parseReliability(papp,
					unmarshalled.getReliability().getValueID(),
					unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS(),
					unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
					getTestMaterialIdentity(unmarshalled));
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

		parseReference(unmarshalled,papp);

		
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
			
			effect.getConditions().put(cMeasuredConcentration,
					set.getBASISCONC()==null?null:
					set.getBASISCONC().getBASISCONCValue());
						
			
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