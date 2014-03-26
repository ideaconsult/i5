package net.idea.i5.cli;

import java.io.File;

import net.idea.opentox.cli.IIdentifiableResource;

public class Container implements IIdentifiableResource<String> {
	protected String identifier;
	protected File ipzarchive;
	protected String report;

	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public Container(String identifier,File file) {
		this(identifier,file,null);
	}
	public Container(String identifier,File file,String report) {
		setIpzarchive(file);
		setResourceIdentifier(identifier);
		setReport(report);
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
