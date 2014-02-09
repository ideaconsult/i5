package net.idea.i5._5.ambit2.sections;

import net.idea.i5._5.ambit2.Phrases;
import net.idea.i5._5.ambit2.QACriteriaException;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;

public abstract class AbstractStudyRecordConverter<T>  implements IStudyRecordConverter<T>{
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
	
	protected boolean qualityCheckEnabled ;
	public boolean isQualityCheckEnabled() {
		return qualityCheckEnabled;
	}

	public void setQualityCheckEnabled(boolean qualityCheckEnabled) {
		this.qualityCheckEnabled = qualityCheckEnabled;
	}


	protected final String Physstate = "Physical state";
	
	protected static final String cSpecies = "Species";
	protected static final String cSex = "Sex";
	
	protected static final String cToxicity = "Toxicity";
	protected static final String cGeneration = "Generation";
	protected static final String cEffectType = "Effect type";
	protected static final String cDoses= "Doses/concentrations";
	protected static final String cRouteAdm= "Route of administration";
	protected static final String cRoute= "Route";	
	protected static final String cReference = "Reference";
	protected static final String cYear = "Study year";
	protected static final String cTypeMethod= "Type of method";
	protected static final String cTypeStudy= "Type of study";
	
	protected static final String DECOMPOSITION = "Decomposition";
	protected static final String methodType = "Method type";
	protected static final String ph = "pH";
	protected static final String Temperature = "Temperature";
	protected static final String Remark = "Remark";
	protected static final String Solvent = "Solvent";
	protected static final String Pressure = "Pressure";
	protected static final String VapourPressure = "Vapour Pressure";
	protected static final String AtmPressure = "Atm. Pressure";
	protected static final String WaterSolubility = "Water solubility";
	protected static final String SUBLIMATION = "Sublimation";
	protected static final String MELTINGPOINT = "Melting Point";
	protected static final String BOILINGPOINT = "Boiling point";
	protected static final String HLC = "Henry's Law const.";
	protected static final String pKa = "pKa";
	protected static final String OrgCarbonPercent = "% Org.Carbon";
	protected static final String BioaccBasis = "Bioacc. basis";
	protected static final String cTestType = "Test type";
	protected static final String cTimePoint = "Sampling time";
	protected static final String cPercentDegradation = "% Degradation";
	protected static final String TestCondition = "Test condition";
	
	protected static final String cSalinity = "Salinity";
	protected static final String cExposure = "Exposure";
	protected static final String cTestMedium = "Test Medium";
	protected static final String cTestOrganism = "Test organism";
	protected static final String cMeasuredConcentration = "Measured concentration";
	protected static final String cEffect = "Effect";
	protected static final String cBasisForEffect = "Basis for effect";
	protected static final String cConcType = "Based on";	
	
	protected static final String cSoilNo = "Soil No.";
	protected static final String cSoilType = "Soil type";
	protected static final String cOCContent =  "OC content";	
	
	protected static final String cTypeGenotoxicity= "Type of genotoxicity";
	protected static final String cTargetGene= "Target gene";
	protected static final String cMetabolicActivationSystem= "Metabolic activation system";
	protected static final String cMetabolicActivation= "Metabolic activation";	
	
	
	protected static final String SOLUBILITY_ORG_SOLVENT = "Solubility org. solvents";
	
	
	
	protected static final String unit = "unit";
	protected static final String loValue = "loValue";
	protected static final String upValue = "upValue";
	protected static final String loQualifier = "loQualifier";
	protected static final String upQualifier = "upQualifier";
	
	private static final String r_id = "id";
	private static final String r_value = "value";
	private static final String r_isRobustStudy = "isRobustStudy";
	private static final String r_isUsedforClassification = "isUsedforClassification";
	private static final String r_isUsedforMSDS = "isUsedforMSDS";
	private static final String r_purposeFlag = "purposeFlag";
	private static final String r_studyResultType = "studyResultType";
	
