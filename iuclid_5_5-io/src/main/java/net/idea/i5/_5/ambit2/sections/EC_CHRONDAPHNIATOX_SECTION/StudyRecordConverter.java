package net.idea.i5._5.ambit2.sections.EC_CHRONDAPHNIATOX_SECTION;

import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5._5.ambit2.sections.ECOTOXStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONDAPHNIATOX_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONDAPHNIATOX_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONDAPHNIATOX_SECTION.EndpointStudyRecord.ScientificPart.ECCHRONDAPHNIATOX.REFERENCE.Set;

public class StudyRecordConverter extends ECOTOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONDAPHNIATOX_SECTION.EndpointStudyRecord>{


	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.EC_CHRONDAPHNIATOX);
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
			return unmarshalled.getScientificPart().getECCHRONDAPHNIATOX().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getECCHRONDAPHNIATOX().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getECCHRONDAPHNIATOX().getREFERENCE().getSet()) {
				try {
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				} catch (Exception x) {papp.setReference(null);}				
				try {
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
		
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONDAPHNIATOX_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getECCHRONDAPHNIATOX()==null) return null;
		
		
		record.clear();
		Experiment<IParams, IParams> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		try {
			parseReliability(papp, unmarshalled.getReliability().getValueID(),
					unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
					,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
					getTestMaterialIdentity(unmarshalled));
		} catch (Exception x) {
			return null;
		}
		record.addMeasurement(papp);		
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		if (sciPart.getECCHRONDAPHNIATOX().getGUIDELINE()!=null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONDAPHNIATOX_SECTION.EndpointStudyRecord.ScientificPart.ECCHRONDAPHNIATOX.GUIDELINE.Set set : sciPart.getECCHRONDAPHNIATOX().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
		if (sciPart.getECCHRONDAPHNIATOX().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getECCHRONDAPHNIATOX().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
	
		// citation
		parseReference(unmarshalled, papp);
		
		//Exposure duration
		if (sciPart.getECCHRONDAPHNIATOX().getEXPDURATION()!=null) {
			Params p = new Params();
			try {p.setLoValue(sciPart.getECCHRONDAPHNIATOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getVALUE().getValue());}
			catch (Exception x) {p.setLoValue(null);}
			try {p.setUnits(sciPart.getECCHRONDAPHNIATOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getUNITValue());} catch (Exception x){}
			papp.getParameters().put(I5CONSTANTS.cExposure,p);
		} else {
			papp.getParameters().put(I5CONSTANTS.cExposure,null);
		}
		
		if (sciPart.getECCHRONDAPHNIATOX().getWATERTYPE()!=null) {
				papp.getParameters().put(I5CONSTANTS.cTestMedium,sciPart.getECCHRONDAPHNIATOX().getWATERTYPE().getSet().getLISTRIGHTPOP().getLISTRIGHTPOPValue());
		} else 
			papp.getParameters().put(I5CONSTANTS.cTestMedium,null);
		
		try {
			papp.getParameters().put(I5CONSTANTS.cTestOrganism,
					getValue(sciPart.getECCHRONDAPHNIATOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getECCHRONDAPHNIATOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { 
			papp.getParameters().put(I5CONSTANTS.cTestOrganism,null);
		}
		
		//ENDPOINT
		if (sciPart.getECCHRONDAPHNIATOX().getEFFCONC()!=null && sciPart.getECCHRONDAPHNIATOX().getEFFCONC().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_CHRONDAPHNIATOX_SECTION.EndpointStudyRecord.ScientificPart.ECCHRONDAPHNIATOX.EFFCONC.Set set : sciPart.getECCHRONDAPHNIATOX().getEFFCONC().getSet()) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
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
				p.setLoValue( set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONVALUE().getValue());
				p.setUnits(set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONUNITValue());
				effect.getConditions().put(I5CONSTANTS.cExposure,p);
			} else {
				effect.getConditions().put(I5CONSTANTS.cExposure,null);
			}
		}
		return record;
	}
}
