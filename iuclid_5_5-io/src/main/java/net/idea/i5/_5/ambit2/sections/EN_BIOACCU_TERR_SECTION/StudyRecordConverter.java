package net.idea.i5._5.ambit2.sections.EN_BIOACCU_TERR_SECTION;

import net.idea.i5._5.ambit2.sections.ENVFATEStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord.ScientificPart.ENBIOACCUTERR.REFERENCE.Set;



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
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getENBIOACCUTERR()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),
				unmarshalled.getStudyResultType().getValueID()
			);
		record.addtMeasurement(papp);
	
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		if (sciPart.getENBIOACCUTERR().getGUIDELINE()!=null)
			for (ScientificPart.ENBIOACCUTERR.GUIDELINE.Set set : sciPart.getENBIOACCUTERR().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getENBIOACCUTERR().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getENBIOACCUTERR().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		if (sciPart.getENBIOACCUTERR().getREFERENCE() != null)
			for (Set set : sciPart
					.getENBIOACCUTERR().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}		
		try {
			papp.getParameters().put(cSpecies,sciPart.getENBIOACCUTERR().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} catch (Exception x) {
			papp.getParameters().put(cSpecies,null);
		}
		
		if (sciPart.getENBIOACCUTERR().getBCF()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_BIOACCU_TERR_SECTION.EndpointStudyRecord.ScientificPart.ENBIOACCUTERR.BCF.Set set : sciPart.getENBIOACCUTERR().getBCF().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint(set.getBSAFTYPE().getBSAFTYPEValue());
				effect.setConditions(new Params());
				papp.addEffect(effect);
				
				try {
					effect.getConditions().put(BioaccBasis,set.getPHRASEOTHERBASIS().getBASISTXT().getValue());
				} catch (Exception x) {
					effect.getConditions().put(BioaccBasis,null);
				}
				
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
