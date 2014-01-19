package net.idea.i5._5.ambit2.sections.TO_SKIN_IRRITATION_SECTION;

import net.idea.i5._5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart.TOSKINIRRITATION.GUIDELINE.Set;


public class StudyRecordConverter extends TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord>{
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_SKIN_IRRITATION);
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOSKINIRRITATION()==null) return null;
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
					unmarshalled.getDocumentReferencePK(),
					unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file

		if (sciPart.getTOSKINIRRITATION().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOSKINIRRITATION().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {}
		if (sciPart.getTOSKINIRRITATION().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOSKINIRRITATION().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		
		// year
		papp.getParameters().put(cYear,null);
		if (sciPart.getTOSKINIRRITATION().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SKIN_IRRITATION_SECTION.EndpointStudyRecord.ScientificPart.TOSKINIRRITATION.REFERENCE.Set set : sciPart
					.getTOSKINIRRITATION().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null && set.getREFERENCEYEAR().getREFERENCEYEAR()!=null) {
					papp.getParameters().put(cYear,set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				} else papp.getParameters().put(cYear,null);
			}

		// Skin irritation/corrosion
		
		papp.getParameters().put(cSpecies,
					sciPart.getTOSKINIRRITATION().getORGANISM()==null?null:
					sciPart.getTOSKINIRRITATION().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		
		papp.getParameters().put(cTypeMethod,
				sciPart.getTOSKINIRRITATION().getTYPEINVIVOINVITRO()==null?null:
				sciPart.getTOSKINIRRITATION().getTYPEINVIVOINVITRO().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		
		if (sciPart.getTOSKINIRRITATION().getINTERPRETRSSUBMITTER() != null) {
			papp.setInterpretationResult( 
					sciPart.getTOSKINIRRITATION().getINTERPRETRSSUBMITTER().getSet()
					.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		} else papp.setInterpretationResult(null); 
		if (sciPart.getTOSKINIRRITATION().getCRITERIASUBMITTER() != null) {
			papp.setInterpretationCriteria( 
					sciPart.getTOSKINIRRITATION().getCRITERIASUBMITTER()
					.getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} else papp.setInterpretationCriteria("");
		return record;
	}
}
