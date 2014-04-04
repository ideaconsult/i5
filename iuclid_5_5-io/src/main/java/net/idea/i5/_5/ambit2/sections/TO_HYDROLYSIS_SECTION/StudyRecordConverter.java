package net.idea.i5._5.ambit2.sections.TO_HYDROLYSIS_SECTION;

import net.idea.i5._5.ambit2.sections.ENVFATEStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_HYDROLYSIS_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_HYDROLYSIS_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_HYDROLYSIS_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_HYDROLYSIS_SECTION.EndpointStudyRecord.ScientificPart.TOHYDROLYSIS.REFERENCE.Set;



public class StudyRecordConverter extends ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_HYDROLYSIS_SECTION.EndpointStudyRecord>{
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_HYDROLYSIS);
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
			return unmarshalled.getScientificPart().getTOHYDROLYSIS().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}		
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getTOHYDROLYSIS().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getTOHYDROLYSIS().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_HYDROLYSIS_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOHYDROLYSIS()==null) return null;

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
		if (sciPart.getTOHYDROLYSIS().getGUIDELINE()!=null)
			for (ScientificPart.TOHYDROLYSIS.GUIDELINE.Set set : sciPart.getTOHYDROLYSIS().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getTOHYDROLYSIS().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOHYDROLYSIS().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		
		parseReference(unmarshalled, papp);
		papp.getParameters().put(cYear,papp.getReferenceYear());		

		if (sciPart.getTOHYDROLYSIS().getHALFLIFE()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_HYDROLYSIS_SECTION.EndpointStudyRecord.ScientificPart.TOHYDROLYSIS.HALFLIFE.Set set : sciPart.getTOHYDROLYSIS().getHALFLIFE().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				try { effect.setEndpoint(set.getPHRASEOTHERTYPE().getTYPEValue());} catch (Exception x) {effect.setEndpoint(null);}
				effect.setConditions(new Params());
				papp.addEffect(effect);
				
				//ph
				if (set.getPH() != null) {
					Params phvalue = new Params();
					if (set.getPH().getPH().getValue()!= null) 
						phvalue.put(loValue,getNumber(set.getPH().getPH().getValue()));
					else  phvalue.put(loValue,null);
					effect.getConditions().put(ph, phvalue);
				} else effect.getConditions().put(ph,null);
				
				//temperature
				if (set.getVALUEUNITTEMPVALUE() != null) {
					Params tvalue = new Params();
					if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE()!= null) {
						tvalue.put(loValue,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
					} else tvalue.put(loValue,null);
					if (set.getVALUEUNITTEMPVALUE()!=null)
						tvalue.put(unit,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPUNITValue()));
					effect.getConditions().put(Temperature, tvalue);				
				} else
					effect.getConditions().put(Temperature, null);						
				
				//result
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
				

			}
		} 		
		return record;
	}
}
