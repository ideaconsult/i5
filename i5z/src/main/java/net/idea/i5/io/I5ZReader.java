package net.idea.i5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import ambit2.base.exceptions.AmbitIOException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.core.io.FileInputState;
import ambit2.core.io.IRawReader;
import ambit2.core.io.ZipReader;

public class I5ZReader<SUBSTANCE> extends ZipReader {
	protected String contextPath = "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101";
	protected JAXBContext jaxbContext;
	protected Unmarshaller jaxbUnmarshaller;
	
	public I5ZReader(File zipfile) throws AmbitIOException {
		super(zipfile);
	}
	public I5ZReader(InputStream stream) throws AmbitIOException {
		super(stream);
	}
	
	@Override
	protected IRawReader<IStructureRecord> getItemReader(int index) throws Exception {
		String name = files[index].getName().toLowerCase();
		if (name.endsWith(FileInputState.extensions[FileInputState.I5D_INDEX])) {
			logger.log(Level.FINE,name);
			InputStream fileReader = new FileInputStream(files[index]);
			try {
				if (jaxbContext==null) jaxbContext = JAXBContext.newInstance(contextPath);
				if (jaxbUnmarshaller==null) jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				I5DReader reader = new I5DReader(fileReader,jaxbContext,jaxbUnmarshaller);
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
			
		throw new Exception("Unsupported format "+name); 
	}

	@Override
	protected void closeItemReader(IRawReader<IStructureRecord> itemReader)
			throws IOException {
		if (itemReader!=null) itemReader.setErrorHandler(null);
		super.closeItemReader(itemReader);
	}
	
	public String getContextPath() {
		return contextPath;
	}
	public synchronized void setContextPath(String contextPath) {
		this.contextPath = contextPath;
		//if contextpath is modified, let's reinitialize jaxb
		jaxbContext = null;
		jaxbUnmarshaller = null;
	}

}
