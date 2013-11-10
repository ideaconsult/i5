package net.idea.i5._5.ambit2;

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
import eu.europa.echa.schemas.iuclid5._20130101.referencesubstance.ReferenceSubstance;
import eu.europa.echa.schemas.iuclid5._20130101.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.CasInformation;
import eu.europa.echa.schemas.iuclid5._20130101.referencesubstance.ReferenceSubstance.ReferenceSubstanceInformation.Synonyms;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEORAL.EFFLEVEL.Set;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.ExternalSystemIdentifiers.ExternalSystemIdentifier;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions.SubstanceComposition;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions.SubstanceComposition.Additives.Additive;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions.SubstanceComposition.Constituents.Constituent;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.SubstanceCompositions.SubstanceComposition.Impurities.Impurity;
import eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.TradeNames.TradeName;

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
		else if (unmarshalled instanceof ReferenceSubstance) {
			return transform2record((ReferenceSubstance)unmarshalled);
		} else if (unmarshalled instanceof eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord) {
			return transform2record((eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord)unmarshalled);
		} else if (unmarshalled instanceof eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord) {
			return transform2record((eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord)unmarshalled);
		} else if (unmarshalled instanceof eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord) {
			return transform2record((eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord)unmarshalled);
		} else if (unmarshalled instanceof eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord) {
			return transform2record((eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord)unmarshalled);
		}
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
			if (unmarshalled.getExternalSystemIdentifiers()!=null)
			for (ExternalSystemIdentifier id : unmarshalled.getExternalSystemIdentifiers().getExternalSystemIdentifier()) {
				System.out.println(id.getExternalSystemDesignator());
				System.out.println(id.getID());
				System.out.println(id.getRemarks());
			}
			System.out.println("origin\t"+unmarshalled.getOrigin().getOtherValue().getValue());
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
				
				System.out.println(c.getLocalUUID());
				System.out.println(c.getName());
				System.out.println(c.getDescription());
				System.out.println(c.getDegreeOfPurity().getUpperValue());
				System.out.println(c.getDegreeOfPurity().getLowerValue());
				System.out.println(c.getDegreeOfPurity().getLowerPrecision().getValue());
				
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
		
		Proportion p = new Proportion();
		if (a.getProportionReal()!=null) {
			p.setReal_lowervalue(a.getProportionReal().getLowerValue());
			p.setReal_uppervalue(a.getProportionReal().getUpperValue());
			try {
				p.setReal_lower(Phrases.phrasegroup_A02.get(a.getProportionReal().getLowerPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}
			try {
				p.setReal_upper(Phrases.phrasegroup_A02.get(a.getProportionReal().getUpperPrecision().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}
			try {
				p.setReal_unit(Phrases.phrasegroup_N24.get(a.getProportionReal().getUnit().getValueID()));
			} catch (Exception x) {
				p.setReal_unit("");
			}
			
		}
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
					record.setProperty(prop,name.getRemarks());
				}

				//System.out.println(unmarshalled.getTradeNames().getTradeName().get(i).getCountry().getValueID());
			}
		}	

		return record;
	}
	
	
	protected IStructureRecord transform2record(ReferenceSubstance unmarshalled) {
		structureRecord.clear();
		setFormat(structureRecord);
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
		record.setFormat("i5._5.");
	}
	protected IStructureRecord transform2record(eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord unmarshalled) {
		record.clear();
		
		//(Endpoint EP)
		System.out.println("Endpoint\t"+unmarshalled.getName());
		//UUID
		System.out.println("Document UUID\t"+unmarshalled.getDocumentReferencePK());
		//DATA OWNER - this is substance UUID, not the UUID of the company
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			System.out.println("Substance UUID (company specific)\t" + unmarshalled.getOwnerRef().getUniqueKey());
			System.out.println("Substance description\t" + unmarshalled.getOwnerRef().getDescription());
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		
		//NO. OF STUDY

		//GUIDELINE
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getECFISHTOX().getGUIDELINE()!=null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECFISHTOX.GUIDELINE.Set set : sciPart.getECFISHTOX().getGUIDELINE().getSet()) {
				System.out.println("Guideline\t"+
						set.getQUALIFIER().getQUALIFIERValue()+ "\t"+
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
				

			}
		//GUIDELINE (other)
		if (sciPart.getECFISHTOX().getMETHODNOGUIDELINE()!=null)
			System.out.println("Guideline\t"+sciPart.getECFISHTOX().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		if (sciPart.getECFISHTOX().getSALINITY()!=null)
			System.out.println(sciPart.getECFISHTOX().getSALINITY().getSet().getTEXTBELOW());
		//Exposure duration
		if (sciPart.getECFISHTOX().getEXPDURATION()!=null) {
			System.out.print("Exposure\t"+sciPart.getECFISHTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getVALUE());
			System.out.println("\t"+sciPart.getECFISHTOX().getEXPDURATION().getSet().getVALUEUNITVALUE().getUNITValue());
		}
		if (sciPart.getECFISHTOX().getWATERTYPE()!=null) {
		System.out.println("Water\t"+
				sciPart.getECFISHTOX().getWATERTYPE().getSet().getLISTRIGHTPOP().getLISTRIGHTPOP()+"\t"+
				sciPart.getECFISHTOX().getWATERTYPE().getSet().getLISTRIGHTPOP().getLISTRIGHTPOPValue());
		}
		//TEST ORGANISM
		System.out.println("Organism\t"+
				sciPart.getECFISHTOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOP()+"\t"+
				sciPart.getECFISHTOX().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());		
		//MEASURED CONC.
		

		//ENDPOINT
		if (sciPart.getECFISHTOX().getEFFCONC()!=null && sciPart.getECFISHTOX().getEFFCONC().getSet()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_FISHTOX_SECTION.EndpointStudyRecord.ScientificPart.ECFISHTOX.EFFCONC.Set set : sciPart.getECFISHTOX().getEFFCONC().getSet()) {
			System.out.println("Endpoint\t"+set.getPHRASEOTHERENDPOINT().getENDPOINT()+ "\t" + set.getPHRASEOTHERENDPOINT().getENDPOINTValue());
			if (set.getPHRASEOTHERBASISEFFECT()!=null)
				System.out.println("Effect\t"+set.getPHRASEOTHERBASISEFFECT().getBASISEFFECT()+ "\t" + set.getPHRASEOTHERBASISEFFECT().getBASISEFFECTValue());
			if (set.getPHRASEOTHEREFFCONCTYPE()!=null)
				System.out.println("Conc type\t"+set.getPHRASEOTHEREFFCONCTYPE().getEFFCONCTYPE()+ "\t" + set.getPHRASEOTHEREFFCONCTYPE().getEFFCONCTYPEValue());
			//EXPOSURE
			//(Exposure value)
			//(Exposure unit)
			
			if (set.getPRECISIONLOQUALIFIER()!=null)
				System.out.println("Qualifier\t"+set.getPRECISIONLOQUALIFIER().getLOQUALIFIER()+ "\t" + set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
			
			if (set.getVALUEUNITEXPDURATIONVALUE()!=null)
				System.out.println("Value\t"+set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONVALUE().getValue()+
							"\t" + set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONUNIT()+
							"\t" + set.getVALUEUNITEXPDURATIONVALUE().getEXPDURATIONUNITValue()
							);			
						
		} else {
			System.err.println("No data");
		}
		//ECOTOXICITY
		//(Value 1st Prefix)
		//(Value 1st value)
		//(Value unit)

		//EFFECT
		//EFFECT BASED ON


		return record;
	}
	protected IStructureRecord transform2record(eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord unmarshalled) {
		record.clear();
		//(Endpoint EP)
		System.out.println("Endpoint\t"+unmarshalled.getName());
		//UUID
		System.out.println("Document UUID\t"+unmarshalled.getDocumentReferencePK());
		//DATA OWNER - this is substance UUID, not the UUID of the company
		System.out.println("Substance UUID (company specific)\t" + unmarshalled.getOwnerRef().getUniqueKey());
		setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		//TODO data owner
		//GUIDELINE
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		System.out.println("Guideline\t"+sciPart.getPCPARTITION().getGUIDELINE());
		//GUIDELINE (other)
		if (sciPart.getPCPARTITION().getMETHODNOGUIDELINE()!=null)
			System.out.println("Guideline\t"+sciPart.getPCPARTITION().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());

		System.out.println(sciPart.getPCPARTITION().getMETHODDETAILS().getSet().getFREETEXTBELOW());
		System.out.println(sciPart.getPCPARTITION().getMETHODTYPE());

		
		//Partition coeff
		//type
		//System.out.println(sciPart.getPCPARTITION().getPARTCOEFFTYPE().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		//values	
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_PARTITION_SECTION.EndpointStudyRecord.ScientificPart.PCPARTITION.PARTCOEFF.Set set: sciPart.getPCPARTITION().getPARTCOEFF().getSet()) {
			System.out.println(set.getTYPE().getTYPEValue());
			if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) {
				System.out.println(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
				System.out.println("LoValue\t"+set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());	
			}
			if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) {
				System.out.println(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
				System.out.println("UpValue\t"+set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue());
			}
			if (set.getVALUEUNITTEMPVALUE()!=null) {
				System.out.print("Temperature\t"+set.getVALUEUNITTEMPVALUE().getTEMPVALUE().getValue());
				System.out.println("\t"+set.getVALUEUNITTEMPVALUE().getTEMPUNITValue());
			}
			if (set.getPRECISIONPHLOQUALIFIER()!=null) {
				System.out.println(set.getPRECISIONPHLOQUALIFIER().getPHLOQUALIFIERValue());
				System.out.println(set.getPRECISIONPHLOQUALIFIER().getPHLOVALUE().getValue());
				
				System.out.println(set.getPRECISIONPHLOQUALIFIER().getPHUPQUALIFIERValue());
				System.out.println(set.getPRECISIONPHLOQUALIFIER().getPHUPVALUE().getValue());
			}
		}
		return record;
	}

	protected IStructureRecord transform2record(eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord unmarshalled) {
		record.clear();
		//(Endpoint EP)
		System.out.println("Endpoint\t"+unmarshalled.getName());
		//UUID
		System.out.println("Document UUID\t"+unmarshalled.getDocumentReferencePK());
		//DATA OWNER - this is substance UUID, not the UUID of the company
		System.out.println("Substance UUID (company specific)\t" + unmarshalled.getOwnerRef().getUniqueKey());
		//TODO data owner
		setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		//GUIDELINE
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOBIODEGWATERSCREEN().getGUIDELINE()!=null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSCREEN.GUIDELINE.Set set : sciPart.getTOBIODEGWATERSCREEN().getGUIDELINE().getSet()) {
				System.out.println("Guideline\t"+
						(set.getQUALIFIER()==null?"":set.getQUALIFIER().getQUALIFIERValue())+
						"\t"+
						(set.getPHRASEOTHERGUIDELINE()==null?"":set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue()));
			}
		
		//GUIDELINE (other)
		if (sciPart.getTOBIODEGWATERSCREEN().getMETHODNOGUIDELINE()!=null)
			System.out.println("Guideline\t"+sciPart.getTOBIODEGWATERSCREEN().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		//TEST TYPE
		if (sciPart.getTOBIODEGWATERSCREEN().getOXYGENCONDITIONS()!=null) {
			System.out.println("TEST TYPE\t"+sciPart.getTOBIODEGWATERSCREEN().getOXYGENCONDITIONS().getSet().getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		}
		if (sciPart.getTOBIODEGWATERSCREEN().getINTERPRETRESULTSSUBM()!=null) {
			System.out.println("RESULT\t"+sciPart.getTOBIODEGWATERSCREEN().getINTERPRETRESULTSSUBM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		}
		if (sciPart.getTOBIODEGWATERSCREEN().getDEGRAD()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSCREEN.DEGRAD.Set set : sciPart.getTOBIODEGWATERSCREEN().getDEGRAD().getSet()) {
				if (set.getPHRASEOTHERPARAMETER()!=null)
					System.out.println("PARAMETER\t"+set.getPHRASEOTHERPARAMETER().getPARAMETERValue());
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) {
						System.out.print("LO\t"+set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
						System.out.print("\t");
						System.out.println(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());
					}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) {
						System.out.print("UP\t"+set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
						System.out.print("\t");
						System.out.println(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue());
					}
				}
				if (set.getVALUEUNITTIMEPOINTVALUE()!=null)
					System.out.print("Time point\t"+
							(set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE()==null?"":set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE().getValue()));
				
					System.out.println("\t"+
							(set.getVALUEUNITTIMEPOINTVALUE()==null?"":set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTUNITValue()));				
			}
		}

		//sciPart.getTOBIODEGWATERSCREEN().get
		return record;
	}
	protected IStructureRecord transform2record(EndpointStudyRecord unmarshalled) {
		record.clear();
		//(Endpoint EP)
		System.out.println("Endpoint\t"+unmarshalled.getName());
		//UUID
		System.out.println("Document UUID\t"+unmarshalled.getDocumentReferencePK());
		//DATA OWNER - this is substance UUID, not the UUID of the company
		System.out.println("Substance UUID (company specific)\t" + unmarshalled.getOwnerRef().getUniqueKey());
		//TODO data owner
		setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		//GUIDELINE
		ScientificPart sciPart = unmarshalled.getScientificPart();
		System.out.println("Guideline\t"+sciPart.getTOACUTEORAL().getGUIDELINE());
		//GUIDELINE (other)
		if (sciPart.getTOACUTEORAL().getMETHODNOGUIDELINE()!=null)
			System.out.println("Guideline\t"+sciPart.getTOACUTEORAL().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		//year
		if (sciPart.getTOACUTEORAL().getREFERENCE()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEORAL.REFERENCE.Set set : sciPart.getTOACUTEORAL().getREFERENCE().getSet()) {
			System.out.println("Ref\t"+set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
			System.out.println("Year\t"+set.getREFERENCEYEAR());
		}
		//Acute tox oral
		//Species
		System.out.print("Organism\t"+sciPart.getTOACUTEORAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOP());
		System.out.println("\t"+sciPart.getTOACUTEORAL().getORGANISM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		//Sex
		if (sciPart.getTOACUTEORAL().getSEX()!=null) {
			System.out.println("Sex\t"+
					sciPart.getTOACUTEORAL().getSEX().getSet().getLISTBELOWPOP().getLISTBELOWPOP()+"\t"+
					sciPart.getTOACUTEORAL().getSEX().getSet().getLISTBELOWPOP().getLISTBELOWPOPValue());
		}	
		//endpoint
		//effect level
		if (sciPart.getTOACUTEORAL().getEFFLEVEL()!=null)
		for (Set set : sciPart.getTOACUTEORAL().getEFFLEVEL().getSet()) {
			System.out.println("===== Effect level");
			if (set.getSEX()!=null)
				System.out.println("Sex\t"+set.getSEX().getSEX()+ "\t" + set.getSEX().getSEXValue());
			
			System.out.println("Endpoint\t"+set.getPHRASEOTHERENDPOINT().getENDPOINT());
			System.out.println("Endpoint\t"+set.getPHRASEOTHERENDPOINT().getENDPOINTValue());
			if (set.getPHRASEOTHERENDPOINT().getENDPOINTTXT()!=null)
				System.out.println(set.getPHRASEOTHERENDPOINT().getENDPOINTTXT().getValue());
			
			System.out.println(set.getPRECISIONLOQUALIFIER().getLOQUALIFIER());
			System.out.println(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
			
			System.out.println("Unit\t"+set.getPRECISIONLOQUALIFIER().getUNIT());
			System.out.println(set.getPRECISIONLOQUALIFIER().getUNITValue());
			System.out.println(set.getPRECISIONLOQUALIFIER().getUNITTXT());
			
			System.out.println(set.getPRECISIONLOQUALIFIER().getUPQUALIFIER());
			System.out.println(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
			
			if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null)
				System.out.println("Lo value\t"+set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue());

			
			if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) {
				System.out.println("Up value\t"+set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue());
			}	
			
			if (set.getPRECISIONCONFLIMITSLOQUALIFIER()!=null) {
				System.out.println(set.getPRECISIONCONFLIMITSLOQUALIFIER().getCONFLIMITSLOQUALIFIER());
				System.out.println(set.getPRECISIONCONFLIMITSLOQUALIFIER().getCONFLIMITSUPQUALIFIER());
				System.out.println(set.getPRECISIONCONFLIMITSLOQUALIFIER().getCONFLIMITSLOVALUE());
				System.out.println(set.getPRECISIONCONFLIMITSLOQUALIFIER().getCONFLIMITSUPVALUE());
			}
			System.out.println(set.getPHRASEOTHEREFFCONCTYPE());
		}
		if (sciPart.getTOACUTEORAL().getINTERPRETRSSUBMITTER()!=null) {
			System.out.println(sciPart.getTOACUTEORAL().getINTERPRETRSSUBMITTER().getSet().getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());
		}
		if (sciPart.getTOACUTEORAL().getCRITERIASUBMITTER()!=null) {
			System.out.println(sciPart.getTOACUTEORAL().getCRITERIASUBMITTER().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		}
		//sciPart.getTOACUTEORAL().
		return record;
	}
}
