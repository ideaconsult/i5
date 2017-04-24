package net.idea.i6._2.ambit2;

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
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.interfaces.IStructureRecord.MOL_TYPE;
import ambit2.base.interfaces.IStructureRecord.STRUC_TYPE;
import ambit2.base.interfaces.IStructureRelation;
import ambit2.base.relation.STRUCTURE_RELATION;
import ambit2.base.relation.composition.Proportion;
import ambit2.core.config.AmbitCONSTANTS;
import ambit2.core.io.ECHAPreregistrationListReader;
import ambit2.core.io.I5ReaderSimple;
import eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2.AdditivesEntry;
import eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2.ConstituentsEntry;
import eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2.FLEXIBLERECORDSubstanceComposition;
import eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2.ImpuritiesEntry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry;
import eu.europa.echa.iuclid6.namespaces.reference_substance._2.CASInfo;
import eu.europa.echa.iuclid6.namespaces.reference_substance._2.I6SynonymEntry;
import eu.europa.echa.iuclid6.namespaces.reference_substance._2.REFERENCESUBSTANCE;
import eu.europa.echa.iuclid6.namespaces.reference_substance._2.Synonyms;
import eu.europa.echa.iuclid6.namespaces.substance._2.SUBSTANCE;
import net.idea.i5.io.IStudyRecordConverter;
import net.idea.i5.io.IuclidAmbitProcessor;
import net.idea.i5.io.QACriteriaException;
import net.idea.i6._2.ambit2.sections.I6StudyRecordConverter;
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
					logger.log(Level.WARNING, x.getMessage());
				}
		} else if (content instanceof REFERENCESUBSTANCE)
			try {
				ReferenceSubstanceRecordWrapper w = new ReferenceSubstanceRecordWrapper(doc);
				w.setLibrary(library);
				return w.transform2record(structureRecord);
			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage());
			}

		try {
			IStudyRecordConverter convertor = getConvertor(content.getClass().getName());
			if (convertor != null)
				return convertor.transform2record(getWrapper(doc, content.getClass().getName()), record);
		} catch (QACriteriaException x) {
			// reliability exception
			logger.log(Level.FINE, x.getMessage(),x);
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

		String clazzName = String.format("net.idea.i6._2.ambit2.wrappers.%s_RecordWrapper", tagName);
		try {
			Class<?> c = Class.forName(clazzName);
			Constructor<?> cons = c.getConstructor(Document.class);
			Object cnv = cons.newInstance(doc);
			if (cnv instanceof EndpointStudyRecordWrapper) {
				wrapper = (EndpointStudyRecordWrapper) cnv;
			}
		} catch (Exception x) {
			logger.log(Level.WARNING, String.format("%s\t%s", "Class not found, using default EndpointStudyRecordWrapper",
					x.getMessage()));
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
		record.setFormat("i6._2.");
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

			CASInfo cas = unmarshalled.getReferenceSubstanceInfo().getCASInfo();
			if (cas != null) {
				try {
					structureRecord.setRecordProperty(I5ReaderSimple.casProperty,
							casProcessor.process(cas.getCASNumber()));
				} catch (Exception x) {
					structureRecord.setRecordProperty(I5ReaderSimple.casProperty, cas.getCASNumber());
				}
				// TODO cas name
			}
			String iupacName = unmarshalled.getReferenceSubstanceInfo().getIupacName();
			setIUPACName(structureRecord, iupacName);

			Synonyms synonyms = unmarshalled.getReferenceSubstanceInfo().getSynonyms();
			if (synonyms != null) {
				List<String> lookup = new ArrayList<String>();
				for (I6SynonymEntry e : synonyms.getEntry()) {
					if (lookup.indexOf(e.getName()) < 0)
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
				} catch (Exception x) {
					record.setOwnerName("");
				}
				record.setSubstanceName(unmarshalled.getChemicalName());
				record.setPublicName(unmarshalled.getPublicName());

				setSubstanceUUID(record, getDocumentReferencePK());

				try {
					record.setSubstancetype(getPhrase(unmarshalled.getTypeOfSubstance().getComposition().getValue(),unmarshalled.getTypeOfSubstance().getComposition().getOther()));
				} catch (Exception x) {
					record.setSubstancetype("Error reading the composition type");
				}
				/*
				 * if (unmarshalled.getExternalSystemIdentifiers() != null) for
				 * (ExternalSystemIdentifier id :
				 * unmarshalled.getExternalSystemIdentifiers()
				 * .getExternalSystemIdentifier()) { if (record.getExternalids()
				 * == null) record.setExternalids(new
				 * ArrayList<ExternalIdentifier>()); record.getExternalids()
				 * .add(new ExternalIdentifier(id.getExternalSystemDesignator(),
				 * id.getID())); }
				 */
				if (unmarshalled.getReferenceSubstance() != null) {
					setReferenceSubstanceUUID(record, unmarshalled.getReferenceSubstance().getReferenceSubstance());
				}

				parseComposition(record);
			}
			return record;
		}

		public void parseComposition(SubstanceRecord record) {
			try {
				Iterator<Entry<String, Document>> i = library.entrySet().iterator();
				while (i.hasNext()) {
					Entry<String, Document> e = i.next();
					if (e.getValue().getContent().getAny() instanceof FLEXIBLERECORDSubstanceComposition) {

						FLEXIBLERECORDSubstanceComposition sc = (FLEXIBLERECORDSubstanceComposition) e.getValue()
								.getContent().getAny();
						String compositionUUID = cleanCompositionUUID(getPlatformMetadataValue(e.getValue(), "documentKey"));
						String cname = sc.getGeneralInformation().getName();
						if (sc.getImpurities() != null)
							for (ImpuritiesEntry c : sc.getImpurities().getImpurities().getEntry()) {
								impurity2record(compositionUUID, cname, record, c);
							}
						if (sc.getAdditives() != null)
							for (AdditivesEntry c : sc.getAdditives().getAdditives().getEntry()) {
								additive2record(compositionUUID, cname, record, c);
							}
						if (sc.getConstituents() != null)
							for (ConstituentsEntry c : sc.getConstituents().getConstituents().getEntry()) {
								constituent2record(unmarshalled, compositionUUID, cname, record, c);
							}

					}
				}

			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage(),x);
			}
		}

		protected String cleanCompositionUUID(String value) {
			int slashpos = value.indexOf("/");
			if (slashpos > 0)
				return("L6-"+value.substring(0, slashpos));
			else
				return("L6-"+value);
		}
		
		protected void setOwnerUUID(SubstanceRecord record, String value) {
			int slashpos = value.indexOf("/");
			if (slashpos > 0)
				record.setOwnerUUID(value.substring(0, slashpos));
			else
				record.setOwnerUUID(value);
		}

		protected IStructureRecord additive2record(String compositionUUID, String name, SubstanceRecord substance,
				AdditivesEntry a) {
			IStructureRecord record = new StructureRecord();
			setFormat(record);

			record.setType(STRUC_TYPE.NA);
			if (a.getReferenceSubstance() != null) {
				record.setContent(a.getReferenceSubstance());
				setReferenceSubstanceUUID(record, a.getReferenceSubstance());
			}

			Proportion p = new Proportion();
			if (a.getConcentration() != null) {
				p.setReal_lowervalue(a.getConcentration().getLowerValue().doubleValue());
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
					p.setReal_unit(getPhrase(a.getConcentration().getUnitCode()));
				} catch (Exception x) {
					p.setReal_unit("");
				}

			}
			if (a.getProportionTypical() != null) {
				p.setTypical_value(a.getProportionTypical().getValue().doubleValue());
				try {
					p.setTypical(a.getProportionTypical().getQualifier());
				} catch (Exception x) {
					p.setTypical("");
				}
				try {
					p.setTypical_unit(getPhrase(a.getProportionTypical().getUnitCode()));
				} catch (Exception x) {
					p.setTypical_unit("");
				}
			}

			try {
				p.setFunction(getPhrase(a.getFunction().getValue()));
			} catch (Exception x) {
				p.setFunction("Error reading the function type");
			}
			IStructureRelation r = substance.addStructureRelation(compositionUUID, record,
					STRUCTURE_RELATION.HAS_ADDITIVE, p);
			r.setName(name);
			return record;
		}

		protected IStructureRecord impurity2record(String compositionUUID, String name, SubstanceRecord substance,
				ImpuritiesEntry a) {
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
					p.setReal_unit(getPhrase(a.getConcentration().getUnitCode()));
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
					p.setTypical_unit(getPhrase(a.getProportionTypical().getUnitCode()));
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
				SubstanceRecord substance, ConstituentsEntry a)

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
					p.setReal_unit(getPhrase(a.getConcentration().getUnitCode()));
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
					p.setTypical_unit(getPhrase(a.getProportionTypical().getUnitCode()));
				} catch (Exception x) {
					p.setTypical_unit("");
				}
			}

			IStructureRelation r = substance.addStructureRelation(compositionUUID, record,
					STRUCTURE_RELATION.HAS_CONSTITUENT, p);
			r.setName(cname);
			if ((unmarshalled != null) && (unmarshalled.getOtherNames() != null)) {
				int i = 0;
				for (eu.europa.echa.iuclid6.namespaces.substance._2.SUBSTANCE.OtherNames.Entry name : unmarshalled
						.getOtherNames().getEntry()) {

					String nameType = getPhrase(name.getNameType().getValue());
					Property prop = Property.getInstance(String.format("%s %d", nameType, (i + 1)),
							LiteratureEntry.getI5UUIDReference());
					prop.setLabel(Property.opentox_TradeName);
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
