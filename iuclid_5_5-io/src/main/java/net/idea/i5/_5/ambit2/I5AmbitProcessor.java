package net.idea.i5._5.ambit2;

import net.idea.i5._5.substance.Substance.ExternalSystemIdentifiers.ExternalSystemIdentifier;
import net.idea.i5._5.substance.Substance.SubstanceCompositions;
import net.idea.i5._5.substance.Substance.SubstanceCompositions.SubstanceComposition;
import net.idea.i5._5.substance.Substance.SubstanceCompositions.SubstanceComposition.Additives.Additive;
import net.idea.i5._5.substance.Substance.SubstanceCompositions.SubstanceComposition.Constituents.Constituent;
import net.idea.i5._5.substance.Substance.SubstanceCompositions.SubstanceComposition.Impurities.Impurity;
import ambit2.base.data.LiteratureEntry;
import ambit2.base.data.Property;
import ambit2.base.data.StructureRecord;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.interfaces.IStructureRecord.STRUC_TYPE;
import ambit2.base.processors.DefaultAmbitProcessor;
import ambit2.base.relation.STRUCTURE_RELATION;
import ambit2.base.relation.composition.Proportion;

public class I5AmbitProcessor<Target> extends DefaultAmbitProcessor<Target, IStructureRecord> {
	protected SubstanceRecord record = new SubstanceRecord();
	/**
	 * 
	 */
	private static final long serialVersionUID = -38158314141255416L;

	public IStructureRecord process(Target unmarshalled) throws AmbitException {
		if (unmarshalled instanceof net.idea.i5._5.substance.Substance)
			return transform2record((net.idea.i5._5.substance.Substance)unmarshalled);
		else
		return null;
	}

	protected IStructureRecord transform2record(net.idea.i5._5.substance.Substance unmarshalled) {
		record.clear();
		if (unmarshalled != null) {
			if (unmarshalled.getChemicalName()!=null)
				record.setProperty(Property.getNameInstance(),unmarshalled.getChemicalName());
			if (unmarshalled.getPublicName()!=null)
				record.setProperty(Property.getPublicNameInstance(),unmarshalled.getPublicName());
			if (unmarshalled.getDocumentReferencePK()!=null)
				record.setProperty(Property.getI5UUIDInstance(),unmarshalled.getDocumentReferencePK());
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
			for (ExternalSystemIdentifier id : unmarshalled.getExternalSystemIdentifiers().getExternalSystemIdentifier()) {
				System.out.println(id.getExternalSystemDesignator());
				System.out.println(id.getID());
				System.out.println(id.getRemarks());
			}
			/*
			formaldehyde / formaldehyde / 50-00-0
			System.out.println(unmarshalled.getReferenceSubstanceRef().getDescription());
			ECB5-053aa8c4-d29b-4aa5-b457-5cc3b47f7d8b/0
			System.out.println(unmarshalled.getReferenceSubstanceRef().getUniqueKey());
			System.out.println(unmarshalled.getReferenceSubstanceRef().getNotes());
			REFERENCE_SUBSTANCE
			System.out.println(unmarshalled.getReferenceSubstanceRef().getType());
			*/
			
			SubstanceCompositions sc = unmarshalled.getSubstanceCompositions();
			for (SubstanceComposition c : sc.getSubstanceComposition()) {
				
				System.out.println(c.getLocalUUID());
				System.out.println(c.getName());
				System.out.println(c.getDescription());
				System.out.println(c.getDegreeOfPurity().getUpperValue());
				System.out.println(c.getDegreeOfPurity().getLowerValue());
				System.out.println(c.getDegreeOfPurity().getLowerPrecision().getValue());
				
				if (c.getAdditives()!=null)
				for (Additive a : c.getAdditives().getAdditive()) 
					additive2record(record,a);

				if (c.getImpurities()!=null)
				for (Impurity a : c.getImpurities().getImpurity()) 
					impurity2record(record,a);
						
				
				if (c.getConstituents()!=null)
				for (Constituent a : c.getConstituents().getConstituent()) 
					constituent2record(record,a);
				
			}
		}
		return record;
	}
	
