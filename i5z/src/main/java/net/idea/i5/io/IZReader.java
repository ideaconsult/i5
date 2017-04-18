package net.idea.i5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;

import ambit2.base.exceptions.AmbitIOException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.core.io.IRawReader;
import ambit2.core.io.ZipReader;
import net.idea.modbcum.i.exceptions.AmbitException;
import net.idea.modbcum.p.DefaultAmbitProcessor;

public abstract class IZReader<SUBSTANCE, ROOT_OBJECT extends IROOT_OBJECTS, OBJECTVERIFIER extends DefaultAmbitProcessor<InputStream,ROOT_OBJECT>> extends ZipReader<I5Options> implements IQASettings {
	protected transient File tempFolder;
	protected QASettings qaSettings;
	protected Map<String, String> file2cjaxbcp;
	protected transient OBJECTVERIFIER rootObjectVerifier;

	protected transient Hashtable<String, JAXBStuff> jaxbCache = new Hashtable<String, JAXBStuff>();

	@Override
	public QASettings getQASettings() {
		if (qaSettings == null)
			qaSettings = new QASettings();
		return qaSettings;
	}

	@Override
	public void setQASettings(QASettings qualityCheckEnabled) {
		this.qaSettings = qualityCheckEnabled;
	}

	public IZReader(File zipfile, I5Options options) throws AmbitIOException {
		super(zipfile, options);
	}

	public IZReader(InputStream stream, I5Options options) throws AmbitIOException {
		super(stream, options);
	}

	@Override
	protected void finalize() throws Throwable {
		if (jaxbCache != null)
			jaxbCache.clear();
		rootObjectVerifier = null;
		super.finalize();
	}

	@Override
	public void close() throws IOException {
		try {
			if (tempFolder != null && tempFolder.exists())
				FileUtils.deleteDirectory(tempFolder);
		} catch (Exception x) {
			x.printStackTrace();
		}
		super.close();
	}

	protected abstract boolean isSupported(String name);

	@Override
	protected void closeItemReader(IRawReader<IStructureRecord> itemReader) throws IOException {
		if (itemReader != null)
			itemReader.setErrorHandler(null);
		super.closeItemReader(itemReader);
	}

	@Override
	protected File verifyEntry(File file) throws IOException, AmbitException {
		if (isSupported(file.getName())) {
			String cp = getJaxbContextPath4File(file);
			return cp == null ? null : ("".equals(cp)) ? null : file;
		} else
			return null;
	}

	protected String getJaxbContextPath4File(File file) throws AmbitException, IOException {
		if (file2cjaxbcp == null)
			file2cjaxbcp = new Hashtable<String, String>();
		String cp = file2cjaxbcp.get(file.getAbsolutePath());
		if (cp != null)
			return cp;
		// read the file and find out if the object is supported. Then return
		// the JAXB context path.
		if (rootObjectVerifier == null)
			rootObjectVerifier = createObjectVerifier();
		try {
			IROOT_OBJECTS rootObject = rootObjectVerifier.process(new FileInputStream(file));
			cp = ((rootObject != null) && (rootObject.getContextPath() != null)) ? rootObject.getContextPath() : "";
			file2cjaxbcp.put(file.getAbsolutePath(), cp);
			return cp;
		} catch (Exception x) {
			logger.log(Level.FINE, x.getMessage());
			return null;
		}
	}
	
	protected abstract OBJECTVERIFIER createObjectVerifier();
		
}

class JAXBStuff {
	protected JAXBContext jaxbContext;
	protected Unmarshaller jaxbUnmarshaller;

	public JAXBStuff(String contextPath) throws JAXBException {
		jaxbContext = JAXBContext.newInstance(contextPath);
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	}

	public Unmarshaller getUnmarshaller() throws JAXBException {
		return jaxbUnmarshaller == null ? jaxbContext.createUnmarshaller() : jaxbUnmarshaller;
	}

}