package net.idea.i6.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import ambit2.base.exceptions.AmbitIOException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.core.io.FileState;
import ambit2.core.io.IRawReader;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5Options;
import net.idea.i5.io.IZReader;
import net.idea.modbcum.i.exceptions.AmbitException;

/**
 * Support for .i6z files
 * 
 * @author nina
 *
 * @param <SUBSTANCE>
 */
public class I6ZReader<SUBSTANCE> extends IZReader<SUBSTANCE, I6_ROOT_OBJECTS> {
	protected Map<String, Document> library;

	public I6ZReader(InputStream stream) throws AmbitIOException {
		this(stream, new I5Options());
	}

	public I6ZReader(File zipfile) throws AmbitIOException {
		this(zipfile, new I5Options());
	}

	public I6ZReader(File zipfile, I5Options options) throws AmbitIOException {
		super(zipfile, options);
	}

	public I6ZReader(InputStream stream, I5Options options) throws AmbitIOException {
		super(stream, options);
	}

	@Override
	protected boolean isSupported(String name) {
		return name.endsWith("manifest.xml") || FileState._FILE_TYPE.I6D_INDEX.hasExtension(name);
	}

	@Override
	protected String getJaxbContextPath4File(File file) throws AmbitException, IOException {
		return file2cjaxbcp == null ? null : file2cjaxbcp.get(file.getAbsolutePath());
	}

	@Override
	protected File verifyEntry(File file) throws IOException, AmbitException {
		return file;
	}

	@Override
	public File[] unzip(File zipfile, File directory, I5Options options) throws AmbitIOException {

		tempFolder = directory;
		File[] files = super.unzip(zipfile, directory, options);
		if (files == null)
			throw new AmbitIOException(String.format("Failed to unzip %s into %s", zipfile.getAbsolutePath(),
					directory.getAbsolutePath()));
		List<File> referenceSubstances = new ArrayList<File>();
		List<File> substances = new ArrayList<File>();
		List<File> study = new ArrayList<File>();
		List<File> linkedentries = new ArrayList<File>();
		for (File file : files)
			if (file.getName().endsWith("manifest.xml")) {
				I6ManifestReader reader = new I6ManifestReader();
				try (FileInputStream in = new FileInputStream(file)) {
					org.w3c.dom.Document manifest = reader.read(in);
					file2cjaxbcp = reader.parseFiles(manifest, directory);
				} catch (Exception x) {
					throw new AmbitIOException();
				}
				break;
			}

		for (File file : files) {
			if (file.getName().equals("manifest.xml"))
				continue;
			String cp = file2cjaxbcp.get(file.getAbsolutePath());
			if (cp != null) {
				logger.log(Level.FINE, cp);
				if (cp.indexOf(".literature.") >= 0) {
					linkedentries.add(file);
				} if (cp.indexOf(".fixed_record_identifiers.") >= 0) {	
					linkedentries.add(file);
				} if (cp.indexOf(".legal_entity.") >= 0) {	
					linkedentries.add(file);					
				} else if (cp.indexOf(".flexible_record_substancecomposition.") >= 0) {
					linkedentries.add(file);					
				//} else if (cp.indexOf(".test_material_information.") >= 0) {
				//	linkedentries.add(file);
				} else if (cp.indexOf(".reference_substance.") >= 0) {
					if (options != null && (options.getMaxReferenceStructures() > -1)
							&& (referenceSubstances.size() >= options.getMaxReferenceStructures())) {

						if (options.isExceptionOnMaxReferenceStructures())
							throw new AmbitIOException(String.format(
									"Exceeded the number of maximum reference structures (%d) in zip file %s ",
									options.getMaxReferenceStructures(), zipfile.getAbsolutePath()));
						else {
							// ignore the file
							logger.log(Level.WARNING,
									String.format(
											"Exceeded the number of maximum reference structures (%d) in zip file %s ",
											options.getMaxReferenceStructures(), zipfile.getAbsolutePath()));
						}
						;
					} else
						referenceSubstances.add(file);
				} else if (cp.indexOf(".substance.") >= 0) {
					substances.add(file);
					if (options != null && (!options.isAllowMultipleSubstances() && (substances.size() > 1)))
						throw new AmbitIOException("Single substance mode but multiple substances in zip file "
								+ zipfile.getAbsolutePath());
				} else if (cp.indexOf("endpoint_study_record") >= 0) {
					study.add(file);
				}
			}
		}
		logger.log(Level.FINE, String.format("Reference substances %d\tSubstances %d\tStudies %d",
				referenceSubstances.size(), substances.size(), study.size()));

		// sort by jaxb context so that we reuse JAXBContext and cache it only
		// once!
		Collections.sort(study, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				return file2cjaxbcp.get(o2.getAbsolutePath()).compareTo(file2cjaxbcp.get(o1.getAbsolutePath()));
			}
		});

		if (linkedentries.size() > 0)
			try {
				library = I6ManifestReader.parseLinkedEntry(linkedentries);
			} catch (Exception x) {
				logger.log(Level.WARNING, x.getMessage(), x);
			}
		referenceSubstances.addAll(substances);
		referenceSubstances.addAll(study);
		substances.clear();
		study.clear();

		return referenceSubstances.toArray(new File[referenceSubstances.size()]);
	}

	@Override
	protected IRawReader<IStructureRecord> getItemReader(int index) throws Exception {
		String name = files[index].getName().toLowerCase();

		if (isSupported(name)) {
			logger.log(Level.FINE, name);
			try {
				// String jaxbcontextpath =
				// getJaxbContextPath4File(files[index]);
				String jaxbcontextpath = "eu.europa.echa.iuclid6.namespaces.platform_container.v1:"
						+ "eu.europa.echa.iuclid6.namespaces.platform_fields.v1:"
						+ "eu.europa.echa.iuclid6.namespaces.platform_metadata.v1:"
						+ "eu.europa.echa.iuclid6.namespaces.fixed_record_identifiers._2:"
						+ "eu.europa.echa.iuclid6.namespaces.literature._1:" + getJaxbContextPath4File(files[index]);
				if (jaxbcontextpath != null && !"".equals(jaxbcontextpath)) {
					InputStream fileReader = new FileInputStream(files[index]);
					try {
						JAXBStuff jaxb = jaxbCache.get(jaxbcontextpath);
						if (jaxb == null) {
							jaxb = new JAXBStuff(jaxbcontextpath);

							jaxbCache.clear();
							jaxbCache.put(jaxbcontextpath, jaxb);
						} else {
						}
						I6DReader reader = new I6DReader(files[index].getName(), fileReader, jaxb.getJaxbContext(),
								jaxb.getUnmarshaller(), getQASettings(), library);
						reader.setErrorHandler(errorHandler);
						return reader;
					} catch (javax.xml.bind.UnmarshalException x) {
						throw x;
					} catch (Exception x) {
						throw x;

					} finally {
						// stream closed by closeItemReader
					}
				}
			} catch (Exception x) {
				logger.log(Level.WARNING, String.format("%s\t%s\tFile: %s", x.getClass().getName(), x.getMessage(),
						files[index].getName()));
				throw x;
			}
		}
		throw new Exception("Unsupported format " + name);
	}

}
