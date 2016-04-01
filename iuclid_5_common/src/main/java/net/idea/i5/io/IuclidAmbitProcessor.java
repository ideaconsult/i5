package net.idea.i5.io;

import javax.xml.bind.JAXBElement;

import net.idea.modbcum.p.DefaultAmbitProcessor;
import ambit2.base.data.LiteratureEntry;
import ambit2.base.data.Property;
import ambit2.base.data.StructureRecord;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.processors.CASProcessor;

public abstract class IuclidAmbitProcessor<Target> extends
		DefaultAmbitProcessor<Target, IStructureRecord> implements IQASettings {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1776494682527536782L;
	protected SubstanceRecord record = new SubstanceRecord();
	protected StructureRecord structureRecord = new StructureRecord();
	protected CASProcessor casProcessor = new CASProcessor();

	protected QASettings qaSettings;

	@Override
	public QASettings getQASettings() {
		if (qaSettings == null)
			qaSettings = new QASettings();
		return qaSettings;
	}

	
	@Override
	public void setQASettings(QASettings qualityCheckEnabled) {
		this.qaSettings = qualityCheckEnabled;
	}

	protected void setCompanyUUID(SubstanceRecord record, String value) {
		int slashpos = value.indexOf("/");
		if (slashpos > 0)
			record.setSubstanceUUID(value.substring(0, slashpos));
		else
			record.setSubstanceUUID(value);
	}

	protected void setOwnerUUID(SubstanceRecord record, String value) {
		int slashpos = value.indexOf("/");
		if (slashpos > 0)
			record.setOwnerUUID(value.substring(0, slashpos));
		else
			record.setOwnerUUID(value);
	}

	protected void setReferenceSubstanceUUID(IStructureRecord record,
			String value) {
		int slashpos = value.indexOf("/");
		String prefix = value.substring(0, 4);
		
		if (slashpos > 0)
			record.setRecordProperty(Property.getI5UUIDInstance(),
					value.substring(0, slashpos));
		else
			record.setRecordProperty(Property.getI5UUIDInstance(), value);
	}

	protected String getValue(String value, JAXBElement<String> other) {
		return value == null ? value
				: (value.startsWith("other") ? (other == null ? null : other
						.getValue()) : value);
	}
	
}
