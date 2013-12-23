package net.idea.i5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.idea.i5.io.I5ObjectVerifier.I5_ROOT_OBJECTS;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.exceptions.AmbitIOException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.core.io.FileInputState;
import ambit2.core.io.IRawReader;
import ambit2.core.io.ZipReader;

public class I5ZReader<SUBSTANCE> extends ZipReader {
	protected Hashtable<String, JAXBStuff> jaxbCache = new Hashtable<String,JAXBStuff>();
	protected I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
	
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
			logger.log(Level.INFO,name);
			try {
				String jaxbcontextpath = getJaxbContextPath4File(files[index]);
				
				if (jaxbcontextpath!=null) {
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
	protected File createTempFile(File directory, String name) throws IOException,AmbitException {
		I5DFile file = null;
		if (name.toLowerCase().endsWith(FileInputState.extensions[FileInputState.I5D_INDEX])) {
			file =  new I5DFile(directory,name);
			file.setContextPath(getJaxbContextPath4File(file));
		}
		return file;
	}
	
	private String getJaxbContextPath4File(File file) throws AmbitException,IOException {
		if (file instanceof I5DFile) {
			if (((I5DFile)file).getContextPath()!=null) return ((I5DFile)file).getContextPath();
		}
		//read the file and find out if the object is supported. Then return the JAXB context path.
		I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(new FileInputStream(file));
		if ((rootObject!=null)&& (rootObject.getContextPath()!=null)) {
			return rootObject.getContextPath();
		}
		return null;
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

class I5DFile extends File {
	protected String contextPath;
	public String getContextPath() {
		return contextPath;
	}
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	public I5DFile(File directory, String name) {
		super(directory,name);
	}
	
}