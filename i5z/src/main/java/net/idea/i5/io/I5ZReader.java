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
				I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(new FileInputStream(files[index]));
				
				if ((rootObject!=null)&& (rootObject.getContextPath()!=null)) {
					InputStream fileReader = new FileInputStream(files[index]);
					try {
						JAXBStuff jaxb = jaxbCache.get(rootObject.getContextPath());
						if (jaxb==null) {
							jaxb = new JAXBStuff(rootObject.getContextPath());
							jaxbCache.put(rootObject.getContextPath(), jaxb);
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


}

class JAXBStuff {
	protected JAXBContext jaxbContext;
	protected Unmarshaller jaxbUnmarshaller;
	
	public JAXBStuff(String contextPath) throws JAXBException {
		jaxbContext = JAXBContext.newInstance(contextPath);
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	}
}
