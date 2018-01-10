package net.idea.i5.io;

import java.util.HashSet;
import java.util.Set;

public class QASettings {
	boolean enabled;
	/**
	 * {@link net.idea.i5._5.ambit2.Phrases.phrasegroup_Z38}
	 */
	//protected Set<String> testMaterialIdentity;
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

	public void clear() {
		setEnabled(false);
		purposeFlag.clear();
		reliability.clear();
		studyResultType.clear();
		referenceType.clear();
	}

	@Override
	public String toString() {
		return isEnabled() ? "QA enabled" : "QA disabled";
	}

	protected void initSets() {
		purposeFlag = new HashSet<String>();
		reliability = new HashSet<String>();
		studyResultType = new HashSet<String>();
		referenceType = new HashSet<String>();
	}

	public void setDefault() {
		// "key study" or "supporting study"
		purposeFlag.add("921");
		purposeFlag.add("1590");
		// yes
		// "1 (reliable without restriction)", "2 (reliable with restrictions)"
		reliability.add("16");
		reliability.add("18");
		// experimental result
		studyResultType.add("1895");
		// Study report OR publication OR Review article / handbook
		referenceType.add("1586");
		referenceType.add("1433");
		referenceType.add("1486");
	}

	public void setAll() {
		// "key study" or "supporting study"
		purposeFlag.add("921");
		purposeFlag.add("1590");
		purposeFlag.add("1661");
		purposeFlag.add("8108");
		purposeFlag.add("NOT_SPECIFIED");

		// "1 (reliable without restriction)", "2 (reliable with restrictions)"
		reliability.add("16");
		reliability.add("18");
		reliability.add("22");
		reliability.add("24");
		reliability.add("1342");
		reliability.add("NOT_SPECIFIED");
		// experimental result
		studyResultType.add("1895");
		studyResultType.add("1896");
		studyResultType.add("1885");
		studyResultType.add("2303");
		studyResultType.add("2304");
		studyResultType.add("14");
		studyResultType.add("1342");
		studyResultType.add("1173");
		studyResultType.add("NOT_SPECIFIED");
		// Study report OR publication OR Review article / handbook
		referenceType.add("1586");
		referenceType.add("266");
		referenceType.add("1433");
		referenceType.add("1486");
		referenceType.add("1542");
		referenceType.add("811");
		referenceType.add("1342");
		referenceType.add("NOT_SPECIFIED");
	}
	/**
	 * Do not use. This option is removed  as the concept of test material in IUCLDI6 is different than in IUCLID5 
	 * @param testMaterialCode
	 */
	@Deprecated
	public void addTestMaterialIdentityOption(String testMaterialCode) {
	}
	/**
	 * Do not use. 
	 * Changed to always return true, as the concept of test material in IUCLDI6 is different than in IUCLID5
	 * @param testMaterialCode 
	 * @return
	 */
	@Deprecated
	public boolean isTestMaterialIdentityAccepted(String testMaterialCode) {
		return true;
	}

	public void addPurposeflagOption(String purposeFlagCode) {
		purposeFlag.add(purposeFlagCode);
	}

	public boolean isPurposeflagAccepted(String purposeFlagCode) {
		return purposeFlag.contains(purposeFlagCode);
	}

	public void addStudyResultOption(String studyResultTypeID) {
		studyResultType.add(studyResultTypeID);
	}

	public boolean isStudyResultAccepted(String studyResultTypeID) {
		return studyResultType.contains(studyResultTypeID);
	}

	public void addReliabilityOption(String valueID) {
		reliability.add(valueID);
	}

	public boolean isReliabilityAccepted(String valueID) {
		return reliability.contains(valueID);
	}

	public void addReferenceTypeOption(String referenceTypeCode) {
		referenceType.add(referenceTypeCode);
	}

	public boolean isReferenceTypeAccepted(String referenceTypeCode) {
		return referenceType.contains(referenceTypeCode==null?"NOT_SPECIFIED":referenceTypeCode);
	}
}
