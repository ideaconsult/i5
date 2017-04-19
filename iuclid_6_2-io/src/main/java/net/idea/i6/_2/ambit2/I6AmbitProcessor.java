package net.idea.i6._2.ambit2;

import java.util.Hashtable;
import java.util.logging.Level;

import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.reference_substance._2.REFERENCESUBSTANCE;
import eu.europa.echa.iuclid6.namespaces.substance._2.SUBSTANCE;
import net.idea.i5.io.IStudyRecordConverter;
import net.idea.i5.io.IuclidAmbitProcessor;
import net.idea.i5.io.QACriteriaException;
import net.idea.i6.io.I6_ROOT_OBJECTS;
import net.idea.modbcum.i.exceptions.AmbitException;

public class I6AmbitProcessor<Target> extends IuclidAmbitProcessor<Target> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4709118915064457190L;
	protected Hashtable<String, IStudyRecordConverter> convertors = new Hashtable<String, IStudyRecordConverter>();

	public I6AmbitProcessor(String container) {
		super(container);
	}

	public IStructureRecord process(Target unmarshalled) throws AmbitException {
		Object content = unmarshalled;
		if (unmarshalled instanceof Document) {
			content = ((Document) unmarshalled).getContent().getAny();
		}
		if (content instanceof SUBSTANCE) {
			if (!acceptSubstance((SUBSTANCE) content))
				return null;
			else
				return transform2record((SUBSTANCE) content);
		} else if (content instanceof REFERENCESUBSTANCE)
			return transform2record((REFERENCESUBSTANCE) content);
		try {
			IStudyRecordConverter convertor = getConvertor(content.getClass().getName());
			if (convertor != null)
				return convertor.transform2record(new EndpointStudyRecordWrapper((Document)unmarshalled), record);
		} catch (QACriteriaException x) {
			// reliability exception
			logger.log(Level.FINE, x.getMessage());
			return null;
		} catch (AmbitException x) {
			throw x;
		} catch (Exception x) {
			throw new AmbitException(x);
		}
		return null;
	}

	protected boolean acceptSubstance(SUBSTANCE substance) {
		return true;
	}

	protected IStudyRecordConverter getConvertor(String className) throws Exception {
		IStudyRecordConverter convertor = null;
		String[] path = className.split("\\.");
		String tagName = path[path.length - 1];
		try {
			I6_ROOT_OBJECTS tag = I6_ROOT_OBJECTS
					.valueOf(tagName.replace("ENDPOINTSTUDYRECORD", "ENDPOINT_STUDY_RECORD_"));
			if (tag.isScientificPart()) {
				convertor = convertors.get(tag.name());
				if (convertor == null) {
					String clazzName = "net.idea.i6._2.ambit2.sections.I6StudyRecordConverter";
					
					 //String clazzName = "net.idea.i6._2.ambit2.sections." + path[path.length - 3]+ ".StudyRecordConverter";
					
					Object cnv = Class.forName(clazzName).newInstance();
					if (cnv instanceof IStudyRecordConverter) {
						convertor = (IStudyRecordConverter) cnv;
						convertor.setQASettings(getQASettings());
						convertors.put(tag.name(), convertor);
					} else
						throw new Exception("Not an instance of IStudyRecordConverter!");
				} else {
					convertor.setQASettings(getQASettings());
				}
			}
		} catch (Exception x) {
			throw x;
		}
		return convertor;
	}

	// net.idea.i6._2.ambit2.sections.endpoint_study_record_watersolubility.StudyRecordConverter
	// net.idea.i6._2.ambit2.sections.endpoint_study_record_watersolubility.StudyRecordConvertor
	protected IStructureRecord transform2record(SUBSTANCE unmarshalled) {
		record.clear();
		setFormat(record);
		if (unmarshalled != null) {
			// owner
			try {
				// in I6 this is the key
				setOwnerUUID(record, unmarshalled.getOwnerLegalEntity());
			} catch (Exception x) {
				record.setOwnerUUID(null);
			}
			try {
				// TODO need to parse the manifest / legal entity to get this
				// record.setOwnerName(unmarshalled.getOwnerLegalEntity().getDescription());
			} catch (Exception x) {
				record.setOwnerName("");
			}
			record.setSubstanceName(unmarshalled.getChemicalName());
			record.setPublicName(unmarshalled.getPublicName());
			/*
			 * setCompanyUUID(record, unmarshalled.getDocumentReferencePK()); //
			 * get from phrases try {
			 * record.setSubstancetype(getValue(Phrases.phrasegroup_N08
			 * .get(unmarshalled.getComposition().getValueID()),
			 * unmarshalled.getComposition().getOtherValue())); } catch
			 * (Exception x) {
			 * record.setSubstancetype("Error reading the composition type"); }
			 * if (unmarshalled.getExternalSystemIdentifiers() != null) for
			 * (ExternalSystemIdentifier id : unmarshalled
			 * .getExternalSystemIdentifiers() .getExternalSystemIdentifier()) {
			 * if (record.getExternalids() == null) record.setExternalids(new
			 * ArrayList<ExternalIdentifier>()); record.getExternalids()
			 * .add(new ExternalIdentifier(id .getExternalSystemDesignator(),
			 * id.getID())); }
			 * 
			 * if (unmarshalled.getReferenceSubstance() != null) {
			 * setReferenceSubstanceUUID(record, unmarshalled.
			 * getReferenceSubstance().getReferenceSubstance()); }
			 * 
			 * SubstanceCompositions sc =
			 * unmarshalled.getSubstanceCompositions(); if (sc != null) for
			 * (SubstanceComposition c : sc.getSubstanceComposition()) { //
			 * c.getName(); if ((c.getAdditives() != null) &&
			 * (c.getAdditives().getAdditive() != null)) for (Additive a :
			 * c.getAdditives().getAdditive()) additive2record(c.getLocalUUID(),
			 * c.getName(), record, a);
			 * 
			 * if ((c.getImpurities() != null) &&
			 * (c.getImpurities().getImpurity() != null)) for (Impurity a :
			 * c.getImpurities().getImpurity())
			 * impurity2record(c.getLocalUUID(), c.getName(), record, a);
			 * 
			 * if (c.getConstituents() != null &&
			 * (c.getConstituents().getConstituent() != null)) for (Constituent
			 * a : c.getConstituents() .getConstituent()) { Substance substance
			 * = unmarshalled; try { if (!substance .getReferenceSubstanceRef()
			 * .getUniqueKey() .equals(a.getReferenceSubstance()
			 * .getUniqueKey())) substance = null; } catch (Exception x) { }
			 * constituent2record(substance, c.getLocalUUID(), c.getName(),
			 * record, a); }
			 * 
			 * }
			 */
		}
		return record;
	}

	/*
	 * protected IStructureRecord additive2record(String compositionUUID, String
	 * name, SubstanceRecord substance, Additive a) { IStructureRecord record =
	 * new StructureRecord(); setFormat(record);
	 * 
	 * record.setType(STRUC_TYPE.NA); if (a.getReferenceSubstance() != null) {
	 * record.setContent(a.getReferenceSubstance().getDescription());
	 * setReferenceSubstanceUUID(record, a.getReferenceSubstance()
	 * .getUniqueKey()); }
	 * 
	 * Proportion p = new Proportion(); if (a.getProportionReal() != null) {
	 * p.setReal_lowervalue(a.getProportionReal().getLowerValue());
	 * p.setReal_uppervalue(a.getProportionReal().getUpperValue()); try {
	 * p.setReal_lower(Phrases.get(Phrases.phrasegroup_A02, a
	 * .getProportionReal().getLowerPrecision().getValueID())); } catch
	 * (Exception x) { p.setReal_unit(""); } try {
	 * p.setReal_upper(Phrases.phrasegroup_A02.get(a
	 * .getProportionReal().getUpperPrecision().getValueID())); } catch
	 * (Exception x) { p.setReal_unit(""); } try {
	 * p.setReal_unit(Phrases.phrasegroup_N24.get(a
	 * .getProportionReal().getUnit().getValueID())); } catch (Exception x) {
	 * p.setReal_unit(""); }
	 * 
	 * } if (a.getProportionTypical() != null) {
	 * p.setTypical_value(a.getProportionTypical().getValue()); try {
	 * p.setTypical(Phrases.phrasegroup_A02.get(a
	 * .getProportionTypical().getPrecision().getValueID())); } catch (Exception
	 * x) { p.setTypical(""); } try {
	 * p.setTypical_unit(Phrases.phrasegroup_N24.get(a
	 * .getProportionTypical().getUnit().getValueID())); } catch (Exception x) {
	 * p.setTypical_unit(""); } }
	 * 
	 * try { p.setFunction(Phrases.phrasegroup_N28.get(a.getFunction()
	 * .getValueID())); } catch (Exception x) {
	 * p.setFunction("Error reading the function type"); } IStructureRelation r
	 * = substance.addStructureRelation(compositionUUID, record,
	 * STRUCTURE_RELATION.HAS_ADDITIVE, p); r.setName(name); return record; }
	 */

	/*
	 * protected IStructureRecord impurity2record(String compositionUUID, String
	 * name, SubstanceRecord substance, Impurity a) { IStructureRecord record =
	 * new StructureRecord(); setFormat(record);
	 * 
	 * record.setType(STRUC_TYPE.NA); if (a.getReferenceSubstance() != null) {
	 * record.setContent(a.getReferenceSubstance().getDescription());
	 * setReferenceSubstanceUUID(record, a.getReferenceSubstance()
	 * .getUniqueKey()); }
	 * 
	 * Proportion p = new Proportion(); if (a.getProportionReal() != null) {
	 * p.setReal_lowervalue(a.getProportionReal().getLowerValue());
	 * p.setReal_uppervalue(a.getProportionReal().getUpperValue()); try {
	 * p.setReal_lower(Phrases.phrasegroup_A02.get(a
	 * .getProportionReal().getLowerPrecision().getValueID())); } catch
	 * (Exception x) { p.setReal_lower(""); } try {
	 * p.setReal_upper(Phrases.phrasegroup_A02.get(a
	 * .getProportionReal().getUpperPrecision().getValueID())); } catch
	 * (Exception x) { p.setReal_lower(""); } try {
	 * p.setReal_unit(Phrases.phrasegroup_N24.get(a
	 * .getProportionReal().getUnit().getValueID())); } catch (Exception x) {
	 * p.setReal_unit(""); } }
	 * 
	 * if (a.getProportionTypical() != null) {
	 * p.setTypical_value(a.getProportionTypical().getValue()); try {
	 * p.setTypical(Phrases.phrasegroup_A02.get(a
	 * .getProportionTypical().getPrecision().getValueID())); } catch (Exception
	 * x) { p.setTypical(""); } try {
	 * p.setTypical_unit(Phrases.phrasegroup_N24.get(a
	 * .getProportionTypical().getUnit().getValueID())); } catch (Exception x) {
	 * p.setTypical_unit(""); }
	 * 
	 * }
	 * 
	 * IStructureRelation r = substance.addStructureRelation(compositionUUID,
	 * record, STRUCTURE_RELATION.HAS_IMPURITY, p); r.setName(name); return
	 * record; }
	 */

	/*
	 * protected IStructureRecord constituent2record(Substance unmarshalled,
	 * String compositionUUID, String cname, SubstanceRecord substance,
	 * Constituent a) { if (a == null) return null; IStructureRecord record =
	 * new StructureRecord(); setFormat(record); record.setType(STRUC_TYPE.NA);
	 * if (a.getReferenceSubstance() != null) {
	 * record.setContent(a.getReferenceSubstance().getDescription());
	 * 
	 * setReferenceSubstanceUUID(record, a.getReferenceSubstance()
	 * .getUniqueKey()); }
	 * 
	 * Proportion p = new Proportion(); if (a.getProportionReal() != null) {
	 * p.setReal_lowervalue(a.getProportionReal().getLowerValue());
	 * p.setReal_uppervalue(a.getProportionReal().getUpperValue()); try {
	 * p.setReal_lower(Phrases.phrasegroup_A02.get(a
	 * .getProportionReal().getLowerPrecision().getValueID())); } catch
	 * (Exception x) { p.setReal_lower(""); } try {
	 * p.setReal_upper(Phrases.phrasegroup_A02.get(a
	 * .getProportionReal().getUpperPrecision().getValueID())); } catch
	 * (Exception x) { p.setReal_lower(""); } try {
	 * p.setReal_unit(Phrases.phrasegroup_N24.get(a
	 * .getProportionReal().getUnit().getValueID())); } catch (Exception x) {
	 * p.setReal_unit(""); } }
	 * 
	 * if (a.getProportionTypical() != null) {
	 * p.setTypical_value(a.getProportionTypical().getValue()); try {
	 * p.setTypical(Phrases.phrasegroup_A02.get(a
	 * .getProportionTypical().getPrecision().getValueID())); } catch (Exception
	 * x) { p.setTypical(""); } try {
	 * p.setTypical_unit(Phrases.phrasegroup_N24.get(a
	 * .getProportionTypical().getUnit().getValueID())); } catch (Exception x) {
	 * p.setTypical_unit(""); } }
	 * 
	 * IStructureRelation r = substance.addStructureRelation(compositionUUID,
	 * record, STRUCTURE_RELATION.HAS_CONSTITUENT, p); r.setName(cname); //
	 * Adding the tradenames to the reference structure if ((unmarshalled !=
	 * null) && (unmarshalled.getTradeNames() != null)) { for (int i = 0; i <
	 * unmarshalled.getTradeNames().getTradeName() .size(); i++) { TradeName
	 * name = unmarshalled.getTradeNames().getTradeName() .get(i); Property prop
	 * = Property.getInstance( String.format("Trade name %d", (i + 1)),
	 * LiteratureEntry.getI5UUIDReference());
	 * prop.setLabel(Property.opentox_TradeName); record.setRecordProperty(prop,
	 * name.getName());
	 * 
	 * if (name.getRemarks() != null && !"".equals(name.getRemarks())) { prop =
	 * Property.getInstance("Identifier", LiteratureEntry.getI5UUIDReference());
	 * prop.setLabel(Property.opentox_TradeName); record.setRecordProperty(prop,
	 * name.getRemarks()); } } }
	 * 
	 * return record; }
	 */
	protected IStructureRecord transform2record(REFERENCESUBSTANCE unmarshalled) {
		structureRecord.clear();
		setFormat(structureRecord);
		/*
		 * if (unmarshalled.getDocumentReferencePK() != null)
		 * setReferenceSubstanceUUID(structureRecord,
		 * unmarshalled.getDocumentReferencePK()); if (unmarshalled.getName() !=
		 * null) structureRecord.setRecordProperty(I5ReaderSimple.nameProperty,
		 * unmarshalled.getName());
		 * 
		 * if (unmarshalled.getEcSubstanceInventoryEntryRef() != null) if
		 * (unmarshalled.getEcSubstanceInventoryEntryRef().getNumber() != null)
		 * structureRecord.setRecordProperty(I5ReaderSimple.ecProperty,
		 * unmarshalled.getEcSubstanceInventoryEntryRef() .getNumber());
		 * 
		 * structureRecord.setFormat(null); if
		 * (unmarshalled.getReferenceSubstanceStructure() != null) { String
		 * inchi = unmarshalled.getReferenceSubstanceStructure() .getInChI(); if
		 * (inchi != null && !"".equals(inchi)) {
		 * structureRecord.setFormat(MOL_TYPE.INC.name());
		 * structureRecord.setContent(inchi);
		 * structureRecord.setType(STRUC_TYPE.D1); } else {
		 * structureRecord.setFormat(null); structureRecord.setContent("");
		 * structureRecord.setType(STRUC_TYPE.NA); }
		 * structureRecord.setInchi(null); String smiles =
		 * unmarshalled.getReferenceSubstanceStructure() .getSmilesNotation();
		 * if (smiles != null && !"".equals(smiles)) { if
		 * (structureRecord.getFormat() == null) {
		 * structureRecord.setFormat(MOL_TYPE.INC.name());
		 * structureRecord.setContent(smiles); }
		 * structureRecord.setType(STRUC_TYPE.D1); }
		 * structureRecord.setSmiles(smiles);
		 * structureRecord.setFormula(unmarshalled
		 * .getReferenceSubstanceStructure().getMolecularFormula()); } else
		 * structureRecord.setType(STRUC_TYPE.NA);
		 * 
		 * if (structureRecord.getFormat() == null)
		 * structureRecord.setFormat(MOL_TYPE.SDF.name()); CasInformation cas =
		 * unmarshalled.getReferenceSubstanceInformation() .getCasInformation();
		 * if (cas != null) { try {
		 * structureRecord.setRecordProperty(I5ReaderSimple.casProperty,
		 * casProcessor.process(cas.getCasNumber())); } catch (Exception x) {
		 * structureRecord.setRecordProperty(I5ReaderSimple.casProperty,
		 * cas.getCasNumber()); }
		 * 
		 * } String iupacName = unmarshalled.getReferenceSubstanceInformation()
		 * .getIupacName(); setIUPACName(structureRecord,iupacName);
		 * 
		 * Synonyms synonyms = unmarshalled.getReferenceSubstanceInformation()
		 * .getSynonyms(); if (synonyms != null) { List<String> lookup = new
		 * ArrayList<String>(); for (int i = 0; i <
		 * synonyms.getSynonym().size(); i++) if
		 * (lookup.indexOf(synonyms.getSynonym().get(i).getName()) < 0)
		 * lookup.add(synonyms.getSynonym().get(i).getName());
		 * 
		 * for (int i = 0; i < lookup.size(); i++) { structureRecord
		 * .setRecordProperty( Property.getInstance( AmbitCONSTANTS.NAMES,
		 * LiteratureEntry.getInstance( String.format( "%s %s#%d",
		 * I5ReaderSimple.I5_REFERENCE,
		 * ECHAPreregistrationListReader.echa_tags.SYNONYM .toString(), i + 1,
		 * I5ReaderSimple.I5_URL), I5ReaderSimple.I5_URL)), lookup .get(i)); }
		 * 
		 * }
		 */
		return structureRecord;
	}

	protected void setFormat(IStructureRecord record) {
		record.setFormat("i6._2.");
	}

}
