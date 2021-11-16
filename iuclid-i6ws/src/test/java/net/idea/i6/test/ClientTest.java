package net.idea.i6.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openscience.cdk.io.IChemObjectReaderErrorHandler;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QASettings;
import net.idea.i6.cli.I6LightClient;
import net.idea.i6.io.I6ZReader;

public class ClientTest {
	protected static Logger logger = Logger.getLogger(ClientTest.class.getName());

	static final String loggingProperties = "logging.properties";
	static final String log4jProperties = "log4j.properties";

	static I6LightClient i6;

	@BeforeClass
	public static void init() throws Exception {

		try (InputStream in = new FileInputStream(
				ClientTest.class.getClassLoader().getResource(loggingProperties).getFile())) {
			LogManager.getLogManager().readConfiguration(in);
			logger.log(Level.INFO, String.format("Logging configuration loaded from %s", loggingProperties));
		} catch (Exception x) {
			System.err.println("logging configuration failed " + x.getMessage());
		}

		// now log4j for those who use it
		try (InputStream in = ClientTest.class.getClassLoader().getResourceAsStream(log4jProperties)) {
			PropertyConfigurator.configure(in);
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage());
		}
		i6 = new I6LightClient(PropertiesUtil.getTarget());
	}

	@AfterClass
	public static void done() throws Exception {
		i6.close();
	}

	protected int unmarshall_i6z(File in, int nfiles) throws Exception {
		logger.log(Level.INFO, "unmarshall_i6z " + in.toString());
		Assert.assertNotNull(in);
		FileOutputStream output = null;
		I6ZReader reader = null;
		try {
			reader = new I6ZReader(in);
			reader.setQASettings(new QASettings(false));
			if (nfiles > 0)
				Assert.assertEquals(nfiles, reader.getFiles().length);
			reader.setErrorHandler(new IChemObjectReaderErrorHandler() {
				@Override
				public void handleError(String message, int row, int colStart, int colEnd, Exception exception) {
				}

				@Override
				public void handleError(String message, int row, int colStart, int colEnd) {
				}

				@Override
				public void handleError(String message, Exception exception) {
					logger.log(Level.SEVERE, message, exception);
				}

				public void handleError(String message) {
					logger.log(Level.SEVERE, message);
				}
			});
			int count = 0;
			while (reader.hasNext()) {
				Object next = reader.nextRecord();
				if (next instanceof SubstanceRecord) {
					List<ProtocolApplication> papps = ((SubstanceRecord) next).getMeasurements();
					if (papps != null) {
						Assert.assertTrue(papps.size() > 0);
						for (ProtocolApplication papp : papps) {
							if (papp.getProtocol() != null) {
								String category = ((Protocol) papp.getProtocol()).getCategory();
								try {
									I5_ROOT_OBJECTS r = I5_ROOT_OBJECTS.valueOf(
											((Protocol) papp.getProtocol()).getCategory().replace("_SECTION", ""));

								} catch (Exception x) {
									logger.log(Level.WARNING, x.getMessage());
								}
							}
						}
					}
				} else if (next instanceof IStructureRecord) {
					Assert.assertNotNull(((IStructureRecord) next).getContent());
				}
				logger.fine(next == null ? "null entry" : next.toString());
				count++;
			}
			return count;
		} catch (Exception x) {
			throw x;
		} finally {
			if (output != null)
				output.close();
			if (reader != null)
				reader.close();
		}
	}
}
