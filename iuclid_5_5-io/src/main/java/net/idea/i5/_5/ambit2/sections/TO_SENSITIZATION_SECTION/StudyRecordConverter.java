package net.idea.i5._5.ambit2.sections.TO_SENSITIZATION_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SENSITIZATION_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord.ScientificPart.TOSENSITIZATION.GUIDELINE.Set;


public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord>{
	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOSENSITIZATION()==null) return null;
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
					unmarshalled.getDocumentReferencePK(),
					unmarshalled.getName(),"TOX","TO_SENSITIZATION_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file

		if (sciPart.getTOSENSITIZATION().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOSENSITIZATION().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getTOSENSITIZATION().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOSENSITIZATION().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		
		// year
		if (sciPart.getTOSENSITIZATION().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_SENSITIZATION_SECTION.EndpointStudyRecord.ScientificPart.TOSENSITIZATION.REFERENCE.Set set : sciPart
					.getTOSENSITIZATION().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.getParameters().put(cYear,set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				} else papp.getParameters().put(cYear,null);
			}

		// Sensitization
		/*
		papp.getParameters().put(cSpecies,
					sciPart.getTOSENSITIZATION().getORGANISM()==null?null:
					sciPart.getTOSENSITIZATION().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		*/
		papp.getParameters().put(cTypeMethod,
				sciPart.getTOSENSITIZATION().getTYPEINVIVOINVITRO()==null?null:
				sciPart.getTOSENSITIZATION().getTYPEINVIVOINVITRO().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		
		papp.getParameters().put(cTypeStudy,
				sciPart.getTOSENSITIZATION().getSTUDYTYPE()==null?null:
				sciPart.getTOSENSITIZATION().getSTUDYTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		
		
		if (sciPart.getTOSENSITIZATION().getINTERPRETRSSUBMITTER() != null) {
			papp.setInterpretationResult( 
					sciPart.getTOSENSITIZATION().getINTERPRETRSSUBMITTER().getSet()
					.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		}
		if (sciPart.getTOSENSITIZATION().getCRITERIASUBMITTER() != null) {
			papp.setInterpretationCriteria( 
					sciPart.getTOSENSITIZATION().getCRITERIASUBMITTER()
					.getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		}
		return record;
	}
}
