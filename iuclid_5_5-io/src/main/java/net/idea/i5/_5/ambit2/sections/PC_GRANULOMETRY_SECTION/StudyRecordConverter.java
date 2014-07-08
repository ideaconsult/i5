package net.idea.i5._5.ambit2.sections.PC_GRANULOMETRY_SECTION;

import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
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
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ZETA_POTENTIAL_SECTION.DocumentTypeType;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord,IParams,IParams> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.PC_GRANULOMETRY);
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
			return unmarshalled.getScientificPart().getPCGRANULOMETRY().getTESTMATINDICATOR().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getPCGRANULOMETRY().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord.ScientificPart.PCGRANULOMETRY.REFERENCE.Set set : unmarshalled.getScientificPart().getPCGRANULOMETRY().getREFERENCE().getSet()) {
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
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCGRANULOMETRY()==null) return null;

		record.clear();
		Experiment<IParams, IParams> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled));
		record.addMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		parseReference(unmarshalled, papp);			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCGRANULOMETRY().getGUIDELINE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord.ScientificPart.PCGRANULOMETRY.GUIDELINE.Set set : sciPart.getPCGRANULOMETRY().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
		if (sciPart.getPCGRANULOMETRY().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCGRANULOMETRY().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		try {
			papp.getParameters().put(I5CONSTANTS.pTESTMAT_FORM,
			sciPart.getPCGRANULOMETRY().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pTESTMAT_FORM,null);
		}
		try {
			String value = sciPart.getPCGRANULOMETRY().getDISTRIBUTIONTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue();
			if ("other:".equals(value)) try {
				value = sciPart.getPCGRANULOMETRY().getDISTRIBUTIONTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT().getValue();
			} catch (Exception x) {}	
			papp.getParameters().put(I5CONSTANTS.pDISTRIBUTION_TYPE,value);
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pDISTRIBUTION_TYPE,null);
		}
		
		//Mass median diametrer
		if (sciPart.getPCGRANULOMETRY().getDIAMETER()!=null) { 
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.pMMD);
			effect.getConditions().put(I5CONSTANTS.rSTD_DEV,new Params(null));
			effect.getConditions().put(I5CONSTANTS.cSEQ_NUM,new Params(null));
			effect.getConditions().put(I5CONSTANTS.Remark,new Params(null));
			papp.addEffect(effect);
			try {
				effect.setLoQualifier(sciPart.getPCGRANULOMETRY().getDIAMETER().getSet().getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
			} catch (Exception x) {}
			try {
				effect.setUpQualifier(sciPart.getPCGRANULOMETRY().getDIAMETER().getSet().getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
			} catch (Exception x) {}
			try {
				Object v = getNumber(sciPart.getPCGRANULOMETRY().getDIAMETER().getSet().getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
				if (v instanceof Double) effect.setLoValue(((Double)v).doubleValue());
				else effect.setTextValue(v.toString());
			} catch (Exception x) {}
			try {
				Object v = getNumber(sciPart.getPCGRANULOMETRY().getDIAMETER().getSet().getPRECISIONLOQUALIFIER().getUPVALUE().getValue());
				if (v instanceof Double) effect.setUpValue(((Double)v).doubleValue());
				else effect.setTextValue(v.toString());
			} catch (Exception x) {}			
			//units
			effect.setUnit(getUnit(sciPart.getPCGRANULOMETRY().getDIAMETER().getSet().getPRECISIONLOQUALIFIER().getUNITValue(),
					sciPart.getPCGRANULOMETRY().getDIAMETER().getSet().getPRECISIONLOQUALIFIER().getUNITTXT()==null?null:
					sciPart.getPCGRANULOMETRY().getDIAMETER().getSet().getPRECISIONLOQUALIFIER().getUNITTXT().getValue()));
				
		}
		//Mass median aerodynamic diameter
		if (sciPart.getPCGRANULOMETRY().getMMAD()!=null) {
			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			effect.setEndpoint(I5CONSTANTS.pMMAD);
			Params rSTDEV = new Params(null);
			effect.getConditions().put(I5CONSTANTS.rSTD_DEV,rSTDEV);
			effect.getConditions().put(I5CONSTANTS.cSEQ_NUM,new Params(null));
			effect.getConditions().put(I5CONSTANTS.Remark,new Params(null));
			papp.addEffect(effect);
			try {
				effect.setLoQualifier(sciPart.getPCGRANULOMETRY().getMMAD().getSet().getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
			} catch (Exception x) {}
			try {
				effect.setUpQualifier(sciPart.getPCGRANULOMETRY().getMMAD().getSet().getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
			} catch (Exception x) {}
			try {
				Object v = getNumber(sciPart.getPCGRANULOMETRY().getMMAD().getSet().getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
				if (v instanceof Double) effect.setLoValue(((Double)v).doubleValue());
				else effect.setTextValue(v.toString());
			} catch (Exception x) {}
			try {
				Object v = getNumber(sciPart.getPCGRANULOMETRY().getMMAD().getSet().getPRECISIONLOQUALIFIER().getUPVALUE().getValue());
				if (v instanceof Double) effect.setUpValue(((Double)v).doubleValue());
				else effect.setTextValue(v.toString());
			} catch (Exception x) {}			
			//units
			effect.setUnit(getUnit(sciPart.getPCGRANULOMETRY().getMMAD().getSet().getPRECISIONLOQUALIFIER().getUNITValue(),
					sciPart.getPCGRANULOMETRY().getMMAD().getSet().getPRECISIONLOQUALIFIER().getUNITTXT()==null?null:
					sciPart.getPCGRANULOMETRY().getMMAD().getSet().getPRECISIONLOQUALIFIER().getUNITTXT().getValue()));
			
			//Geometric standard deviation
			if (sciPart.getPCGRANULOMETRY().getGSD()!=null) {
				rSTDEV.put("Class",I5CONSTANTS.pGSD);
				rSTDEV.put("isResult",true);
				
				try {
					rSTDEV.setLoQualifier(sciPart.getPCGRANULOMETRY().getGSD().getSet().getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
				} catch (Exception x) {}
				try {
					rSTDEV.setUpQualifier(sciPart.getPCGRANULOMETRY().getGSD().getSet().getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
				} catch (Exception x) {}
				try {
					Object v = getNumber(sciPart.getPCGRANULOMETRY().getGSD().getSet().getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
					rSTDEV.setLoValue(v);
				} catch (Exception x) {}
				try {
					Object v = getNumber(sciPart.getPCGRANULOMETRY().getGSD().getSet().getPRECISIONLOQUALIFIER().getUPVALUE().getValue());
					rSTDEV.setUpValue(v);
				} catch (Exception x) {}			
			}			
			
			
		}

		//Particle size
		if (sciPart.getPCGRANULOMETRY().getPARTICLESIZE()!=null) 
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord.ScientificPart.PCGRANULOMETRY.PARTICLESIZE.Set set : sciPart.getPCGRANULOMETRY().getPARTICLESIZE().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				Params rSTDEV = new Params(null);
				effect.getConditions().put(I5CONSTANTS.rSTD_DEV,rSTDEV);
				effect.getConditions().put(I5CONSTANTS.cSEQ_NUM,new Params(null));
				effect.getConditions().put(I5CONSTANTS.Remark,new Params(null));
				papp.addEffect(effect);
				String percentile = set.getPHRASEOTHERPERCENTILE().getPERCENTILEValue();
				effect.setEndpoint(I5CONSTANTS.pPARTICLESIZE+"."+percentile);
				
				Params p = new Params(null);effect.getConditions().put(I5CONSTANTS.cPERCENTILE,p);
				try {p.setLoValue(percentile);p.setLoQualifier("  ");} catch (Exception x) {}
				
				try {rSTDEV.setLoValue(getNumber(set.getSTDEV().getSTDEV().getValue()));} catch (Exception x) {}
				
				p = new Params(null);effect.getConditions().put(I5CONSTANTS.Remark,p);
				try {p.setLoValue(set.getREM().getREM().getValue());p.setLoQualifier("  ");} catch (Exception x) {}
				
				try {
					effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
				} catch (Exception x) {}
				try {
					effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
				} catch (Exception x) {}
				try {
					Object v = getNumber(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
					if (v instanceof Double) effect.setLoValue(((Double)v).doubleValue());
					else effect.setTextValue(v.toString());
				} catch (Exception x) {}
				try {
					Object v = getNumber(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue());
					if (v instanceof Double) effect.setUpValue(((Double)v).doubleValue());
					else effect.setTextValue(v.toString());
				} catch (Exception x) {}			
				//units
				effect.setUnit(getUnit(set.getPRECISIONLOQUALIFIER().getUNITValue(),
						set.getPRECISIONLOQUALIFIER().getUNITTXT()==null?null:
						set.getPRECISIONLOQUALIFIER().getUNITTXT().getValue()));
			}
		//particle size at different passages
		if (sciPart.getPCGRANULOMETRY().getPARTICLESIZE()!=null) 
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord.ScientificPart.PCGRANULOMETRY.DISTRIBUTION.Set set : sciPart.getPCGRANULOMETRY().getDISTRIBUTION().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				Params rSTDEV = new Params(null);
				effect.getConditions().put(I5CONSTANTS.rSTD_DEV,rSTDEV);
				Params rREM = new Params(null);
				effect.getConditions().put(I5CONSTANTS.Remark,rREM);
				try {rREM.setLoValue(set.getREM().getREM().getValue());} catch (Exception x) {}
				
				effect.setEndpoint(I5CONSTANTS.pPARTICLESIZE);
				papp.addEffect(effect);
				Params p = new Params(null);effect.getConditions().put(I5CONSTANTS.cSEQ_NUM,p);
				try {
					p.setLoValue(set.getPASSAGENUMBER().getPASSAGENUMBERValue());p.setLoQualifier("  ");} 
				catch (Exception x) { p.setLoValue(null);}	;
				
				try {
					effect.setLoQualifier(set.getPRECISIONSIZELOQUALIFIER().getSIZELOQUALIFIERValue());
				} catch (Exception x) {}
				try {
					effect.setUpQualifier(set.getPRECISIONSIZELOQUALIFIER().getSIZEUPQUALIFIERValue());
				} catch (Exception x) {}
				try {
					Object v = getNumber(set.getPRECISIONSIZELOQUALIFIER().getSIZELOVALUE().getValue());
					if (v instanceof Double) effect.setLoValue(((Double)v).doubleValue());
					else effect.setTextValue(v.toString());
				} catch (Exception x) {}
				try {
					Object v = getNumber(set.getPRECISIONSIZELOQUALIFIER().getSIZEUPVALUE().getValue());
					if (v instanceof Double) effect.setUpValue(((Double)v).doubleValue());
					else effect.setTextValue(v.toString());
				} catch (Exception x) {}			
				//units
				effect.setUnit(getUnit(set.getPRECISIONSIZELOQUALIFIER().getSIZEUNITValue(),
						set.getPRECISIONSIZELOQUALIFIER().getSIZEUNITTXT()==null?null:
						set.getPRECISIONSIZELOQUALIFIER().getSIZEUNITTXT().getValue()));
				
				//Distribution
				rSTDEV.put("Class","Distribution");
				rSTDEV.put("isResult",true);
				
				try {
					rSTDEV.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
				} catch (Exception x) {}
				try {
					rSTDEV.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
				} catch (Exception x) {}
				try {
					rSTDEV.setLoValue(getNumber(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
				} catch (Exception x) {}
				try {
					rSTDEV.setUpValue(getNumber(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
				} catch (Exception x) {}	
	
				
			}
		try {
			papp.setInterpretationResult(sciPart.getPCGRANULOMETRY().getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);			
		}
		return record;
	}

	
}
