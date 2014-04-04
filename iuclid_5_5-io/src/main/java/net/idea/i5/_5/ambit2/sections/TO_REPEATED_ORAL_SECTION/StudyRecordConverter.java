package net.idea.i5._5.ambit2.sections.TO_REPEATED_ORAL_SECTION;

import net.idea.i5._5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_ORAL_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_ORAL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOREPEATEDORAL.GUIDELINE.Set;


public class StudyRecordConverter extends TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_ORAL_SECTION.EndpointStudyRecord>{
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_REPEATED_ORAL);
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
			return unmarshalled.getScientificPart().getTOREPEATEDORAL().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}		
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getTOREPEATEDORAL().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOREPEATEDORAL.REFERENCE.Set set : unmarshalled.getScientificPart().getTOREPEATEDORAL().getREFERENCE().getSet()) {
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
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_ORAL_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOREPEATEDORAL()==null) return null;
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
					unmarshalled.getDocumentReferencePK(),
					unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled));
		record.addtMeasurement(papp);
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file

		if (sciPart.getTOREPEATEDORAL().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOREPEATEDORAL().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {}
		if (sciPart.getTOREPEATEDORAL().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOREPEATEDORAL().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		
		// year
		
		parseReference(unmarshalled, papp);
		papp.getParameters().put(cYear,papp.getReferenceYear());

		// Repeated tox oral
		papp.getParameters().put(cSpecies,
					sciPart.getTOREPEATEDORAL().getORGANISM()==null?null:
					sciPart.getTOREPEATEDORAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		
		try {
			papp.getParameters().put(cRouteAdm,
					sciPart.getTOREPEATEDORAL().getROUTE()==null?null:
					sciPart.getTOREPEATEDORAL().getROUTE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} catch (Exception x) { papp.getParameters().put(cRouteAdm,null);}		
		
		try {
			papp.getParameters().put(cTestType,
					sciPart.getTOREPEATEDORAL().getTESTTYPETOX().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} catch (Exception x) { papp.getParameters().put(cTestType,null);}
		
		
		StringBuilder doses = null;
		if (sciPart.getTOREPEATEDORAL().getDOSES()!=null && sciPart.getTOREPEATEDORAL().getDOSES().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOREPEATEDORAL.DOSES.Set set : sciPart.getTOREPEATEDORAL().getDOSES().getSet()) try {
			String value = set.getCONCENTRATIONS().getCONCENTRATIONS().getValue();
			if (doses==null) doses = new StringBuilder();
			else doses.append(";");
			doses.append(value);
		} catch (Exception x) {}
		
		papp.getParameters().put(cDoses,doses==null?null:doses.toString());
		// endpoint
		// effect level
		if (sciPart.getTOREPEATEDORAL().getEFFLEVEL() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOREPEATEDORAL.EFFLEVEL.Set set : sciPart.getTOREPEATEDORAL().getEFFLEVEL().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				try {effect.setEndpoint(set.getPHRASEOTHERENDPOINT().getENDPOINTValue());} catch (Exception x) {}
				effect.setConditions(new Params());
				papp.addEffect(effect);
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					effect.setUnit(set.getPRECISIONLOQUALIFIER().getUNITValue());
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					} catch (Exception x) {}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					} catch (Exception x) {}
				}
				
				effect.getConditions().put(cSex,set.getSEX()==null?null:set.getSEX().getSEXValue());

			}
		papp.setInterpretationResult(null); 
		papp.setInterpretationCriteria(null); 
		return record;
	}
}
