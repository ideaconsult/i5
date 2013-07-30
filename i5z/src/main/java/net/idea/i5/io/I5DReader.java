package net.idea.i5.io;

import java.io.InputStream;
import java.util.Hashtable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.openscience.cdk.exception.CDKException;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IProcessor;
import ambit2.base.interfaces.IStructureRecord;

public class I5DReader extends AbstractI5DReader<IStructureRecord> {
	protected SubstanceRecord record = new SubstanceRecord();
	protected Hashtable<String, IProcessor<Object, IStructureRecord>> processors = new Hashtable<String, IProcessor<Object, IStructureRecord>>();
	/**
	 * Reuses existing JAXBContext
	 * @param in
	 * @param jaxbContext
	 * @param jaxbUnmarshaller
	 * @throws CDKException
	 */
	public I5DReader(InputStream in,JAXBContext jaxbContext,Unmarshaller jaxbUnmarshaller) throws CDKException {
		super(in,jaxbContext, jaxbUnmarshaller);
		initProcessors();
	}
	/**
	 * 
	 * @param in
	 * uses default JAXB context path "net.idea.i5._5.substance:eu.europa.echa.schemas.iuclid5._20120101"
	 * @throws CDKException
	 */
	public I5DReader(InputStream in) throws CDKException {
		super(in);
		initProcessors();
	}
	/**
	 * 
	 * @param in
	 * @param contextPath e.g. "net.idea.i5._5.substance:eu.europa.echa.schemas.iuclid5._20120101"
	 * @throws CDKException
	 */
	public I5DReader(InputStream in,String contextPath) throws CDKException {
		super(in,contextPath);
		initProcessors();
	}
	
	protected void initProcessors() {
		processors.put(eu.europa.echa.schemas.iuclid5._20120101.Substance.class.getName(), 
								new net.idea.i5._4.ambit2.I5AmbitProcessor());
		processors.put(net.idea.i5._5.substance.Substance.class.getName(), 
								new net.idea.i5._5.ambit2.I5AmbitProcessor());
	}


	@Override
	protected IStructureRecord transform(Object unmarshalled) throws AmbitException {
		IProcessor<Object, IStructureRecord> p = processors.get(unmarshalled.getClass().getName());
		if (p!=null)
			return p.process(unmarshalled);
		else return null;
	}

}
