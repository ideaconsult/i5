package net.idea.i5._5.ambit2.sections.PC_BOILING_SECTION;

import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart.PCBOILING.REFERENCE.Set;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.PC_BOILING);
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
			return unmarshalled.getScientificPart().getPCBOILING().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
			
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getPCBOILING().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getPCBOILING().getREFERENCE().getSet()) {
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
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCBOILING()==null) return null;

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
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCBOILING().getGUIDELINE() != null)
			for (ScientificPart.PCBOILING.GUIDELINE.Set set : sciPart.getPCBOILING().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {}
		if (sciPart.getPCBOILING().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCBOILING().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		if (sciPart.getPCBOILING().getBOILINGPT()!=null && sciPart.getPCBOILING().getBOILINGPT().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_BOILING_SECTION.EndpointStudyRecord.ScientificPart.PCBOILING.BOILINGPT.Set set : sciPart.getPCBOILING().getBOILINGPT().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(I5CONSTANTS.BOILINGPOINT);
			effect.setConditions(new Params());
			papp.addEffect(effect);
			try {
				effect.getConditions().put(I5CONSTANTS.rDECOMPOSITION,	set.getPHRASEOTHERDECOMPINDICATOR().getDECOMPINDICATORValue());
			}  catch (Exception x) {
				effect.getConditions().put(I5CONSTANTS.rDECOMPOSITION,null);
			}
			
			
			if (set.getPRECISIONPRESSURELOQUALIFIER() != null) {
				/* Change to go like this
				"conditions":	{"pH": {"loValue" : 4},"Temperature":"25 C"},
				*/
				Params vpvalue = new Params();
				if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOVALUE()!= null) {
					vpvalue.put(I5CONSTANTS.loQualifier,
							(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue() == null) ? null : 
							set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue());
					vpvalue.put(I5CONSTANTS.loValue,getNumber(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOVALUE().getValue()));
				} else vpvalue.put(I5CONSTANTS.loValue, null);
				
				if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE()!= null) {
					vpvalue.put(I5CONSTANTS.upQualifier,
							(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPQUALIFIER() == null) ? null : 
							set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPQUALIFIERValue());					
					vpvalue.put(I5CONSTANTS.upValue,getNumber(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE().getValue()));
				} else vpvalue.put(I5CONSTANTS.upValue, null);
				vpvalue.put(I5CONSTANTS.unit,set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUNITValue());
				effect.getConditions().put(I5CONSTANTS.AtmPressure, vpvalue);

			} else {
				effect.getConditions().put(I5CONSTANTS.AtmPressure,null);
			}

			
			if (set.getPRECISIONLOQUALIFIER() != null) {
				effect.setUnit(set.getPRECISIONLOQUALIFIER().getUNITValue());
				if (set.getPRECISIONLOQUALIFIER().getLOVALUE() != null)
					try {
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER()
								.getLOQUALIFIERValue());						
						effect.setLoValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue());
					}
				if (set.getPRECISIONLOQUALIFIER().getUPVALUE() != null)
					try {
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER()
								.getUPQUALIFIERValue());						
						effect.setUpValue(Double.parseDouble(set
								.getPRECISIONLOQUALIFIER().getUPVALUE()
								.getValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONLOQUALIFIER().getLOVALUE()
								.getValue());
					}
			}
		}

		return record;
	}
	

}
