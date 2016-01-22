package net.idea.i5.io;

/**
 * Introduced in order to control import of specific I5Z content
 * @author nina
 *
 */
public class I5Options {
	protected boolean allowMultipleSubstances = false;

	protected int maxReferenceStructures = -1; 
	public int getMaxReferenceStructures() {
		return maxReferenceStructures;
	}
	public void setMaxReferenceStructures(int maxReferenceStructures) {
		this.maxReferenceStructures = maxReferenceStructures;
	}
	public boolean isAllowMultipleSubstances() {
		return allowMultipleSubstances;
	}
	public void setAllowMultipleSubstances(boolean allowMultipleSubstances) {
		this.allowMultipleSubstances = allowMultipleSubstances;
	}
}
