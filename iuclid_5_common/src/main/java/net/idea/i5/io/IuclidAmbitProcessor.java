package net.idea.i5.io;

import javax.xml.bind.JAXBElement;

import ambit2.base.data.Property;
import ambit2.base.data.StructureRecord;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.processors.CASProcessor;
import net.idea.modbcum.p.DefaultAmbitProcessor;

public abstract class IuclidAmbitProcessor<Target> extends DefaultAmbitProcessor<Target, IStructureRecord>
		implements IQASettings {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1776494682527536782L;
	protected SubstanceRecord record = new SubstanceRecord();
	protected StructureRecord structureRecord = new StructureRecord();
	protected CASProcessor casProcessor = new CASProcessor();
	protected QASettings qaSettings;
	protected String container;

	/**
	 * @param container
	 *            the i5z file
	 */
	public IuclidAmbitProcessor(String container) {
		super();
		this.container = container;
	}

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

	/**
	 * @deprecated Use setSubstanceUUID() instead
	 * @param record SubstanceRecord
	 * @param value the substance UUID
	 */
	@Deprecated  
	protected void setCompanyUUID(SubstanceRecord record, String value) {
		setSubstanceUUID(record, value);
	}

	protected void setSubstanceUUID(SubstanceRecord record, String value) {
		int slashpos = value.indexOf("/");
		if (slashpos > 0) {
			record.setSubstanceUUID(value.substring(0, slashpos));
			record.setContent(value.substring(slashpos + 1));
		} else {
			record.setSubstanceUUID(value);
			record.setContent(container);
		}
	}

	protected void setOwnerUUID(SubstanceRecord record, String value) {
		int slashpos = value.indexOf("/");
		if (slashpos > 0)
			record.setOwnerUUID(value.substring(0, slashpos));
		else
			record.setOwnerUUID(value);
	}

	protected void setReferenceSubstanceUUID(IStructureRecord record, String value) {
		int slashpos = value.indexOf("/");
		String i5value = (slashpos > 0) ? value.substring(0, slashpos) : value;

		if (record instanceof SubstanceRecord) {
			((SubstanceRecord) record).setReferenceSubstanceUUID(i5value);
		} else {
			Property i5uuid = Property.getInstance(Property.IUCLID5_UUID, container);
			i5uuid.setLabel(Property.opentox_IUCLID5_UUID);
			record.setRecordProperty(i5uuid, i5value);
		}
	}

	protected void setIUPACName(IStructureRecord record, String value) {
		if (value == null || "".equals(value.trim()))
			return;
		Property iupacname = Property.getInstance(Property.Names, container);
		iupacname.setLabel(Property.opentox_IupacName);
		record.setRecordProperty(iupacname, value);
	}

	protected String getValue(String value, JAXBElement<String> other) {
		return value == null ? value : (value.startsWith("other") ? (other == null ? null : other.getValue()) : value);
	}

}
