package net.idea.i5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;

import ambit2.base.exceptions.AmbitIOException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.core.io.FileState;
import ambit2.core.io.IRawReader;

public class I5ZReader<SUBSTANCE> extends IZReader<SUBSTANCE,I5_ROOT_OBJECTS, I5ObjectVerifier> {

	/**
	 * Uncompresses the .i5z archive content, detects the correct JAXB context
	 * path and unmarshall the XML content using JAXB generated classes
	 * 
	 * @param zipfile
	 * @throws AmbitIOException
	 */
	public I5ZReader(File zipfile) throws AmbitIOException {
		this(zipfile, new I5Options());
	}

	public I5ZReader(File zipfile, I5Options options) throws AmbitIOException {
		super(zipfile, options);
	}

	/**
	 * Uncompresses the .i5z archive content, detects the correct JAXB context
	 * path and unmarshall the XML content using JAXB generated classes
	 * 
	 * @param stream
	 * @throws AmbitIOException
	 */
	public I5ZReader(InputStream stream) throws AmbitIOException {
		this(stream, new I5Options());
	}

	public I5ZReader(InputStream stream, I5Options options) throws AmbitIOException {
		super(stream, options);
	}

	@Override
	protected boolean isSupported(String name) {
		return FileState._FILE_TYPE.I5D_INDEX.hasExtension(name);
	}

	@Override
	protected IRawReader<IStructureRecord> getItemReader(int index) throws Exception {
		String name = files[index].getName().toLowerCase();

		if (isSupported(name)) {
			logger.log(Level.FINE, name);
			try {
				String jaxbcontextpath = getJaxbContextPath4File(files[index]);

				if (jaxbcontextpath != null && !"".equals(jaxbcontextpath)) {
					InputStream fileReader = new FileInputStream(files[index]);
					try {
						JAXBStuff jaxb = jaxbCache.get(jaxbcontextpath);
						if (jaxb == null) {
							jaxb = new JAXBStuff(jaxbcontextpath);

							jaxbCache.clear();
							jaxbCache.put(jaxbcontextpath, jaxb);
							// System.out.print(jaxbCache.size());
							// System.out.print("\t");
							// System.out.println(jaxbcontextpath);
						} else {
							// System.out.print("CACHED");
							// System.out.print("\t");
							// System.out.println(jaxbcontextpath);
						}
						I5DReader reader = new I5DReader(files[index].getName(), fileReader, jaxb.jaxbContext,
								jaxb.getUnmarshaller(), getQASettings());
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

	@Override
	protected I5ObjectVerifier createObjectVerifier() {
		return new I5ObjectVerifier();
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
		for (File file : files) {
			String cp = file2cjaxbcp.get(file.getAbsolutePath());
			if (cp != null) {
				logger.log(Level.FINE, cp);
				if (cp.indexOf(".referencesubstance") >= 0) {
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
				} else if (cp.indexOf(".substance") >= 0) {
					substances.add(file);
					if (options != null && (!options.allowMultipleSubstances && (substances.size() > 1)))
						throw new AmbitIOException("Single substance mode but multiple substances in zip file "
								+ zipfile.getAbsolutePath());
				} else
					study.add(file);
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

		referenceSubstances.addAll(substances);
		referenceSubstances.addAll(study);
		substances.clear();
		study.clear();

		return referenceSubstances.toArray(new File[referenceSubstances.size()]);
	}

}
