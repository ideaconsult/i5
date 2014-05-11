package net.idea.i5._5.ambit2.sections.TO_ACUTE_INHAL_SECTION;

import net.idea.i5._5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_INHAL_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_INHAL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_INHAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEINHAL.GUIDELINE.Set;


public class StudyRecordConverter extends TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_INHAL_SECTION.EndpointStudyRecord>{
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_ACUTE_INHAL);
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
			return unmarshalled.getScientificPart().getTOACUTEINHAL().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}		
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getTOACUTEINHAL().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_INHAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEINHAL.REFERENCE.Set set : unmarshalled.getScientificPart().getTOACUTEINHAL().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_INHAL_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOACUTEINHAL()==null) return null;
		
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

		if (sciPart.getTOACUTEINHAL().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOACUTEINHAL().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
		if (sciPart.getTOACUTEINHAL().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOACUTEINHAL().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		
		// year
		parseReference(unmarshalled, papp);
		papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());

		// Acute tox oral
		try {
			papp.getParameters().put(I5CONSTANTS.cSpecies,
					getValue(sciPart.getTOACUTEINHAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
							sciPart.getTOACUTEINHAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()));
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cSpecies,null);}
		
		// Sex
		try {
			papp.getParameters().put(I5CONSTANTS.cSex,
					sciPart.getTOACUTEINHAL().getSEX()==null?null:
					sciPart.getTOACUTEINHAL().getSEX().getSet().getLISTBELOWPOP().getLISTBELOWPOPValue());
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cSex,null);}
		// endpoint
		// effect level
		if (sciPart.getTOACUTEINHAL().getEFFLEVEL() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_INHAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEINHAL.EFFLEVEL.Set set : sciPart.getTOACUTEINHAL().getEFFLEVEL().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				try {effect.setEndpoint(set.getPHRASEOTHERENDPOINT().getENDPOINTValue());} catch (Exception x) {}
				effect.setConditions(new Params());
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
		if (sciPart.getTOACUTEINHAL().getINTERPRETRSSUBMITTER() != null) {
			String otherValue = null;
			try { 
				otherValue = sciPart.getTOACUTEINHAL().getINTERPRETRSSUBMITTER().getSet().
					getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXTXT().getValue();
			} catch (Exception x) {
			};
			
			setInterpretationResult(papp, 
					sciPart.getTOACUTEINHAL().getINTERPRETRSSUBMITTER().getSet()
					.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue(),
					otherValue
			);

		} else setInterpretationResult(papp,null,null);
		
		if (sciPart.getTOACUTEINHAL().getCRITERIASUBMITTER() != null) {
			papp.setInterpretationCriteria( 
					sciPart.getTOACUTEINHAL().getCRITERIASUBMITTER()
					.getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} else papp.setInterpretationCriteria(""); 

		return record;
	}
}
