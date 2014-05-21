package net.idea.i5._5.ambit2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;

import javax.xml.bind.JAXBElement;

import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.IQASettings;
import net.idea.i5.io.IStudyRecordConverter;
import net.idea.i5.io.QACriteriaException;
import net.idea.i5.io.QASettings;
import ambit2.base.data.LiteratureEntry;
import ambit2.base.data.Property;
import ambit2.base.data.StructureRecord;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.substance.ExternalIdentifier;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.interfaces.IStructureRecord.MOL_TYPE;
import ambit2.base.interfaces.IStructureRecord.STRUC_TYPE;
import ambit2.base.processors.CASProcessor;
import ambit2.base.processors.DefaultAmbitProcessor;
import ambit2.base.relation.STRUCTURE_RELATION;
import ambit2.base.relation.composition.Proportion;
import ambit2.core.config.AmbitCONSTANTS;
import ambit2.core.io.ECHAPreregistrationListReader;
import ambit2.core.io.I5ReaderSimple;
import eu.europa.echa.schemas.iuclid5._20130101.referencesubstance.ReferenceSubstance;
import eu.europa.echa.schemas.iuclid5._20130101.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.CasInformation;
import eu.europa.echa.schemas.iuclid5._20130101.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.Synonyms;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.ExternalSystemIdentifiers.ExternalSystemIdentifier;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions.SubstanceComposition;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions.SubstanceComposition.Additives.Additive;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions.SubstanceComposition.Constituents.Constituent;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions.SubstanceComposition.Impurities.Impurity;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.TradeNames.TradeName;

public class I5AmbitProcessor<Target> extends DefaultAmbitProcessor<Target, IStructureRecord> implements IQASettings {
	protected SubstanceRecord record = new SubstanceRecord();
	protected StructureRecord structureRecord = new StructureRecord();
	protected CASProcessor casProcessor = new CASProcessor();
	
