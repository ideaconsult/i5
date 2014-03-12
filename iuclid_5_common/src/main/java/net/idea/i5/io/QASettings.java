package net.idea.i5.io;

public class QASettings {
	boolean enabled = true;

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
}
