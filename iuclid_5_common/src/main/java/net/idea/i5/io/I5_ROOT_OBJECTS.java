package net.idea.i5.io;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;

/**
 * https://github.com/ideaconsult/i5/blob/master/iuclid_5_common/src/main/java/
 * net/idea/i5/io/I5_ROOT_OBJECTS.java
 * 
 * @author nina
 * 
 */
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
					// SUBSTANCEPHYSICALSTATE phrasegroup_A19
					"gaseous", "liquid", "solid", "Not specified" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.Remark };
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
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eMELTINGPOINT };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.rDECOMPOSITION,
					I5CONSTANTS.rSUBLIMATION };
		}

		@Override
		public String getTitle() {
			return "Melting point / freezing point";
		}

		@Override
		public String getNumber() {
			return "4.2";
		}

		@Override
		public String getOntologyURI() {

			return "CHEMINF_000256";
		}
	},
	PC_BOILING {
		@Override
		public String getTitle() {
			return "Boiling point";
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.BOILINGPOINT };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.rDECOMPOSITION,
					I5CONSTANTS.AtmPressure };
		}

		@Override
		public String getNumber() {
			return "4.3";
		}

		@Override
		public String getOntologyURI() {
			return "CHEMINF_000257";
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
			return true; // not NM specific, but used in NM !
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.pMMD, I5CONSTANTS.pMMAD,
					I5CONSTANTS.pGSD, I5CONSTANTS.pPARTICLESIZE
			// I5CONSTANTS.pPARTICLESIZE + percentile
			};
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSEQ_NUM, I5CONSTANTS.Remark };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pTESTMAT_FORM,
					I5CONSTANTS.pDISTRIBUTION_TYPE };
		}

		@Override
		public String getOntologyURI() {
			// http://purl.obolibrary.org/obo/CHMO_0002119
			return "CHMO_0002119";
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

		@Override
		public String getOntologyURI() {
			return "CHEMINF_000419";
		}

	},
	PC_PARTITION {
		@Override
		public boolean isDataRich() {
			return true;
		}

		@Override
		public String getTitle() {
			return "Partition coefficient";
		}

		@Override
		public String getNumber() {
			return "4.7";
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eVapourPressure };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTemperature };
		}

		@Override
		public String getOntologyURI() {
			return "BAO_0002130";
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

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eWaterSolubility };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTemperature };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.methodType };
		}

		@Override
		public String getOntologyURI() {
			return "BAO_0002775";
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

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eSOLUBILITY_ORG_SOLVENT };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTemperature, I5CONSTANTS.Remark,
					I5CONSTANTS.cSolvent };
		}

		@Override
		public String getOntologyURI() {
			return "BAO_0002135";
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

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.pH };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTemperature, I5CONSTANTS.cDoses,
					I5CONSTANTS.Remark };
		}

		@Override
		public String getOntologyURI() {
			return "UO_0000196";
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

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.pKa };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTemperature, I5CONSTANTS.rNo };
		}

		@Override
		public String getOntologyURI() {
			return "CHEMINF_000194";
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
			return true; // 101
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.AGGLO_AGGR_DIAM,
					I5CONSTANTS.AGGLO_AGGR_SIZE,
					I5CONSTANTS.AGGLO_AGGR_SIZE_DIST,
					I5CONSTANTS.AGGLO_AGGREGATION_IDX };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.pH, I5CONSTANTS.cMEDIUM,
					I5CONSTANTS.Remark, I5CONSTANTS.cSEQ_NUM,
					I5CONSTANTS.cPERCENTILE };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod };
		}

		@Override
		public String getOntologyURI() {
			return "NPO_1967 NPO_1968";
			//
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
			return true; // 102
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eCRYSTALLINE_PHASE };
		}

		@Override
		public String[] getConditions() {
			return new String[] {};
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod,
					I5CONSTANTS.pTESTMAT_FORM, I5CONSTANTS.pMATERIAL_ISOTROPIC };
		}

		@Override
		public String getOntologyURI() {
			return "NPO_1512";
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
			return true; // 103
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.MEAN_DIAMETER };
		}

		@Override
		public String[] getConditions() {
			return new String[] {

			};
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod,
					I5CONSTANTS.pTESTMAT_FORM, I5CONSTANTS.pMATERIAL_ISOTROPIC };
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
			return true; // 104
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eASPECT_RATIO_X,
					I5CONSTANTS.eASPECT_RATIO_Y, I5CONSTANTS.eASPECT_RATIO_Z,
					I5CONSTANTS.eSHAPE };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.Remark };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod };
		}

		@Override
		public String getOntologyURI() {
			return "NPO_274 NPO_1365";
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
			return true; // 105
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.SPECIFIC_SURFACE_AREA };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.Remark };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.pTESTMAT_FORM,
					I5CONSTANTS.cTypeMethod };
		}

		@Override
		public String getOntologyURI() {
			return "NPO_1235";
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
			return true; // 106
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eZETA_POTENTIAL,
					I5CONSTANTS.eISOELECTRIC_POINT };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cMEDIUM, I5CONSTANTS.pH,
					I5CONSTANTS.Remark };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.pTESTMAT_FORM,
					I5CONSTANTS.cTypeMethod };
		}

		@Override
		public String getOntologyURI() {
			return "NPO_1302";
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
			return true; // 107
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eATOMIC_COMPOSITION,
					I5CONSTANTS.eFUNCTIONAL_GROUP };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.pCOATING_DESCRIPTION,
					I5CONSTANTS.pDESCRIPTION, I5CONSTANTS.Remark,
					I5CONSTANTS.pELEMENT_OR_GROUP, I5CONSTANTS.pTYPE };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod };
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
			return true; // 108
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eDUSTINEX };
		}

		@Override
		public String[] getConditions() {
			return new String[] {

			};
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod,
					I5CONSTANTS.pTESTMAT_FORM };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_9000003";
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
			return true; // 109
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.ePOROSITY,
					I5CONSTANTS.eSPECIFIC_PORE_VOLUME, };
		}

		@Override
		public String[] getConditions() {
			return new String[] {};
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod,
					I5CONSTANTS.pTESTMAT_FORM };
		}

		@Override
		public String getOntologyURI() {
			return "PATO_0000973";
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
			return true; // 110
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.ePOUR_DENSITY };
		}

		@Override
		public String[] getConditions() {
			return new String[] {};
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod,
					I5CONSTANTS.pTESTMAT_FORM };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_9000004";
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
			return true; // 111
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.ePHOTOCATALYTIC_ACTIVITY,
					I5CONSTANTS.eTURNOVERFREQUENCY };
		}

		@Override
		public String[] getConditions() {
			return new String[] {};
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod,
					I5CONSTANTS.pTESTMAT_FORM };
		}
	},
	/*
	 * RADICAL_FORMATION_POTENTIAL {
	 * 
	 * @Override public String getTitle() { return
	 * "Nanomaterial radical formation potential"; }
	 * 
	 * @Override public String getNumber() { return "4.35"; }
	 * 
	 * @Override public boolean isNanoMaterialTemplate() { return true; //112 }
	 * 
	 * @Override public boolean isSupported() { return false; }
	 * 
	 * @Override public String[] getEndpoints() { return new String[] { }; }
	 * 
	 * @Override public String[] getConditions() { return new String[] {}; }
	 * 
	 * @Override public String[] getProtocolParameters() { return new String[]
	 * {}; } },
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
			return true; // 113
		}

		@Override
		public boolean isSupported() {
			return true;
		}

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.eCATALYTIC_ACTIVITY,
					I5CONSTANTS.eTURNOVERFREQUENCY };
		}

		@Override
		public String[] getConditions() {
			return new String[] {};
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pMETHODDETAILS,
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					I5CONSTANTS.pSAMPLING, I5CONSTANTS.cTypeMethod,
					I5CONSTANTS.pTESTMAT_FORM };
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

		@Override
		public boolean isIUCLID5() {
			return false;
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

		@Override
		public String[] getEndpoints() {
			return new String[] { I5CONSTANTS.rPERCENTILE_DT50 };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.pReactant, I5CONSTANTS.TestCondition };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.pReactant };
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

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.pH, I5CONSTANTS.cTemperature };
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

		@Override
		public String[] getEndpoints() {
			// phrasegroup_F103
			return new String[] { I5CONSTANTS.ePercentDegradation,
					"CH4 evolution", "CO2 evolution", "DOC removal",
					"inorg. C analysis", "O2 consumption", "Radiochem. meas.",
					"Test mat. analysis", "TOC removal" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTimePoint };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTestType };
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

		@Override
		public String[] getEndpoints() {
			// phrasegroup_F136
			return new String[] { "(pseudo-)first order (= DT50)",
					"second order", "zero order" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cDegradationParameter,
					I5CONSTANTS.rDegradation, I5CONSTANTS.cTimePoint };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTestType };
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
			// phrasegroup_F136
			return new String[] { "(pseudo-)first order (= DT50)",
					"second order", "zero order", "other:", "no data" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSoilNo, // phrasegroup_F108
					I5CONSTANTS.cSoilType, // phrasegroup_F109
					I5CONSTANTS.cOCContent // number
			};
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTestType };
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
			// phrasegroup_F141
			return new String[] { "BCF", "BAF", "BSAF", "BMF" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cBioaccBasis, I5CONSTANTS.cDoses };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cRoute };
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
			// phrasegroup_F133
			return new String[] { "BCF", "BSAF" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cBioaccBasis };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cSpecies };
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
					// phrasegroup_TD470
					"Koc", "log Koc", "Kd", "other:" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTemperature,
					I5CONSTANTS.rOrgCarbonPercent, I5CONSTANTS.Remark };
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
			return new String[] { I5CONSTANTS.HLC };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.Pressure,
					I5CONSTANTS.cTemperature, I5CONSTANTS.Remark };
		}

		@Override
		public String getTopCategory() {
			return "ENV FATE";
		}

		@Override
		public String getOntologyURI() {
			return "CHEMINF_000433";
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

		@Override
		public String[] getEndpoints() {
			// phrasegroup_E104
			return new String[] { "LC0", "LC10", "LC50", "LC100", "EC0",
					"EC10", "EC50", "EC100", "LL0", "LL10", "LL50", "LL100",
					"EL0", "EL10", "EL50", "EL100", "IC10", "IC50", "IC100",
					"NOELR", "LOELR", "NOEC", "LOEC" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cEffect, I5CONSTANTS.cConcType,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cExposure };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cExposure,
					I5CONSTANTS.cTestMedium, I5CONSTANTS.cTestOrganism };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000010";
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

		@Override
		public String[] getEndpoints() {
			// phrasegroup_E115b
			return new String[] { "NOEC", "LOEC", "NOELR", "LOELR", "EC10",
					"EC50", "EL10", "EL50", "IC10", "IC50", "LC10", "LC50",
					"LL10", "LL50" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cEffect, I5CONSTANTS.cConcType,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cExposure };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cExposure,
					I5CONSTANTS.cTestMedium, I5CONSTANTS.cTestOrganism };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000011";
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

		@Override
		public String[] getEndpoints() {
			// phrasegroup_E104
			return new String[] { "LC0", "LC10", "LC50", "LC100", "EC0",
					"EC10", "EC50", "EC100", "LL0", "LL10", "LL50", "LL100",
					"EL0", "EL10", "EL50", "EL100", "IC10", "IC50", "IC100",
					"NOELR", "LOELR", "NOEC", "LOEC" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cEffect, I5CONSTANTS.cConcType,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cExposure };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cExposure,
					I5CONSTANTS.cTestMedium, I5CONSTANTS.cTestOrganism };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000006";
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

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cEffect, I5CONSTANTS.cConcType,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cExposure };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cExposure,
					I5CONSTANTS.cTestMedium, I5CONSTANTS.cTestOrganism };
		}

		@Override
		public String[] getEndpoints() {
			// phrasegroup_E115b
			return new String[] { "NOEC", "LOEC", "NOELR", "LOELR", "EC10",
					"EC50", "EL10", "EL50", "IC10", "IC50", "LC10", "LC50",
					"LL10", "LL50" };
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

		@Override
		public String[] getEndpoints() {
			// phrasegroup_E110
			return new String[] { "EC0", "EC5", "EC10", "EC20", "EC50", "EC90",
					"EC100", "EL0", "EL5", "EL10", "EL20", "EL50", "EL90",
					"EL100", "IC10", "IC50", "IC100", "NOEC", "NOELR", "LOEC",
					"LOELR" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cEffect, I5CONSTANTS.cConcType,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cExposure };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cExposure,
					I5CONSTANTS.cTestMedium, I5CONSTANTS.cTestOrganism };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000005";
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

		@Override
		public String[] getEndpoints() {
			// phrasegroup_E107
			return new String[] { "EC0", "EC10", "EC50", "EC100", "IC0",
					"IC10", "IC50", "IC100", "NOEC", "LOEC" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cEffect, I5CONSTANTS.cConcType,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cExposure };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cExposure,
					I5CONSTANTS.cTestMedium, I5CONSTANTS.cTestOrganism };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000015";
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
					// phrasegroup_E118
					"LC0", "LC10", "LC50", "LC100", "EC0", "EC10", "EC50",
					"EC100", "LD0", "LD10", "LD50", "LD100", "LR0", "LR10",
					"LR50", "LR100", "NOEC", "LOEC", "other:" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cConcType, I5CONSTANTS.cExposure,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cEffect };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTestMedium,
					I5CONSTANTS.cTestOrganism, I5CONSTANTS.cExposure };
		}

		@Override
		public String getTopCategory() {
			return "ECOTOX";
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000009";
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
					// phrasegroup_E118
					"LC0", "LC10", "LC50", "LC100", "EC0", "EC10", "EC50",
					"EC100", "LD0", "LD10", "LD50", "LD100", "LR0", "LR10",
					"LR50", "LR100", "NOEC", "LOEC", "other:" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cConcType, I5CONSTANTS.cExposure,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cEffect };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTestMedium,
					I5CONSTANTS.cTestOrganism, I5CONSTANTS.cExposure };
		}

		@Override
		public String getTopCategory() {
			return "ECOTOX";
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000013";
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

		@Override
		public String[] getEndpoints() {
			return new String[] {
					// phrasegroup_E118
					"LC0", "LC10", "LC50", "LC100", "EC0", "EC10", "EC50",
					"EC100", "LD0", "LD10", "LD50", "LD100", "LR0", "LR10",
					"LR50", "LR100", "NOEC", "LOEC", "other:" };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTestOrganism,
					I5CONSTANTS.cExposure };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cConcType, I5CONSTANTS.cExposure,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cEffect };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000016";
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

		@Override
		public String[] getEndpoints() {
			// phrasegroup_E121
			return new String[] { "NOEC", "LOEC", "EC0", "EC10", "EC25",
					"EC50", "EC100", "ER0", "ER10", "ER25", "ER50", "ER100",
					"LC0", "LC10", "LC25", "LC50", "LC100"

			};
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTestMedium,
					I5CONSTANTS.cExposure };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTestOrganism,
					I5CONSTANTS.cConcType, I5CONSTANTS.cExposure,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cEffect };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000017";
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
					// phrasegroup_E128
					"EC0", "EC10", "EC25", "EC50", "EC100", "ER0", "ER10",
					"ER25", "ER50", "ER100", "NOEC", "other:" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cConcType, I5CONSTANTS.cExposure,
					I5CONSTANTS.cMeasuredConcentration, I5CONSTANTS.cEffect };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTestOrganism,
					I5CONSTANTS.cExposure };
		}

		@Override
		public String getTopCategory() {
			return "ECOTOX";
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000008";
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

		@Override
		public String[] getEndpoints() {
			return new String[] {
					// phrasegroup_T01
					"LD0", "LD50", "LD100", "LDLo", "approx. LD50",
					"discriminating dose" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cSex };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] {};
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000020";
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

		@Override
		public String[] getEndpoints() {
			return new String[] {
					// phrasegroup_T05
					"LC0", "LC50", "LC100", "LCLo", "discriminating conc." };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cSex };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] {};
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000023";
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

		@Override
		public String[] getEndpoints() {
			return new String[] {
					// phrasegroup_T01
					"LD0", "LD50", "LD100", "LDLo", "approx. LD50",
					"discriminating dose" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cSex };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] {};
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000026";
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

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cTypeMethod };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000032";
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

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cTypeMethod };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000033";
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

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cSpecies,
					I5CONSTANTS.cTypeMethod, I5CONSTANTS.cTypeStudy };
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000034";
		}
	},
	// TO_SENSITIZATION_HUMAN,
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
					// phrasegroup_T156
					"NOAEL", "NOEL", "LOAEL", "LOEL", "BMD05", "BMDL05",
					"BMDL10", "BMD", "BMC05", "BMCL05", "BMCL10", "BMC",
					"dose level", "conc. level", "other:" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cTestType, I5CONSTANTS.cSex };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cRouteAdm, I5CONSTANTS.cDoses
					 };
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000021";
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
					// phrasegroup_T166
					"NOAEL", "NOEL", "LOAEL", "LOEL", "BMD05", "BMDL05",
					"BMDL10", "BMD", "BMC05", "BMCL05", "BMCL10", "BMC",
					"dose level", "conc. level", "other:" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cTestType, I5CONSTANTS.cSex };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cRouteAdm, I5CONSTANTS.cDoses,
					 };
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000024";
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
					// phrasegroup_T156
					"NOAEL", "NOEL", "LOAEL", "LOEL", "BMD05", "BMDL05",
					"BMDL10", "BMD", "BMC05", "BMCL05", "BMCL10", "BMC",
					"dose level", "conc. level", "other:" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cTestType,
					I5CONSTANTS.cSex };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTypeCoverage,
					I5CONSTANTS.cDoses, };
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000027";
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
			return new String[] { I5CONSTANTS.eGenotoxicity };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTypeStudy, I5CONSTANTS.cMetabolicActivation,
					I5CONSTANTS.cSpecies };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cTypeStudy,
					I5CONSTANTS.cMetabolicActivationSystem,
					I5CONSTANTS.cTypeGenotoxicity, I5CONSTANTS.cTargetGene,
					I5CONSTANTS.cSpecies };
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
			return new String[] { I5CONSTANTS.eGenotoxicity };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cTypeStudy, I5CONSTANTS.cToxicity, I5CONSTANTS.cSex };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cRouteAdm,
					I5CONSTANTS.cTypeStudy, I5CONSTANTS.cTypeGenotoxicity,
					I5CONSTANTS.cSpecies };
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000028";
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
			return new String[] { // phrasegroup_TD400
			"no NOAEC identified", "no NOAEL identified", "no T25 identified",
					"T25", "NOAEC", "NOAEL", "NOEC", "NOEL", "LOAEC", "LOAEL",
					"LOEC", "LOEL", "BMD05", "BMDL05", "BMDL10", "BMD",
					"BMC05", "BMCL05", "BMCL10", "BMC", "dose level",
					"conc.level", "other:" };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cEffectType };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cRouteAdm,
					I5CONSTANTS.cDoses };
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public String getOntologyURI() {
			return "ENM_0000029";
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

		@Override
		public String[] getEndpoints() {
			return new String[] {
					// phrasegroup_T166
					"NOAEL", "NOEL", "LOAEL", "LOEL", "BMD05", "BMDL05",
					"BMDL10", "BMD", "BMC05", "BMCL05", "BMCL10", "BMC",
					"dose level", "conc. level", "other:" };
		}

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cRouteAdm,
					I5CONSTANTS.cDoses };
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cSex, I5CONSTANTS.cGeneration };
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

		@Override
		public String[] getProtocolParameters() {
			return new String[] { I5CONSTANTS.cSpecies, I5CONSTANTS.cRouteAdm,
					I5CONSTANTS.cDoses };
		}

		@Override
		public String[] getConditions() {
			return new String[] {I5CONSTANTS.cSpecies, I5CONSTANTS.cEffectType };
		}

		@Override
		public String[] getEndpoints() {
			return new String[] {
					// phrasegroup_T166
					"NOAEL", "NOEL", "LOAEL", "LOEL", "BMD05", "BMDL05",
					"BMDL10", "BMD", "BMC05", "BMCL05", "BMCL10", "BMC",
					"dose level", "conc. level", "other:" };
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
			return new String[] { I5CONSTANTS.cDoses };
		}

		// cell viability: http://www.bioassayontology.org/bao#BAO_0003009
		// cytotoxicity: http://www.bioassayontology.org/bao#BAO_0002993
		// functional : http://www.bioassayontology.org/bao#BAO_0000010
		@Override
		public boolean isIUCLID5() {
			return false;
		}

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
			return new String[] { I5CONSTANTS.cDoses };
		}

		@Override
		public boolean isIUCLID5() {
			return false;
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
			return new String[] { I5CONSTANTS.cDoses };
		}

		@Override
		public boolean isIUCLID5() {
			return false;
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

		@Override
		public boolean isIUCLID5() {
			return false;
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

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	UNKNOWN_TOXICITY_SUMMARY {
		@Override
		public String getTitle() {
			return "Toxicity (other) summary";
		}

		@Override
		public String getNumber() {
			return "7.999.8";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	SUPPORTING_INFO {
		@Override
		public String getTitle() {
			return "Supporting information";
		}

		@Override
		public String getNumber() {
			return "7.999.9";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_CONFIRMATORY {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public String[] getConditions() {
			return new String[] { "Replicate", "Emission wavelength" };
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_SUMMARY {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public String[] getConditions() {
			return new String[] { "Emission wavelength" };
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_SCREENING {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_CELLBASED {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_DOSERESPONSE {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public String[] getConditions() {
			return new String[] { I5CONSTANTS.cDoses, "Replicate",
					"Emission wavelength" };
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_PANEL {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_BIOCHEMICAL {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_INVIVO {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_ACTIVECONCENTRATIONSPECIFIED {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PUBCHEM_INVITRO {
		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	PROTEOMICS {
		@Override
		public String getTitle() {
			return "Proteomics";
		}

		@Override
		public String getNumber() {
			return "8.100";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

	},
	BAO_0003009 {
		@Override
		public String getTitle() {
			return "Cell Viability Assay";
		}

		@Override
		public String getNumber() {
			return name();
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

		@Override
		public String getOntologyURI() {
			return name();
		}

	},
	BAO_0002993 {
		@Override
		public String getTitle() {
			return "Cytotoxicity Assay";
		}

		@Override
		public String getNumber() {
			return name();
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

		@Override
		public String getOntologyURI() {
			return name();
		}

	},
	BAO_0002100 {
		@Override
		public String getTitle() {
			return "Cell Growth Assay";
		}

		@Override
		public String getNumber() {
			return name();
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

		@Override
		public String getOntologyURI() {
			return name();
		}

	},
	BAO_0002167 {
		// to be merged with genotox
		@Override
		public String getTitle() {
			return "Genotoxicity Assay";
		}

		@Override
		public String getNumber() {
			return name();
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

		@Override
		public String getOntologyURI() {
			return name();
		}

	},
	BAO_0002168 {
		// to be merged woth I5 category
		@Override
		public String getTitle() {
			return "Oxidative Stress Assay";
		}

		@Override
		public String getNumber() {
			return name();
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

		@Override
		public String getOntologyURI() {
			return name();
		}

	},
	BAO_0002189 {
		// to be merged with I5 category
		@Override
		public String getTitle() {
			return "Toxicity Assay";
		}

		@Override
		public String getNumber() {
			return name();
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}

		@Override
		public String getOntologyURI() {
			return name();
		}
	},
	CELL_CYCLE {
		// obo:GO:0007049
		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},
	CELL_DEATH {
		// obo:GO:0008219
		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},
	CELL_MORPHOLOGY {
		// BAO_0170002
		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},

	CELL_PROLIFERATION {
		// obo:GO:0008283
		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},
	MITOCHONDRIAL_DEPOLARIZATION {

		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},
	OXIDATIVE_PHOSPHORYLATION {
		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},
	PROTEIN_STABILIZATION {
		// obo:GO:0050821
		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},
	RECEPTOR_BINDING {
		// obo:GO:0005102
		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},
	REGULATION_OF_CATALYTIC_ACTIVITY {
		// BAO_0002737
		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},
	REGULATION_OF_GENE_EXPRESSION {
		// obo:GO:0010468
		@Override
		public String getNumber() {
			return "7.205";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	},
	REGULATION_OF_TRANSCRIPTION_FACTOR_ACTIVITY {
		// obo:GO:0006355
		@Override
		public String getNumber() {
			return "7.505";
		}

		@Override
		public String getTopCategory() {
			return "TOX";
		}

		@Override
		public boolean isIUCLID5() {
			return false;
		}
	};

	public boolean isIUCLID5() {
		return true;
	}

	public String getContextPath() {
		return "eu.europa.echa.schemas.iuclid5._20130101.studyrecord." + name()
				+ "_SECTION";
	}

	public String toSection() {
		return name() + "_SECTION";
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
		return String.format("10.%d", ordinal());
	}

	public String getTitle() {
		return name().replace("_", " ");
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
		if (params != null)
			for (String param : params)
				protocolParams.put(param, null);
		return protocolParams;
	}

	/**
	 * 
	 * @param guide
	 * @return
	 */
	public Protocol getProtocol(String guide) {
		Protocol protocol = new Protocol(guide);
		protocol.setCategory(name() + "_SECTION");
		protocol.setTopCategory(getTopCategory());
		return protocol;
	}

	/**
	 * Creates an experiment record and adds placeholders for the relevant
	 * parameters
	 * 
	 * @param protocol
	 * @return
	 */
	public ProtocolApplication<Protocol, IParams, String, IParams, String> createExperimentRecord(
			Protocol protocol) {
		ProtocolApplication<Protocol, IParams, String, IParams, String> experiment = new ProtocolApplication<Protocol, IParams, String, IParams, String>(
				protocol);
		experiment.setParameters(createProtocolParameters());
		return experiment;
	}

	/**
	 * Creates an effect record and adds placeholders for the relevant
	 * conditions
	 * 
	 * @return
	 */
	public EffectRecord<String, IParams, String> createEffectRecord() {
		EffectRecord<String, IParams, String> record = new EffectRecord<String, IParams, String>();
		record.setConditions(new Params());
		String[] conditions = getConditions();
		if (conditions != null)
			for (String condition : conditions)
				record.getConditions().put(condition, null);
		return record;
	}
}