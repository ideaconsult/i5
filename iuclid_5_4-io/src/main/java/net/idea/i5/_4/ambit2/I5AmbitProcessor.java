package net.idea.i5._4.ambit2;

import java.util.ArrayList;
import java.util.List;

import ambit2.base.data.LiteratureEntry;
import ambit2.base.data.Property;
import ambit2.base.data.StructureRecord;
import ambit2.base.data.SubstanceRecord;
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
import eu.europa.echa.schemas.iuclid5._20120101.referencesubstance.ReferenceSubstance;
import eu.europa.echa.schemas.iuclid5._20120101.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.CasInformation;
import eu.europa.echa.schemas.iuclid5._20120101.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.Synonyms;
import eu.europa.echa.schemas.iuclid5._20120101.substance.Substance;
import eu.europa.echa.schemas.iuclid5._20120101.substance.Substance.ExternalSystemIdentifiers.ExternalSystemIdentifier;
import eu.europa.echa.schemas.iuclid5._20120101.substance.Substance.SubstanceCompositions;
import eu.europa.echa.schemas.iuclid5._20120101.substance.Substance.SubstanceCompositions.SubstanceComposition;
import eu.europa.echa.schemas.iuclid5._20120101.substance.Substance.SubstanceCompositions.SubstanceComposition.Additives.Additive;
import eu.europa.echa.schemas.iuclid5._20120101.substance.Substance.SubstanceCompositions.SubstanceComposition.Constituents.Constituent;
import eu.europa.echa.schemas.iuclid5._20120101.substance.Substance.SubstanceCompositions.SubstanceComposition.Impurities.Impurity;
import eu.europa.echa.schemas.iuclid5._20120101.substance.Substance.TradeNames.TradeName;

public class I5AmbitProcessor<Target> extends DefaultAmbitProcessor<Target, IStructureRecord> {
	protected SubstanceRecord record = new SubstanceRecord();
	protected StructureRecord structureRecord = new StructureRecord();
	protected CASProcessor casProcessor = new CASProcessor();
	/**
	 * 
	 */
	private static final long serialVersionUID = -38158314141255416L;

	public IStructureRecord process(Target unmarshalled) throws AmbitException {
		if (unmarshalled instanceof Substance)
			return transform2record((Substance)unmarshalled);
		else if (unmarshalled instanceof ReferenceSubstance)
			return transform2record((ReferenceSubstance)unmarshalled);
		return null;
	}


