package net.idea.i5._5.ambit2.sections.EN_BIOACCU_TERR_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord.ScientificPart.ENBIOACCUTERR.REFERENCE.Set;
import net.idea.i5.ambit2.sections.ENVFATEStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;



public class StudyRecordConverter extends ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord>{
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.EN_BIOACCU_TERR);
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
			return unmarshalled.getScientificPart().getENBIOACCUTERR().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}		
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getENBIOACCUTERR().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getENBIOACCUTERR().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getENBIOACCUTERR()==null) return null;

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
		if (sciPart.getENBIOACCUTERR().getGUIDELINE()!=null)
			for (ScientificPart.ENBIOACCUTERR.GUIDELINE.Set set : sciPart.getENBIOACCUTERR().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
							set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));

			}
		if (sciPart.getENBIOACCUTERR().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getENBIOACCUTERR().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		parseReference(unmarshalled, papp);

		try {
			papp.getParameters().put(I5CONSTANTS.cSpecies,
					getValue(sciPart.getENBIOACCUTERR().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getENBIOACCUTERR().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
			
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cSpecies,null);}		
		
		if (sciPart.getENBIOACCUTERR().getBCF()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord.ScientificPart.ENBIOACCUTERR.BCF.Set set : sciPart.getENBIOACCUTERR().getBCF().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(set.getBSAFTYPE().getBSAFTYPEValue());
				//not sure where to get concentrations from- decided to remove the field
				//effect.getConditions().put(I5CONSTANTS.cDoses,null);
				papp.addEffect(effect);
				
				try {
					String basis = set.getPHRASEOTHERBASIS().getBASISValue();
					if (basis.startsWith("other:")) basis = set.getPHRASEOTHERBASIS().getBASISTXT().getValue();
					
					effect.getConditions().put(I5CONSTANTS.cBioaccBasis,basis);
				} catch (Exception x) { effect.getConditions().put(I5CONSTANTS.cBioaccBasis,null);}				
				
				if (set.getPRECISIONBSAFLOQUALIFIER()!=null) {
					effect.setUnit(set.getPRECISIONBSAFLOQUALIFIER().getBSAFUNITValue());
					if (set.getPRECISIONBSAFLOQUALIFIER().getBSAFLOVALUE()!=null) try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONBSAFLOQUALIFIER().getBSAFLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONBSAFLOQUALIFIER().getBSAFLOQUALIFIER());
					} catch (Exception x) {}
					if (set.getPRECISIONBSAFLOQUALIFIER().getBSAFUPVALUE()!=null) try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONBSAFLOQUALIFIER().getBSAFUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONBSAFLOQUALIFIER().getBSAFUPQUALIFIER());
					} catch (Exception x) {}
				}	
				
			}
		} 		
		return record;
	}
}
