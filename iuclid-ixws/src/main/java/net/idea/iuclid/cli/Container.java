package net.idea.iuclid.cli;

import java.io.File;

import net.idea.opentox.cli.IIdentifiableResource;
import net.idea.opentox.cli.id.IIdentifier;

public class Container implements IIdentifiableResource<IIdentifier> {
	protected IIdentifier identifier;
	protected File ipzarchive;
	protected String report;

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public Container(IIdentifier identifier, File file) {
		this(identifier, file, null);
	}

	public Container(IIdentifier identifier, File file, String report) {
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
	public void setResourceIdentifier(IIdentifier identifier) {
		this.identifier = identifier;
	}

	@Override
	public IIdentifier getResourceIdentifier() {
		return identifier;
	}

	@Override
	public String toString() {
		return getResourceIdentifier().toString();
	}

}
