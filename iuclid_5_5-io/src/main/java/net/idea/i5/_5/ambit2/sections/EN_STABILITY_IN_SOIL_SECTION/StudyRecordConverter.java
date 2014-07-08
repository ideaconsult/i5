package net.idea.i5._5.ambit2.sections.EN_STABILITY_IN_SOIL_SECTION;

import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5._5.ambit2.sections.ENVFATEStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_STABILITY_IN_SOIL_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_STABILITY_IN_SOIL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_STABILITY_IN_SOIL_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_STABILITY_IN_SOIL_SECTION.EndpointStudyRecord.ScientificPart.ENSTABILITYINSOIL.REFERENCE.Set;



public class StudyRecordConverter extends ENVFATEStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_STABILITY_IN_SOIL_SECTION.EndpointStudyRecord>{
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.EN_STABILITY_IN_SOIL);
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
			return unmarshalled.getScientificPart().getENSTABILITYINSOIL().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getENSTABILITYINSOIL().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getENSTABILITYINSOIL().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_STABILITY_IN_SOIL_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getENSTABILITYINSOIL()==null) return null;

		record.clear();
		Experiment<IParams, IParams> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),
				unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled)
			);
		record.addMeasurement(papp);
	
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		if (sciPart.getENSTABILITYINSOIL().getGUIDELINE()!=null)
			for (ScientificPart.ENSTABILITYINSOIL.GUIDELINE.Set set : sciPart.getENSTABILITYINSOIL().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
							set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));

			}
		if (sciPart.getENSTABILITYINSOIL().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getENSTABILITYINSOIL().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		parseReference(unmarshalled, papp);	

		//TEST TYPE
		papp.getParameters().put(I5CONSTANTS.cTestType,
				sciPart.getENSTABILITYINSOIL().getOXYGENCONDITIONS()==null?null:
				sciPart.getENSTABILITYINSOIL().getOXYGENCONDITIONS().getSet().getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());

		Params soil = new Params();
		
		if (sciPart.getENSTABILITYINSOIL().getPROP()!=null) 
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_STABILITY_IN_SOIL_SECTION.EndpointStudyRecord.ScientificPart.ENSTABILITYINSOIL.PROP.Set set : sciPart.getENSTABILITYINSOIL().getPROP().getSet()){
			Params p = new Params();
			p.put(I5CONSTANTS.cSoilType,set.getPHRASEOTHERSOILTYPE()==null?null:set.getPHRASEOTHERSOILTYPE().getSOILTYPEValue());
			
			Params v = new Params();
			try {
				v.setLoQualifier(set.getPRECISIONCARBONLOQUALIFIER().getCARBONLOQUALIFIERValue());
			} catch (Exception x) {}
			try {
				v.setLoValue(set.getPRECISIONCARBONLOQUALIFIER().getCARBONLOVALUE().getValue());
			} catch (Exception x) {v.setLoValue(null);}
			try {
				v.setUpQualifier(set.getPRECISIONCARBONLOQUALIFIER().getCARBONUPQUALIFIERValue());
			} catch (Exception x) {}
			try {
				v.setUpValue(set.getPRECISIONCARBONLOQUALIFIER().getCARBONUPVALUE().getValue());
			} catch (Exception x) {v.setUpValue(null);}
			try {
				v.setUnits("%");
			} catch (Exception x) {v.setUnits(null);}
			p.put(I5CONSTANTS.cOCContent, v);
			
			if (set.getSOILNUMBER()!=null && set.getSOILNUMBER().getSOILNUMBERValue()!=null) {
				p.put(I5CONSTANTS.cSoilNo, set.getSOILNUMBER().getSOILNUMBERValue());
				soil.put(set.getSOILNUMBER().getSOILNUMBERValue(),p);
			}
		}
			

		if (sciPart.getENSTABILITYINSOIL().getHALFLIFE()!=null) 
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EN_STABILITY_IN_SOIL_SECTION.EndpointStudyRecord.ScientificPart.ENSTABILITYINSOIL.HALFLIFE.Set set : sciPart.getENSTABILITYINSOIL().getHALFLIFE().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				try {
					effect.setEndpoint(getValue(set.getPHRASEOTHERTYPE().getTYPEValue(),set.getPHRASEOTHERTYPE().getTYPETXT()));
				} catch (Exception x) {effect.setEndpoint(null);}
				
				papp.addEffect(effect);
				try {
					IParams soilno = (Params)soil.get(set.getSOILNUMBER().getSOILNUMBERValue());
					effect.getConditions().putAll(soilno);
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.cSoilNo,null);
				}
				
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
				
			}
		return record;
	}
}
