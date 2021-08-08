package net.idea.i5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.idea.modbcum.i.exceptions.AmbitException;

import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.io.formats.IResourceFormat;
import org.openscience.cdk.io.iterator.DefaultIteratingChemObjectReader;

import ambit2.base.data.ILiteratureEntry;
import ambit2.base.interfaces.ICiteable;
import ambit2.core.io.IRawReader;

/**
 * Reader for IIUCLID .i5d files (XML with IUCLID5 schema)
 * @author nina
 *
 * @param <SUBSTANCE>
 */
public abstract class AbstractI5DReader<T> extends DefaultIteratingChemObjectReader implements IRawReader<T>, ICiteable {
	protected static Logger logger = Logger.getLogger(AbstractI5DReader.class.getName());
	protected InputStream stream;
	protected JAXBContext jaxbContext;
	protected Unmarshaller jaxbUnmarshaller;
	protected boolean hasNext = true;
	protected Object unmarshalled;
	protected T record;

	/**
	 * Reuses existing JAXBContext
	 * @param in
	 * @param jaxbContext
	 * @param jaxbUnmarshaller
	 * @throws CDKException
	 */
	public AbstractI5DReader( InputStream in,JAXBContext jaxbContext,Unmarshaller jaxbUnmarshaller) throws CDKException {
		super();
		setReader(in);
		initJAXB(jaxbContext, jaxbUnmarshaller);
	}
	/**
	 * 
	 * @param in
	 * uses default JAXB context path "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101.substance"
	 * See {@link I6ObjectVerifier.I5_ROOT_OBJECTS} for supported paths.
	 * @throws CDKException
	 */
	public AbstractI5DReader( InputStream in) throws CDKException {
		this(in,"eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101.substance");
	}
	/**
	 * Detects the I5D content and uses the correct JAXB classes to unmarshall the XML content
	 * @param file
	 * @throws CDKException
	 * @throws FileNotFoundException
	 * @throws AmbitException
	 */
	public AbstractI5DReader(File file) throws CDKException, FileNotFoundException, AmbitException {
		this(file,null);
	}
	/**
	 * Detects the I5D content and uses the correct JAXB classes to unmarshall the XML content
	 * @param file
	 * @param rootObjectVerifier could be null
	 * @throws CDKException
	 * @throws FileNotFoundException
	 * @throws AmbitException
	 */
	public AbstractI5DReader(File file,I5ObjectVerifier rootObjectVerifier) throws CDKException, FileNotFoundException, AmbitException {
		this(new FileInputStream(file),getJaxbContext(file,rootObjectVerifier));
	}	
	/**
	 * Detects the I5D content and returns the correct JAXB path
	 * @param file
	 * @param rootObjectVerifier
	 * @return
	 * @throws AmbitException
	 * @throws FileNotFoundException
	 */
	public static String getJaxbContext(File file,I5ObjectVerifier rootObjectVerifier) throws AmbitException, FileNotFoundException {
		if (rootObjectVerifier==null) rootObjectVerifier = new I5ObjectVerifier();
		I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(new FileInputStream(file));
		return rootObject==null?null:rootObject.getContextPath();
	}
	
	/**
	 * 
	 * @param in
	 * @param contextPath e.g. eu.europa.echa.schemas.iuclid5._20120101.substance"
	 * @throws CDKException
	 */
	public AbstractI5DReader(InputStream in,String contextPath) throws CDKException {
		super();
		setReader(in);
		try {
			initJAXB(contextPath);
		} catch (JAXBException x) {
			throw new CDKException("Error initializing JAXB",x);
		}
	}
	public void initJAXB(String contextPath) throws JAXBException  {
		jaxbContext = JAXBContext.newInstance(contextPath,AbstractI5DReader.class.getClassLoader());
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();

	}
	public void initJAXB(JAXBContext jaxbContext,Unmarshaller jaxbUnmarshaller) {
		this.jaxbContext = jaxbContext;
		this.jaxbUnmarshaller = jaxbUnmarshaller;
	}
	public void setReader(InputStream in) throws CDKException {
		this.stream = in;
	}

	/**
	 * Does nothing, use {@link #setReader(InputStream)
	 */
	public void setReader(Reader reader) throws CDKException {
		throw new CDKException("Use setReader(InputStream) to avoid problems with XML BOM");
	}

	public void close() throws IOException {
		if (stream!=null) stream.close();
	}

	public boolean hasNext() {
		if (hasNext) {
			try { 
				unmarshalled = jaxbUnmarshaller.unmarshal(stream);
				record = transform(unmarshalled);
				hasNext = false;
				return true;
			} catch (Exception x) {
				try { handleError(x.getMessage(),x);} 
				catch (Exception xx) {
					logger.log(java.util.logging.Level.SEVERE,x.getMessage(),xx);
				}
				return false;
			}
		} else {
			unmarshalled = null;
			record = null;
			return false;
		}
	}

	public Object next() {
		return unmarshalled;
	}

	protected ILiteratureEntry reference;
	
	public ILiteratureEntry getReference() {
		return reference;
	}

	public void setReference(ILiteratureEntry reference) {
		this.reference = reference;
	}

	public T nextRecord() {
		return record;
	}

	public IResourceFormat getFormat() {
		return I5DFormat.getInstance();
	}
	
	protected abstract T transform(Object unmarshalled) throws AmbitException ;
	


	@Override
	protected void finalize() throws Throwable {
		jaxbContext = null;
		jaxbUnmarshaller = null;
		super.finalize();
	}
	
}
