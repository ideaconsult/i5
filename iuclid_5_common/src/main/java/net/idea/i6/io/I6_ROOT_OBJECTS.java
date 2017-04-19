package net.idea.i6.io;

import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.IROOT_OBJECTS;

/*
	Document {
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	Attachment {
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	Attachments {
		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	Content {
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
 */
public enum I6_ROOT_OBJECTS implements IROOT_OBJECTS {

	REFERENCE_SUBSTANCE {
		@Override
		public String getContextPath() {
			return "eu.europa.echa.iuclid6.namespaces.reference_substance._2";
		}

		@Override
		public boolean isScientificPart() {
			return false;
		}
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.Substance;
		}
	},
	LEGAL_ENTITY {
		@Override
		public boolean isSupported() {
			return false;
		}
	},
	LITERATURE {
		public boolean isSupported() {
			return false;
		}
		
	},
	CONTACT {
		public boolean isSupported() {
			return false;
		}		
	},
	SUBSTANCE {
		@Override
		public String getContextPath() {
			return "eu.europa.echa.iuclid6.namespaces.substance._2";
		}

		@Override
		public boolean isScientificPart() {
			return false;
		}
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.Substance;
		}
	},
	ENDPOINT_SUMMARY {
		@Override
		public String getContextPath() {
			return null;
		}

		@Override
		public boolean isScientificPart() {
			return false;
		}
	},
	ENDPOINT_STUDY_RECORD {
		@Override
		public String getContextPath() {
			return null;
		}

		@Override
		public boolean isScientificPart() {
			return true;
		}
	},
	TEST_MATERIAL_INFORMATION {
		@Override
		public boolean isSupported() {
			return false;
		}
	},
	ENDPOINT_STUDY_RECORD_AcuteToxicityDermal {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_ACUTE_DERMAL;
		}
	},
	ENDPOINT_STUDY_RECORD_AcuteToxicityInhalation {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_ACUTE_INHAL;
		}
	},
	ENDPOINT_STUDY_RECORD_AcuteToxicityOral {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_ACUTE_ORAL;
		}
	},
	ENDPOINT_STUDY_RECORD_AcuteToxicityOtherRoutes {
	},
	ENDPOINT_STUDY_RECORD_AdditionalInformationOnEnvironmentalFateAndBehaviour {
	},
	ENDPOINT_STUDY_RECORD_AdditionalPhysicoChemical {
	},
	ENDPOINT_STUDY_RECORD_AdditionalToxicologicalInformation {
	},
	ENDPOINT_STUDY_RECORD_AutoFlammability {
	},
	ENDPOINT_STUDY_RECORD_BasicToxicokinetics {
	},
	ENDPOINT_STUDY_RECORD_BioaccumulationAquaticSediment {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.EN_BIOACCUMULATION;
		}
	},
	ENDPOINT_STUDY_RECORD_BiodegradationInWaterScreeningTests {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_BIODEG_WATER_SCREEN;
		}
	},
	ENDPOINT_STUDY_RECORD_BoilingPoint {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.PC_BOILING;
		}
	},
	ENDPOINT_STUDY_RECORD_Carcinogenicity {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_CARCINOGENICITY;
		}
	},
	ENDPOINT_STUDY_RECORD_Density {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.POUR_DENSITY;
		}
	},
	ENDPOINT_STUDY_RECORD_DevelopmentalToxicityTeratogenicity {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_DEVELOPMENTAL;
		}
	},
	ENDPOINT_STUDY_RECORD_DirectObservationsClinicalCases {
	},
	ENDPOINT_STUDY_RECORD_DistributionModelling {
	},
	ENDPOINT_STUDY_RECORD_Explosiveness {
	},
	ENDPOINT_STUDY_RECORD_EyeIrritation {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_EYE_IRRITATION;
		}
	},
	ENDPOINT_STUDY_RECORD_FlashPoint {
		
	},
	ENDPOINT_STUDY_RECORD_GeneralInformation {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.GI_GENERAL_INFORM;
		}
	},
	ENDPOINT_STUDY_RECORD_GeneticToxicityVitro {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_GENETIC_IN_VITRO;
		}
	},
	ENDPOINT_STUDY_RECORD_GeneticToxicityVivo {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_GENETIC_IN_VIVO;
		}
	},
	ENDPOINT_STUDY_RECORD_Melting {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.PC_MELTING;
		}
	},
	ENDPOINT_STUDY_RECORD_MonitoringData {
	},
	ENDPOINT_STUDY_RECORD_OtherDistributionData {
	},
	ENDPOINT_STUDY_RECORD_OxidisingProperties {
		
	},
	ENDPOINT_STUDY_RECORD_Partition {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.PC_PARTITION;
		}
	},
	ENDPOINT_STUDY_RECORD_PhototransformationInAir {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_PHOTOTRANS_AIR;
		}
	},
	ENDPOINT_STUDY_RECORD_RepeatedDoseToxicityDermal {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_REPEATED_DERMAL;
		}
	},
	ENDPOINT_STUDY_RECORD_RepeatedDoseToxicityInhalation {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_REPEATED_INHAL;
		}
	},
	ENDPOINT_STUDY_RECORD_RepeatedDoseToxicityOral {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_REPEATED_ORAL;
		}
	},
	ENDPOINT_STUDY_RECORD_RepeatedDoseToxicityOther {
	},
	ENDPOINT_STUDY_RECORD_ShortTermToxicityToAquaInv {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.EC_DAPHNIATOX;
		}
	},
	ENDPOINT_STUDY_RECORD_ShortTermToxicityToFish {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.EC_FISHTOX;
		}
	},
	ENDPOINT_STUDY_RECORD_SkinIrritationCorrosion {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_SKIN_IRRITATION;
		}
	},
	ENDPOINT_STUDY_RECORD_SkinSensitisation {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_SENSITIZATION;
		}
	},
	ENDPOINT_STUDY_RECORD_SpecificInvestigations {
	},
	ENDPOINT_STUDY_RECORD_ToxicityReproduction {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.TO_REPRODUCTION;
		}
	},
	ENDPOINT_STUDY_RECORD_ToxicityToAquaticAlgae {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.EC_ALGAETOX;
		}
	},
	ENDPOINT_STUDY_RECORD_ToxicityToMicroorganisms {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.EC_BACTOX;
		}
	},
	ENDPOINT_STUDY_RECORD_ToxicityToOtherAboveGroundOrganisms {
	},
	ENDPOINT_STUDY_RECORD_ToxicityToTerrestrialPlants {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.EC_PLANTTOX;
		}
	},
	ENDPOINT_STUDY_RECORD_Vapour {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.PC_VAPOUR;
		}
	},
	ENDPOINT_STUDY_RECORD_WaterSolubility {
		@Override
		public I5_ROOT_OBJECTS mapIUCLID5() {
			return I5_ROOT_OBJECTS.PC_WATER_SOL;
		}
	};
	public I5_ROOT_OBJECTS mapIUCLID5() {
		return null;
	}
	public boolean isIUCLID6() {
		return true;
	}
	public String getContextPath() {

		if (isIUCLID6())
			//package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_directobservationsclinicalcases._2;
			return String.format("eu.europa.echa.iuclid6.namespaces.%s._2",name().toLowerCase());

		else return null;

	}	
	public boolean isScientificPart() {
		return true;
	}

	@Override
	public boolean isSupported() {
		return true;
	}
	
	public String toSection() {
		I5_ROOT_OBJECTS i5 = mapIUCLID5();
		return i5==null?(name() + "_SECTION"):i5.toSection();
	}
	
	public String getTopCategory() {
		I5_ROOT_OBJECTS i5 = mapIUCLID5();
		return i5==null?"P-CHEM":i5.getTopCategory();
	}
	public IParams createProtocolParameters() {
		I5_ROOT_OBJECTS i5 = mapIUCLID5();
		return i5==null?new Params():i5.createProtocolParameters();
	}
}