	protected void setCompanyUUID(SubstanceRecord record,String value) {
		int slashpos = value.indexOf("/");
		if (slashpos>0)
			record.setCompanyUUID(value.substring(0,slashpos));
		else
			record.setCompanyUUID(value);
	}	
	
	public AbstractStudyRecordConverter(I5_ROOT_OBJECTS endpointCategory) {
		super();
		this.endpointCategory = endpointCategory;
		this.qualityCheckEnabled = true;
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
		if ("2480".equals(testMaterialCode)) return true; //yes
		throw new QACriteriaException("Test material identity ",testMaterialCode,testMaterialCode==null?null:Phrases.phrasegroup_Z38.get(testMaterialCode));
	}
	
	protected boolean isPurposeflagAccepted(String purposeFlagCode) throws QACriteriaException{
		if ("921".equals(purposeFlagCode) || "1590".equals(purposeFlagCode) ) return true; //1 or 2
		throw new QACriteriaException("Purpose flag ",purposeFlagCode,purposeFlagCode==null?null:Phrases.phrasegroup_Y14_3.get(purposeFlagCode));

	}
	protected boolean isStudyResultAccepted(String studyResultTypeID) throws QACriteriaException {
		if ("1895".equals(studyResultTypeID)) return true; //experimental result
		throw new QACriteriaException("Study result ",studyResultTypeID,studyResultTypeID==null?null:Phrases.phrasegroup_Z05.get(studyResultTypeID));
	}
	protected boolean isReliabilityAccepted(String valueID) throws QACriteriaException {
		if ("16".equals(valueID) || "18".equals(valueID) ) return true; //1 or 2
		throw new QACriteriaException("Reliability ",valueID,valueID==null?null:Phrases.phrasegroup_A36.get(valueID));
	}
	protected boolean isReferenceTypeAccepted(String referenceTypeCode) throws QACriteriaException {
		//Study report OR publication OR Review article / handbook
		if ("1586".equals(referenceTypeCode) || "1433".equals(referenceTypeCode)  || "1486".equals(referenceTypeCode)) return true;
		QACriteriaException x = new QACriteriaException("Reference type ",referenceTypeCode,referenceTypeCode==null?null:Phrases.phrasegroup_Z31.get(referenceTypeCode));
		if (isQualityCheckEnabled()) throw x;
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

			if (isQualityCheckEnabled()) {
				isPurposeflagAccepted(purposeFlagCode);
				isStudyResultAccepted(studyResultTypeID);
				isReliabilityAccepted(valueID);
				isTestMaterialIdentityAccepted(testMaterialIndicator);
			} 
			//else System.out.println("No quality check");

			Params reliability = new Params();
			reliability.put(r_id, valueID);
			reliability.put(r_value, Phrases.phrasegroup_A36.get(valueID));
			reliability.put(r_isRobustStudy, isRobustStudy);
			reliability.put(r_isUsedforClassification, isUsedforClassification);
			reliability.put(r_isUsedforMSDS, isUsedforMSDS);
			reliability.put(r_purposeFlag, Phrases.phrasegroup_Y14_3.get(purposeFlagCode));
			reliability.put(r_studyResultType, Phrases.phrasegroup_Z05.get(studyResultTypeID));
			
			papp.setReliability(reliability);
			return reliability;
	};
	
	protected ProtocolApplication createProtocolApplication(String documentID,String name) {
		ProtocolApplication<Protocol,Params,String,Params,String> papp = new ProtocolApplication<Protocol,Params,String,Params,String>(
					new Protocol(name));
		papp.setDocumentUUID(documentID);		
		papp.getProtocol().setTopCategory(getTopCategory());
		papp.getProtocol().setCategory(getEndpointCategory());
		papp.setParameters(new Params());
		return papp;
	}
	protected Object getNumber(Object value) {
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
}
