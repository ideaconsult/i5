package net.idea.i5._5.ambit2.sections.ASPECT_RATIO_SHAPE_SECTION;

import javax.xml.bind.JAXBElement;

import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;
import net.idea.modbcum.i.exceptions.AmbitException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord.ScientificPart.ASPECTRATIOSHAPE.REFERENCE.Set;

public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord, IParams, IParams> {

	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE);
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
			return unmarshalled.getScientificPart().getASPECTRATIOSHAPE()
					.getTESTMATEQSUBMSUB().getSet().getLISTBELOWSEL()
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
		if (unmarshalled.getScientificPart().getASPECTRATIOSHAPE()
				.getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart()
					.getASPECTRATIOSHAPE().getREFERENCE().getSet()) {
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
		else
			qax = new QACriteriaException("Empty reference!");
		if (qax != null)
			throw qax;
	}

	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record) == null)
			return null;
		ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getASPECTRATIOSHAPE() == null)
			return null;

		record.clear();
		ProtocolApplication<Protocol, IParams, String, IParams, String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(), unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID(),
				unmarshalled.isRobustStudy(),
				unmarshalled.isUsedForClassification(),
				unmarshalled.isUsedForMSDS(), unmarshalled.getPurposeFlag()
						.getValueID(), unmarshalled.getStudyResultType()
						.getValueID(), getTestMaterialIdentity(unmarshalled));
		record.addMeasurement(papp);

		// UUID
		if (unmarshalled.getOwnerRef().getType()
				.equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}

		// citation
		parseReference(unmarshalled, papp);
		// TODO data owner - it's probably not in this file

		if (sciPart.getASPECTRATIOSHAPE().getGUIDELINE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord.ScientificPart.ASPECTRATIOSHAPE.GUIDELINE.Set set : sciPart
					.getASPECTRATIOSHAPE().getGUIDELINE().getSet())
				try {
					papp.getProtocol().addGuideline(
							getGuideline(set.getPHRASEOTHERGUIDELINE()
									.getGUIDELINEValue(), set
									.getPHRASEOTHERGUIDELINE()
									.getGUIDELINETXT()));
				} catch (Exception x) {
				}

		if (sciPart.getASPECTRATIOSHAPE().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getASPECTRATIOSHAPE().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		try {
			papp.getParameters().put(
					I5CONSTANTS.cTypeMethod,
					sciPart.getASPECTRATIOSHAPE().getMETHOD() == null ? null
							: sciPart.getASPECTRATIOSHAPE().getMETHOD()
									.getSet().getPHRASEOTHERLISTSELFIX()
									.getLISTSELFIXValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.cTypeMethod, null);
		}

		try {
			papp.getParameters().put(
					I5CONSTANTS.pMETHODDETAILS,
					sciPart.getASPECTRATIOSHAPE().getMETHODSDETAILSDATAEVAL()
							.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
							.getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pMETHODDETAILS, null);
		}
		/*
		 * papp.getParameters().put(cTestMaterialForm,
		 * sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM()==null?null:
		 * sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM().getSet().
		 * getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		 */

		try {
			papp.getParameters().put(
					I5CONSTANTS.pSAMPLING,
					sciPart.getASPECTRATIOSHAPE().getSAMPLING().getSet()
							.getFREETEXTBELOW().getFREETEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pSAMPLING, null);
		}
		try {
			papp.getParameters().put(
					I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					sciPart.getASPECTRATIOSHAPE().getDATAGATHERINGINSTRUMENTS()
							.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
							.getValue());
		} catch (Exception x) {
			papp.getParameters().put(I5CONSTANTS.pDATA_GATHERING_INSTRUMENTS,
					null);
		}

		if (sciPart.getASPECTRATIOSHAPE().getSHAPEDESCRIPTION() != null) {
			parseElement(sciPart.getASPECTRATIOSHAPE().getSHAPEDESCRIPTION(),
					papp);
		}
		if (sciPart.getASPECTRATIOSHAPE().getASPECTRATIO() != null) {
			parseElement(sciPart.getASPECTRATIOSHAPE().getASPECTRATIO(), papp);
		}
		/*
		try {
			papp.setInterpretationResult(sciPart.getASPECTRATIOSHAPE()
					.getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW()
					.getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);
		}
		*/
		return record;
	}

	protected void parseElement(JAXBElement<Object> element,
			ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		String endpoint = null;
		if (element.getValue() instanceof Node) {
			endpoint = ((Node) element.getValue()).getLocalName();
			// parseNode((Node) element.getValue(),">");
		}
		if (element.getValue() instanceof NodeList) {
			NodeList nodes = (NodeList) element.getValue();
			// i5:set
			for (int i = 0; i < nodes.getLength(); i++) {
				Node set = nodes.item(i);
				if ("set".equals(set.getLocalName())) {

					EffectRecord<String, IParams, String> effectShape = null;
					EffectRecord<String, IParams, String> effectAspectRatio_x = null;
					EffectRecord<String, IParams, String> effectAspectRatio_y = null;
					EffectRecord<String, IParams, String> effectAspectRatio_z = null;

					NodeList r = set.getChildNodes();
					for (int j = 0; j < r.getLength(); j++)
						try {
							EFFECT field = EFFECT.valueOf(r.item(j)
									.getLocalName());
							switch (field) {
							case PHRASEOTHER_SHAPE_DESCRIPTIVE: {
								if (effectShape == null) {
									effectShape = I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE
											.createEffectRecord();
									effectShape.setEndpoint(I5CONSTANTS.eSHAPE);
									papp.addEffect(effectShape);
								}								
								field.setValue(papp, effectShape, r.item(j)
										.getChildNodes());
								break;
							}
							case PRECISION_X_LOQUALIFIER: {
								if (effectAspectRatio_x == null) {
									effectAspectRatio_x = I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE
											.createEffectRecord();
									effectAspectRatio_x
											.setEndpoint(I5CONSTANTS.eASPECT_RATIO_X);
									papp.addEffect(effectAspectRatio_x);
								}
								field.setValue(papp, effectAspectRatio_x, r
										.item(j).getChildNodes());
								break;
							}
							case X_STD_DEVI_VALUE: {
								if (effectAspectRatio_x == null) {
									effectAspectRatio_x = I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE
											.createEffectRecord();
									effectAspectRatio_x
											.setEndpoint(I5CONSTANTS.eASPECT_RATIO_X);
									papp.addEffect(effectAspectRatio_x);
								}
								field.setValue(papp, effectAspectRatio_z, r
										.item(j).getChildNodes());
								break;								
							}							
							case PRECISION_Y_LOQUALIFIER: {
								if (effectAspectRatio_y == null) {
									effectAspectRatio_y = I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE
											.createEffectRecord();
									effectAspectRatio_y
											.setEndpoint(I5CONSTANTS.eASPECT_RATIO_Y);
									papp.addEffect(effectAspectRatio_y);
								}
								field.setValue(papp, effectAspectRatio_y, r
										.item(j).getChildNodes());
								break;
							}
							case Y_STD_DEVI_VALUE: {
								if (effectAspectRatio_y == null) {
									effectAspectRatio_y = I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE
											.createEffectRecord();
									effectAspectRatio_y
											.setEndpoint(I5CONSTANTS.eASPECT_RATIO_Y);
									papp.addEffect(effectAspectRatio_y);
								}
								field.setValue(papp, effectAspectRatio_z, r
										.item(j).getChildNodes());
								break;								
							}							
							case PRECISION_Z_LOQUALIFIER: {
								if (effectAspectRatio_z == null) {
									effectAspectRatio_z = I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE
											.createEffectRecord();
									effectAspectRatio_z
											.setEndpoint(I5CONSTANTS.eASPECT_RATIO_Z);
									papp.addEffect(effectAspectRatio_z);
								}
								field.setValue(papp, effectAspectRatio_z, r
										.item(j).getChildNodes());
								break;
							}
							case Z_STD_DEVI_VALUE: {
								if (effectAspectRatio_z == null) {
									effectAspectRatio_z = I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE
											.createEffectRecord();
									effectAspectRatio_z
											.setEndpoint(I5CONSTANTS.eASPECT_RATIO_Z);
									papp.addEffect(effectAspectRatio_z);
								}
								field.setValue(papp, effectAspectRatio_z, r
										.item(j).getChildNodes());
								break;								
							}
							case SHAPE_VALUE: {
								if (effectShape == null) {
									effectShape = I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE
											.createEffectRecord();
									effectShape.setEndpoint(I5CONSTANTS.eSHAPE);
									papp.addEffect(effectShape);
								}
								field.setValue(papp, effectShape, r.item(j)
										.getChildNodes());
								break;
							}
							case VALUEUNIT_STD_DEV_VALUE: {
								if (effectShape == null) {
									effectShape = I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE
											.createEffectRecord();
									effectShape.setEndpoint(I5CONSTANTS.eSHAPE);
									papp.addEffect(effectShape);
								}
								field.setValue(papp, effectShape, r.item(j)
										.getChildNodes());
								break;
							}
							
							case REMARKS: {
								field.setValue(papp, null, r.item(j)
										.getChildNodes());
								break;
							}
							default: {
								break;
							}
							}

						} catch (Exception x) {
							x.printStackTrace();
						}
				} else {
					// don't know what's this
				}
			}
		}

	}

	enum P {
		SHAPE_DESCRIPTIVE_value {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				String result = node.getTextContent();
				if (papp.getInterpretationResult()==null) papp.setInterpretationResult(result);
				else papp.setInterpretationResult(papp.getInterpretationResult() + " " + result);
				effect.setTextValue(result);
			}
		},
		SHAPE_DESCRIPTIVE_TXT{
			
		},
		SHAPE_DESCRIPTIVE {
			
		},
		REMARKS {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				papp.setInterpretationCriteria(node.getTextContent());
			}
		},
		SHAPE_VALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					//effect.setTextValue(node.getTextContent());
				}
			}
		},
		SHAPE_value {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				String q = node.getTextContent();
				effect.setUnit("NOT_SPECIFIED".equals(q) ? null : q);
			}
		},
		STD_DEV_VALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setErrorValue(Double.parseDouble(node
							.getTextContent()));
				} catch (Exception x) {

				}
			}
		},
		STD_DEV_UNIT_value {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setUnit(node.getTextContent());
				} catch (Exception x) {

				}
			}
		},
		STD_DEV_UNIT,
		X_LOQUALIFIER_value {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				effect.setLoQualifier(node.getTextContent());
			}
		},
		X_LOVALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					effect.setTextValue(node.getTextContent());
				}
			}
		},
		X_UPQUALIFIER_value {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				effect.setUpQualifier(node.getTextContent());
			}
		},
		X_UPVALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {

				}
			}
		},
		X_STD_DEVI_VALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setErrorValue(Double.parseDouble(node
							.getTextContent()));
				} catch (Exception x) {

				}
			}

		},
		// y
		Y_LOQUALIFIER_value {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				effect.setLoQualifier(node.getTextContent());
			}
		},
		Y_LOVALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					effect.setTextValue(node.getTextContent());
				}
			}
		},
		Y_UPQUALIFIER_value {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				effect.setUpQualifier(node.getTextContent());
			}
		},
		Y_UPVALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {

				}
			}
		},
		Y_STD_DEVI_VALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setErrorValue(Double.parseDouble(node
							.getTextContent()));
				} catch (Exception x) {

				}
			}

		},
		// z
		Z_LOQUALIFIER_value {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				effect.setLoQualifier(node.getTextContent());
			}
		},
		Z_LOVALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					effect.setTextValue(node.getTextContent());
				}
			}
		},
		Z_UPQUALIFIER_value {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				effect.setUpQualifier(node.getTextContent());
			}
		},
		Z_UPVALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setUpValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {

				}
			}
		},
		Z_STD_DEVI_VALUE {
			@Override
			public void setValue(
					ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
					EffectRecord<String, IParams, String> effect,
					IParams params, Node node) {
				try {
					effect.setErrorValue(Double.parseDouble(node
							.getTextContent()));
				} catch (Exception x) {

				}
			}

		},
		X_LOQUALIFIER,Y_LOQUALIFIER,Z_LOQUALIFIER,
		X_UPQUALIFIER,Y_UPQUALIFIER,Z_UPQUALIFIER,
		STD_DEV_UNIT_TXT


		;
		public void setValue(
				ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
				EffectRecord<String, IParams, String> effect, IParams params,
				Node node) {
		}

	}

	enum EFFECT {

		PHRASEOTHER_SHAPE_DESCRIPTIVE, SHAPE_VALUE, PHRASEOTHER_SHAPE, VALUEUNIT_STD_DEV_VALUE, PRECISION_X_LOQUALIFIER, PRECISION_Y_LOQUALIFIER, PRECISION_Z_LOQUALIFIER, REMARKS,
		X_STD_DEVI_VALUE,Y_STD_DEVI_VALUE,Z_STD_DEVI_VALUE;

		public void setValue(
				ProtocolApplication<Protocol, IParams, String, IParams, String> papp,
				EffectRecord<String, IParams, String> effect, NodeList nodes) {

			if (nodes != null) {
				for (int i = 0; i < nodes.getLength(); i++)
					try {
						P p = P.valueOf(nodes.item(i).getLocalName()
								.replace(".", "_"));
						p.setValue(papp, effect, null, nodes.item(i));
					} catch (Exception x) {
						x.printStackTrace();
					}
			}
		}
	}

}
