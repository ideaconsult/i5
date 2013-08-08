package net.idea.i5._0.ambit2;

import java.util.ArrayList;
import java.util.List;

import ambit2.base.data.LiteratureEntry;
import ambit2.base.data.Property;
import ambit2.base.data.StructureRecord;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.interfaces.IStructureRecord.MOL_TYPE;
import ambit2.base.processors.CASProcessor;
import ambit2.base.processors.DefaultAmbitProcessor;
import ambit2.core.config.AmbitCONSTANTS;
import ambit2.core.io.ECHAPreregistrationListReader;
import ambit2.core.io.I5ReaderSimple;
import eu.europa.echa.schemas.iuclid5._20070330.referencesubstance.ReferenceSubstance;
import eu.europa.echa.schemas.iuclid5._20070330.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.CasInformation;
import eu.europa.echa.schemas.iuclid5._20070330.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.Synonyms;

public class I5AmbitProcessor<Target> extends DefaultAmbitProcessor<Target, IStructureRecord> {
	//protected SubstanceRecord substanceRecord = new SubstanceRecord();
	protected StructureRecord structureRecord = new StructureRecord();
	protected CASProcessor casProcessor = new CASProcessor();
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
		structureRecord.clear();
		if (unmarshalled.getDocumentReferencePK()!=null)
			setUUID(structureRecord,unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getName()!=null)
			structureRecord.setProperty(I5ReaderSimple.nameProperty,unmarshalled.getName());
		
		if (unmarshalled.getEcSubstanceInventoryEntryRef().getNumber()!=null)
			structureRecord.setProperty(I5ReaderSimple.ecProperty,unmarshalled.getEcSubstanceInventoryEntryRef().getNumber());
		
		if (unmarshalled.getReferenceSubstanceStructure()!=null) {
			structureRecord.setFormat(MOL_TYPE.INC.name());
			structureRecord.setContent(unmarshalled.getReferenceSubstanceStructure().getInChI());
			structureRecord.setInchi(null);
			structureRecord.setSmiles(unmarshalled.getReferenceSubstanceStructure().getSmilesNotation());
			structureRecord.setFormula(unmarshalled.getReferenceSubstanceStructure().getMolecularFormula());
		}
		CasInformation cas = unmarshalled.getReferenceSubstanceInformation().getCasInformation();
		if (cas!=null) {
			try {
				structureRecord.setProperty(I5ReaderSimple.casProperty,casProcessor.process(cas.getCasNumber()));
			} catch (Exception x) {
				structureRecord.setProperty(I5ReaderSimple.casProperty,cas.getCasNumber());
			}
		}
		if (unmarshalled.getReferenceSubstanceInformation().getIupacName()!=null)
			structureRecord.setProperty(Property.getNameInstance(),unmarshalled.getReferenceSubstanceInformation().getIupacName());
		
		Synonyms synonyms = unmarshalled.getReferenceSubstanceInformation().getSynonyms();
		if (synonyms!=null) {
			List<String> lookup = new ArrayList<String>();
			for (int i=0;i < synonyms.getSynonym().size();i++)
				if (lookup.indexOf(synonyms.getSynonym().get(i).getName())<0)
					lookup.add(synonyms.getSynonym().get(i).getName());
			for (int i=0;i < lookup.size();i++)
				structureRecord.setProperty(
						Property.getInstance(AmbitCONSTANTS.NAMES,
						LiteratureEntry.getInstance(String.format("%s %s#%d",I5ReaderSimple.I5_REFERENCE,
								ECHAPreregistrationListReader.echa_tags.SYNONYM.toString(),i+1, 
								I5ReaderSimple.I5_URL),I5ReaderSimple.I5_URL))
						,lookup.get(i));		
			
		}
			
		return structureRecord;
	}

	protected void setUUID(IStructureRecord record,String value) {
		int slashpos = value.indexOf("/");
		if (slashpos>0)
			record.setProperty(Property.getI5UUIDInstance(),value.substring(0,slashpos));
		else
			record.setProperty(Property.getI5UUIDInstance(),value);
	}
	protected void setFormat(IStructureRecord record) {
		record.setFormat("i5._0.");
	}
}
