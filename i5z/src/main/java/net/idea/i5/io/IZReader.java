package net.idea.i5.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;

import ambit2.base.exceptions.AmbitIOException;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.core.io.IRawReader;
import ambit2.core.io.ZipReader;
import net.idea.modbcum.i.exceptions.AmbitException;

public abstract class IZReader<SUBSTANCE, ROOT_OBJECT extends IROOT_OBJECTS> extends ZipReader<I5Options>
		implements IQASettings {
	protected transient File tempFolder;
	protected QASettings qaSettings;
	protected Map<String, String> file2cjaxbcp;

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

	protected abstract String getJaxbContextPath4File(File file) throws AmbitException, IOException;

	protected class JAXBStuff {
		protected JAXBContext jaxbContext;
		public JAXBContext getJaxbContext() {
			return jaxbContext;
		}

		protected Unmarshaller jaxbUnmarshaller;

		public JAXBStuff(String contextPath) throws JAXBException {
			jaxbContext = JAXBContext.newInstance(contextPath,IZReader.class.getClassLoader());
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		}

		public Unmarshaller getUnmarshaller() throws JAXBException {
			return jaxbUnmarshaller == null ? jaxbContext.createUnmarshaller() : jaxbUnmarshaller;
		}

	}
}
