package net.idea.i5._5.ambit2.sections.GI_GENERAL_INFORM_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart.GIGENERALINFORM.REFERENCE.Set;

public class StudyRecordConverter extends	AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord> {

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getGIGENERALINFORM()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"P-CHEM","GI_GENERAL_INFORM_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		if (sciPart.getGIGENERALINFORM().getREFERENCE() != null)
			for (Set set : sciPart.getGIGENERALINFORM().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getGIGENERALINFORM().getGUIDELINE() != null)
			for (ScientificPart.GIGENERALINFORM.GUIDELINE.Set set : sciPart
					.getGIGENERALINFORM().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getGIGENERALINFORM().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getGIGENERALINFORM().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}
		
		StringBuilder physstate = null;
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart.GIGENERALINFORM.SUBSTANCEPHYSICALSTATE.Set set : sciPart.getGIGENERALINFORM().getSUBSTANCEPHYSICALSTATE().getSet()) {
			if (physstate==null) physstate = new StringBuilder(); else physstate.append(" ");
			physstate.append(set.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		}
		StringBuilder form = null;
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart.GIGENERALINFORM.FORM.Set set : sciPart.getGIGENERALINFORM().getFORM().getSet()) {
			if (form==null) form= new StringBuilder(); else form.append(" ");
			form.append(set.getPHRASEOTHERLISTPOP().getLISTPOPValue());
		}

		EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
		effect.setEndpoint(Physstate==null?null:physstate.toString());
		effect.setConditions(new Params());
		effect.getConditions().put(Remark,form==null?null:form.toString());
		papp.addEffect(effect);
		papp.setInterpretationResult(sciPart.getGIGENERALINFORM().getSUBSTANCETYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());

		return record;
	}
	

}
