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
	GI_GENERAL_INFORM,
	PC_MELTING {
		@Override
		public boolean isDataRich() {
			return true;
		}
	},
	PC_BOILING,
	PC_VAPOUR {
		@Override
		public boolean isDataRich() {
			return true;
		}
	},
	PC_PARTITION {
		@Override
		public boolean isDataRich() {
			return true;
		}
	},
	PC_WATER_SOL {
		@Override
		public boolean isDataRich() {
			return true;
		}
	},
	PC_SOL_ORGANIC,
	PC_NON_SATURATED_PH,
	PC_DISSOCIATION,
	TO_PHOTOTRANS_AIR,
	TO_HYDROLYSIS,
	TO_BIODEG_WATER_SCREEN {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	TO_BIODEG_WATER_SIM {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	EN_STABILITY_IN_SOIL,
	EN_BIOACCUMULATION {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	EN_BIOACCU_TERR,
	EN_ADSORPTION,
	EN_HENRY_LAW ,
	TO_ACUTE_ORAL {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	TO_ACUTE_INHAL,
	TO_ACUTE_DERMAL,
	TO_SKIN_IRRITATION {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	TO_EYE_IRRITATION {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	TO_SENSITIZATION {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	//TO_SENSITIZATION_HUMAN,
	TO_REPEATED_ORAL {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	TO_REPEATED_INHAL,
	TO_REPEATED_DERMAL,
	TO_GENETIC_IN_VITRO {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	TO_CARCINOGENICITY,
	TO_REPRODUCTION,
	TO_DEVELOPMENTAL,
	EC_FISHTOX {
		@Override
		public boolean isDataRich() {
			return true;
		}
	},
	EC_CHRONFISHTOX {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	EC_DAPHNIATOX {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	EC_CHRONDAPHNIATOX {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	EC_ALGAETOX {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	EC_BACTOX {
		@Override
		public boolean isDataRich() {
			return true;
		}		
	},
	EC_SEDIMENTDWELLINGTOX,
	EC_SOILDWELLINGTOX,
	EC_HONEYBEESTOX,
	EC_PLANTTOX,
	EC_SOIL_MICRO_TOX;

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
} 