	protected IStructureRecord transform2record(Substance unmarshalled) {
		record.clear();
		setFormat(record);
		if (unmarshalled != null) {
			//owner
			try {
				record.setOwnerUUID(unmarshalled.getOwnerLegalEntity().getUniqueKey());
			} catch (Exception x) {}
			record.setCompanyName(unmarshalled.getChemicalName());
			record.setPublicName(unmarshalled.getPublicName());
			setCompanyUUID(record,unmarshalled.getDocumentReferencePK());
			//get from phrases
			try {
				record.setSubstancetype(Phrases.phrasegroup_N08.get(unmarshalled.getComposition().getValueID()));
			} catch (Exception x) {
				record.setSubstancetype("Error reading the composition type");
			}
			if (unmarshalled.getTradeNames()!=null) {
				for (int i=0; i < unmarshalled.getTradeNames().getTradeName().size();i++) {
					Property p =  Property.getInstance(String.format("Trade name %d", (i+1)), LiteratureEntry.getTradeNameReference());
					p.setLabel(Property.opentox_TradeName);
					record.setProperty(p,unmarshalled.getTradeNames().getTradeName().get(i).getName());
					//System.out.println(unmarshalled.getTradeNames().getTradeName().get(i).getNameType().getValueID());
					//System.out.println(unmarshalled.getTradeNames().getTradeName().get(i).getRemarks());
					//System.out.println(unmarshalled.getTradeNames().getTradeName().get(i).getCountry().getValueID());
				}
			}	
			/*
			if (unmarshalled.getExternalSystemIdentifiers()!=null)
			for (ExternalSystemIdentifier id : unmarshalled.getExternalSystemIdentifiers().getExternalSystemIdentifier()) {
				System.out.println(id.getExternalSystemDesignator());
				System.out.println(id.getID());
				System.out.println(id.getRemarks());
			}
			*/
			
			//System.out.println("origin\t"+unmarshalled.getOrigin().getOtherValue());
			/*
			formaldehyde / formaldehyde / 50-00-0
			System.out.println(unmarshalled.getReferenceSubstanceRef().getDescription());
			ECB5-053aa8c4-d29b-4aa5-b457-5cc3b47f7d8b/0
			System.out.println(unmarshalled.getReferenceSubstanceRef().getUniqueKey());
			System.out.println(unmarshalled.getReferenceSubstanceRef().getNotes());
			REFERENCE_SUBSTANCE
			System.out.println(unmarshalled.getReferenceSubstanceRef().getType());
			*/
			if (unmarshalled.getReferenceSubstanceRef()!=null) {
				setReferenceSubstanceUUID(record,unmarshalled.getReferenceSubstanceRef().getUniqueKey());
			}
			
			SubstanceCompositions sc = unmarshalled.getSubstanceCompositions();
			for (SubstanceComposition c : sc.getSubstanceComposition()) {
				/*
				System.out.println(c.getLocalUUID());
				System.out.println(c.getName());
				System.out.println(c.getDescription());
				System.out.println(c.getDegreeOfPurity().getUpperValue());
				System.out.println(c.getDegreeOfPurity().getLowerValue());
				System.out.println(c.getDegreeOfPurity().getLowerPrecision().getValue());
				*/
				if (c.getAdditives()!=null)
				for (Additive a : c.getAdditives().getAdditive()) 
					additive2record(c.getLocalUUID(),record,a);

				if (c.getImpurities()!=null)
				for (Impurity a : c.getImpurities().getImpurity()) 
					impurity2record(c.getLocalUUID(),record,a);
						
				
				if (c.getConstituents()!=null)
				for (Constituent a : c.getConstituents().getConstituent()) {
					constituent2record(
							(unmarshalled.getReferenceSubstanceRef().getUniqueKey().equals(a.getReferenceSubstance().getUniqueKey()))?unmarshalled:null,
							c.getLocalUUID(),record,a);
				}	
				
			}
		}
		return record;
	}
	
