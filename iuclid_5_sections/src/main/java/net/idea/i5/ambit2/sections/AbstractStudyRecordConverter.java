package net.idea.i5.ambit2.sections;

import javax.xml.bind.JAXBElement;

import net.idea.i5._5.ambit2.json.Experiment;
import net.idea.i5.ambit2.phrases.Phrases;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.IStudyRecordConverter;
import net.idea.i5.io.QACriteriaException;
import net.idea.i5.io.QASettings;
import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.ReliabilityParams;

public abstract class AbstractStudyRecordConverter<T,PROTOCOLPARAMS extends IParams,CONDITIONS extends IParams>  implements IStudyRecordConverter<T>{
	protected I5_ROOT_OBJECTS endpointCategory;
	protected enum _top_category {
		PCHEM {
			@Override
			public String toString() {
				return "P-CHEM";
			}
		},		
		ENVFATE {
			@Override
			public String toString() {
				return "ENV FATE";
			}
		},
		ECOTOX,
		TOX
	};
	
	protected QASettings qaSettings;

	
	
	protected void setCompanyUUID(SubstanceRecord record,String value) {
		int slashpos = value.indexOf("/");
		if (slashpos>0)
			record.setSubstanceUUID(value.substring(0,slashpos));
		else
			record.setSubstanceUUID(value);
	}	
	
	public AbstractStudyRecordConverter(I5_ROOT_OBJECTS endpointCategory) {
		this(endpointCategory,new QASettings());
	}
	public AbstractStudyRecordConverter(I5_ROOT_OBJECTS endpointCategory,QASettings qaSettings) {
		super();
		this.endpointCategory = endpointCategory;
		setQASettings(qaSettings);
	}
	
	protected String getEndpointCategory() {
		return endpointCategory==null?null:endpointCategory.toSection();
	}
	
	protected boolean hasDataTransferCriteriaFulfilled(T unmarshalled) {
		if (!hasScientificPart(unmarshalled)) return false;
		if (isDataWaiving(unmarshalled)) return false;

		//if (!isReferenceTypeAccepted(unmarshalled)) return false;
		return false;
	}

	protected abstract String getTopCategory();
	protected abstract boolean hasScientificPart(T unmarshalled) ;	
	protected abstract boolean isDataWaiving(T unmarshalled);
	protected abstract String getTestMaterialIdentity(T unmarshalled);
	
	protected boolean isTestMaterialIdentityAccepted(String testMaterialCode) throws QACriteriaException {
		if (qaSettings.isTestMaterialIdentityAccepted(testMaterialCode)) return true; //yes
		throw new QACriteriaException("Test material identity ",testMaterialCode,testMaterialCode==null?null:Phrases.phrasegroup_Z38.get(testMaterialCode));
	}
	
	protected boolean isPurposeflagAccepted(String purposeFlagCode) throws QACriteriaException{
		if (qaSettings.isPurposeflagAccepted(purposeFlagCode)) return true; //key study, supporting study
		throw new QACriteriaException("Purpose flag ",purposeFlagCode,purposeFlagCode==null?null:Phrases.phrasegroup_Y14_3.get(purposeFlagCode));
	}
	
	protected boolean isStudyResultAccepted(String studyResultTypeID) throws QACriteriaException {
		if (qaSettings.isStudyResultAccepted(studyResultTypeID)) return true; // experimental result
		throw new QACriteriaException("Study result ",studyResultTypeID,studyResultTypeID==null?null:Phrases.phrasegroup_Z05.get(studyResultTypeID));
	}
	protected boolean isReliabilityAccepted(String valueID) throws QACriteriaException {
		if (qaSettings.isReliabilityAccepted(valueID)) return true; //"1 (reliable without restriction)", "2 (reliable with restrictions)"
		throw new QACriteriaException("Reliability ",valueID,valueID==null?null:Phrases.phrasegroup_A36.get(valueID));
	}
	protected boolean isReferenceTypeAccepted(String referenceTypeCode) throws QACriteriaException {
		if (qaSettings.isReferenceTypeAccepted(referenceTypeCode)) return true; //"study report",  "publication", "review article or handbook"
		if (getQASettings().isEnabled()) {
			throw new QACriteriaException("Reference type ",referenceTypeCode,referenceTypeCode==null?null:Phrases.phrasegroup_Z31.get(referenceTypeCode));
		}
		else return true;
	}
	
