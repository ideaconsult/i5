package net.idea.i5._5.ambit2.sections.PC_NON_SATURATED_PH_SECTION;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord.ScientificPart.PCNONSATURATEDPH.REFERENCE.Set;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord> {

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.PC_NON_SATURATED_PH);
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
			return unmarshalled.getScientificPart().getPCNONSATURATEDPH().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getPCNONSATURATEDPH().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getPCNONSATURATEDPH().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCNONSATURATEDPH()==null) return null;

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
		
		if (sciPart.getPCNONSATURATEDPH().getGUIDELINE() != null)
			for (ScientificPart.PCNONSATURATEDPH.GUIDELINE.Set set : sciPart
					.getPCNONSATURATEDPH().getGUIDELINE().getSet()) {
				
				papp.getProtocol().addGuideline(
				getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()==null?null:set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT().getValue())
				);

			}
		if (sciPart.getPCNONSATURATEDPH().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCNONSATURATEDPH().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		if (sciPart.getPCNONSATURATEDPH().getPH()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_NON_SATURATED_PH_SECTION.EndpointStudyRecord.ScientificPart.PCNONSATURATEDPH.PH.Set set : sciPart.getPCNONSATURATEDPH().getPH().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(I5CONSTANTS.pH);
			effect.setConditions(new Params());
			papp.addEffect(effect);

			if (set.getVALUEUNITTEMPVALUE() != null) {
				Params tvalue = new Params();
				if (set.getVALUEUNITTEMPVALUE().getTEMPVALUE()!= null) {
					tvalue.put(
							I5CONSTANTS.loValue,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue()));
				}
				if (set.getVALUEUNITTEMPVALUE()!=null)
					tvalue.put(
							I5CONSTANTS.unit,set.getVALUEUNITTEMPVALUE().getTEMPUNITValue());
				effect.getConditions().put(I5CONSTANTS.cTemperature, tvalue);				
			} else
				effect.getConditions().put(I5CONSTANTS.cTemperature, null);			
			
			
			if (set.getPRECISIONCONCLOQUALIFIER() != null) {
				Params phvalue = new Params();
				if (set.getPRECISIONCONCLOQUALIFIER().getCONCLOVALUE()!= null) {
					String qlfr = getQualifier(set.getPRECISIONCONCLOQUALIFIER().getCONCUPQUALIFIERValue()); 
					phvalue.put(I5CONSTANTS.loQualifier,qlfr);
					
					phvalue.put(I5CONSTANTS.loValue,getNumber(set.getPRECISIONCONCLOQUALIFIER().getCONCLOVALUE().getValue()));
				} else phvalue.put(I5CONSTANTS.loValue,null);
				if (set.getPRECISIONCONCLOQUALIFIER().getCONCUPVALUE()!= null) {
					String qlfr = getQualifier(set.getPRECISIONCONCLOQUALIFIER().getCONCUPQUALIFIERValue());
					phvalue.put(I5CONSTANTS.upQualifier,qlfr);
												
					phvalue.put(
							I5CONSTANTS.upValue,getNumber(set.getPRECISIONCONCLOQUALIFIER().getCONCUPVALUE().getValue()));
				} else phvalue.put(I5CONSTANTS.upValue,null);
				
				phvalue.put(I5CONSTANTS.unit,getUnit(set.getPRECISIONCONCLOQUALIFIER().getCONCUNITValue(),
								set.getPRECISIONCONCLOQUALIFIER().getCONCUNITTXT()==null?null:
								set.getPRECISIONCONCLOQUALIFIER().getCONCUNITTXT().getValue()));
				
				
				effect.getConditions().put(I5CONSTANTS.cDoses, phvalue);

			} else {
				effect.getConditions().put(I5CONSTANTS.cDoses,null);
			}
			try{
				effect.getConditions().put(I5CONSTANTS.Remark, set.getREM().getREM().getValue());
			} catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.Remark,null);	
			}
			if (set.getPRECISIONLOQUALIFIER() != null) {
				if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
					try {
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER()
								.getLOQUALIFIERValue());						
						effect.setLoValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue());
					}
				if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
					try {
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER()
								.getUPQUALIFIERValue());						
						effect.setUpValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getUPVALUE()
								.getValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue());
					}
			}

		}
		return record;
	}
	

}
