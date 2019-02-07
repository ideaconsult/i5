package net.idea.i5._4.ambit2.sections.EN_BIOACCUMULATION_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_BIOACCUMULATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_BIOACCUMULATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_BIOACCUMULATION_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_BIOACCUMULATION_SECTION.EndpointStudyRecord.ScientificPart.ENBIOACCUMULATION.REFERENCE.Set;
import net.idea.i5.ambit2.sections.ENVFATEStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;



public class StudyRecordConverter extends ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_BIOACCUMULATION_SECTION.EndpointStudyRecord>{
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.EN_BIOACCUMULATION);
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
			return unmarshalled.getScientificPart().getENBIOACCUMULATION().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getENBIOACCUMULATION().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getENBIOACCUMULATION().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_BIOACCUMULATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getENBIOACCUMULATION()==null) return null;

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
		if (sciPart.getENBIOACCUMULATION().getGUIDELINE()!=null)
			for (ScientificPart.ENBIOACCUMULATION.GUIDELINE.Set set : sciPart.getENBIOACCUMULATION().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
							set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));

			}
		if (sciPart.getENBIOACCUMULATION().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getENBIOACCUMULATION().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		parseReference(unmarshalled, papp);
		
		try {
			papp.getParameters().put(I5CONSTANTS.cSpecies,
					getValue(sciPart.getENBIOACCUMULATION().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getENBIOACCUMULATION().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cSpecies,null);}			
		
		try {
			papp.getParameters().put(I5CONSTANTS.cRoute,sciPart.getENBIOACCUMULATION().getROUTE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cRoute,null);}
		
		if (sciPart.getENBIOACCUMULATION().getBCF()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.EN_BIOACCUMULATION_SECTION.EndpointStudyRecord.ScientificPart.ENBIOACCUMULATION.BCF.Set set : sciPart.getENBIOACCUMULATION().getBCF().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				try {effect.setEndpoint(set.getPHRASEOTHERTYPE().getTYPEValue());} catch (Exception x) {}
				papp.addEffect(effect);
				
				try {
					effect.getConditions().put(I5CONSTANTS.cRoute,sciPart.getENBIOACCUMULATION().getROUTE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
				} catch (Exception x) { effect.getConditions().put(I5CONSTANTS.cRoute,null);}

				
				try {
					effect.getConditions().put(I5CONSTANTS.cBioaccBasis,
							getValue(set.getPHRASEOTHERBASIS().getBASISValue(), set.getPHRASEOTHERBASIS().getBASISTXT()));
				} catch (Exception x) { effect.getConditions().put(I5CONSTANTS.cBioaccBasis,null);}
				try {
					effect.getConditions().put(I5CONSTANTS.cDoses,set.getCONCLEVEL().getCONCLEVEL().getValue());
				} catch (Exception x) { effect.getConditions().put(I5CONSTANTS.cDoses,null);}
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					effect.setUnit(getUnit(set.getPRECISIONLOQUALIFIER().getUNITValue(),
							set.getPRECISIONLOQUALIFIER().getUNITTXT()==null?null:
							set.getPRECISIONLOQUALIFIER().getUNITTXT().getValue()));
					
					if (set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue()!=null) try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					} catch (Exception x) {}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					} catch (Exception x) {}
				}	
				
			}
		} else {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.eBCF);
			papp.addEffect(effect);
			effect.getConditions().put(I5CONSTANTS.cBioaccBasis,null);
			effect.getConditions().put(I5CONSTANTS.cDoses,null);
		}
		return record;
	}
}
