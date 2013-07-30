package net.idea.i5._4.ambit2;

import ambit2.base.data.Property;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.processors.DefaultAmbitProcessor;

public class I5AmbitProcessor<Target> extends DefaultAmbitProcessor<Target, IStructureRecord> {
	protected SubstanceRecord record = new SubstanceRecord();
	/**
	 * 
	 */
	private static final long serialVersionUID = -38158314141255416L;

	public IStructureRecord process(Target unmarshalled) throws AmbitException {
		if (unmarshalled instanceof net.idea.i5._4.substance.Substance)
			return transform2record((net.idea.i5._4.substance.Substance)unmarshalled);
		else
		return null;
	}

	protected IStructureRecord transform2record(net.idea.i5._4.substance.Substance unmarshalled) {
		record.clear();
		if (unmarshalled != null) {
			record.setProperty(Property.getNameInstance(),unmarshalled.getChemicalName());
			record.setProperty(Property.getI5UUIDInstance(),unmarshalled.getDocumentReferencePK());
		}
		return record;
	}
}
