package net.idea.i5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ambit2.base.exceptions.AmbitException;
import ambit2.base.exceptions.AmbitIOException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.core.io.FileInputState;
import ambit2.core.io.IRawReader;
import ambit2.core.io.ZipReader;

public class I5ZReader<SUBSTANCE> extends ZipReader {
	protected Map<String,String> file2cjaxbcp;
	protected Hashtable<String, JAXBStuff> jaxbCache = new Hashtable<String,JAXBStuff>();
	protected I5ObjectVerifier rootObjectVerifier;
	
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
	protected IRawReader<IStructureRecord> getItemReader(int index) throws Exception {
		String name = files[index].getName().toLowerCase();
		if (name.endsWith(FileInputState.extensions[FileInputState.I5D_INDEX])) {
			logger.log(Level.FINE,name);
			try {
				String jaxbcontextpath = getJaxbContextPath4File(files[index]);
				
				if (jaxbcontextpath!=null && !"".equals(jaxbcontextpath)) {
					InputStream fileReader = new FileInputStream(files[index]);
					try {
						JAXBStuff jaxb = jaxbCache.get(jaxbcontextpath);
						if (jaxb==null) {
							jaxb = new JAXBStuff(jaxbcontextpath);
							jaxbCache.put(jaxbcontextpath, jaxb);
						}
						I5DReader reader = new I5DReader(fileReader,jaxb.jaxbContext,jaxb.jaxbUnmarshaller);
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
		if (file.getName().toLowerCase().endsWith(FileInputState.extensions[FileInputState.I5D_INDEX])) {
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
		File[] files =  super.unzip(zipfile, directory);
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
		logger.log(Level.INFO,
				String.format("Reference substances %d\tSubstances %d\tStudies %d",
				referenceSubstances.size(),
				substances.size(),
				study.size()));
		/*
		substances.addAll(referenceSubstances);
		substances.addAll(study);
		referenceSubstances.clear();study.clear();

		for (File file : substances)
			System.out.println(file2cjaxbcp.get(file.getAbsolutePath()));
		return substances.toArray(new File[referenceSubstances.size()]);
		*/
		referenceSubstances.addAll(substances);
		referenceSubstances.addAll(study);
		substances.clear();study.clear();

		for (File file : substances)
			System.out.println(file2cjaxbcp.get(file.getAbsolutePath()));
		return referenceSubstances.toArray(new File[referenceSubstances.size()]);		
	}
	
}

class JAXBStuff {
	protected JAXBContext jaxbContext;
	protected Unmarshaller jaxbUnmarshaller;
	
	public JAXBStuff(String contextPath) throws JAXBException {
		jaxbContext = JAXBContext.newInstance(contextPath);
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	}
}

