package net.idea.i5._5.ambit2.sections.EN_ADSORPTION_SECTION;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart.ENADSORPTION.REFERENCE.Set;


public class StudyRecordConverter extends ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord>{
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.EN_ADSORPTION);
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
			return unmarshalled.getScientificPart().getENADSORPTION().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}		
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getENADSORPTION().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getENADSORPTION().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_ADSORPTION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getENADSORPTION()==null) return null;

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
		if (sciPart.getENADSORPTION().getGUIDELINE()!=null)
			for (ScientificPart.ENADSORPTION.GUIDELINE.Set set : sciPart.getENADSORPTION().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getENADSORPTION().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getENADSORPTION().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		parseReference(unmarshalled, papp);	

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
						tvalue.put(I5CONSTANTS.loValue,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
					}
					tvalue.put(I5CONSTANTS.unit,set.getVALUEUNITTEMPVALUE().getTEMPUNITValue()); //here the unit is assumed ...
					effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);				
				} else
					effect.getConditions().put(I5CONSTANTS.cTemperature, null);	
				
				try {
					effect.getConditions().put(I5CONSTANTS.Remark, set.getREMARKS().getREMARKS().getValue());
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.Remark,null);
				}
				
				if (set.getPRECISIONOCLOQUALIFIER()!=null) {
					Params oc = new Params(); //% organic carbon
					oc.put(I5CONSTANTS.unit,"%");
					if (set.getPRECISIONOCLOQUALIFIER().getOCLOVALUE()!=null) try {
						oc.put(I5CONSTANTS.loValue,Double.parseDouble(set.getPRECISIONOCLOQUALIFIER().getOCLOVALUE().getValue()));
						oc.put(I5CONSTANTS.loQualifier, set.getPRECISIONOCLOQUALIFIER().getOCLOQUALIFIER());
					} catch (Exception x) {}
					
					if (set.getPRECISIONOCLOQUALIFIER().getOCUPVALUE()!=null) try {
						oc.put(I5CONSTANTS.upValue,Double.parseDouble(set.getPRECISIONOCLOQUALIFIER().getOCUPVALUE().getValue()));
						oc.put(I5CONSTANTS.upQualifier, set.getPRECISIONOCLOQUALIFIER().getOCUPQUALIFIERValue());
					} catch (Exception x) {
					}
					effect.getConditions().put(I5CONSTANTS.rOrgCarbonPercent,null);
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