	public ambit2.base.interfaces.IStructureRecord transform2record(T unmarshalled, SubstanceRecord record) throws AmbitException {
		if (hasDataTransferCriteriaFulfilled(unmarshalled)) return null;
		else return record;
	};
	protected abstract void parseReference(T unmarshalled, ProtocolApplication papp) throws QACriteriaException;

	protected Params parseReliability(ProtocolApplication papp,
				String valueID, 
				boolean isRobustStudy, boolean isUsedforClassification, boolean isUsedforMSDS,
				String purposeFlagCode,String studyResultTypeID,
				String testMaterialIndicator) throws AmbitException {

			if (getQASettings().isEnabled()) {
				isPurposeflagAccepted(purposeFlagCode);
				isStudyResultAccepted(studyResultTypeID);
				isReliabilityAccepted(valueID);
				isTestMaterialIdentityAccepted(testMaterialIndicator);
			} 
			//else System.out.println("No quality check");

			ReliabilityParams reliability = new ReliabilityParams();
			reliability.setId(valueID);
			reliability.setValue(Phrases.phrasegroup_A36.get(valueID));
			reliability.setIsRobustStudy(isRobustStudy);
			reliability.setIsUsedforClassification(isUsedforClassification);
			reliability.setIsUsedforMSDS(isUsedforMSDS);
			reliability.setPurposeFlag(Phrases.phrasegroup_Y14_3.get(purposeFlagCode));
			reliability.setStudyResultType(Phrases.phrasegroup_Z05.get(studyResultTypeID));
			
			papp.setReliability(reliability);
			return reliability;
	};
	
	protected PROTOCOLPARAMS createProtocolParameters() {
		if (endpointCategory==null) return (PROTOCOLPARAMS) new Params();
		else return (PROTOCOLPARAMS) endpointCategory.createProtocolParameters();
	}
	protected Experiment<PROTOCOLPARAMS,CONDITIONS> createProtocolApplication(String documentID,String name) {
		Experiment<PROTOCOLPARAMS,CONDITIONS> papp = new Experiment<PROTOCOLPARAMS,CONDITIONS>(new Protocol(name));
		papp.setDocumentUUID(documentID);		
		papp.getProtocol().setTopCategory(getTopCategory());
		papp.getProtocol().setCategory(getEndpointCategory());
		papp.setParameters(createProtocolParameters());
		return papp;
	}
	public static Object getNumber(Object value) {
		if (value == null) return null;
		if (value instanceof Number) return value;
		try {
			return Double.parseDouble(value.toString());
		} catch (Exception x) {
			return value;
		}
		
	}
	
	
	protected void setInterpretationResult(ProtocolApplication papp,String value,String otherValue) {
		if (value == null) papp.setInterpretationResult("");
		else if ("other:".equals(value)) { //other
			papp.setInterpretationResult(otherValue);
		} else
			papp.setInterpretationResult(value);
	}
	@Override
	public QASettings getQASettings() {
		if (qaSettings==null) qaSettings = new QASettings();
		return qaSettings;
	}
	@Override
	public void setQASettings(QASettings qaSettings) {
		this.qaSettings = qaSettings;
	}
	protected String getQualifier(String qualifier) {
		return "NOT_SPECIFIED".equals(qualifier)?null:qualifier;
	}
	protected String getUnit(String unit,String otherValue) {
		if ("other:".equals(unit)) return otherValue;
		else return unit;
	}
	protected String getGuideline(String method,JAXBElement<String> otherValue) {
		if (method==null || method.startsWith("other")) return otherValue==null?null:otherValue.getValue();
		else return method;
	}
	protected String getGuideline(String method,String otherValue) {
		if (method==null || method.startsWith("other")) return otherValue;
		else return method;
	}

	protected Params addParams(String key,Object value) {
		Params p = new Params();
		p.put(key,value);
		return p;
	}
	
	protected String getValue(String value, JAXBElement<String> other) {
		return value==null?value:(value.startsWith("other:")?(other==null?null:other.getValue()):value);
	}
}