	/**
	 * Create structure record from additive
	 * @param constituent
	 * @return
	 */
	protected IStructureRecord additive2record(String compositionUUID,SubstanceRecord substance, Additive a) {
		IStructureRecord record = new StructureRecord();
		setFormat(record);
		/*
		System.out.println(constituent.getType()); //REFERENCE_SUBSTANCE
		System.out.println(constituent.getNotes());
		System.out.println(constituent.getDescription());
		*/
		record.setType(STRUC_TYPE.NA);
		if (a.getReferenceSubstance()!=null) {
			record.setContent(a.getReferenceSubstance().getDescription());
			setReferenceSubstanceUUID(record,a.getReferenceSubstance().getUniqueKey());
		}
		
		//a.getFunction() additive specific
		
		Proportion p = new Proportion();
		if (a.getProportionReal()!=null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
			try {
				p.setReal_lower(Phrases.phrasegroup_A02.get(a.getProportionReal().getLowerPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}	
			try {
				p.setReal_upper(Phrases.phrasegroup_A02.get(a.getProportionReal().getUpperPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}
			try {
				p.setReal_unit(Phrases.phrasegroup_N24.get(a.getProportionReal().getUnit().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}

		}
		if (a.getProportionTypical()!=null) {
			try {
				p.setTypical(Phrases.phrasegroup_A02.get(a.getProportionTypical().getPrecision().getValueID()));
			} catch (Exception x) {
				p.setTypical("");
			}			
			p.setTypical_value(a.getProportionTypical().getValue());
			try {
				p.setTypical_unit(Phrases.phrasegroup_N24.get(a.getProportionTypical().getUnit().getValueID()));
			} catch (Exception x) {
				p.setTypical_unit("");
			}
		}
		try {
			p.setFunction(Phrases.phrasegroup_N28.get(a.getFunction().getValueID()));
		} catch (Exception x) {
			p.setFunction("Error reading the function type");
		}		
		substance.addStructureRelation(compositionUUID,record,STRUCTURE_RELATION.HAS_ADDITIVE,p);		
		
		return record;
	}
	
	/**
	 * Create structure record from impurity
	 * @param constituent
	 * @return
	 */
	protected IStructureRecord impurity2record(String compositionUUID,SubstanceRecord substance, Impurity a) {
		IStructureRecord record = new StructureRecord();
		setFormat(record);

		record.setType(STRUC_TYPE.NA);
		if (a.getReferenceSubstance()!=null) {
			record.setContent(a.getReferenceSubstance().getDescription());
			setReferenceSubstanceUUID(record,a.getReferenceSubstance().getUniqueKey());
		}
		
		Proportion p = new Proportion();
		if (a.getProportionReal()!=null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
			try {
				p.setReal_lower(Phrases.phrasegroup_A02.get(a.getProportionReal().getLowerPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}	
			try {
				p.setReal_upper(Phrases.phrasegroup_A02.get(a.getProportionReal().getUpperPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}
			try {
				p.setReal_unit(Phrases.phrasegroup_N24.get(a.getProportionReal().getUnit().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}			
		}
		/**
		 * TODO
			System.out.println(a.getProportionReal().getLowerPrecision().getValue());
			System.out.println(a.getProportionReal().getUpperPrecision().getValue());
		 */
		if (a.getProportionTypical()!=null) {
			p.setTypical_value(a.getProportionTypical().getValue());
			try {
				p.setTypical(Phrases.phrasegroup_A02.get(a.getProportionTypical().getPrecision().getValueID()));
			} catch (Exception x) {
				p.setTypical("");
			}			
			try {
				p.setTypical_unit(Phrases.phrasegroup_N24.get(a.getProportionTypical().getUnit().getValueID()));
			} catch (Exception x) {
				p.setTypical_unit("");
			}
		}
		/**
		 * TODO
		System.out.println(a.getRemarks());
		 */
		substance.addStructureRelation(compositionUUID,record,STRUCTURE_RELATION.HAS_IMPURITY,p);		
		
		return record;
	}
	
	/**
	 * Create structure record from impurity
	 * @param constituent
	 * @return
	 */
	protected IStructureRecord constituent2record(Substance unmarshalled,String compositionUUID,SubstanceRecord substance, Constituent a) {
		IStructureRecord record = new StructureRecord();
		setFormat(record);
		record.setType(STRUC_TYPE.NA);
		record.setContent(a.getReferenceSubstance().getDescription());
		/*
		System.out.println(constituent.getType()); //REFERENCE_SUBSTANCE
		System.out.println(constituent.getNotes());
		System.out.println(constituent.getDescription());
		*/
		setReferenceSubstanceUUID(record,a.getReferenceSubstance().getUniqueKey());
		
		Proportion p = new Proportion();
		if (a.getProportionReal()!=null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
			try {
				p.setReal_lower(Phrases.phrasegroup_A02.get(a.getProportionReal().getLowerPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}	
			try {
				p.setReal_upper(Phrases.phrasegroup_A02.get(a.getProportionReal().getUpperPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_lower("");
			}				
			try {
				p.setReal_unit(Phrases.phrasegroup_N24.get(a.getProportionReal().getUnit().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}
		}
		/**
		 * TODO
			System.out.println(a.getProportionReal().getLowerPrecision().getValue());
			System.out.println(a.getProportionReal().getUpperPrecision().getValue());
		 */
		if (a.getProportionTypical()!=null) {
			p.setTypical_value(a.getProportionTypical().getValue());
			try {
				p.setTypical(Phrases.phrasegroup_A02.get(a.getProportionTypical().getPrecision().getValueID()));
			} catch (Exception x) {
				p.setTypical("");
			}			
			try {
				p.setTypical_unit(Phrases.phrasegroup_N24.get(a.getProportionTypical().getUnit().getValueID()));
			} catch (Exception x) {
				p.setTypical_unit("");
			}
		}
		/**
		 * TODO
		System.out.println(a.getRemarks());
		 */
		substance.addStructureRelation(compositionUUID,record,STRUCTURE_RELATION.HAS_CONSTITUENT,p);
		
		//Adding the tradenames to the reference structure
		if ((unmarshalled!=null) && (unmarshalled.getTradeNames()!=null)) {
			for (int i=0; i < unmarshalled.getTradeNames().getTradeName().size();i++) {
				TradeName name = unmarshalled.getTradeNames().getTradeName().get(i);
				Property prop =  Property.getInstance(String.format("Trade name %d", (i+1)), LiteratureEntry.getI5UUIDReference());
				prop.setLabel(Property.opentox_TradeName);
				record.setProperty(prop,name.getName());
				//System.out.println(unmarshalled.getTradeNames().getTradeName().get(i).getNameType().getValueID());
				
				if (name.getRemarks()!=null && !"".equals(name.getRemarks())) {
					prop =  Property.getInstance("Identifier", LiteratureEntry.getI5UUIDReference());
					prop.setLabel(Property.opentox_TradeName);
					record.setProperty(prop,unmarshalled.getTradeNames().getTradeName().get(i).getRemarks());
				}

				//System.out.println(unmarshalled.getTradeNames().getTradeName().get(i).getCountry().getValueID());
			}
		}			
		return record;
	}
	
	protected IStructureRecord transform2record(ReferenceSubstance unmarshalled) {
		structureRecord.clear();
		if (unmarshalled.getDocumentReferencePK()!=null)
			setReferenceSubstanceUUID(structureRecord,unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getName()!=null)
			structureRecord.setProperty(I5ReaderSimple.nameProperty,unmarshalled.getName());
		
		if (unmarshalled.getEcSubstanceInventoryEntryRef().getNumber()!=null)
			structureRecord.setProperty(I5ReaderSimple.ecProperty,unmarshalled.getEcSubstanceInventoryEntryRef().getNumber());
		
		if (unmarshalled.getReferenceSubstanceStructure()!=null) {
			structureRecord.setFormat(MOL_TYPE.INC.name());
			String inchi = unmarshalled.getReferenceSubstanceStructure().getInChI();
			if (inchi!=null && !"".equals(inchi)) {
				structureRecord.setContent(inchi);
				structureRecord.setType(STRUC_TYPE.D1);
			} else {
				structureRecord.setContent("");
				structureRecord.setType(STRUC_TYPE.NA);
			}
			structureRecord.setInchi(null);
			String smiles = unmarshalled.getReferenceSubstanceStructure().getSmilesNotation();
			if (smiles!=null && !"".equals(smiles)) {
				structureRecord.setType(STRUC_TYPE.D1);
			}
			structureRecord.setSmiles(smiles);
			structureRecord.setFormula(unmarshalled.getReferenceSubstanceStructure().getMolecularFormula());
		} else structureRecord.setType(STRUC_TYPE.NA);
		CasInformation cas = unmarshalled.getReferenceSubstanceInformation().getCasInformation();
		if (cas!=null) {
			try {
				structureRecord.setProperty(I5ReaderSimple.casProperty,casProcessor.process(cas.getCasNumber()));
			} catch (Exception x) {
				structureRecord.setProperty(I5ReaderSimple.casProperty,cas.getCasNumber());
			}
		}
		String iupacName = unmarshalled.getReferenceSubstanceInformation().getIupacName();
		if ((iupacName!=null) && !"".equals(iupacName.trim()))
			structureRecord.setProperty(Property.getNameInstance(),iupacName);
		
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


	protected void setCompanyUUID(SubstanceRecord record,String value) {
		int slashpos = value.indexOf("/");
		if (slashpos>0)
			record.setCompanyUUID(value.substring(0,slashpos));
		else
			record.setCompanyUUID(value);
	}	
	protected void setReferenceSubstanceUUID(IStructureRecord record,String value) {
		int slashpos = value.indexOf("/");
		if (slashpos>0)
			record.setProperty(Property.getI5UUIDInstance(),value.substring(0,slashpos));
		else
			record.setProperty(Property.getI5UUIDInstance(),value);
	}		
	protected void setFormat(IStructureRecord record) {
		record.setFormat("i5._4.");
	}
}
