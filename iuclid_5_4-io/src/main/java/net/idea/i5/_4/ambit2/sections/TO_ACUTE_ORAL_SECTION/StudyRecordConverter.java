package net.idea.i5._4.ambit2.sections.TO_ACUTE_ORAL_SECTION;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.ro.I5CONSTANTS;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_ACUTE_ORAL_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEORAL.GUIDELINE.Set;
import net.idea.i5.ambit2.sections.TOXStudyRecordConvertor;
import net.idea.i5.io.Experiment;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;

public class StudyRecordConverter
		extends
		TOXStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord> {
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.TO_ACUTE_ORAL);
	}

	@Override
	protected boolean hasScientificPart(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getScientificPart() != null;
	}

	@Override
	protected boolean isDataWaiving(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getDataWaiving() != null;
	}

	@Override
	protected String getTestMaterialIdentity(EndpointStudyRecord unmarshalled) {
		try {
			return unmarshalled.getScientificPart().getTOACUTEORAL()
					.getTESTMATINDICATOR().getSet().getLISTBELOWSEL()
					.getLISTBELOWSEL();
		} catch (Exception x) {
			return null;
		}
	}

	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled,
			ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getTOACUTEORAL().getREFERENCE() != null)
			for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEORAL.REFERENCE.Set set : unmarshalled
					.getScientificPart().getTOACUTEORAL().getREFERENCE()
					.getSet()) {
				try {
					papp.setReference(set.getREFERENCEAUTHOR()
							.getREFERENCEAUTHOR().getValue());
				} catch (Exception x) {
					papp.setReference(null);
				}
				try {
					if (set.getREFERENCEYEAR() != null)
						try {
							papp.setReferenceYear(set.getREFERENCEYEAR()
									.getREFERENCEYEAR().getValue());
						} catch (Exception x) {
						}
					try {
						papp.setReferenceOwner(set.getREFERENCECOMPANYID()
								.getREFERENCECOMPANYID().getValue());
					} catch (Exception x) {
						papp.setReferenceOwner("");
					}
					isReferenceTypeAccepted(set.getPHRASEOTHERREFERENCETYPE() == null ? null
							: set.getPHRASEOTHERREFERENCETYPE()
									.getREFERENCETYPE());
					return;
				} catch (QACriteriaException x) {
					qax = x;
					continue;
				} catch (Exception x) {
					qax = new QACriteriaException(x.getMessage());
					continue;
				}

			}
		else if (!isReferenceTypeAccepted(null))
			qax = new QACriteriaException("Empty reference!");
		if (qax != null)
			throw qax;
	}

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOACUTEORAL()==null) return null;
		
		record.clear();
		Experiment<IParams, IParams> papp = createProtocolApplication(
					unmarshalled.getDocumentReferencePK(),
					unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled));
		record.addMeasurement(papp);
		
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file

		if (sciPart.getTOACUTEORAL().getGUIDELINE()!=null)
			for (Set set : sciPart.getTOACUTEORAL().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(getGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue(),
						set.getPHRASEOTHERGUIDELINE().getGUIDELINETXT()));
			} catch (Exception x) {}
		if (sciPart.getTOACUTEORAL().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOACUTEORAL().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/
		
		parseReference(unmarshalled, papp);
		//papp.getParameters().put(I5CONSTANTS.cYear,papp.getReferenceYear());

				
		Object prm_sex = null;
		// Sex
		try {
			prm_sex = 
					sciPart.getTOACUTEORAL().getSEX()==null?null:
					sciPart.getTOACUTEORAL().getSEX().getSet().getLISTBELOWPOP().getLISTBELOWPOPValue();
		} catch (Exception x) { papp.getParameters().put(I5CONSTANTS.cSex,null);}
		// endpoint
		// effect level
		if (sciPart.getTOACUTEORAL().getEFFLEVEL() != null)
			for (eu.europa.echa.schemas.iuclid5._20120101.studyrecord.TO_ACUTE_ORAL_SECTION.EndpointStudyRecord.ScientificPart.TOACUTEORAL.EFFLEVEL.Set set : sciPart.getTOACUTEORAL().getEFFLEVEL().getSet()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				try {
					effect.setEndpoint(getValue(set.getPHRASEOTHERENDPOINT().getENDPOINTValue(),set.getPHRASEOTHERENDPOINT().getENDPOINTTXT()));
				} catch (Exception x) {effect.setEndpoint(null);}
				papp.addEffect(effect);
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					effect.setUnit(getUnit(set.getPRECISIONLOQUALIFIER().getUNITValue(),
							set.getPRECISIONLOQUALIFIER().getUNITTXT()==null?null:
							set.getPRECISIONLOQUALIFIER().getUNITTXT().getValue()));
					
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					} catch (Exception x) {}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					} catch (Exception x) {}
				}
				

				try {
					effect.getConditions().put(
							I5CONSTANTS.cSpecies,
							getValue(sciPart.getTOACUTEORAL().getORGANISM()
									.getSet().getPHRASEOTHERLISTPOP()
									.getLISTPOPValue(), sciPart
									.getTOACUTEORAL().getORGANISM().getSet()
									.getPHRASEOTHERLISTPOP().getLISTPOPTXT()));

				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.cSpecies, null);
				}

				effect.getConditions().put(
						I5CONSTANTS.cSex,
						set.getSEX() == null ? prm_sex : set.getSEX()
								.getSEXValue());

			}
		
		if (sciPart.getTOACUTEORAL().getINTERPRETRSSUBMITTER() != null) {
			String otherValue = null;
			try { 
				otherValue = sciPart.getTOACUTEORAL().getINTERPRETRSSUBMITTER().getSet().
					getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXTXT().getValue();
			} catch (Exception x) {};
			
			setInterpretationResult(papp, 
					sciPart.getTOACUTEORAL().getINTERPRETRSSUBMITTER().getSet()
					.getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue(),
					otherValue
			);

		} else setInterpretationResult(papp,null,null);
		
		if (sciPart.getTOACUTEORAL().getCRITERIASUBMITTER() != null) {
			papp.setInterpretationCriteria(getValue( 
					sciPart.getTOACUTEORAL().getCRITERIASUBMITTER().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue(),
					sciPart.getTOACUTEORAL().getCRITERIASUBMITTER().getSet().getPHRASEOTHERLISTPOP().getLISTPOPTXT()
					));
		} else papp.setInterpretationCriteria(""); 

		return record;
	}

}
