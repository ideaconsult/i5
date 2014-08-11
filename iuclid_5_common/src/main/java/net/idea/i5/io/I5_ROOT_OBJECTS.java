package net.idea.i5.io;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;

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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					//SUBSTANCEPHYSICALSTATE  phrasegroup_A19
				"gaseous","liquid","solid","Not specified"
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.Remark
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					
			};
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
	PC_GRANULOMETRY {
		@Override
		public String getTitle() {
			return "Particle size distribution (Granulometry)";
		}
		@Override
		public String getNumber() {
			return "4.5";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //not NM specific, but used in NM !
		}		
		@Override
		public boolean isSupported() {
			return true;
		}		
		@Override
		public String[] getEndpoints() {
			return new String[] {
				I5CONSTANTS.pMMD,I5CONSTANTS.pMMAD,I5CONSTANTS.pGSD,I5CONSTANTS.pPARTICLESIZE
				//I5CONSTANTS.pPARTICLESIZE + percentile
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {I5CONSTANTS.cPERCENTILE,I5CONSTANTS.cSEQ_NUM,I5CONSTANTS.Remark};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {I5CONSTANTS.pTESTMAT_FORM,I5CONSTANTS.pDISTRIBUTION_TYPE};
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
	
	AGGLOMERATION_AGGREGATION {
		@Override
		public String getTitle() {
			return "Agglomeration/aggregation";
		}
		@Override
		public String getNumber() {
			return "4.24";
		}
		@Override
		public boolean isNanoMaterialTemplate() {
			return true; //101
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.AGGLO_AGGR_DIAM,I5CONSTANTS.AGGLO_AGGR_SIZE, I5CONSTANTS.AGGLO_AGGR_SIZE_DIST, I5CONSTANTS.AGGLO_AGGREGATION_IDX
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {I5CONSTANTS.pH,I5CONSTANTS.cMEDIUM,I5CONSTANTS.Remark,I5CONSTANTS.cSEQ_NUM,I5CONSTANTS.cPERCENTILE};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod
			};
		}
	},
	CRYSTALLINE_PHASE {
		@Override
		public String getTitle() {
			return "Crystalline phase";
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
			return true;
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.eCRYSTALLINE_PHASE
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.rCRYSTALLINE_PHASE_SPACE_GROUP,
					I5CONSTANTS.rCRYSTALLINE_PHASE_POINT_GROUP,
					I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTGRPH_PLANES,
					I5CONSTANTS.rCRYSTALLINE_PHASE_BRAVAIS_LATTICE,
					I5CONSTANTS.rCRYSTALLINE_PHASE_COMMON_NAME,
					I5CONSTANTS.rCRYSTALLINE_PHASE_CRYSTAL_SYSTEM
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod,I5CONSTANTS.pTESTMAT_FORM,I5CONSTANTS.pMATERIAL_ISOTROPIC
			};
		}
	},
	CRYSTALLITE_AND_GRAIN_SIZE {
		@Override
		public String getTitle() {
			return "Crystallite and grain phase";
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
			return true;
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.MEAN_DIAMETER
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
								
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod,I5CONSTANTS.pTESTMAT_FORM,I5CONSTANTS.pMATERIAL_ISOTROPIC			
			};
		}
	},
	ASPECT_RATIO_SHAPE {
		@Override
		public String getTitle() {
			return "Aspect ratio/shape";
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
			return true;
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.eASPECT_RATIO,I5CONSTANTS.eSHAPE
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
				I5CONSTANTS.eSHAPE_DESCRIPTIVE,I5CONSTANTS.X,I5CONSTANTS.Y,I5CONSTANTS.Z,I5CONSTANTS.Remark	
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod
			};
		}
	},
	SPECIFIC_SURFACE_AREA {
		@Override
		public String getTitle() {
			return "Specific surface area";
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
			return true;
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.SPECIFIC_SURFACE_AREA
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.Remark
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.pTESTMAT_FORM,I5CONSTANTS.cTypeMethod
			};
		}
	},
	ZETA_POTENTIAL {
		@Override
		public String getTitle() {
			return "Zeta potential";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.eZETA_POTENTIAL,I5CONSTANTS.eISOELECTRIC_POINT
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cMEDIUM,I5CONSTANTS.pH,I5CONSTANTS.Remark
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.pTESTMAT_FORM,I5CONSTANTS.cTypeMethod
			};
		}
	},
	SURFACE_CHEMISTRY {
		@Override
		public String getTitle() {
			return "Surface chemistry";
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
			return true;
		}	
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.eATOMIC_COMPOSITION,I5CONSTANTS.eFUNCTIONAL_GROUP
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.pCOATING_DESCRIPTION,I5CONSTANTS.pDESCRIPTION,I5CONSTANTS.Remark,I5CONSTANTS.pELEMENT_OR_GROUP,I5CONSTANTS.pTYPE
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod
			};
		}
	},
	DUSTINESS {
		@Override
		public String getTitle() {
			return "Dustiness";
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
			return true;
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.eDUSTINEX
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {

			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod,I5CONSTANTS.pTESTMAT_FORM
			};
		}
	},
	POROSITY {
		@Override
		public String getTitle() {
			return "Porosity";
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
			return true;
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.ePOROSITY,
					I5CONSTANTS.eSPECIFIC_PORE_VOLUME,
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod,I5CONSTANTS.pTESTMAT_FORM
			};
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
			return true;
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.ePOUR_DENSITY
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod,I5CONSTANTS.pTESTMAT_FORM
			};
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
			return true;
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.ePHOTOCATALYTIC_ACTIVITY,I5CONSTANTS.eTURNOVERFREQUENCY
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod,I5CONSTANTS.pTESTMAT_FORM
			};
		}
	},
	/*
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {};
		}
	},		
	*/
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
			return true;
		}
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.eCATALYTIC_ACTIVITY,I5CONSTANTS.eTURNOVERFREQUENCY
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.pMETHODDETAILS,I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,I5CONSTANTS.pSAMPLING,I5CONSTANTS.cTypeMethod,I5CONSTANTS.pTESTMAT_FORM
			};
		}
		
	},			
	PC_UNKNOWN {
		@Override
		public String toString() {
			return "Physico chemical properties (other)";
		}
		@Override
		public String getNumber() {
			return "4.99";
		}
		public String getTopCategory() {
			return "P-CHEM";
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
		@Override
		public String getTopCategory() {
			return "ENV FATE";
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
		@Override
		public String getTopCategory() {
			return "ENV FATE";
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
		@Override
		public String getTopCategory() {
			return "ENV FATE";
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
		@Override
		public String getTopCategory() {
			return "ENV FATE";
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
		@Override
		public String[] getEndpoints() {
			//phrasegroup_F136
			return new String[] {
					"(pseudo-)first order (= DT50)","second order","zero order","other:","no data"
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cSoilNo, //phrasegroup_F108
					I5CONSTANTS.cSoilType, //phrasegroup_F109
					I5CONSTANTS.cOCContent	//number
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cTestType
			};
		}
		@Override
		public String getTopCategory() {
			return "ENV FATE";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					
			};
		}	
		@Override
		public String getTopCategory() {
			return "ENV FATE";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					
			};
		}
		@Override
		public String getTopCategory() {
			return "ENV FATE";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					//phrasegroup_TD470
					"Koc","log Koc","Kd","other:"
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cTemperature,I5CONSTANTS.rOrgCarbonPercent, I5CONSTANTS.Remark
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					
			};
		}	
		@Override
		public String getTopCategory() {
			return "ENV FATE";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					
			};
		}	
		@Override
		public String getTopCategory() {
			return "ENV FATE";
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
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					//phrasegroup_E118
					"LC0","LC10","LC50","LC100","EC0","EC10","EC50","EC100","LD0","LD10","LD50","LD100","LR0","LR10",
					"LR50","LR100","NOEC","LOEC","other:"
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cConcType,I5CONSTANTS.cExposure,I5CONSTANTS.cMeasuredConcentration,I5CONSTANTS.cEffect
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cTestMedium,I5CONSTANTS.cTestOrganism,I5CONSTANTS.cExposure
			};
		}		
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					//phrasegroup_E118
					"LC0","LC10","LC50","LC100","EC0","EC10","EC50","EC100","LD0","LD10","LD50","LD100","LR0","LR10",
					"LR50","LR100","NOEC","LOEC","other:"					
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cConcType,I5CONSTANTS.cExposure,I5CONSTANTS.cMeasuredConcentration,I5CONSTANTS.cEffect
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cTestMedium,I5CONSTANTS.cTestOrganism,I5CONSTANTS.cExposure
			};
		}
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					//phrasegroup_E128
					"EC0","EC10","EC25","EC50","EC100",
					"ER0","ER10","ER25","ER50","ER100","NOEC","other:"					
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cConcType,I5CONSTANTS.cExposure,I5CONSTANTS.cMeasuredConcentration,I5CONSTANTS.cEffect
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cTestOrganism,I5CONSTANTS.cExposure
			};
		}	
		@Override
		public String getTopCategory() {
			return "ECOTOX";
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
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					//phrasegroup_T156
					"NOAEL","NOEL","LOAEL","LOEL","BMD05","BMDL05","BMDL10","BMD","BMC05","BMCL05","BMCL10","BMC","dose level","conc. level","other:"
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cSex					
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cRouteAdm,I5CONSTANTS.cDoses,I5CONSTANTS.cSpecies,I5CONSTANTS.cTestType
			};
		}
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					//phrasegroup_T166
					"NOAEL","NOEL","LOAEL","LOEL","BMD05","BMDL05","BMDL10","BMD","BMC05","BMCL05","BMCL10","BMC","dose level","conc. level","other:"
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cSex		
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cRouteAdm,I5CONSTANTS.cDoses,I5CONSTANTS.cSpecies,I5CONSTANTS.cTestType
			};
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					//phrasegroup_T156
					"NOAEL","NOEL","LOAEL","LOEL","BMD05","BMDL05","BMDL10","BMD","BMC05","BMCL05","BMCL10","BMC","dose level","conc. level","other:"
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cSex		
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cTypeCoverage,I5CONSTANTS.cDoses,I5CONSTANTS.cSpecies,I5CONSTANTS.cTestType
			};
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.eGenotoxicity
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cMetabolicActivation, I5CONSTANTS.cSpecies  
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cTypeStudy, I5CONSTANTS.cMetabolicActivationSystem,I5CONSTANTS.cTypeGenotoxicity,
					I5CONSTANTS.cTargetGene,I5CONSTANTS.cSpecies 
			};
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
		}
		@Override
		public String getOntologyURI() {
			return "http://www.bioassayontology.org/bao#BAO_0002167";
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
			return "7.6.2";
		}		
		@Override
		public String[] getEndpoints() {
			return new String[] {
					I5CONSTANTS.eGenotoxicity
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cToxicity, I5CONSTANTS.cSex
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cRouteAdm,
					I5CONSTANTS.cTypeStudy, I5CONSTANTS.cTypeGenotoxicity,I5CONSTANTS.cSpecies 
			};
		}
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String[] getEndpoints() {
			return new String[] { //phrasegroup_TD400
				"no NOAEC identified","no NOAEL identified","no T25 identified",
				"T25","NOAEC","NOAEL","NOEC","NOEL","LOAEC","LOAEL","LOEC","LOEL",
				"BMD05","BMDL05","BMDL10","BMD","BMC05","BMCL05","BMCL10","BMC","dose level","conc.level","other:"
			};
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cToxicity, I5CONSTANTS.cSex
			};
		}
		@Override
		public String[] getProtocolParameters() {
			return new String[] {
					I5CONSTANTS.cRouteAdm,
					I5CONSTANTS.cTypeStudy, I5CONSTANTS.cTypeGenotoxicity,I5CONSTANTS.cSpecies ,I5CONSTANTS.cDoses
			};
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String getTopCategory() {
			return "TOX";
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
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},
	CELL_VIABILITY_ASSAY {
		@Override
		public String getTitle() {
			return "Cell viability assay";
		}
		@Override
		public String getNumber() {
			return "7.999.1";
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
		}
		@Override
		public String getOntologyURI() {
			return "http://www.bioassayontology.org/bao#BAO_0003009";
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cDoses
			};
		}
		//cell viability: http://www.bioassayontology.org/bao#BAO_0003009
		//cytotoxicity: http://www.bioassayontology.org/bao#BAO_0002993
		//functional : http://www.bioassayontology.org/bao#BAO_0000010
	},
	BINDING_ASSAY {
		@Override
		public String getTitle() {
			return "Binding assay";
		}
		@Override
		public String getNumber() {
			return "7.999.2";
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
		}
		@Override
		public String getOntologyURI() {
			return "http://www.bioassayontology.org/bao#BAO_0000041";
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cDoses
			};
		}
	},	
	PROTEIN_SMALLMOLECULE_INTERACTION {
		@Override
		public String getTitle() {
			return "Protein-small molecule interaction assay";
		}
		@Override
		public String getNumber() {
			return "7.999.2";
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
		}
		@Override
		public String getOntologyURI() {
			return "http://www.bioassayontology.org/bao#BAO_0000110";
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cDoses
			};
		}
		
	},		
	AUTO_FLUORESCENCE {
		@Override
		public String getTitle() {
			return "Auto fluorescence";
		}
		@Override
		public String getNumber() {
			return "7.999.3";
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},	
	UNKNOWN_TOXICITY {
		@Override
		public String getTitle() {
			return "Toxicity (other)";
		}
		@Override
		public String getNumber() {
			return "7.999";
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},
	UNKNOWN_TOXICITY_SUMMARY {
		@Override
		public String getTitle() {
			return "Toxicity (other) summary";
		}
		@Override
		public String getNumber() {
			return "7.999.9";
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},	

	PUBCHEM_CONFIRMATORY {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
		@Override
		public String[] getConditions() {
			return new String[] {
					I5CONSTANTS.cDoses,"Replicate","Emission wavelength"
			};
		}
	},
	PUBCHEM_SUMMARY {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	
	},
	PUBCHEM_SCREENING {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},
	PUBCHEM_CELLBASED {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},	
	PUBCHEM_DOSERESPONSE {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},		
	PUBCHEM_PANEL {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},		
	PUBCHEM_BIOCHEMICAL {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},		
	PUBCHEM_INVIVO {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},		
	PUBCHEM_ACTIVECONCENTRATIONSPECIFIED {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},			
	PUBCHEM_INVITRO {
		@Override
		public String getTopCategory() {
			return "TOX";
		}
	},			
	PROTEOMICS {
		@Override
		public String getTitle() {
			return "Proteomics";
		}
		@Override
		public String getNumber() {
			return "7.100";
		}	
		@Override
		public String getTopCategory() {
			return "TOX";
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
		return String.format("10.%d",ordinal());
	}	
	public String getTitle() {
		return name().replace("_"," ");
	}		
	public String getTopCategory() {
		return "P-CHEM";
	}
	public String[] getEndpoints() {
		return null;
	}
	public String[] getProtocolParameters() {
		return null;
	}
	public String[] getConditions() {
		return null;
	}
	public String getOntologyURI() {
		return null;
	}
	public IParams createProtocolParameters() {
		IParams protocolParams = new Params();
		String[] params = getProtocolParameters();
		if (params!=null) 
			for (String param : params)
				protocolParams.put(param,null);
		return protocolParams;
	}
	/**
	 * 
	 * @param guide
	 * @return
	 */
	public Protocol getProtocol(String guide) {
		Protocol protocol = new Protocol(guide);
		protocol.setCategory(name()+"_SECTION");
		protocol.setTopCategory(getTopCategory());
		return protocol;
	}

	/**
	 * Creates an experiment record and adds placeholders for the relevant parameters
	 * @param protocol
	 * @return
	 */
	public ProtocolApplication<Protocol, IParams, String, IParams,String> createExperimentRecord(Protocol protocol) {
		ProtocolApplication<Protocol, IParams, String, IParams,String> experiment = new ProtocolApplication<Protocol, IParams, String, IParams,String>(protocol);
		experiment.setParameters(createProtocolParameters());
		return experiment;
	}	
	/**
	 * Creates an effect record and adds placeholders for the relevant conditions
	 * @return
	 */
	public EffectRecord<String, IParams, String> createEffectRecord() {
		EffectRecord<String, IParams, String> record =  new EffectRecord<String, IParams, String>();
		record.setConditions(new Params());
		String[] conditions = getConditions();
		if (conditions!=null) 
			for (String condition : conditions)
				record.getConditions().put(condition,null);
		return record;
	}
} 