package net.idea.i6.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Hashtable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.openscience.cdk.exception.CDKException;
import org.w3c.dom.Node;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import eu.europa.echa.iuclid6.namespaces.reference_substance._2.REFERENCESUBSTANCE;
import eu.europa.echa.iuclid6.namespaces.substance._2.SUBSTANCE;
import net.idea.i5.io.AbstractI5DReader;
import net.idea.i5.io.I5ObjectVerifier;
import net.idea.i5.io.QASettings;
import net.idea.modbcum.i.exceptions.AmbitException;
import net.idea.modbcum.i.processors.IProcessor;

public class I6DReader extends AbstractI5DReader<IStructureRecord> {
	
	protected Hashtable<String, IProcessor<Object, IStructureRecord>> processors = new Hashtable<String, IProcessor<Object, IStructureRecord>>();
	protected String container = null;	

	public String getContainer() {
		return container;
	}
	public void setContainer(String container) {
		this.container = container;
	}
	/**
	 * Detects the I5D content and uses the correct JAXB classes to unmarshall the XML content
	 * @param file
	 * @throws CDKException
	 * @throws FileNotFoundException
	 * @throws AmbitException
	 */
	public I6DReader(String container,File file,QASettings qaSettings) throws CDKException, FileNotFoundException, AmbitException {
		this(container,file,null,qaSettings);
	}
	/**
	 * Detects the I5D content and uses the correct JAXB classes to unmarshall the XML content
	 * @param file
	 * @param rootObjectVerifier could be null
	 * @throws CDKException
	 * @throws FileNotFoundException
	 * @throws AmbitException
	 */
	public I6DReader(String container,File file,I5ObjectVerifier rootObjectVerifier,QASettings qaSettings) throws CDKException, FileNotFoundException, AmbitException {
		this(container,new FileInputStream(file),getJaxbContext(file,rootObjectVerifier),qaSettings);
	}	
	
	/**
	 * Reuses existing JAXBContext
	 * @param in
	 * @param jaxbContext
	 * @param jaxbUnmarshaller
	 * @throws CDKException
	 */
	public I6DReader(String container,InputStream in,JAXBContext jaxbContext,Unmarshaller jaxbUnmarshaller,QASettings qaSettings) throws CDKException {
		super(in,jaxbContext, jaxbUnmarshaller);
		initProcessors(qaSettings, container);
	}
	public I6DReader(String container,InputStream in,JAXBContext jaxbContext,Unmarshaller jaxbUnmarshaller) throws CDKException {
		this(container,in,jaxbContext,jaxbUnmarshaller,new QASettings());
	}
	/**
	 * 
	 * @param in
	 * uses default JAXB context path "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101"
	 * @throws CDKException
	 */
	public I6DReader(String container,InputStream in,QASettings qaSettings) throws CDKException {
		super(in);
		initProcessors(qaSettings, container);
	}

	/**
	 * 
	 * @param in
	 * @param contextPath e.g. "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101"
	 * @throws CDKException
	 */
	public I6DReader(String container,InputStream in,String contextPath,QASettings qaSettings) throws CDKException {
		super(in,contextPath);
		initProcessors(qaSettings, container);
	}
	
	protected void initProcessors(QASettings qaSettings, String container) {
		record = new SubstanceRecord();
		
		net.idea.i6._2.ambit2.I6AmbitProcessor i62 = new net.idea.i6._2.ambit2.I6AmbitProcessor(container);
		
		i62.setQASettings(qaSettings);
		
		processors.put(SUBSTANCE.class.getName(),i62); 
		processors.put(REFERENCESUBSTANCE.class.getName(),i62); 
		processors.put(Document.class.getName(),i62);
		//env fate
		for (I6_ROOT_OBJECTS tag : I6_ROOT_OBJECTS.values()) 
			if (tag.isScientificPart()) {
				//package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationinwaterandsedimentsimulationtests._2;
				String clazz = String.format("eu.europa.echa.iuclid6.namespaces.%s._2.%s",tag.name().toLowerCase(),tag.name().replaceAll("_",""));
				processors.put(clazz, i62);
			}
	}


	@Override
	protected IStructureRecord transform(Object unmarshalled) throws AmbitException {
		if (unmarshalled instanceof Document) {
			Document doc = (Document) unmarshalled;
			unmarshalled = doc.getContent().getAny();
		}
		
		IProcessor<Object, IStructureRecord> p = processors.get(unmarshalled.getClass().getName());
		if (p!=null) try {
			return p.process(unmarshalled);
		} catch (Exception x) {
			throw new AmbitException(x);
		}	
		else return null;
	}

	@Override
	public Object next() {
		return nextRecord();
	}
}
