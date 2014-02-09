package net.idea.i5._5.ambit2.sections.GI_GENERAL_INFORM_SECTION;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart.GIGENERALINFORM.REFERENCE.Set;

public class StudyRecordConverter extends PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord> {

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.GI_GENERAL_INFORM);
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
			return unmarshalled.getScientificPart().getGIGENERALINFORM().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getGIGENERALINFORM().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getGIGENERALINFORM().getREFERENCE().getSet()) {
				try {
					if (set.getREFERENCEAUTHOR()!=null)
						papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
					if (set.getREFERENCEYEAR()!=null) try {
						papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
					} catch (Exception x) {}
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getGIGENERALINFORM()==null) return null;

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
		if (sciPart.getGIGENERALINFORM().getSUBSTANCEPHYSICALSTATE()!=null && sciPart.getGIGENERALINFORM().getSUBSTANCEPHYSICALSTATE().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart.GIGENERALINFORM.SUBSTANCEPHYSICALSTATE.Set set : sciPart.getGIGENERALINFORM().getSUBSTANCEPHYSICALSTATE().getSet()) {
			if (physstate==null) physstate = new StringBuilder(); else physstate.append(" ");
			physstate.append(set.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		}
		
		StringBuilder form = null;
		if (sciPart.getGIGENERALINFORM().getFORM()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.GI_GENERAL_INFORM_SECTION.EndpointStudyRecord.ScientificPart.GIGENERALINFORM.FORM.Set set : sciPart.getGIGENERALINFORM().getFORM().getSet()) {
			if (form==null) form= new StringBuilder(); else form.append(" ");
			form.append(set.getPHRASEOTHERLISTPOP().getLISTPOPValue());
		}

		EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
		effect.setEndpoint(physstate==null?null:physstate.toString());
		effect.setConditions(new Params());
		effect.getConditions().put(Remark,form==null?null:form.toString());
		papp.addEffect(effect);
		try {
		papp.setInterpretationResult(sciPart.getGIGENERALINFORM().getSUBSTANCETYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} catch (Exception x) {papp.setInterpretationResult("");}

		return record;
	}
	

}
