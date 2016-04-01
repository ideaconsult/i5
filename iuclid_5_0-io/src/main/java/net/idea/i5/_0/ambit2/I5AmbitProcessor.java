package net.idea.i5._0.ambit2;

import java.util.ArrayList;
import java.util.List;

import net.idea.i5.io.IuclidAmbitProcessor;
import net.idea.modbcum.i.exceptions.AmbitException;
import ambit2.base.data.LiteratureEntry;
import ambit2.base.data.Property;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.interfaces.IStructureRecord.MOL_TYPE;
import ambit2.core.config.AmbitCONSTANTS;
import ambit2.core.io.ECHAPreregistrationListReader;
import ambit2.core.io.I5ReaderSimple;
import eu.europa.echa.schemas.iuclid5._20070330.referencesubstance.ReferenceSubstance;
import eu.europa.echa.schemas.iuclid5._20070330.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.CasInformation;
import eu.europa.echa.schemas.iuclid5._20070330.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.Synonyms;

public class I5AmbitProcessor<Target> extends IuclidAmbitProcessor<Target> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3640668819435122630L;

	public I5AmbitProcessor(String container) {
		super(container);
	}

	public IStructureRecord process(Target unmarshalled) throws AmbitException {
		if (unmarshalled instanceof ReferenceSubstance)
			return transform2record((ReferenceSubstance) unmarshalled);
		return null;
	}

	protected IStructureRecord transform2record(ReferenceSubstance unmarshalled) {
		structureRecord.clear();
		if (unmarshalled.getDocumentReferencePK() != null)
			setReferenceSubstanceUUID(structureRecord,
					unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getName() != null)
			structureRecord.setRecordProperty(I5ReaderSimple.nameProperty,
					unmarshalled.getName());

		if (unmarshalled.getEcSubstanceInventoryEntryRef().getNumber() != null)
			structureRecord.setRecordProperty(I5ReaderSimple.ecProperty,
					unmarshalled.getEcSubstanceInventoryEntryRef().getNumber());

		if (unmarshalled.getReferenceSubstanceStructure() != null) {
			structureRecord.setFormat(MOL_TYPE.INC.name());
			structureRecord.setContent(unmarshalled
					.getReferenceSubstanceStructure().getInChI());
			structureRecord.setInchi(null);
			structureRecord.setSmiles(unmarshalled
					.getReferenceSubstanceStructure().getSmilesNotation());
			structureRecord.setFormula(unmarshalled
					.getReferenceSubstanceStructure().getMolecularFormula());
		}
		CasInformation cas = unmarshalled.getReferenceSubstanceInformation()
				.getCasInformation();
		if (cas != null) {
			try {
				structureRecord.setRecordProperty(I5ReaderSimple.casProperty,
						casProcessor.process(cas.getCasNumber()));
			} catch (Exception x) {
				structureRecord.setRecordProperty(I5ReaderSimple.casProperty,
						cas.getCasNumber());
			}
		}
		if (unmarshalled.getReferenceSubstanceInformation().getIupacName() != null)
			structureRecord.setRecordProperty(Property.getNameInstance(),
					unmarshalled.getReferenceSubstanceInformation()
							.getIupacName());

		Synonyms synonyms = unmarshalled.getReferenceSubstanceInformation()
				.getSynonyms();
		if (synonyms != null) {
			List<String> lookup = new ArrayList<String>();
			for (int i = 0; i < synonyms.getSynonym().size(); i++)
				if (lookup.indexOf(synonyms.getSynonym().get(i).getName()) < 0)
					lookup.add(synonyms.getSynonym().get(i).getName());
			for (int i = 0; i < lookup.size(); i++)
				structureRecord
						.setRecordProperty(
								Property.getInstance(
										AmbitCONSTANTS.NAMES,
										LiteratureEntry.getInstance(
												String.format(
														"%s %s#%d",
														I5ReaderSimple.I5_REFERENCE,
														ECHAPreregistrationListReader.echa_tags.SYNONYM
																.toString(),
														i + 1,
														I5ReaderSimple.I5_URL),
												I5ReaderSimple.I5_URL)), lookup
										.get(i));

		}

		return structureRecord;
	}

	protected void setFormat(IStructureRecord record) {
		record.setFormat("i5._0.");
	}
}
