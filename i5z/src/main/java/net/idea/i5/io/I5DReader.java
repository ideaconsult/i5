package net.idea.i5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Hashtable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import net.idea.modbcum.i.exceptions.AmbitException;
import net.idea.modbcum.i.processors.IProcessor;

import org.openscience.cdk.exception.CDKException;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;

public class I5DReader extends AbstractI5DReader<IStructureRecord> {
	
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
	public I5DReader(String container,File file,QASettings qaSettings) throws CDKException, FileNotFoundException, AmbitException {
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
	public I5DReader(String container,File file,I5ObjectVerifier rootObjectVerifier,QASettings qaSettings) throws CDKException, FileNotFoundException, AmbitException {
		this(container,new FileInputStream(file),getJaxbContext(file,rootObjectVerifier),qaSettings);
	}	
	
	/**
	 * Reuses existing JAXBContext
	 * @param in
	 * @param jaxbContext
	 * @param jaxbUnmarshaller
	 * @throws CDKException
	 */
	public I5DReader(String container,InputStream in,JAXBContext jaxbContext,Unmarshaller jaxbUnmarshaller,QASettings qaSettings) throws CDKException {
		super(in,jaxbContext, jaxbUnmarshaller);
		initProcessors(qaSettings);
		record.setContent(container);
	}
	public I5DReader(String container,InputStream in,JAXBContext jaxbContext,Unmarshaller jaxbUnmarshaller) throws CDKException {
		this(container,in,jaxbContext,jaxbUnmarshaller,new QASettings());
	}
	/**
	 * 
	 * @param in
	 * uses default JAXB context path "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101"
	 * @throws CDKException
	 */
	public I5DReader(String container,InputStream in,QASettings qaSettings) throws CDKException {
		super(in);
		initProcessors(qaSettings);
		record.setContent(container);
	}

	/**
	 * 
	 * @param in
	 * @param contextPath e.g. "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101"
	 * @throws CDKException
	 */
	public I5DReader(String container,InputStream in,String contextPath,QASettings qaSettings) throws CDKException {
		super(in,contextPath);
		initProcessors(qaSettings);
		record.setContent(container);
	}
	
	protected void initProcessors(QASettings qaSettings) {
		record = new SubstanceRecord();
		
		
		net.idea.i5._0.ambit2.I5AmbitProcessor i50 = new net.idea.i5._0.ambit2.I5AmbitProcessor();
		net.idea.i5._5.ambit2.I5AmbitProcessor i55 = new net.idea.i5._5.ambit2.I5AmbitProcessor();
		net.idea.i5._4.ambit2.I5AmbitProcessor i54 = new net.idea.i5._4.ambit2.I5AmbitProcessor();
		
		i55.setQASettings(qaSettings);
		i54.setQASettings(qaSettings);
		
		processors.put(eu.europa.echa.schemas.iuclid5._20070330.referencesubstance.ReferenceSubstance.class.getName(), i50); 
		
		processors.put(eu.europa.echa.schemas.iuclid5._20120101.substance.Substance.class.getName(), i54);
		processors.put(eu.europa.echa.schemas.iuclid5._20120101.referencesubstance.ReferenceSubstance.class.getName(), i54); 

		processors.put(eu.europa.echa.schemas.iuclid5._20130101.substance.Substance.class.getName(),i55); 
		processors.put(eu.europa.echa.schemas.iuclid5._20130101.referencesubstance.ReferenceSubstance.class.getName(),i55); 
		//env fate
		for (I5_ROOT_OBJECTS tag : I5_ROOT_OBJECTS.values()) 
			if (tag.isScientificPart()) {
				processors.put("eu.europa.echa.schemas.iuclid5._20130101.studyrecord." + tag.name() + "_SECTION.EndpointStudyRecord", i55);
				processors.put("eu.europa.echa.schemas.iuclid5._20120101.studyrecord." + tag.name() + "_SECTION.EndpointStudyRecord", i54);
			}
	}


	@Override
	protected IStructureRecord transform(Object unmarshalled) throws AmbitException {
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
