package net.idea.i6.io.substance.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.openscience.cdk.io.IChemObjectReaderErrorHandler;
import org.w3c.dom.Document;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.relation.composition.CompositionRelation;
import junit.framework.Assert;
import net.idea.i5.io.QASettings;
import net.idea.i6.io.I6DReader;
import net.idea.i6.io.I6ManifestReader;
import net.idea.i6.io.I6ZReader;

public class SubstanceTest {
	protected static Logger logger = Logger.getLogger(SubstanceTest.class.getName());

	@Test
	public void readManifest() throws Exception {
		File file = new File(getClass().getClassLoader().getResource("net/idea/i6/_2/substance/manifest.xml").getFile());
		Assert.assertTrue(file.exists());
		File folder = file.getParentFile();
		try (InputStream in = new FileInputStream(file)) {
			I6ManifestReader r = new I6ManifestReader();
			Document manifest = r.read(in);

			Map<String, String> file2cjaxbcp = r.parseFiles(manifest, folder);
			System.out.println(file2cjaxbcp);

			File test = new File(folder,"IUC4-05eb6a0b-c37d-3a08-a9a3-718494b352ef_0.i6d");
			Assert.assertEquals("eu.europa.echa.iuclid6.namespaces.endpoint_study_record_watersolubility._2", file2cjaxbcp.get(test.getAbsolutePath()));

			String jaxbcontextpath = "eu.europa.echa.iuclid6.namespaces.platform_container.v1:"
					+ "eu.europa.echa.iuclid6.namespaces.platform_fields.v1:"
					+ "eu.europa.echa.iuclid6.namespaces.platform_metadata.v1:" + file2cjaxbcp.get(test.getAbsolutePath());

			JAXBContext jaxbContext = JAXBContext.newInstance(jaxbcontextpath);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			System.out.println(jaxbcontextpath);
			try (InputStream fileReader = new FileInputStream(test)) {
				I6DReader reader = new I6DReader(test.getAbsolutePath(), fileReader, jaxbContext, jaxbUnmarshaller, new QASettings(false));
				while (reader.hasNext()) {
					Object o = reader.next();
					Assert.assertNotNull(o);
				}
			} catch (Exception x) {
				x.printStackTrace();
			}

			SubstanceRecord substance = new SubstanceRecord();
			r.parseDocuments(manifest, substance);
			Assert.assertNotNull(substance.getSubstanceUUID());
			Assert.assertNotNull(substance.getContent());
			Assert.assertEquals("IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734", substance.getSubstanceUUID());
			Assert.assertNotNull(substance.getReferenceSubstanceUUID());

		}
	}

	@Test
	public void test_i6z_2() throws Exception {
		String test = "net/idea/i6/_2/substance/i6z/IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734.i6z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertNotNull(url);
		Assert.assertEquals(603, unmarshall_i6z(new File(url.getFile()), 603));
		// all 880
	}

	@Test
	public void test_i6z_2_echa() throws Exception {
		String test = "net/idea/i6/_2/substance/i6z/ECHA-13cdf683-927b-47d6-81a5-32d27ec38747.i6z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertNotNull(url);
		Assert.assertEquals(32, unmarshall_i6z(new File(url.getFile()), 32));
		// all 52
	}

	@Test
	public void test_i6z_2_internal() throws Exception {
		String test = "net/idea/i6/_2/substance/i6z/IUC5-a438545b-3c6c-403f-83e6-5cd2756d77d6.i6z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertNotNull(url);
		Assert.assertEquals(38, unmarshall_i6z(new File(url.getFile()), 38));
		// all 880
	}

	protected int unmarshall_i6z(File in, int nfiles) throws Exception {
		Assert.assertNotNull(in);
		FileOutputStream output = null;
		I6ZReader reader = null;
		try {
			reader = new I6ZReader(in);
			QASettings qa = new QASettings(false);
			qa.setAll();
			reader.setQASettings(qa);
			Assert.assertEquals(nfiles, reader.getFiles().length);
			reader.setErrorHandler(new IChemObjectReaderErrorHandler() {
				public void handleError(String message, int row, int colStart, int colEnd, Exception exception) {
					exception.printStackTrace();
				}

				public void handleError(String message, int row, int colStart, int colEnd) {
					// System.out.println(message);
				}

				public void handleError(String message, Exception exception) {
					// logger.log(Level.SEVERE, message);
				}

				public void handleError(String message) {
					// logger.log(Level.SEVERE, message);
				}
			});
			int count = 0;
			while (reader.hasNext()) {
				Object next = reader.nextRecord();
				if (next instanceof SubstanceRecord) {
					Assert.assertNotNull(((SubstanceRecord) next).getSubstanceUUID());
					// Assert.assertNotNull(((SubstanceRecord)
					// next).getContent());
					if (((SubstanceRecord) next).getRelatedStructures() != null)
						for (CompositionRelation r : ((SubstanceRecord) next).getRelatedStructures()) {
							Assert.assertNotNull(r.getCompositionUUID());
						}
				} else if (next instanceof IStructureRecord) {
					System.out.println(((IStructureRecord) next).getContent());
				}
				logger.info(next == null ? "null entry" : next.toString());
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
