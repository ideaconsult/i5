package net.idea.i5._0.ambit2;

import ambit2.base.data.Property;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.processors.DefaultAmbitProcessor;
import eu.europa.echa.schemas.iuclid5._20070330.referencesubstance.ReferenceSubstance;

public class I5AmbitProcessor<Target> extends DefaultAmbitProcessor<Target, IStructureRecord> {
	protected SubstanceRecord record = new SubstanceRecord();
	/**
	 * 
	 */
	private static final long serialVersionUID = -38158314141255416L;

	public IStructureRecord process(Target unmarshalled) throws AmbitException {
		if (unmarshalled instanceof ReferenceSubstance)
			return transform2record((ReferenceSubstance)unmarshalled);
		return null;
	}

	protected IStructureRecord transform2record(ReferenceSubstance unmarshalled) {
		record.clear();
		if (unmarshalled.getDocumentReferencePK()!=null)
			record.setProperty(Property.getI5UUIDInstance(),unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getName()!=null)
			record.setProperty(Property.getNameInstance(),unmarshalled.getName());
		if (unmarshalled.getReferenceSubstanceStructure()!=null) {
			record.setInchi(unmarshalled.getReferenceSubstanceStructure().getInChI());
			record.setSmiles(unmarshalled.getReferenceSubstanceStructure().getSmilesNotation());
			//record.setFormula(unmarshalled.getReferenceSubstanceStructure().getStructureFormula().);
		}
			
		return record;
	}
	
}