	/**
	 * Create structure record from additive
	 * @param constituent
	 * @return
	 */
	protected IStructureRecord additive2record(SubstanceRecord substance, Additive a) {
		IStructureRecord record = new StructureRecord();
		/*
		System.out.println(constituent.getType()); //REFERENCE_SUBSTANCE
		System.out.println(constituent.getNotes());
		System.out.println(constituent.getDescription());
		*/
		record.setType(STRUC_TYPE.NA);
		record.setContent(a.getReferenceSubstance().getDescription());
		record.setProperty(Property.getI5UUIDInstance(),a.getReferenceSubstance().getUniqueKey());
		
		//a.getFunction() additive specific
		
		Proportion p = new Proportion();
		if (a.getProportionReal()!=null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
//			System.out.println("Lower precision " + a.getProportionReal().getLowerPrecision().getValue());
			//System.out.println("Upper precision " + a.getProportionReal().getUpperPrecision().getValue());
		}
		/**
		 * TODO
			System.out.println(a.getProportionReal().getLowerPrecision().getValue());
			System.out.println(a.getProportionReal().getUpperPrecision().getValue());
		 */
		if (a.getProportionTypical()!=null) {
			p.setTypical_value(a.getProportionTypical().getValue());
			//System.out.println("getProportionTypical precision" + a.getProportionTypical().getPrecision().getValue());
			p.setTypical_unit(a.getProportionTypical().getUnit().getValue());
		}
		/**
		 * TODO
		System.out.println(a.getRemarks());
		 */
		substance.addStructureRelation(record,STRUCTURE_RELATION.HAS_ADDITIVE,p);		
		
		return record;
	}
	
	/**
	 * Create structure record from impurity
	 * @param constituent
	 * @return
	 */
	protected IStructureRecord impurity2record(SubstanceRecord substance, Impurity a) {
		IStructureRecord record = new StructureRecord();
		/*
		System.out.println(constituent.getType()); //REFERENCE_SUBSTANCE
		System.out.println(constituent.getNotes());
		System.out.println(constituent.getDescription());
		*/
		record.setType(STRUC_TYPE.NA);
		record.setContent(a.getReferenceSubstance().getDescription());
		record.setProperty(Property.getI5UUIDInstance(),a.getReferenceSubstance().getUniqueKey());
		
		Proportion p = new Proportion();
		if (a.getProportionReal()!=null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
//			System.out.println("Lower precision " + a.getProportionReal().getLowerPrecision().getValue());
			//System.out.println("Upper precision " + a.getProportionReal().getUpperPrecision().getValue());
		}
		/**
		 * TODO
			System.out.println(a.getProportionReal().getLowerPrecision().getValue());
			System.out.println(a.getProportionReal().getUpperPrecision().getValue());
		 */
		if (a.getProportionTypical()!=null) {
			p.setTypical_value(a.getProportionTypical().getValue());
			//System.out.println("getProportionTypical precision" + a.getProportionTypical().getPrecision().getValue());
			p.setTypical_unit(a.getProportionTypical().getUnit().getValue());
		}
		/**
		 * TODO
		System.out.println(a.getRemarks());
		 */
		substance.addStructureRelation(record,STRUCTURE_RELATION.HAS_IMPURITY,p);		
		
		return record;
	}
	
	/**
	 * Create structure record from impurity
	 * @param constituent
	 * @return
	 */
	protected IStructureRecord constituent2record(SubstanceRecord substance, Constituent a) {
		IStructureRecord record = new StructureRecord();
		record.setType(STRUC_TYPE.NA);
		record.setContent(a.getReferenceSubstance().getDescription());
		/*
		System.out.println(constituent.getType()); //REFERENCE_SUBSTANCE
		System.out.println(constituent.getNotes());
		System.out.println(constituent.getDescription());
		*/
		record.setProperty(Property.getI5UUIDInstance(),a.getReferenceSubstance().getUniqueKey());
		

		Proportion p = new Proportion();
		if (a.getProportionReal()!=null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
//			System.out.println("Lower precision " + a.getProportionReal().getLowerPrecision().getValue());
			//System.out.println("Upper precision " + a.getProportionReal().getUpperPrecision().getValue());
		}
		/**
		 * TODO
			System.out.println(a.getProportionReal().getLowerPrecision().getValue());
			System.out.println(a.getProportionReal().getUpperPrecision().getValue());
		 */
		if (a.getProportionTypical()!=null) {
			p.setTypical_value(a.getProportionTypical().getValue());
			//System.out.println("getProportionTypical precision" + a.getProportionTypical().getPrecision().getValue());
			p.setTypical_unit(a.getProportionTypical().getUnit().getValue());
		}
		/**
		 * TODO
		System.out.println(a.getRemarks());
		 */
		substance.addStructureRelation(record,STRUCTURE_RELATION.HAS_CONSTITUENT,p);
		return record;
	}	
}
