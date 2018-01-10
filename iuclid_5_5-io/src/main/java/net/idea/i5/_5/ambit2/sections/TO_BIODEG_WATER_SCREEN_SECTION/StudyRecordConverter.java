package net.idea.i5._5.ambit2.sections.TO_BIODEG_WATER_SCREEN_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSCREEN.REFERENCE.Set;
import net.idea.i5.ambit2.sections.ENVFATEStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;



public class StudyRecordConverter extends ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord>{
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_BIODEG_WATER_SCREEN);
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
			return unmarshalled.getScientificPart().getTOBIODEGWATERSCREEN().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}		
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getTOBIODEGWATERSCREEN().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getTOBIODEGWATERSCREEN().getREFERENCE().getSet()) {
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
		else if (!isReferenceTypeAccepted(null)) qax = new QACriteriaException("Empty reference!");
		if (qax!=null) throw qax;
	}			
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOBIODEGWATERSCREEN()==null) return null;

		record.clear();
		Experiment<IParams, IParams> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),
				unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled)
			);
		record.addMeasurement(papp);
	
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		if (sciPart.getTOBIODEGWATERSCREEN().getGUIDELINE()!=null)
			for (ScientificPart.TOBIODEGWATERSCREEN.GUIDELINE.Set set : sciPart.getTOBIODEGWATERSCREEN().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
							set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));

			}
		if (sciPart.getTOBIODEGWATERSCREEN().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOBIODEGWATERSCREEN().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		parseReference(unmarshalled, papp);
		//papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());	

		//TEST TYPE
		papp.getParameters().put(I5CONSTANTS.cTestType,
				sciPart.getTOBIODEGWATERSCREEN().getOXYGENCONDITIONS()==null?null:
				sciPart.getTOBIODEGWATERSCREEN().getOXYGENCONDITIONS().getSet().getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());

		
		if (sciPart.getTOBIODEGWATERSCREEN().getINTERPRETRESULTSSUBM() != null) {
			String otherValue = null;
			try { 
				otherValue = sciPart.getTOBIODEGWATERSCREEN().getINTERPRETRESULTSSUBM().getSet().
				getPHRASEOTHERLISTPOP().getLISTPOPTXT().getValue();
			} catch (Exception x) {};
			
			setInterpretationResult(papp, 
					sciPart.getTOBIODEGWATERSCREEN().getINTERPRETRESULTSSUBM().getSet()
					.getPHRASEOTHERLISTPOP().getLISTPOPValue(),
					otherValue
			);

		} else setInterpretationResult(papp,null,null);		
		
		papp.setInterpretationCriteria(null);
		if (sciPart.getTOBIODEGWATERSCREEN().getRESULTSDETAILS()!=null) try {
			papp.setInterpretationCriteria(sciPart.getTOBIODEGWATERSCREEN().getRESULTSDETAILS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}
		

		if (sciPart.getTOBIODEGWATERSCREEN().getDEGRAD()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSCREEN.DEGRAD.Set set : sciPart.getTOBIODEGWATERSCREEN().getDEGRAD().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(I5CONSTANTS.ePercentDegradation);
				effect.setUnit("%");
				try {
					effect.setEndpoint(getValue(
							set.getPHRASEOTHERPARAMETER().getPARAMETERValue(),
							set.getPHRASEOTHERPARAMETER().getPARAMETERTXT()
							));
				} catch (Exception x) {}
				
				papp.addEffect(effect);
				//sampling time
				//sampling time
				if (set.getVALUEUNITTIMEPOINTVALUE() != null) {
					Value tvalue = new Value();
					if (set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE()!= null) {
						tvalue.setLoValue(getNumber(set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE().getValue()));
					}
					if (set.getVALUEUNITTIMEPOINTVALUE()!=null)
						tvalue.setUnits(set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTUNITValue());
					effect.getConditions().put(I5CONSTANTS.cTimePoint, tvalue);				
				} else
					effect.getConditions().put(I5CONSTANTS.cTimePoint, null);	
				
				//results
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
