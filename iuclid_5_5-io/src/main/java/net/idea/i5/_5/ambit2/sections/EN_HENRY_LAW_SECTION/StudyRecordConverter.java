package net.idea.i5._5.ambit2.sections.EN_HENRY_LAW_SECTION;

import net.idea.i5._5.ambit2.sections.ENVFATEStudyRecordConvertor;
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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord.ScientificPart.ENHENRYLAW.REFERENCE.Set;



public class StudyRecordConverter extends ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord>{
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.EN_HENRY_LAW);
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
			return unmarshalled.getScientificPart().getENHENRYLAW().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getENHENRYLAW().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getENHENRYLAW().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getENHENRYLAW()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),
				unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled)
			);
		record.addtMeasurement(papp);
	
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		if (sciPart.getENHENRYLAW().getGUIDELINE()!=null)
			for (ScientificPart.ENHENRYLAW.GUIDELINE.Set set : sciPart.getENHENRYLAW().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
							set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));

			}
		if (sciPart.getENHENRYLAW().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getENHENRYLAW().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		parseReference(unmarshalled, papp);

		//TEST TYPE

		if (sciPart.getENHENRYLAW().getHENRYSLAW()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_HENRY_LAW_SECTION.EndpointStudyRecord.ScientificPart.ENHENRYLAW.HENRYSLAW.Set set : sciPart.getENHENRYLAW().getHENRYSLAW().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint(I5CONSTANTS.HLC);
				effect.setConditions(new Params());
				
				papp.addEffect(effect);
				
				if (set.getVALUEUNITPRESSUREVALUE() != null) {
					Params tvalue = new Params();
					if (set.getVALUEUNITPRESSUREVALUE().getPRESSUREVALUE()!= null) {
						tvalue.setLoValue(getNumber(set.getVALUEUNITPRESSUREVALUE().getPRESSUREVALUE().getValue()));
					} else tvalue.setLoValue(null);
					if (set.getVALUEUNITPRESSUREVALUE()!=null)
						tvalue.setUnits(set.getVALUEUNITPRESSUREVALUE().getPRESSUREUNITValue());
					
					effect.getConditions().put(I5CONSTANTS.Pressure, tvalue);				
				} else
					effect.getConditions().put(I5CONSTANTS.Pressure, null);
				try {
					effect.getConditions().put(I5CONSTANTS.Remark, set.getREM().getREM().getValue());
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.Remark,null);
				}
				//temperature
				if (set.getTEMPVALUE() != null) {
					Params tvalue = new Params();
					if (set.getTEMPVALUE()!= null) {
						tvalue.setLoValue(getNumber(set.getTEMPVALUE().getTEMPVALUE().getValue()));
					}
					tvalue.setUnits("\u2103C"); //here the unit is assumed ...
					effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);				
				} else
					effect.getConditions().put(I5CONSTANTS.cTemperature, null);		
				
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
				
	

				
			}
		} 		
		return record;
	}
	

}
