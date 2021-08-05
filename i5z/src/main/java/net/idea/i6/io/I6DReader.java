package net.idea.i6.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.openscience.cdk.exception.CDKException;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.reference_substance._6.REFERENCESUBSTANCE;
import eu.europa.echa.iuclid6.namespaces.substance._6.SUBSTANCE;
import net.idea.i5.io.AbstractI5DReader;
import net.idea.i5.io.I5ObjectVerifier;
import net.idea.i5.io.QASettings;
import net.idea.modbcum.i.exceptions.AmbitException;
import net.idea.modbcum.i.processors.IProcessor;

public class I6DReader extends AbstractI5DReader<IStructureRecord> {

	protected Hashtable<String, IProcessor<Object, IStructureRecord>> processors = new Hashtable<String, IProcessor<Object, IStructureRecord>>();
	protected String container = null;
	protected Map<String,Document> library;

		public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	/**
	 * Detects the I5D content and uses the correct JAXB classes to unmarshall
	 * the XML content
	 * 
	 * @param file
	 * @throws CDKException
	 * @throws FileNotFoundException
	 * @throws AmbitException
	 */
	public I6DReader(String container, File file, QASettings qaSettings, Map<String,Document> library)
			throws CDKException, FileNotFoundException, AmbitException {
		this(container, file, null, qaSettings,library);
	}

	/**
	 * Detects the I5D content and uses the correct JAXB classes to unmarshall
	 * the XML content
	 * 
	 * @param file
	 * @param rootObjectVerifier
	 *            could be null
	 * @throws CDKException
	 * @throws FileNotFoundException
	 * @throws AmbitException
	 */
	public I6DReader(String container, File file, I5ObjectVerifier rootObjectVerifier, QASettings qaSettings, Map<String,Document> library)
			throws CDKException, FileNotFoundException, AmbitException {
		this(container, new FileInputStream(file), getJaxbContext(file, rootObjectVerifier), qaSettings,library);
	}

	/**
	 * Reuses existing JAXBContext
	 * 
	 * @param in
	 * @param jaxbContext
	 * @param jaxbUnmarshaller
	 * @throws CDKException
	 */
	public I6DReader(String container, InputStream in, JAXBContext jaxbContext, Unmarshaller jaxbUnmarshaller,
			QASettings qaSettings, Map<String,Document> library) throws CDKException {
		super(in, jaxbContext, jaxbUnmarshaller);
		initProcessors(qaSettings, container, library);
	}

	public I6DReader(String container, InputStream in, JAXBContext jaxbContext, Unmarshaller jaxbUnmarshaller, Map<String,Document> library)
			throws CDKException {
		this(container, in, jaxbContext, jaxbUnmarshaller, new QASettings(),library);
	}

	/**
	 * 
	 * @param in
	 *            uses default JAXB context path
	 *            "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101"
	 * @throws CDKException
	 */
	public I6DReader(String container, InputStream in, QASettings qaSettings, Map<String,Document> library) throws CDKException {
		super(in);
		initProcessors(qaSettings, container,library);
	}

	/**
	 * 
	 * @param in
	 * @param contextPath
	 *            e.g.
	 *            "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101"
	 * @throws CDKException
	 */
	public I6DReader(String container, InputStream in, String contextPath, QASettings qaSettings, Map<String,Document> library) throws CDKException {
		super(in, contextPath);
		initProcessors(qaSettings, container, library);
	}

	protected void initProcessors(QASettings qaSettings, String container, Map<String,Document> library) {
		record = new SubstanceRecord();

		net.idea.i6._6.ambit2.I6AmbitProcessor i66 = new net.idea.i6._6.ambit2.I6AmbitProcessor(container);
		i66.setLibrary(library);
		i66.setQASettings(qaSettings);

		processors.put(SUBSTANCE.class.getName(), i66);
		processors.put(REFERENCESUBSTANCE.class.getName(), i66);
		processors.put(Document.class.getName(), i66);
		// env fate
		for (I6_ROOT_OBJECTS tag : I6_ROOT_OBJECTS.values())
			if (tag.isScientificPart()) {
				// package
				// eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterandsedimentsimulationtests._5;
				String clazz = String.format("eu.europa.echa.iuclid6.namespaces.%s._6.%s", tag.name().toLowerCase(),
						tag.name().replaceAll("_", ""));
				processors.put(clazz, i66);
			}
	}

	@Override
	protected IStructureRecord transform(Object unmarshalled) throws AmbitException {
		String key = unmarshalled.getClass().getName();
		if (unmarshalled instanceof Document) {
			Document doc = (Document) unmarshalled;
			key = doc.getContent().getAny().getClass().getName();
		}

		IProcessor<Object, IStructureRecord> p = processors.get(key);
		if (p != null)
			try {
				return p.process(unmarshalled);
			} catch (Exception x) {
				throw new AmbitException(x);
			}
		else
			return null;
	}

	@Override
	public Object next() {
		return nextRecord();
	}
}
