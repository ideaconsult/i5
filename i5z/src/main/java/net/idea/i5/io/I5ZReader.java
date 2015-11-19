package net.idea.i5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.idea.modbcum.i.exceptions.AmbitException;

import org.apache.commons.io.FileUtils;

import ambit2.base.exceptions.AmbitIOException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.core.io.FileState;
import ambit2.core.io.IRawReader;
import ambit2.core.io.ZipReader;

public class I5ZReader<SUBSTANCE> extends ZipReader implements IQASettings {
	protected Map<String,String> file2cjaxbcp;
	protected transient Hashtable<String, JAXBStuff> jaxbCache = new Hashtable<String,JAXBStuff>();
	protected transient I5ObjectVerifier rootObjectVerifier;
	protected transient File tempFolder;
	protected QASettings qaSettings;
	@Override
	public QASettings getQASettings() {
		if (qaSettings==null) qaSettings = new QASettings();
		return qaSettings;
	}
	@Override
	public void setQASettings(QASettings qualityCheckEnabled) {
		this.qaSettings = qualityCheckEnabled;
	}
		
	/**
	 * Uncompresses the .i5z archive content, detects the correct JAXB context path and unmarshall the XML content using JAXB generated classes
	 * @param zipfile
	 * @throws AmbitIOException
	 */
	public I5ZReader(File zipfile) throws AmbitIOException {
		super(zipfile);
	}
	/**
	 * Uncompresses the .i5z archive content, detects the correct JAXB context path and unmarshall the XML content using JAXB generated classes
	 * @param stream
	 * @throws AmbitIOException
	 */
	public I5ZReader(InputStream stream) throws AmbitIOException {
		super(stream);
	}
	
	@Override
	protected void finalize() throws Throwable {
		if (jaxbCache!=null) jaxbCache.clear();
		rootObjectVerifier = null;
		super.finalize();
	}
	
	@Override
	protected IRawReader<IStructureRecord> getItemReader(int index) throws Exception {
		String name = files[index].getName().toLowerCase();
		
		if (FileState._FILE_TYPE.I5Z_INDEX.hasExtension(name)) {
			logger.log(Level.FINE,name);
			try {
				String jaxbcontextpath = getJaxbContextPath4File(files[index]);
				
				if (jaxbcontextpath!=null && !"".equals(jaxbcontextpath)) {
					InputStream fileReader = new FileInputStream(files[index]);
					try {
						JAXBStuff jaxb = jaxbCache.get(jaxbcontextpath);
						if (jaxb==null) {
							jaxb = new JAXBStuff(jaxbcontextpath);
							
							jaxbCache.clear();
							jaxbCache.put(jaxbcontextpath, jaxb);
							//System.out.print(jaxbCache.size());	System.out.print("\t"); System.out.println(jaxbcontextpath);
						} else {
							//System.out.print("CACHED");	System.out.print("\t");	System.out.println(jaxbcontextpath);
						}
						I5DReader reader = new I5DReader(fileReader,jaxb.jaxbContext,jaxb.getUnmarshaller(),getQASettings());
						reader.setErrorHandler(errorHandler);
						return reader;
					} catch (javax.xml.bind.UnmarshalException x) {
						throw x;
					} catch (Exception x) {
						throw x;

					} finally {
						//stream closed by closeItemReader
					}
				}
			} catch (Exception x) {
				logger.log(Level.WARNING,String.format("%s\t%s\tFile: %s",x.getClass().getName(),x.getMessage(),files[index].getName()));
				throw x;
			}
		}
		throw new Exception("Unsupported format "+name); 
	}

	@Override
	protected void closeItemReader(IRawReader<IStructureRecord> itemReader)
			throws IOException {
		if (itemReader!=null) itemReader.setErrorHandler(null);
		super.closeItemReader(itemReader);
	}

	@Override
	protected File verifyEntry(File file) throws IOException, AmbitException {
		if (FileState._FILE_TYPE.I5D_INDEX.hasExtension(file)) {
			String cp = getJaxbContextPath4File(file);
			return cp==null?null:("".equals(cp))?null:file;
		} else return null;
	}
	
	private String getJaxbContextPath4File(File file) throws AmbitException,IOException {
		if (file2cjaxbcp==null) file2cjaxbcp = new Hashtable<String,String>();
		String cp = file2cjaxbcp.get(file.getAbsolutePath());
		if (cp!=null) return cp;
		//read the file and find out if the object is supported. Then return the JAXB context path.
		if (rootObjectVerifier==null) rootObjectVerifier = new I5ObjectVerifier();
		try {
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(new FileInputStream(file));
			cp = ((rootObject!=null)&& (rootObject.getContextPath()!=null))?
					rootObject.getContextPath():"";
			file2cjaxbcp.put(file.getAbsolutePath(),cp);
			return cp;
		} catch (Exception x) {
			logger.log(Level.FINE,x.getMessage());
			return null;
		}
	}
	/*
	@Override
	public File[] unzip(File zipfile, File directory) throws AmbitIOException {
		File[] files = super.unzip(zipfile, directory);
		for (File file : files)
			System.out.println(file2cjaxbcp.get(file.getAbsolutePath()));
		return files;
	}
	*/
	
	@Override
	public File[] unzip(File zipfile, File directory) throws AmbitIOException {
		tempFolder = directory;
		File[] files =  super.unzip(zipfile, directory);
		if (files == null) throw new AmbitIOException(String.format("Failed to unzip %s into %s",zipfile.getAbsolutePath(),directory.getAbsolutePath()));
		List<File> referenceSubstances = new ArrayList<File>();
		List<File> substances = new ArrayList<File>();
		List<File> study = new ArrayList<File>();
		for (File file : files) {
			String cp = file2cjaxbcp.get(file.getAbsolutePath());
			if (cp!=null) {
				logger.log(Level.FINE,cp);
				if (cp.indexOf(".referencesubstance")>=0)
					referenceSubstances.add(file);
				else if (cp.indexOf(".substance")>=0)
					substances.add(file);
				else study.add(file);
			}	
		}
		logger.log(Level.FINE,
				String.format("Reference substances %d\tSubstances %d\tStudies %d",
				referenceSubstances.size(),
				substances.size(),
				study.size()));
	
		//sort by jaxb context so that we reuse JAXBContext and cache it only once!
		Collections.sort(study,new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				return file2cjaxbcp.get(o2.getAbsolutePath()).compareTo(file2cjaxbcp.get(o1.getAbsolutePath()));
			}
		});

		referenceSubstances.addAll(substances);
		referenceSubstances.addAll(study);
		substances.clear();study.clear();

		return referenceSubstances.toArray(new File[referenceSubstances.size()]);		
	}

	@Override
	public void close() throws IOException {
		try {
			if (tempFolder!=null && tempFolder.exists()) 
				FileUtils.deleteDirectory(tempFolder);
		} catch (Exception x) {	
			x.printStackTrace();
		}
		super.close();
	}
}

class JAXBStuff {
	protected JAXBContext jaxbContext;
	protected Unmarshaller jaxbUnmarshaller;
	
	public JAXBStuff(String contextPath) throws JAXBException {
		jaxbContext = JAXBContext.newInstance(contextPath);
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	}
	public Unmarshaller getUnmarshaller() throws JAXBException{
		return jaxbUnmarshaller==null?jaxbContext.createUnmarshaller():jaxbUnmarshaller;
	}
	
}

