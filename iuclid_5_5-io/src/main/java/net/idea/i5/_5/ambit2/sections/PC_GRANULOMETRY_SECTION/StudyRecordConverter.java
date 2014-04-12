package net.idea.i5._5.ambit2.sections.PC_GRANULOMETRY_SECTION;

import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ZETA_POTENTIAL_SECTION.DocumentTypeType;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord> {
	
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
		
		if (sciPart.getPCGRANULOMETRY().getGUIDELINE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord.ScientificPart.PCGRANULOMETRY.GUIDELINE.Set set : sciPart.getPCGRANULOMETRY().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
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
			papp.getParameters().put(pTESTMAT_FORM,
			sciPart.getPCGRANULOMETRY().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		} catch (Exception x) {
			papp.getParameters().put(pTESTMAT_FORM,null);
		}
		try {
			String value = sciPart.getPCGRANULOMETRY().getDISTRIBUTIONTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue();
			if ("other:".equals(value)) try {
				value = sciPart.getPCGRANULOMETRY().getDISTRIBUTIONTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT().getValue();
			} catch (Exception x) {}	
			papp.getParameters().put(pDISTRIBUTION_TYPE,value);
		} catch (Exception x) {
			papp.getParameters().put(pDISTRIBUTION_TYPE,null);
		}
		
		//Mass median diametrer
		if (sciPart.getPCGRANULOMETRY().getDIAMETER()!=null) { 
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setConditions(new Params());
			effect.setEndpoint(pMMD);
			effect.getConditions().put(rSTD_DEV,addParams(loValue,null));
			effect.getConditions().put(cSEQ_NUM,addParams(loValue,null));
			effect.getConditions().put(Remark,addParams(loValue,null));
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
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setConditions(new Params());
			effect.setEndpoint(pMMAD);
			Params rSTDEV = addParams(loValue,null);
			effect.getConditions().put(rSTD_DEV,rSTDEV);
			effect.getConditions().put(cSEQ_NUM,addParams(loValue,null));
			effect.getConditions().put(Remark,addParams(loValue,null));
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
				rSTDEV.put("Class",pGSD);
				rSTDEV.put("isResult",true);
				
				try {
					rSTDEV.put(loQualifier,sciPart.getPCGRANULOMETRY().getGSD().getSet().getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
				} catch (Exception x) {}
				try {
					rSTDEV.put(upQualifier,sciPart.getPCGRANULOMETRY().getGSD().getSet().getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
				} catch (Exception x) {}
				try {
					Object v = getNumber(sciPart.getPCGRANULOMETRY().getGSD().getSet().getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
					rSTDEV.put(loValue,v);
				} catch (Exception x) {}
				try {
					Object v = getNumber(sciPart.getPCGRANULOMETRY().getGSD().getSet().getPRECISIONLOQUALIFIER().getUPVALUE().getValue());
					rSTDEV.put(upValue,v);
				} catch (Exception x) {}			
			}			
			
			
		}

		//Particle size
		if (sciPart.getPCGRANULOMETRY().getPARTICLESIZE()!=null) 
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_GRANULOMETRY_SECTION.EndpointStudyRecord.ScientificPart.PCGRANULOMETRY.PARTICLESIZE.Set set : sciPart.getPCGRANULOMETRY().getPARTICLESIZE().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setConditions(new Params());
				Params rSTDEV = addParams(loValue,null);
				effect.getConditions().put(rSTD_DEV,rSTDEV);
				effect.getConditions().put(cSEQ_NUM,addParams(loValue,null));
				effect.getConditions().put(Remark,addParams(loValue,null));
				papp.addEffect(effect);
				String percentile = set.getPHRASEOTHERPERCENTILE().getPERCENTILEValue();
				effect.setEndpoint(pPARTICLESIZE+"."+percentile);
				
				Params p = addParams(loValue, null);effect.getConditions().put(cPERCENTILE,p);
				try {p.put(loValue,percentile);p.put(loQualifier,"  ");} catch (Exception x) {}
				
				try {rSTDEV.put(loValue, getNumber(set.getSTDEV().getSTDEV().getValue()));} catch (Exception x) {}
				
				p = addParams(loValue, null);effect.getConditions().put(Remark,p);
				try {p.put(loValue, set.getREM().getREM().getValue());p.put(loQualifier,"  ");} catch (Exception x) {}
				
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
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setConditions(new Params());
				Params rSTDEV = addParams(loValue,null);
				effect.getConditions().put(rSTD_DEV,rSTDEV);
				Params rREM = addParams(loValue,null);
				effect.getConditions().put(Remark,rREM);
				try {rREM.put(loValue,set.getREM().getREM().getValue());} catch (Exception x) {}
				
				effect.setEndpoint(pPARTICLESIZE);
				papp.addEffect(effect);
				Params p = addParams(loValue,null);effect.getConditions().put(cSEQ_NUM,p);
				try {
					p.put(loValue,set.getPASSAGENUMBER().getPASSAGENUMBERValue());p.put(loQualifier,"  ");} 
				catch (Exception x) { p.put(loValue,null);}	;
				
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
					rSTDEV.put(loQualifier,set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
				} catch (Exception x) {}
				try {
					rSTDEV.put(upQualifier,set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
				} catch (Exception x) {}
				try {
					rSTDEV.put(loValue,getNumber(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
				} catch (Exception x) {}
				try {
					rSTDEV.put(upValue,getNumber(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
				} catch (Exception x) {}	
	
				
			}
		try {
			papp.setInterpretationResult(sciPart.getPCGRANULOMETRY().getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);			
		}
		return record;
	}

	protected Params addParams(String key,Object value) {
		Params p = new Params();
		p.put(key,value);
		return p;
	}
	
}
