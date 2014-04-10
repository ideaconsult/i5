package net.idea.i5.io;

public enum I5_ROOT_OBJECTS {
	AttachmentDocument {
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	LegalEntity {
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	ReferenceSubstance {
		@Override
		public String getContextPath() {
			return "eu.europa.echa.schemas.iuclid5._20130101.referencesubstance:eu.europa.echa.schemas.iuclid5._20120101.referencesubstance:eu.europa.echa.schemas.iuclid5._20070330.referencesubstance";
		}
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	Substance {
		@Override
		public String getContextPath() {
			return "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101.substance";
		}
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	EndpointRecord {
		@Override
		public String getContextPath() {
			return null;
		}
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	EndpointStudyRecord {
		@Override
		public String getContextPath() {
			return null;
		}
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
    scientificPart {
		@Override
		public String getContextPath() {
			return null;
		}
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	GI_GENERAL_INFORM {
		@Override
		public String getTitle() {
			return "Appearance";
		}
		@Override
		public String getNumber() {
			return "4.1";
		}		
	},
	PC_MELTING {
		@Override
		public boolean isDataRich() {
			return true;
		}
		@Override
		public String getTitle() {
			return "Melting point / freezing point";
		}
		@Override
		public String getNumber() {
			return "4.2";
		}		
	},
	PC_BOILING {
		@Override
		public String getTitle() {
			return "Boiling point";
		}
		@Override
		public String getNumber() {
			return "4.3";
		}			
	},
	PC_VAPOUR {
		@Override
		public boolean isDataRich() {
			return true;
		}
		@Override
		public String getTitle() {
			return "Vapour pressure";
		}
		@Override
		public String getNumber() {
			return "4.6";
		}			
	},
	PC_PARTITION {
		@Override
		public boolean isDataRich() {
			return true;
		}
		@Override
		public String getTitle() {
			return "Partition coeffcicient";
		}
		@Override
		public String getNumber() {
			return "4.7";
		}			
	},
	PC_WATER_SOL {
		@Override
		public boolean isDataRich() {
			return true;
		}
		@Override
		public String getTitle() {
			return "Water solubility";
		}
		@Override
		public String getNumber() {
			return "4.8";
		}		
	},
	PC_SOL_ORGANIC {
		@Override
		public String getTitle() {
			return "Solubility in organic solvents";
		}
		@Override
		public String getNumber() {
			return "4.9";
		}			
	},
	PC_NON_SATURATED_PH {
		@Override
		public String getTitle() {
			return "pH";
		}
		@Override
		public String getNumber() {
			return "4.20";
		}			
	},
	PC_DISSOCIATION {
		@Override
		public String getTitle() {
			return "Dissociation constant";
		}
		@Override
		public String getNumber() {
			return "4.21";
		}		
	},
	TO_PHOTOTRANS_AIR {
		@Override
		public String getTitle() {
			return "Phototransformation in Air";
		}		
		@Override
		public String getNumber() {
			return "5.1.1";
		}			
	},
	TO_HYDROLYSIS {
		@Override
		public String getTitle() {
			return "Hydrolysis";
		}
		@Override
		public String getNumber() {
			return "5.1.2";
		}			
	},
	TO_BIODEG_WATER_SCREEN {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Biodegradation in water - screening tests";
		}
		@Override
		public String getNumber() {
			return "5.2.1";
		}			
	},
	TO_BIODEG_WATER_SIM {
		@Override
		public String getTitle() {
			return "Biodegradation in water and sediment: simulation tests";
		}
		@Override
		public String getNumber() {
			return "5.2.2";
		}	
	},
	EN_STABILITY_IN_SOIL {
		@Override
		public String getTitle() {
			return "Biodegradation in Soil";
		}
		@Override
		public String getNumber() {
			return "5.2.3";
		}		
	},
	EN_BIOACCUMULATION {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Bioaccumulation: aquatic / sediment";
		}
		@Override
		public String getNumber() {
			return "5.3.1";
		}		
	},
	EN_BIOACCU_TERR {
		@Override
		public String getTitle() {
			return "Bioaccumulation: terrestrial";
		}
		@Override
		public String getNumber() {
			return "5.3.2";
		}			
	},
	EN_ADSORPTION {
		@Override
		public String getTitle() {
			return "Adsorption / Desorption";
		}
		@Override
		public String getNumber() {
			return "5.4.1";
		}			
	},
	EN_HENRY_LAW {
		@Override
		public String getTitle() {
			return "Henry's Law constant";
		}
		@Override
		public String getNumber() {
			return "5.4.2";
		}			
	},
	TO_ACUTE_ORAL {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Acute toxicity - oral";
		}
		@Override
		public String getNumber() {
			return "7.2.1";
		}			
	},
	TO_ACUTE_INHAL {
		@Override
		public String getTitle() {
			return "Acute toxicity - inhalation";
		}			
		@Override
		public String getNumber() {
			return "7.2.2";
		}		
	},
	TO_ACUTE_DERMAL {
		@Override
		public String getTitle() {
			return "Acute toxicity - dermal";
		}			
		@Override
		public String getNumber() {
			return "7.2.3";
		}			
	},
	TO_SKIN_IRRITATION {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Skin irritation / Corrosion";
		}	
		@Override
		public String getNumber() {
			return "7.3.1";
		}			
	},
	TO_EYE_IRRITATION {
		@Override
		public boolean isDataRich() {
			return true;
		}
		@Override
		public String getTitle() {
			return "Eye irritation";
		}	
		@Override
		public String getNumber() {
			return "7.3.2";
		}			
	},
	TO_SENSITIZATION {
		@Override
		public boolean isDataRich() {
			return true;
		}	
		@Override
		public String getTitle() {
			return "Skin sensitisation";
		}
		@Override
		public String getNumber() {
			return "7.4.1";
		}			
	},
	//TO_SENSITIZATION_HUMAN,
	TO_REPEATED_ORAL {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Repeated dose toxicity - oral";
		}
		@Override
		public String getNumber() {
			return "7.5.1";
		}			
	},
	TO_REPEATED_INHAL {
		@Override
		public String getTitle() {
			return "Repeated dose toxicity - inhalation";
		}
		@Override
		public String getNumber() {
			return "7.5.2";
		}		
	},
	TO_REPEATED_DERMAL {
		@Override
		public String getTitle() {
			return "Repeated dose toxicity - dermal";
		}
		@Override
		public String getNumber() {
			return "7.5.3";
		}			
	},
	TO_GENETIC_IN_VITRO {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Genetic toxicity in vitro";
		}
		@Override
		public String getNumber() {
			return "7.6.1";
		}		
	},
	TO_GENETIC_IN_VIVO {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Genetic toxicity in vivo";
		}
		@Override
		public String getNumber() {
			return "7.6.1";
		}		
	},	
	TO_CARCINOGENICITY {
		@Override
		public String getTitle() {
			return "Carcinogenicity";
		}
		@Override
		public String getNumber() {
			return "7.7";
		}				
	},
	TO_REPRODUCTION {
		@Override
		public String getTitle() {
			return "Toxicity to reproduction";
		}
		@Override
		public String getNumber() {
			return "7.8.1";
		}		
	},
	TO_DEVELOPMENTAL {
		@Override
		public String getTitle() {
			return "Developmental toxicity / teratogenicity";
		}
		@Override
		public String getNumber() {
			return "7.8.2";
		}		
	},
	EC_FISHTOX {
		@Override
		public boolean isDataRich() {
			return true;
		}
		@Override
		public String getTitle() {
			return "Short-term toxicity to fish";
		}
		@Override
		public String getNumber() {
			return "6.1.1";
		}		
	},
	EC_CHRONFISHTOX {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Long-term toxicity to fish";
		}
		@Override
		public String getNumber() {
			return "6.1.2";
		}		
	},
	EC_DAPHNIATOX {
		@Override
		public boolean isDataRich() {
			return true;
		}
		@Override
		public String getTitle() {
			return "Short-term toxicity to aquatic inverterbrates";
		}			
		@Override
		public String getNumber() {
			return "6.1.3";
		}		
	},
	EC_CHRONDAPHNIATOX {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Long-term toxicity to aquatic inverterbrates";
		}
		@Override
		public String getNumber() {
			return "6.1.4";
		}		
	},
	EC_ALGAETOX {
		@Override
		public boolean isDataRich() {
			return true;
		}
		@Override
		public String getTitle() {
			return "Toxicity to aquatic algae and cyanobacteria";
		}
		@Override
		public String getNumber() {
			return "6.1.5";
		}		
	},
	EC_BACTOX {
		@Override
		public boolean isDataRich() {
			return true;
		}		
		@Override
		public String getTitle() {
			return "Toxicity to microorganisms";
		}
		@Override
		public String getNumber() {
			return "6.1.7";
		}		
	},
	EC_SEDIMENTDWELLINGTOX {
		@Override
		public String getTitle() {
			return "Sediment toxicity";
		}
		@Override
		public String getNumber() {
			return "6.2";
		}			
	},
	EC_SOILDWELLINGTOX {
		@Override
		public String getTitle() {
			return "Toxicity to soil macroorganisms";
		}
		@Override
		public String getNumber() {
			return "6.3.1";
		}		
	},
	EC_HONEYBEESTOX {
		@Override
		public String getTitle() {
			return "Toxicity to terrestrial arthropods";
		}
		@Override
		public String getNumber() {
			return "6.3.2";
		}			
	},
	EC_PLANTTOX {
		@Override
		public String getTitle() {
			return "Toxicity to terrestrial plants";
		}
		@Override
		public String getNumber() {
			return "6.3.3";
		}		
	},
	EC_SOIL_MICRO_TOX {
		@Override
		public String getTitle() {
			return "Toxicity to soil microorganisms";
		}
		@Override
		public String getNumber() {
			return "6.3.4";
		}			
	},
	AGGLOMERATION_AGGREGATION {
		@Override
		public String getTitle() {
			return "Nanomaterial agglomeration/aggregation";
		}
		@Override
		public String getNumber() {
			return "4.24";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //101
		}
	},
	CRYSTALLINE_PHASE {
		@Override
		public String getTitle() {
			return "Nanomaterial crystalline phase";
		}
		@Override
		public String getNumber() {
			return "4.25";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //102
		}	
		@Override
		public boolean isSupported() {
			return false;
		}
	},
	CRYSTALLITE_AND_GRAIN_SIZE {
		@Override
		public String getTitle() {
			return "Nanomaterial crystallite and grain phase";
		}
		@Override
		public String getNumber() {
			return "4.26";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //103
		}
		@Override
		public boolean isSupported() {
			return false;
		}
	},
	ASPECT_RATIO_SHAPE {
		@Override
		public String getTitle() {
			return "Nanomaterial aspect ratio/shape";
		}
		@Override
		public String getNumber() {
			return "4.27";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //104
		}
		@Override
		public boolean isSupported() {
			return false;
		}
	},
	SPECIFIC_SURFACE_AREA {
		@Override
		public String getTitle() {
			return "Nanomaterial specific surface area";
		}
		@Override
		public String getNumber() {
			return "4.28";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //105
		}
		@Override
		public boolean isSupported() {
			return false;
		}
	},
	ZETA_POTENTIAL {
		@Override
		public String getTitle() {
			return "Nanomaterial Zeta potential";
		}
		@Override
		public String getNumber() {
			return "4.29";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //106
		}
		@Override
		public boolean isSupported() {
			return true;
		}
	},
	SURFACE_CHEMISTRY {
		@Override
		public String getTitle() {
			return "Nanomaterial surface chemistry";
		}
		@Override
		public String getNumber() {
			return "4.30";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //107
		}
		@Override
		public boolean isSupported() {
			return false;
		}		
	},
	DUSTINESS {
		@Override
		public String getTitle() {
			return "Nanomaterial dustiness";
		}
		@Override
		public String getNumber() {
			return "4.31";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //108
		}
		@Override
		public boolean isSupported() {
			return false;
		}
	},
	POROSITY {
		@Override
		public String getTitle() {
			return "Nanomaterial porosity";
		}
		@Override
		public String getNumber() {
			return "4.32";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //109
		}
		@Override
		public boolean isSupported() {
			return false;
		}
		
	},
	POUR_DENSITY {
		@Override
		public String getTitle() {
			return "Nanomaterial pour density";
		}
		@Override
		public String getNumber() {
			return "4.33";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //110
		}
		@Override
		public boolean isSupported() {
			return false;
		}

	},
	PHOTOCATALYTIC_ACTIVITY {
		@Override
		public String getTitle() {
			return "Nanomaterial photocatalytic activity";
		}
		@Override
		public String getNumber() {
			return "4.34";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //111
		}
		@Override
		public boolean isSupported() {
			return false;
		}
	},
	RADICAL_FORMATION_POTENTIAL {
		@Override
		public String getTitle() {
			return "Nanomaterial radical formation potential";
		}
		@Override
		public String getNumber() {
			return "4.35";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //112
		}
		@Override
		public boolean isSupported() {
			return false;
		}
	},		
	CATALYTIC_ACTIVITY {
		@Override
		public String getTitle() {
			return "Nanomaterial catalytic activity";
		}
		@Override
		public String getNumber() {
			return "4.36";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //113
		}
		@Override
		public boolean isSupported() {
			return false;
		}
		
	}		
	;
	public String getContextPath() {
		return "eu.europa.echa.schemas.iuclid5._20130101.studyrecord."+name()+"_SECTION";
	}	
	public String toSection() {
		return name()+"_SECTION";
	}		
	public boolean isScientificPart() {
		return true;
	}
	public boolean isDataRich() {
		return false;
	}	
	public boolean isSupported() {
		return true;
	}		
	public boolean isNanoMaterialTemplate() {
		return false;
	}		
	public String getNumber() {
		return "";
	}	
	public String getTitle() {
		return name();
	}		
} 