	protected Hashtable<String, IStudyRecordConverter> convertors = new Hashtable<String,IStudyRecordConverter>();
	protected QASettings qaSettings;
	@Override
	public QASettings getQASettings() {
		if (qaSettings==null) qaSettings = new QASettings();
		return qaSettings;
	}
	@Override
	public void setQASettings(QASettings qualityCheckEnabled) {
		this.qaSettings = qualityCheckEnabled;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -38158314141255416L;

	public IStructureRecord process(Target unmarshalled) throws AmbitException {
		if (unmarshalled instanceof Substance) {
			if (!acceptSubstance((Substance) unmarshalled)) return null;
			else return transform2record((Substance) unmarshalled);
		} else if (unmarshalled instanceof ReferenceSubstance) 
			return transform2record((ReferenceSubstance) unmarshalled);
		try {	
			IStudyRecordConverter convertor = getConvertor(unmarshalled.getClass().getName());	
			if (convertor != null)
				return convertor.transform2record(unmarshalled, record);
		} catch (QACriteriaException x) { 
			//reliability exception
			logger.log(Level.INFO,x.getMessage());
			return null;
		} catch (AmbitException x) {
			throw x;
		} catch (Exception x) {
			throw new AmbitException(x);
		}
		return null;
	}
	
	protected boolean acceptSubstance(Substance substance) {
		return true;
	}
	protected IStudyRecordConverter getConvertor(String className) throws Exception {
		IStudyRecordConverter convertor = null;
		String tagName = className.replace("eu.europa.echa.schemas.iuclid5._20130101.studyrecord.","").
						replace("_SECTION","").replace(".EndpointStudyRecord","");
		try {
			I5_ROOT_OBJECTS tag = I5_ROOT_OBJECTS.valueOf(tagName);
			if (tag.isScientificPart()) {
				convertor = convertors.get(tag.name());
				if (convertor == null) {
					Object cnv = Class.forName("net.idea.i5._5.ambit2.sections."+tag+"_SECTION.StudyRecordConverter").newInstance();
					if (cnv instanceof IStudyRecordConverter) {
						convertor = (IStudyRecordConverter)cnv;
						convertor.setQASettings(getQASettings());
						convertors.put(tag.name(),convertor);
					} else throw new Exception("Not an instance of IStudyRecordConverter!");
				} else {
					convertor.setQASettings(getQASettings());
				}
			}
		} catch (Exception x) {
			throw x;
		}
		return convertor;		
	}

	protected IStructureRecord transform2record(Substance unmarshalled) {
		record.clear();
		setFormat(record);
		if (unmarshalled != null) {
			// owner
			try {
				setOwnerUUID(record,unmarshalled.getOwnerLegalEntity().getUniqueKey());
			} catch (Exception x) {
				record.setOwnerUUID(null);
			}
			try {record.setOwnerName(unmarshalled.getOwnerLegalEntity().getDescription());} catch (Exception x) {record.setOwnerName("");}
			record.setCompanyName(unmarshalled.getChemicalName());
			record.setPublicName(unmarshalled.getPublicName());
			setCompanyUUID(record, unmarshalled.getDocumentReferencePK());
			// get from phrases
			try {
				record.setSubstancetype(getValue(
						Phrases.phrasegroup_N08
						.get(unmarshalled.getComposition().getValueID()),
						unmarshalled.getComposition().getOtherValue()
						));
			} catch (Exception x) {
				record.setSubstancetype("Error reading the composition type");
			}
			if (unmarshalled.getExternalSystemIdentifiers() != null)
				for (ExternalSystemIdentifier id : unmarshalled.getExternalSystemIdentifiers().getExternalSystemIdentifier()) {
					if (record.getExternalids()==null) record.setExternalids(new ArrayList<ExternalIdentifier>());
					record.getExternalids().add(new ExternalIdentifier(id.getExternalSystemDesignator(),id.getID()));
				}

			if (unmarshalled.getReferenceSubstanceRef() != null) {
				setReferenceSubstanceUUID(record, unmarshalled
						.getReferenceSubstanceRef().getUniqueKey());
			}

			SubstanceCompositions sc = unmarshalled.getSubstanceCompositions();
			if (sc!=null)
			for (SubstanceComposition c : sc.getSubstanceComposition()) {

				if ((c.getAdditives() != null) && (c.getAdditives().getAdditive()!=null))
					for (Additive a : c.getAdditives().getAdditive())
						additive2record(c.getLocalUUID(), record, a);

				if ((c.getImpurities() != null) && (c.getImpurities().getImpurity()!=null))
					for (Impurity a : c.getImpurities().getImpurity())
						impurity2record(c.getLocalUUID(), record, a);

				if (c.getConstituents() != null && (c.getConstituents().getConstituent()!=null)) 
					for (Constituent a : c.getConstituents().getConstituent()) {
						Substance substance = unmarshalled;
						try {
							if (!substance.getReferenceSubstanceRef().getUniqueKey().equals(a.getReferenceSubstance().getUniqueKey()))
								substance = null;
						} catch (Exception x) {
						}
						constituent2record(substance, c.getLocalUUID(), record, a);
					}

			}
		}
		return record;
	}

	/**
	 * Create structure record from additive
	 * 
	 * @param constituent
	 * @return
	 */
	protected IStructureRecord additive2record(String compositionUUID,
			SubstanceRecord substance, Additive a) {
		IStructureRecord record = new StructureRecord();
		setFormat(record);

		record.setType(STRUC_TYPE.NA);
		if (a.getReferenceSubstance() != null) {
			record.setContent(a.getReferenceSubstance().getDescription());
			setReferenceSubstanceUUID(record, a.getReferenceSubstance()
					.getUniqueKey());
		}

		Proportion p = new Proportion();
		if (a.getProportionReal() != null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
			try {
				p.setReal_lower(Phrases.phrasegroup_A02.get(a
						.getProportionReal().getLowerPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}
			try {
				p.setReal_upper(Phrases.phrasegroup_A02.get(a
						.getProportionReal().getUpperPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}
			try {
				p.setReal_unit(Phrases.phrasegroup_N24.get(a
						.getProportionReal().getUnit().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}

		}
		if (a.getProportionTypical() != null) {
			p.setTypical_value(a.getProportionTypical().getValue());
			try {
				p.setTypical(Phrases.phrasegroup_A02.get(a
						.getProportionTypical().getPrecision().getValueID()));
			} catch (Exception x) {
				p.setTypical("");
			}
			try {
				p.setTypical_unit(Phrases.phrasegroup_N24.get(a
						.getProportionTypical().getUnit().getValueID()));
			} catch (Exception x) {
				p.setTypical_unit("");
			}
		}
	
		try {
			p.setFunction(Phrases.phrasegroup_N28.get(a.getFunction()
					.getValueID()));
		} catch (Exception x) {
			p.setFunction("Error reading the function type");
		}
		substance.addStructureRelation(compositionUUID, record,
				STRUCTURE_RELATION.HAS_ADDITIVE, p);

		return record;
	}

	/**
	 * Create structure record from impurity
	 * 
	 * @param constituent
	 * @return
	 */
	protected IStructureRecord impurity2record(String compositionUUID,
			SubstanceRecord substance, Impurity a) {
		IStructureRecord record = new StructureRecord();
		setFormat(record);

		record.setType(STRUC_TYPE.NA);
		if (a.getReferenceSubstance() != null) {
			record.setContent(a.getReferenceSubstance().getDescription());
			setReferenceSubstanceUUID(record, a.getReferenceSubstance()
					.getUniqueKey());
		}

		Proportion p = new Proportion();
		if (a.getProportionReal() != null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
			try {
				p.setReal_lower(Phrases.phrasegroup_A02.get(a
						.getProportionReal().getLowerPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}
			try {
				p.setReal_upper(Phrases.phrasegroup_A02.get(a
						.getProportionReal().getUpperPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}
			try {
				p.setReal_unit(Phrases.phrasegroup_N24.get(a
						.getProportionReal().getUnit().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}
		}

		if (a.getProportionTypical() != null) {
			p.setTypical_value(a.getProportionTypical().getValue());
			try {
				p.setTypical(Phrases.phrasegroup_A02.get(a
						.getProportionTypical().getPrecision().getValueID()));
			} catch (Exception x) {
				p.setTypical("");
			}
			try {
				p.setTypical_unit(Phrases.phrasegroup_N24.get(a
						.getProportionTypical().getUnit().getValueID()));
			} catch (Exception x) {
				p.setTypical_unit("");
			}

		}
	
		substance.addStructureRelation(compositionUUID, record,
				STRUCTURE_RELATION.HAS_IMPURITY, p);

		return record;
	}

	/**
	 * Create structure record from impurity
	 * 
	 * @param constituent
	 * @return
	 */
	protected IStructureRecord constituent2record(Substance unmarshalled,
			String compositionUUID, SubstanceRecord substance, Constituent a) {
		IStructureRecord record = new StructureRecord();
		setFormat(record);
		record.setType(STRUC_TYPE.NA);
		record.setContent(a.getReferenceSubstance().getDescription());

		setReferenceSubstanceUUID(record, a.getReferenceSubstance()
				.getUniqueKey());

		Proportion p = new Proportion();
		if (a.getProportionReal() != null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
			try {
				p.setReal_lower(Phrases.phrasegroup_A02.get(a
						.getProportionReal().getLowerPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}
			try {
				p.setReal_upper(Phrases.phrasegroup_A02.get(a
						.getProportionReal().getUpperPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}
			try {
				p.setReal_unit(Phrases.phrasegroup_N24.get(a
						.getProportionReal().getUnit().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}
		}

		if (a.getProportionTypical() != null) {
			p.setTypical_value(a.getProportionTypical().getValue());
			try {
				p.setTypical(Phrases.phrasegroup_A02.get(a
						.getProportionTypical().getPrecision().getValueID()));
			} catch (Exception x) {
				p.setTypical("");
			}
			try {
				p.setTypical_unit(Phrases.phrasegroup_N24.get(a
						.getProportionTypical().getUnit().getValueID()));
			} catch (Exception x) {
				p.setTypical_unit("");
			}
		}
		
		substance.addStructureRelation(compositionUUID, record,
				STRUCTURE_RELATION.HAS_CONSTITUENT, p);
		// Adding the tradenames to the reference structure
		if ((unmarshalled != null) && (unmarshalled.getTradeNames() != null)) {
			for (int i = 0; i < unmarshalled.getTradeNames().getTradeName()
					.size(); i++) {
				TradeName name = unmarshalled.getTradeNames().getTradeName()
						.get(i);
				Property prop = Property.getInstance(
						String.format("Trade name %d", (i + 1)),
						LiteratureEntry.getI5UUIDReference());
				prop.setLabel(Property.opentox_TradeName);
				record.setProperty(prop, name.getName());

				if (name.getRemarks() != null && !"".equals(name.getRemarks())) {
					prop = Property.getInstance("Identifier",
							LiteratureEntry.getI5UUIDReference());
					prop.setLabel(Property.opentox_TradeName);
					record.setProperty(prop, name.getRemarks());
				}
			}
		}

		return record;
	}

	protected IStructureRecord transform2record(ReferenceSubstance unmarshalled) {
		structureRecord.clear();
		setFormat(structureRecord);
		if (unmarshalled.getDocumentReferencePK() != null)
			setReferenceSubstanceUUID(structureRecord,
					unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getName() != null)
			structureRecord.setProperty(I5ReaderSimple.nameProperty,
					unmarshalled.getName());
		
		if (unmarshalled.getEcSubstanceInventoryEntryRef()!=null) 
			if (unmarshalled.getEcSubstanceInventoryEntryRef().getNumber() != null)
				structureRecord.setProperty(I5ReaderSimple.ecProperty, unmarshalled.getEcSubstanceInventoryEntryRef().getNumber());

		structureRecord.setFormat(null);
		if (unmarshalled.getReferenceSubstanceStructure() != null) {
			String inchi = unmarshalled.getReferenceSubstanceStructure().getInChI();
			if (inchi != null && !"".equals(inchi)) {
				structureRecord.setFormat(MOL_TYPE.INC.name());
				structureRecord.setContent(inchi);
				structureRecord.setType(STRUC_TYPE.D1);
			} else {
				structureRecord.setFormat(null);
				structureRecord.setContent("");
				structureRecord.setType(STRUC_TYPE.NA);
			}
			structureRecord.setInchi(null);
			String smiles = unmarshalled.getReferenceSubstanceStructure().getSmilesNotation();
			if (smiles != null && !"".equals(smiles)) {
				if (structureRecord.getFormat()==null) {
					structureRecord.setFormat(MOL_TYPE.INC.name());
					structureRecord.setContent(smiles);
				}
				structureRecord.setType(STRUC_TYPE.D1);
			}
			structureRecord.setSmiles(smiles);
			structureRecord.setFormula(unmarshalled.getReferenceSubstanceStructure().getMolecularFormula());
		} else
			structureRecord.setType(STRUC_TYPE.NA);

		if (structureRecord.getFormat()==null) structureRecord.setFormat(MOL_TYPE.SDF.name());
		CasInformation cas = unmarshalled.getReferenceSubstanceInformation().getCasInformation();
		if (cas != null) {
			try {
				structureRecord.setProperty(I5ReaderSimple.casProperty,casProcessor.process(cas.getCasNumber()));
			} catch (Exception x) {
				structureRecord.setProperty(I5ReaderSimple.casProperty,	cas.getCasNumber());
			}
			/* CAS name
			try {
				structureRecord.setProperty(I5ReaderSimple.casProperty,casProcessor.process(cas.getCasNumber()));
			} catch (Exception x) {
				structureRecord.setProperty(I5ReaderSimple.casProperty,	cas.getCasNumber());
			}
			*/
		}
		String iupacName = unmarshalled.getReferenceSubstanceInformation().getIupacName();
		if ((iupacName != null) && !"".equals(iupacName.trim()))
			structureRecord.setProperty(Property.getNameInstance(), iupacName);
		
		
		Synonyms synonyms = unmarshalled.getReferenceSubstanceInformation().getSynonyms();
		if (synonyms != null) {
			List<String> lookup = new ArrayList<String>();
			for (int i = 0; i < synonyms.getSynonym().size(); i++)
				if (lookup.indexOf(synonyms.getSynonym().get(i).getName()) < 0)
					lookup.add(synonyms.getSynonym().get(i).getName());
			
			
			for (int i = 0; i < lookup.size(); i++) {
				structureRecord
						.setProperty(
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

		}

		return structureRecord;
	}

	protected void setCompanyUUID(SubstanceRecord record, String value) {
		int slashpos = value.indexOf("/");
		if (slashpos > 0)
			record.setCompanyUUID(value.substring(0, slashpos));
		else
			record.setCompanyUUID(value);
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
		if (slashpos > 0)
			record.setProperty(Property.getI5UUIDInstance(),
					value.substring(0, slashpos));
		else
			record.setProperty(Property.getI5UUIDInstance(), value);
	}

	protected void setFormat(IStructureRecord record) {
		record.setFormat("i5._5.");
	}
	protected String getValue(String value, JAXBElement<String> other) {
		return value==null?value:(value.startsWith("other")?(other==null?null:other.getValue()):value);
	}

}

