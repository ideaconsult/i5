package net.idea.i5._5.ambit2.sections.PC_VAPOUR_SECTION;

import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart.PCVAPOUR.REFERENCE.Set;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord> {
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.PC_VAPOUR);
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
			return unmarshalled.getScientificPart().getPCVAPOUR().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getPCVAPOUR().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getPCVAPOUR().getREFERENCE().getSet()) {
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
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCVAPOUR()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled));
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		parseReference(unmarshalled, papp);
		
		if (sciPart.getPCVAPOUR().getGUIDELINE() != null)
			for (ScientificPart.PCVAPOUR.GUIDELINE.Set set : sciPart.getPCVAPOUR().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {}
		if (sciPart.getPCVAPOUR().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCVAPOUR().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}
		/*
		if (sciPart.getPCVAPOUR().getTRANSITION().getSet()!=null) 			
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart.PCVAPOUR.TRANSITION.Set set : sciPart.getPCVAPOUR().getTRANSITION().getSet()) {
			
		}
		*/
		
		if (sciPart.getPCVAPOUR().getVAPOURPR()!=null && sciPart.getPCVAPOUR().getVAPOURPR().getSet()!=null)			
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart.PCVAPOUR.VAPOURPR.Set set : sciPart.getPCVAPOUR().getVAPOURPR().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(I5CONSTANTS.eVapourPressure);
			effect.setConditions(new Params());
			papp.addEffect(effect);

			if (set.getVALUEUNITTEMPVALUE() != null) {
				Params tvalue = new Params();
				if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE()!= null) {
					tvalue.put(I5CONSTANTS.loValue,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
				} else tvalue.put(I5CONSTANTS.loValue,null); 
				if (set.getVALUEUNITTEMPVALUE()!=null)
					tvalue.put(I5CONSTANTS.unit,set.getVALUEUNITTEMPVALUE().getTEMPUNITValue());
				
				if (set.getTEMPQUALIFIER()!=null)
					tvalue.put(I5CONSTANTS.loQualifier,set.getTEMPQUALIFIER().getTEMPQUALIFIERValue());
				
				effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);				
			} else
				effect.getConditions().put(I5CONSTANTS.cTemperature, null);	
			
			//Not sure where to get it from
			effect.getConditions().put(I5CONSTANTS.rDECOMPOSITION,null);

			if (set.getPRECISIONPRESSURELOQUALIFIER() != null) {
				effect.setUnit(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUNITValue());
				if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOVALUE() != null) {
					try {
						effect.setLoQualifier(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue());						
					} catch (Exception x) {}
					try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOVALUE().getValue()));
					} catch (Exception x) {
						effect.setTextValue(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue());
					}
				}	
				if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE() != null) {
					try {
						effect.setUpQualifier(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPQUALIFIERValue());						
					} catch (Exception x) {}
					try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE().getValue()));
					} catch (Exception x) {
						effect.setTextValue(
								set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE().getValue()
								);
					}
				}	
			}
		}

		return record;
	}
	

}
