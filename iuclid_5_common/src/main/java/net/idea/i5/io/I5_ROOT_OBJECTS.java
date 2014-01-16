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
	//ecotox
	EC_FISHTOX,
	EC_CHRONFISHTOX,
	EC_DAPHNIATOX,		
	EC_CHRONDAPHNIATOX,
	EC_ALGAETOX,
	EC_BACTOX,
	EC_SEDIMENTDWELLINGTOX,
	EC_SOIL_MICRO_TOX,
	//EC_PLANTTOX,		
	//env
	TO_PHOTOTRANS_AIR,
	TO_HYDROLYSIS,
	TO_BIODEG_WATER_SIM,
	EN_BIOACCU_TERR,
	EN_BIOACCUMULATION,
	EN_STABILITY_IN_SOIL,
	EN_ADSORPTION,
	EN_HENRY_LAW,
	TO_BIODEG_WATER_SCREEN,
	//tox
	TO_ACUTE_ORAL,		
	TO_REPEATED_ORAL,
	TO_REPRODUCTION,		
	TO_SENSITIZATION,		
	TO_SKIN_IRRITATION,
	TO_EYE_IRRITATION,	
	TO_GENETIC_IN_VITRO,
	//pc
	PC_MELTING,
	PC_BOILING,
	PC_DISSOCIATION,
	PC_PARTITION,
	PC_SOL_ORGANIC,
	PC_VAPOUR,
	PC_WATER_SOL,	
	;

	public String getContextPath() {
		return "eu.europa.echa.schemas.iuclid5._20130101.studyrecord."+name()+"_SECTION";
	}	
	public boolean isScientificPart() {
		return true;
	}
} 