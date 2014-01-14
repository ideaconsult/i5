package net.idea.i5._5.ambit2.sections;

import net.idea.i5._5.ambit2.Phrases;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;

public abstract class AbstractStudyRecordConverter<T>  implements IStudyRecordConverter<T>{
	protected static final String cSex = "Sex";
	protected static final String cSpecies = "Species";
	protected static final String cGeneration = "Generation";
	protected static final String cDoses= "Doses/concentrations";
	protected static final String cRoute= "Route of administration";	
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
	protected static final String WaterSolubility = "Water solubility";
	protected static final String SUBLIMATION = "Sublimation";
	protected static final String MELTINGPOINT = "Melting Point";
	protected static final String HLC = "Henry's Law const.";
	protected static final String pKa = "pKa";
	protected static final String OrgCarbonPercent = "% Org.Carbon";
	protected static final String BioaccBasis = "Bioacc. basis";
	protected static final String cTestType = "Test type";
	protected static final String cTimePoint = "Sampling time";
	protected static final String cPercentDegradation = "% Degradation";
	
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
	protected Params parseReliability(ProtocolApplication papp,String valueID, 
				boolean isRobustStudy, boolean isUsedforClassification, boolean isUsedforMSDS,
				String purposeFlagCode,String studyResultTypeID) {
		try {
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
		} catch (Exception x) { return null; }
	};
	
	protected ProtocolApplication createProtocolApplication(String documentID,String name, String topCategory,String category) {
		ProtocolApplication<Protocol,Params,String,Params,String> papp = new ProtocolApplication<Protocol,Params,String,Params,String>(
					new Protocol(name));
		papp.setDocumentUUID(documentID);		
		papp.getProtocol().setTopCategory(topCategory);
		papp.getProtocol().setCategory(category);
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
}
