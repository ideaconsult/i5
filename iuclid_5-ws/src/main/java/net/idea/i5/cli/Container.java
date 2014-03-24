package net.idea.i5.cli;

import java.io.File;

import net.idea.opentox.cli.IIdentifiableResource;

public class Container implements IIdentifiableResource<String> {
	protected String identifier;
	protected File ipzarchive;

	public Container(String identifier,File file) {
		setIpzarchive(file);
		setResourceIdentifier(identifier);
	}
	public File getIpzarchive() {
		return ipzarchive;
	}

	public void setIpzarchive(File ipzarchive) {
		this.ipzarchive = ipzarchive;
	}

	@Override
	public void setResourceIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String getResourceIdentifier() {
		return identifier;
	}
	@Override
	public String toString() {
		return getResourceIdentifier();
	}

}
