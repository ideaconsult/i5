package net.idea.i5._5.ambit2.sections.TO_DEVELOPMENTAL_SECTION;

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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_DEVELOPMENTAL_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_DEVELOPMENTAL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_DEVELOPMENTAL_SECTION.EndpointStudyRecord.ScientificPart.TODEVELOPMENTAL.GUIDELINE.Set;


public class StudyRecordConverter extends TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_DEVELOPMENTAL_SECTION.EndpointStudyRecord>{
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_DEVELOPMENTAL);
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
			return unmarshalled.getScientificPart().getTODEVELOPMENTAL().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}		
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getTODEVELOPMENTAL().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_DEVELOPMENTAL_SECTION.EndpointStudyRecord.ScientificPart.TODEVELOPMENTAL.REFERENCE.Set set : unmarshalled.getScientificPart().getTODEVELOPMENTAL().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_DEVELOPMENTAL_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTODEVELOPMENTAL()==null) return null;
		
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

		if (sciPart.getTODEVELOPMENTAL().getGUIDELINE()!=null)
			for (Set set : sciPart.getTODEVELOPMENTAL().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
		if (sciPart.getTODEVELOPMENTAL().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTODEVELOPMENTAL().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		parseReference(unmarshalled, papp);
		//papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());

		try {
			papp.getParameters().put(I5CONSTANTS.cSpecies,
					getValue(sciPart.getTODEVELOPMENTAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getTODEVELOPMENTAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cSpecies,null);}		

		try {
			papp.getParameters().put(I5CONSTANTS.cRouteAdm,
					getValue(sciPart.getTODEVELOPMENTAL().getROUTE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getTODEVELOPMENTAL().getROUTE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cRouteAdm,null);}		
		
		StringBuilder doses = null;
		if (sciPart.getTODEVELOPMENTAL().getDOSES()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_DEVELOPMENTAL_SECTION.EndpointStudyRecord.ScientificPart.TODEVELOPMENTAL.DOSES.Set set : sciPart.getTODEVELOPMENTAL().getDOSES().getSet()) {
			if (doses==null) doses = new StringBuilder();
			else doses.append(";");
			doses.append(set.getCONCENTRATIONS().getCONCENTRATIONS().getValue());
		}
		papp.getParameters().put(I5CONSTANTS.cDoses,doses==null?null:doses.toString());
		// endpoint
		// effect level
		if (sciPart.getTODEVELOPMENTAL().getEFFLEVEL() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_DEVELOPMENTAL_SECTION.EndpointStudyRecord.ScientificPart.TODEVELOPMENTAL.EFFLEVEL.Set set : sciPart.getTODEVELOPMENTAL().getEFFLEVEL().getSet()) {
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
				
				try {
					effect.getConditions().put(I5CONSTANTS.cEffectType,
							getValue(set.getPHRASEOTHEREFFECTTYPE().getEFFECTTYPEValue()
									,
									set.getPHRASEOTHEREFFECTTYPE().getEFFECTTYPETXT()
									));
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.cEffectType,null);
				}
			}
		papp.setInterpretationResult(null); 
		papp.setInterpretationCriteria(null); 
		return record;
	}
}
