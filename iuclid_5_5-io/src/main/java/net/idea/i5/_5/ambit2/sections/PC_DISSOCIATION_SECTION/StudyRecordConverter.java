package net.idea.i5._5.ambit2.sections.PC_DISSOCIATION_SECTION;

import net.idea.i5._5.ambit2.QACriteriaException;
import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart.PCDISSOCIATION.REFERENCE.Set;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.PC_DISSOCIATION);
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
			return unmarshalled.getScientificPart().getPCDISSOCIATION().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}		
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getPCDISSOCIATION().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getPCDISSOCIATION().getREFERENCE().getSet()) {
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
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCDISSOCIATION()==null) return null;

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

		
		if (sciPart.getPCDISSOCIATION().getGUIDELINE() != null)
			for (ScientificPart.PCDISSOCIATION.GUIDELINE.Set set : sciPart
					.getPCDISSOCIATION().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getPCDISSOCIATION().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCDISSOCIATION().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		if (sciPart.getPCDISSOCIATION().getPKA()!=null && sciPart.getPCDISSOCIATION().getPKA().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_DISSOCIATION_SECTION.EndpointStudyRecord.ScientificPart.PCDISSOCIATION.PKA.Set set : sciPart.getPCDISSOCIATION().getPKA().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(pKa);
			effect.setConditions(new Params());
			papp.addEffect(effect);

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
			

			if (set.getPRECISIONVALUELOQUALIFIER() != null) {
				if (set.getPRECISIONVALUELOQUALIFIER().getVALUELOVALUE() != null)
					try {
						effect.setLoQualifier(set.getPRECISIONVALUELOQUALIFIER().getVALUELOQUALIFIER());
						effect.setLoValue(Double.parseDouble(set
								.getPRECISIONVALUELOQUALIFIER().getVALUELOQUALIFIERValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONVALUELOQUALIFIER().getVALUELOQUALIFIERValue());
					}
				if (set.getPRECISIONVALUELOQUALIFIER().getVALUEUPVALUE() != null)
					try {
						effect.setUpQualifier(set.getPRECISIONVALUELOQUALIFIER().getVALUEUPQUALIFIER());						
						effect.setUpValue(Double.parseDouble(set
								.getPRECISIONVALUELOQUALIFIER().getVALUEUPQUALIFIERValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONVALUELOQUALIFIER().getVALUEUPQUALIFIERValue());
					}
			}
		}

		return record;
	}

}
