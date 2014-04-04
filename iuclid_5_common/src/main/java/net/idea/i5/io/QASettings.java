package net.idea.i5.io;

import java.util.HashSet;
import java.util.Set;

public class QASettings {
	boolean enabled;
	/**
	 * {@link net.idea.i5._5.ambit2.Phrases.phrasegroup_Z38}	  
	 */
	protected Set<String> testMaterialIdentity;
	/**
	 * {@link net.idea.i5._5.ambit2.Phrases#phrasegroup_Y14_3}
	 */
	protected Set<String> purposeFlag;
	/**
	 * {@link net.idea.i5._5.ambit2.Phrases.phrasegroup_A36}	 
	 */
	protected Set<String> reliability;
	/**
	 * {@link net.idea.i5._5.ambit2.Phrases.phrasegroup_Z05}	
	 */
	protected Set<String> studyResultType;
	/**
	 * {@link net.idea.i5._5.ambit2.Phrases.phrasegroup_Z31}	
	 */
	protected Set<String> referenceType;
	
	public QASettings() {
		this(true);
	}
	public QASettings(boolean enabled) {
		this.enabled = enabled;
		initSets();
		setDefault();
		
	}
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return isEnabled()?"QA enabled":"QA disabled";
	}
	protected void initSets() {
		purposeFlag = new HashSet<String>();
		testMaterialIdentity = new HashSet<String>();
		reliability = new HashSet<String>();
		studyResultType = new HashSet<String>();
		referenceType = new HashSet<String>();
	}
	protected void setDefault() {
		// "key study" or "supporting study"
		purposeFlag.add("921");purposeFlag.add("1590");
		// yes
		testMaterialIdentity.add("2480");
		 //"1 (reliable without restriction)", "2 (reliable with restrictions)"
		reliability.add("16");reliability.add("18");
		// experimental result
		studyResultType.add("1895");
		//Study report OR publication OR Review article / handbook
		referenceType.add("1586");referenceType.add("1433");referenceType.add("1486");
	}

	public boolean isTestMaterialIdentityAccepted(String testMaterialCode) {
		return testMaterialIdentity.contains(testMaterialCode);
	}
	public boolean isPurposeflagAccepted(String purposeFlagCode){
		return purposeFlagCode.contains(purposeFlagCode);
	}
	public boolean isStudyResultAccepted(String studyResultTypeID){
		return studyResultType.contains(studyResultTypeID);
	}
	public boolean isReliabilityAccepted(String valueID) {
		return reliability.contains(valueID);
	}
	public boolean isReferenceTypeAccepted(String referenceTypeCode) {
		return referenceType.contains(referenceTypeCode);	
	}	
}
