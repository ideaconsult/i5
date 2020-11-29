package net.idea.i6._5.ambit2;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;

import ambit2.base.data.LiteratureEntry;
import ambit2.base.data.Property;
import ambit2.base.data.StructureRecord;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.substance.ExternalIdentifier;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.interfaces.IStructureRecord.MOL_TYPE;
import ambit2.base.interfaces.IStructureRecord.STRUC_TYPE;
import ambit2.base.interfaces.IStructureRelation;
import ambit2.base.relation.STRUCTURE_RELATION;
import ambit2.base.relation.composition.Proportion;
import ambit2.core.config.AmbitCONSTANTS;
import ambit2.core.io.ECHAPreregistrationListReader;
import ambit2.core.io.I5ReaderSimple;
import eu.europa.echa.iuclid6.namespaces.flexible_record_identifiers._5.FLEXIBLERECORDIdentifiers;
import eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._5.FLEXIBLERECORDSubstanceComposition;
import eu.europa.echa.iuclid6.namespaces.legal_entity._5.LEGALENTITY;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry;
import eu.europa.echa.iuclid6.namespaces.reference_substance._5.REFERENCESUBSTANCE;
import eu.europa.echa.iuclid6.namespaces.reference_substance._5.REFERENCESUBSTANCE.ReferenceSubstanceInfo.CASInfo;
import eu.europa.echa.iuclid6.namespaces.reference_substance._5.REFERENCESUBSTANCE.ReferenceSubstanceInfo.Synonyms;
import eu.europa.echa.iuclid6.namespaces.substance._5.SUBSTANCE;
import net.idea.i5.io.IStudyRecordConverter;
import net.idea.i5.io.IuclidAmbitProcessor;
import net.idea.i5.io.QACriteriaException;
import net.idea.i6._5.ambit2.sections.I6StudyRecordConverter;
import net.idea.i6.io.I6_ROOT_OBJECTS;
import net.idea.modbcum.i.exceptions.AmbitException;

