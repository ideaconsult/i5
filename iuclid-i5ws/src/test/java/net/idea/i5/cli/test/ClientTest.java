package net.idea.i5.cli.test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.idea.i5.cli.I5LightClient;
import net.idea.i5.io.I5ZReader;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QASettings;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openscience.cdk.io.IChemObjectReaderErrorHandler;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;

public class ClientTest {
	protected static Logger logger = Logger.getLogger(ClientTest.class
			.getName());
	static I5LightClient i5;

	@BeforeClass
	public static void init() throws Exception {
		i5 = new I5LightClient(PropertiesUtil.getTarget());
	}

	@AfterClass
	public static void done() throws Exception {
		i5.close();
	}

	protected int unmarshall_i5z(File in, int nfiles) throws Exception {
		logger.log(Level.INFO,"unmarshall_i5z "+ in.toString());
		Assert.assertNotNull(in);
		FileOutputStream output = null;
		I5ZReader reader = null;
		try {
			reader = new I5ZReader(in);
			reader.setQASettings(new QASettings(false));
			if (nfiles > 0)
				Assert.assertEquals(nfiles, reader.getFiles().length);
			reader.setErrorHandler(new IChemObjectReaderErrorHandler() {
				@Override
				public void handleError(String message, int row, int colStart,
						int colEnd, Exception exception) {
				}
				@Override
				public void handleError(String message, int row, int colStart,
						int colEnd) {
				}
				@Override
				public void handleError(String message, Exception exception) {
					logger.log(Level.SEVERE, message,exception);
				}

				public void handleError(String message) {
					logger.log(Level.SEVERE, message);
				}
			});
			int count = 0;
			while (reader.hasNext()) {
				Object next = reader.nextRecord();
				if (next instanceof SubstanceRecord) {
					List<ProtocolApplication> papps = ((SubstanceRecord) next)
							.getMeasurements();
					if (papps != null) {
						Assert.assertTrue(papps.size() > 0);
						for (ProtocolApplication papp : papps) {
							if (papp.getProtocol() != null) {
								String category = ((Protocol) papp
										.getProtocol()).getCategory();
								try {
									I5_ROOT_OBJECTS r = I5_ROOT_OBJECTS
											.valueOf(((Protocol) papp
													.getProtocol())
													.getCategory().replace(
															"_SECTION", ""));

								} catch (Exception x) {
									logger.log(Level.WARNING,x.getMessage());
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
