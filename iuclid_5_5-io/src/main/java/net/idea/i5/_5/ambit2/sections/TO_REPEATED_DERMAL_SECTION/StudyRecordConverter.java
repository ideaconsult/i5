package net.idea.i5._5.ambit2.sections.TO_REPEATED_DERMAL_SECTION;

import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5._5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_DERMAL_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_DERMAL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_DERMAL_SECTION.EndpointStudyRecord.ScientificPart.TOREPEATEDDERMAL.GUIDELINE.Set;


public class StudyRecordConverter extends TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_DERMAL_SECTION.EndpointStudyRecord>{
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_REPEATED_DERMAL);
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
			return unmarshalled.getScientificPart().getTOREPEATEDDERMAL().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}		
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getTOREPEATEDDERMAL().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_DERMAL_SECTION.EndpointStudyRecord.ScientificPart.TOREPEATEDDERMAL.REFERENCE.Set set : unmarshalled.getScientificPart().getTOREPEATEDDERMAL().getREFERENCE().getSet()) {
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
		else qax = new QACriteriaException("Empty reference!");
		if (qax!=null) throw qax;
	}			
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_DERMAL_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOREPEATEDDERMAL()==null) return null;
		
		record.clear();
		Experiment<IParams, IParams> papp = createProtocolApplication(
					unmarshalled.getDocumentReferencePK(),
					unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled));
		record.addMeasurement(papp);
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file

		if (sciPart.getTOREPEATEDDERMAL().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOREPEATEDDERMAL().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
		if (sciPart.getTOREPEATEDDERMAL().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOREPEATEDDERMAL().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// year
		
		parseReference(unmarshalled, papp);
		//papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());
		
		try {
			String medium = sciPart.getTOREPEATEDDERMAL().getTYPECOVERAGE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue();
			if (medium.startsWith("other:")) medium = sciPart.getTOREPEATEDDERMAL().getTYPECOVERAGE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT().getValue();
			papp.getParameters().put(I5CONSTANTS.cTypeCoverage,medium);
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cTypeCoverage,null);	
		}
		try {
			papp.getParameters().put(I5CONSTANTS.cSpecies,
					getValue(sciPart.getTOREPEATEDDERMAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getTOREPEATEDDERMAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cSpecies,null);}

		try {
			papp.getParameters().put(I5CONSTANTS.cTestType,
					getValue(
					sciPart.getTOREPEATEDDERMAL().getTESTTYPETOX().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
					sciPart.getTOREPEATEDDERMAL().getTESTTYPETOX().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()
					));
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cTestType,null);}
		
		/*
		try {
			papp.getParameters().put(cRouteAdm,
					sciPart.getTOREPEATEDDERMAL().getROUTE()==null?null:
					sciPart.getTOREPEATEDDERMAL().getROUTE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} catch (Exception x) { papp.getParameters().put(cRouteAdm,null);}
		*/		
		
		StringBuilder doses = null;
		if ( sciPart.getTOREPEATEDDERMAL().getDOSES()!=null &&  sciPart.getTOREPEATEDDERMAL().getDOSES().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_DERMAL_SECTION.EndpointStudyRecord.ScientificPart.TOREPEATEDDERMAL.DOSES.Set set : sciPart.getTOREPEATEDDERMAL().getDOSES().getSet()) {
			if (doses==null) doses = new StringBuilder();
			else doses.append(";");
			doses.append(set.getCONCENTRATIONS().getCONCENTRATIONS().getValue());
		}
		papp.getParameters().put(I5CONSTANTS.cDoses,doses==null?null:doses.toString());
		// endpoint
		// effect level
		if (sciPart.getTOREPEATEDDERMAL().getEFFLEVEL() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_REPEATED_DERMAL_SECTION.EndpointStudyRecord.ScientificPart.TOREPEATEDDERMAL.EFFLEVEL.Set set : sciPart.getTOREPEATEDDERMAL().getEFFLEVEL().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				try {
					effect.setEndpoint(getValue(
						set.getPHRASEOTHERENDPOINT().getENDPOINTValue(),
						set.getPHRASEOTHERENDPOINT().getENDPOINTTXT()
						));
				} catch (Exception x) {effect.setEndpoint(null);}
				papp.addEffect(effect);
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					effect.setUnit(getUnit(set.getPRECISIONLOQUALIFIER().getUNITValue(),
							set.getPRECISIONLOQUALIFIER().getUNITTXT()==null?null:
							set.getPRECISIONLOQUALIFIER().getUNITTXT().getValue()));
					
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					} catch (Exception x) {}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					} catch (Exception x) {}
				}
				
				effect.getConditions().put(I5CONSTANTS.cSex,set.getSEX()==null?null:set.getSEX().getSEXValue());

			}
		papp.setInterpretationResult(null); 
		papp.setInterpretationCriteria(null); 
		return record;
	}
}