public class I6AmbitProcessor<Target> extends IuclidAmbitProcessor<Target> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4709118915064457190L;
	protected I6StudyRecordConverter convertor;

	protected Map<String, Document> library;

	public Map<String, Document> getLibrary() {
		return library;
	}

	public void setLibrary(Map<String, Document> library) {
		this.library = library;
	}

	public I6AmbitProcessor(String container) {
		super(container);
	}

	public IStructureRecord process(Target unmarshalled) throws AmbitException {
		Document doc = null;
		Object content = unmarshalled;
		if (unmarshalled instanceof Document) {
			doc = (Document) unmarshalled;
			content = doc.getContent().getAny();
		}
		if (content instanceof SUBSTANCE) {
			if (!acceptSubstance((SUBSTANCE) content))
				return null;
			else
				try {
					SubstanceRecordWrapper w = new SubstanceRecordWrapper(doc);
					w.setLibrary(library);
					return w.transform2record(record);
				} catch (Exception x) {
					logger.log(Level.WARNING, x.getMessage(), x);
				}
		} else if (content instanceof REFERENCESUBSTANCE)
			try {
				ReferenceSubstanceRecordWrapper w = new ReferenceSubstanceRecordWrapper(doc);
				w.setLibrary(library);
				return w.transform2record(structureRecord);
			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage(), x);
			}

		try {
			IStudyRecordConverter convertor = getConvertor(content.getClass().getName());
			if (convertor != null)
				return convertor.transform2record(getWrapper(doc, content.getClass().getName()), record);
		} catch (QACriteriaException x) {
			// reliability exception
			logger.log(Level.FINE, String.format("%s\t%s", x.getMessage(), content.getClass().getName()));
			return null;
		} catch (AmbitException x) {
			throw x;
		} catch (Exception x) {
			throw new AmbitException(x);
		}
		return null;
	}

	protected boolean acceptSubstance(SUBSTANCE substance) {
		return true;
	}

	protected EndpointStudyRecordWrapper getWrapper(Document doc, String className) throws Exception {
		EndpointStudyRecordWrapper wrapper = null;
		String[] path = className.split("\\.");
		String tagName = path[path.length - 1].replaceAll("ENDPOINTSTUDYRECORD", "");

		String clazzName = String.format("net.idea.i6._5.ambit2.wrappers.%s_RecordWrapper", tagName);
		try {
			Class<?> c = Class.forName(clazzName);
			Constructor<?> cons = c.getConstructor(Document.class);
			Object cnv = cons.newInstance(doc);
			if (cnv instanceof EndpointStudyRecordWrapper) {
				wrapper = (EndpointStudyRecordWrapper) cnv;
			}
		} catch (Exception x) {
			logger.log(Level.WARNING, String.format("%s\t%s",
					"Class not found, using default EndpointStudyRecordWrapper", x.getMessage()), x);
		}
		if (wrapper == null)
			wrapper = new EndpointStudyRecordWrapper(doc);
		wrapper.setLibrary(library);
		return wrapper;
	}

	protected IStudyRecordConverter getConvertor(String className) throws Exception {

		String[] path = className.split("\\.");
		String tagName = path[path.length - 1];
		try {
			I6_ROOT_OBJECTS tag = I6_ROOT_OBJECTS
					.valueOf(tagName.replace("ENDPOINTSTUDYRECORD", "ENDPOINT_STUDY_RECORD_"));
			if (tag.isScientificPart()) {
				convertor = new I6StudyRecordConverter<>();
				convertor.setQASettings(getQASettings());
				return convertor;
			}
		} catch (Exception x) {
			throw x;
		}
		return null;
	}

	protected void setFormat(IStructureRecord record) {
		record.setFormat("i6._5.");
	}

	class ReferenceSubstanceRecordWrapper extends AbstractDocWrapper {
		protected REFERENCESUBSTANCE unmarshalled;

		public REFERENCESUBSTANCE getREFERENCESUBSTANCE() throws Exception {
			return (REFERENCESUBSTANCE) doc.getContent().getAny();
		}

		public ReferenceSubstanceRecordWrapper(Document doc) throws Exception {
			super(doc);
			this.unmarshalled = getREFERENCESUBSTANCE();
		}

		public IStructureRecord transform2record(IStructureRecord structureRecord) {
			structureRecord.clear();
			setFormat(structureRecord);

			setReferenceSubstanceUUID(structureRecord, getDocumentReferencePK());

			if (unmarshalled.getGeneralInfo().getReferenceSubstanceName() != null)
				structureRecord.setRecordProperty(I5ReaderSimple.nameProperty,
						unmarshalled.getGeneralInfo().getReferenceSubstanceName());

			if (unmarshalled.getReferenceSubstanceInfo() != null)
				if (unmarshalled.getInventory() != null)
					for (InventoryEntry e : unmarshalled.getInventory().getInventoryEntry().getEntry()) {
						if ("EC".equals(e.getInventoryCode()))
							structureRecord.setRecordProperty(I5ReaderSimple.ecProperty, e.getNumberInInventory());
						// else
						// System.out.println(String.format("%s\t%s",e.getInventoryCode(),e.getNumberInInventory()));
					}

			structureRecord.setFormat(null);
			if (unmarshalled.getMolecularStructuralInfo() != null) {
				String inchi = unmarshalled.getMolecularStructuralInfo().getInChl();
				if (inchi != null && !"".equals(inchi)) {
					structureRecord.setFormat(MOL_TYPE.INC.name());
					structureRecord.setContent(inchi);
					structureRecord.setType(STRUC_TYPE.D1);
				} else {
					structureRecord.setFormat(null);
					structureRecord.setContent("");
					structureRecord.setType(STRUC_TYPE.NA);
				}
				structureRecord.setInchi(null);
				String smiles = unmarshalled.getMolecularStructuralInfo().getSmilesNotation();
				if (smiles != null && !"".equals(smiles)) {
					if (structureRecord.getFormat() == null) {
						structureRecord.setFormat(MOL_TYPE.INC.name());
						structureRecord.setContent(smiles);
					}
					structureRecord.setType(STRUC_TYPE.D1);
				}
				structureRecord.setSmiles(smiles);
				structureRecord.setFormula(unmarshalled.getMolecularStructuralInfo().getMolecularFormula());
			} else
				structureRecord.setType(STRUC_TYPE.NA);

			if (structureRecord.getFormat() == null)
				structureRecord.setFormat(MOL_TYPE.SDF.name());

			CASInfo cas = unmarshalled.getReferenceSubstanceInfo() == null ? null
					: unmarshalled.getReferenceSubstanceInfo().getCASInfo();
			if (cas != null) {
				try {
					structureRecord.setRecordProperty(I5ReaderSimple.casProperty,
							casProcessor.process(cas.getCASNumber()));
				} catch (Exception x) {
					structureRecord.setRecordProperty(I5ReaderSimple.casProperty, cas.getCASNumber());
				}
				// TODO cas name
			}
			String iupacName = unmarshalled.getReferenceSubstanceInfo() == null ? null
					: unmarshalled.getReferenceSubstanceInfo().getIupacName();
			setIUPACName(structureRecord, iupacName);

			Synonyms synonyms = unmarshalled.getReferenceSubstanceInfo() == null ? null
					: unmarshalled.getReferenceSubstanceInfo().getSynonyms();
			if (synonyms != null) {
				List<String> lookup = new ArrayList<String>();
				for (eu.europa.echa.iuclid6.namespaces.reference_substance._5.REFERENCESUBSTANCE.ReferenceSubstanceInfo.Synonyms.Entry e : synonyms
						.getEntry()) {
					String nameType = getPhrase(e.getIdentifier().getValue(),
							joinMultiTextFieldSmall(e.getIdentifier().getOther()));

					if ("CAS number".equals(nameType)) {
						structureRecord.setRecordProperty(Property.getCASInstance(), e.getName());
					} else if ("EC number".equals(nameType)) {
						structureRecord.setRecordProperty(Property.getEINECSInstance(), e.getName());
					} else if ("trade namer".equals(nameType)) {
						Property prop = Property.getNameInstance();
						prop.setLabel(Property.opentox_TradeName);
						structureRecord.setRecordProperty(prop, e.getName());
					} else if (lookup.indexOf(e.getName()) < 0)
						lookup.add(e.getName());
				}

				for (int i = 0; i < lookup.size(); i++) {
					structureRecord
							.setRecordProperty(
									Property.getInstance(AmbitCONSTANTS.NAMES,
											LiteratureEntry
													.getInstance(
															String.format("%s %s#%d", I5ReaderSimple.I5_REFERENCE,
																	ECHAPreregistrationListReader.echa_tags.SYNONYM
																			.toString(),
																	i + 1, I5ReaderSimple.I5_URL),
															I5ReaderSimple.I5_URL)),
									lookup.get(i));
				}

			}

			return structureRecord;
		}
	}

	class SubstanceRecordWrapper extends AbstractDocWrapper {
		protected SUBSTANCE unmarshalled;

		public SubstanceRecordWrapper(Document doc) throws Exception {
			super(doc);
			this.unmarshalled = getSUBSTANCE();
		}

		public SUBSTANCE getSUBSTANCE() throws Exception {
			return (SUBSTANCE) doc.getContent().getAny();
		}

		public IStructureRecord transform2record(SubstanceRecord record) {
			record.clear();
			// setFormat(record);
			if (unmarshalled != null) {
				// owner
				try {
					// in I6 this is the key
					setOwnerUUID(record, unmarshalled.getOwnerLegalEntity());
				} catch (Exception x) {
					record.setOwnerUUID(null);
				}
				try {
					// TODO need to parse the manifest / legal entity to get
					// this
					// record.setOwnerName(unmarshalled.getOwnerLegalEntity().getDescription());
					LEGALENTITY le = parseLegalEntity(unmarshalled.getOwnerLegalEntity());
					record.setOwnerName(le.getGeneralInfo().getLegalEntityName());
				} catch (Exception x) {
					record.setOwnerName("");
				}
				record.setSubstanceName(unmarshalled.getChemicalName());
				record.setPublicName(unmarshalled.getPublicName());

				setSubstanceUUID(record, getDocumentReferencePK());

				try {
					record.setSubstancetype(getPhrase(unmarshalled.getTypeOfSubstance().getComposition().getValue(),
							joinMultiTextFieldSmall(unmarshalled.getTypeOfSubstance().getComposition().getOther())));
				} catch (Exception x) {
					record.setSubstancetype("Error reading the composition type");
				}

				if (unmarshalled.getReferenceSubstance() != null) {
					setReferenceSubstanceUUID(record, unmarshalled.getReferenceSubstance().getReferenceSubstance());
				}

				parseComposition(record);
				parseIdentifiers(record);
			}
			return record;
		}

		public LEGALENTITY parseLegalEntity(String uuid) {
			try {

				Document doc = library.get(uuid.replace("/", "_"));
				if (doc != null)
					if (doc.getContent().getAny() instanceof LEGALENTITY)
						return (LEGALENTITY) doc.getContent().getAny();

			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage(), x);
			}
			return null;
		}

		public void parseIdentifiers(SubstanceRecord record) {
			try {
				ArrayList<ExternalIdentifier> a = new ArrayList<ExternalIdentifier>();
				Iterator<Entry<String, Document>> i = library.entrySet().iterator();
				while (i.hasNext()) {
					Entry<String, Document> e = i.next();
					// logger.log(Level.INFO,
					// e.getValue().getContent().getAny().getClass().getName());
					if (e.getValue().getContent().getAny() instanceof FLEXIBLERECORDIdentifiers) {

						FLEXIBLERECORDIdentifiers sc = (FLEXIBLERECORDIdentifiers) e.getValue().getContent().getAny();
						for (eu.europa.echa.iuclid6.namespaces.flexible_record_identifiers._5.FLEXIBLERECORDIdentifiers.ExternalSystemIdentifiersSet.ExternalSystemIdentifiers.Entry id : sc
								.getExternalSystemIdentifiers().getExternalSystemIdentifiers().getEntry()) {
							a.add(new ExternalIdentifier(id.getExternalSystemDesignator(), id.getId()));
						}
						/*
						 * for (RegulatoryProgrammeIdentifiersEntry id :
						 * sc.getRegulatoryProgrammeIdentifiers()
						 * .getRegulatoryProgrammeIdentifiers().getEntry()) { a.add(new
						 * ExternalIdentifier(getPhrase(id. getRegulatoryProgramme().getValue(),
						 * id.getRegulatoryProgramme().getOther()), id.getId())); }
						 */

					}
				}
				record.setExternalids(a);
			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage(), x);
			}

		}

		public void parseComposition(SubstanceRecord record) {
			try {
				Iterator<Entry<String, Document>> i = library.entrySet().iterator();
				while (i.hasNext()) {
					Entry<String, Document> e = i.next();
					if (e.getValue().getContent().getAny() instanceof FLEXIBLERECORDSubstanceComposition) {

						FLEXIBLERECORDSubstanceComposition sc = (FLEXIBLERECORDSubstanceComposition) e.getValue()
								.getContent().getAny();
						String compositionUUID = cleanCompositionUUID(
								getPlatformMetadataValue(e.getValue(), "documentKey"));
						String cname = sc.getGeneralInformation().getName();
						if (sc.getImpurities() != null)
							for (eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._5.FLEXIBLERECORDSubstanceComposition.ImpuritiesSet.Impurities.Entry c : sc
									.getImpurities().getImpurities().getEntry())
								try {
									impurity2record(compositionUUID, cname, record, c);
								} catch (Exception x) {
									logger.log(Level.WARNING, x.getMessage(), x);
								}
						if (sc.getAdditives() != null)
							for (eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._5.FLEXIBLERECORDSubstanceComposition.AdditivesSetSet.Additives.Entry c : sc
									.getAdditives().getAdditives().getEntry())
								try {
									additive2record(compositionUUID, cname, record, c);
								} catch (Exception x) {
									logger.log(Level.WARNING, x.getMessage(), x);
								}
						if (sc.getConstituents() != null)
							for (eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._5.FLEXIBLERECORDSubstanceComposition.ConstituentsSet.Constituents.Entry c : sc
									.getConstituents().getConstituents().getEntry())
								try {
									constituent2record(unmarshalled, compositionUUID, cname, record, c);
								} catch (Exception x) {
									logger.log(Level.WARNING, x.getMessage(), x);
								}

					}
				}

			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage(), x);
			}
		}

		protected String cleanCompositionUUID(String value) {
			int slashpos = value.indexOf("/");
			if (slashpos > 0)
				return ("L6-" + value.substring(0, slashpos));
			else
				return ("L6-" + value);
		}

		protected void setOwnerUUID(SubstanceRecord record, String value) {
			int slashpos = value.indexOf("/");
			if (slashpos > 0)
				record.setOwnerUUID(value.substring(0, slashpos));
			else
				record.setOwnerUUID(value);
		}

		protected IStructureRecord additive2record(String compositionUUID, String name, SubstanceRecord substance,
				eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._5.FLEXIBLERECORDSubstanceComposition.AdditivesSetSet.Additives.Entry a) {
			IStructureRecord record = new StructureRecord();
			setFormat(record);

			record.setType(STRUC_TYPE.NA);
			if (a.getReferenceSubstance() != null) {
				record.setContent(a.getReferenceSubstance());
				setReferenceSubstanceUUID(record, a.getReferenceSubstance());
			}

			Proportion p = new Proportion();
			if (a.getConcentration() != null) {
				if (a.getConcentration().getLowerValue() != null)
					p.setReal_lowervalue(a.getConcentration().getLowerValue().doubleValue());
				if (a.getConcentration().getUpperValue() != null)
					p.setReal_uppervalue(a.getConcentration().getUpperValue().doubleValue());
				try {
					p.setReal_lower(a.getConcentration().getLowerQualifier());
				} catch (Exception x) {
					p.setReal_unit("");
				}
				try {
					p.setReal_upper(a.getConcentration().getUpperQualifier());
				} catch (Exception x) {
					p.setReal_unit("");
				}
				try {
					p.setReal_unit(getPhrase(a.getConcentration().getUnitCode(),
							joinMultiTextFieldSmall(a.getConcentration().getUnitOther())));
				} catch (Exception x) {
					p.setReal_unit("");
				}

			}
			if (a.getProportionTypical() != null) {
				if (a.getProportionTypical().getValue() != null)
					p.setTypical_value(a.getProportionTypical().getValue().doubleValue());
				try {
					p.setTypical(a.getProportionTypical().getQualifier());
				} catch (Exception x) {
					p.setTypical("");
				}
				try {
					p.setTypical_unit(
							getPhrase(a.getProportionTypical().getUnitCode(), a.getConcentration().getUnitCode()));
				} catch (Exception x) {
					p.setTypical_unit("");
				}
			}

			try {
				p.setFunction(
						getPhrase(a.getFunction().getValue(), joinMultiTextFieldSmall(a.getFunction().getOther())));
			} catch (Exception x) {
				p.setFunction("Error reading the function type");
			}
			IStructureRelation r = substance.addStructureRelation(compositionUUID, record,
					STRUCTURE_RELATION.HAS_ADDITIVE, p);
			r.setName(name);
			return record;
		}

		protected IStructureRecord impurity2record(String compositionUUID, String name, SubstanceRecord substance,
				eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._5.FLEXIBLERECORDSubstanceComposition.ImpuritiesSet.Impurities.Entry a) {
			IStructureRecord record = new StructureRecord();
			setFormat(record);

			record.setType(STRUC_TYPE.NA);
			if (a.getReferenceSubstance() != null) {
				record.setContent(a.getReferenceSubstance());
				setReferenceSubstanceUUID(record, a.getReferenceSubstance());
			}

			Proportion p = new Proportion();
			if (a.getConcentration() != null) {
				try {
					p.setReal_lowervalue(a.getConcentration().getLowerValue().doubleValue());
				} catch (Exception x) {
				}
				try {
					p.setReal_uppervalue(a.getConcentration().getUpperValue().doubleValue());
				} catch (Exception x) {
				}
				try {
					p.setReal_lower(a.getConcentration().getLowerQualifier());
				} catch (Exception x) {
					p.setReal_unit("");
				}
				try {
					p.setReal_upper(a.getConcentration().getUpperQualifier());
				} catch (Exception x) {
					p.setReal_unit("");
				}
				try {
					p.setReal_unit(getPhrase(a.getConcentration().getUnitCode(),
							joinMultiTextFieldSmall(a.getConcentration().getUnitOther())));
				} catch (Exception x) {
					p.setReal_unit("");
				}

			}
			if (a.getProportionTypical() != null) {
				try {
					p.setTypical_value(a.getProportionTypical().getValue().doubleValue());
				} catch (Exception x) {
				}
				try {
					p.setTypical(a.getProportionTypical().getQualifier());
				} catch (Exception x) {
					p.setTypical("");
				}
				try {
					p.setTypical_unit(getPhrase(a.getProportionTypical().getUnitCode(),
							joinMultiTextFieldSmall(a.getConcentration().getUnitOther())));
				} catch (Exception x) {
					p.setTypical_unit("");
				}
			}

			IStructureRelation r = substance.addStructureRelation(compositionUUID, record,
					STRUCTURE_RELATION.HAS_IMPURITY, p);
			r.setName(name);
			return record;
		}

		protected IStructureRecord constituent2record(SUBSTANCE unmarshalled, String compositionUUID, String cname,
				SubstanceRecord substance,
				eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._5.FLEXIBLERECORDSubstanceComposition.ConstituentsSet.Constituents.Entry a)

		{
			if (a == null)
				return null;
			IStructureRecord record = new StructureRecord();
			setFormat(record);
			record.setType(STRUC_TYPE.NA);

			if (a.getReferenceSubstance() != null) {
				record.setContent(a.getReferenceSubstance());
				setReferenceSubstanceUUID(record, a.getReferenceSubstance());
			}

			Proportion p = new Proportion();
			if (a.getConcentration() != null) {
				try {
					p.setReal_lowervalue(a.getConcentration().getLowerValue().doubleValue());
				} catch (Exception x) {
				}
				try {
					p.setReal_uppervalue(a.getConcentration().getUpperValue().doubleValue());
				} catch (Exception x) {
				}
				try {
					p.setReal_lower(a.getConcentration().getLowerQualifier());
				} catch (Exception x) {
					p.setReal_lower("");
				}
				try {
					p.setReal_upper(a.getConcentration().getUpperQualifier());
				} catch (Exception x) {
					p.setReal_lower("");
				}
				try {
					p.setReal_unit(getPhrase(a.getConcentration().getUnitCode(),
							joinMultiTextFieldSmall(a.getConcentration().getUnitOther())));
				} catch (Exception x) {
					p.setReal_unit("");
				}
			}
			if (a.getProportionTypical() != null) {
				try {
					p.setTypical_value(a.getProportionTypical().getValue().doubleValue());
				} catch (Exception x) {
				}
				try {
					p.setTypical(a.getProportionTypical().getQualifier());
				} catch (Exception x) {
					p.setTypical("");
				}
				try {
					p.setTypical_unit(getPhrase(a.getProportionTypical().getUnitCode(),
							joinMultiTextFieldSmall(a.getConcentration().getUnitOther())));
				} catch (Exception x) {
					p.setTypical_unit("");
				}
			}

			IStructureRelation r = substance.addStructureRelation(compositionUUID, record,
					STRUCTURE_RELATION.HAS_CONSTITUENT, p);
			r.setName(cname);

			/*
			 * "common name","EC name" CLP alternative name trade name E number INCI name
			 * CAS name
			 * 
			 * FEMA number ISO name UN name/number
			 */

			if ((unmarshalled != null) && (unmarshalled.getOtherNames() != null)) {
				int i = 0;
				for (eu.europa.echa.iuclid6.namespaces.substance._5.SUBSTANCE.OtherNames.Entry name : unmarshalled
						.getOtherNames().getEntry()) {

					String nameType = null;
					try {
						nameType = name.getNameType() == null ? null
								: getPhrase(name.getNameType().getValue(),
										joinMultiTextFieldSmall(name.getNameType().getOther()));
					} catch (Exception x) {
						x.printStackTrace();
					}
					Property prop = Property.getNameInstance();
					if (nameType == null)
						prop = Property.getNameInstance();
					else if ("CAS number".equals(nameType))
						prop = Property.getCASInstance();
					else if ("EC number".equals(nameType))
						prop = Property.getEINECSInstance();
					else if ("CAS name".equals(nameType))
						prop = Property.getNameInstance();
					else if ("EC name".equals(nameType))
						prop = Property.getNameInstance();
					else if ("common name".equals(nameType))
						prop = Property.getNameInstance();
					else if ("ISO name".equals(nameType))
						prop = Property.getNameInstance();
					else if ("INCO name".equals(nameType))
						prop = Property.getNameInstance();
					else if ("IUPAC name".equals(nameType))
						prop = Property.getNameInstance();
					else if ("trade name".equals(nameType)) {
						prop = Property.getNameInstance();
						prop.setLabel(Property.opentox_TradeName);
					} else
						prop = Property.getInstance(String.format("%s %d", nameType, (i + 1)),
								LiteratureEntry.getI5UUIDReference());

					record.setRecordProperty(prop, name.getName());
					if (name.getRemarks() != null && !"".equals(name.getRemarks())) {
						prop = Property.getInstance("Identifier", LiteratureEntry.getI5UUIDReference());
						prop.setLabel(Property.opentox_TradeName);
						record.setRecordProperty(prop, name.getRemarks());
					}
					i++;
				}
			}

			return record;
		}

	}

}
