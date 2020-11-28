package net.idea.i6.io.substance.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.openscience.cdk.io.IChemObjectReaderErrorHandler;
import org.w3c.dom.Document;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.relation.composition.CompositionRelation;
import eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._5.FLEXIBLERECORDSubstanceComposition;
import eu.europa.echa.iuclid6.namespaces.substance._5.SUBSTANCE;
import junit.framework.Assert;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QASettings;
import net.idea.i6._5.ambit2.EndpointStudyRecordWrapper;
import net.idea.i6.io.I6DReader;
import net.idea.i6.io.I6ManifestReader;
import net.idea.i6.io.I6ZReader;
import net.idea.i6.io.I6_ROOT_OBJECTS;

public class SubstanceTest {
	protected static Logger logger = Logger.getLogger(SubstanceTest.class.getName());

	@Test
	public void testPhrases() throws Exception {
		Assert.assertEquals("OECD Guideline 471 (Bacterial Reverse Mutation Assay)",
				EndpointStudyRecordWrapper.getPhrase("1287"));
		Assert.assertEquals("XXX", EndpointStudyRecordWrapper.getPhrase("XXX"));
	}

	@Test
	public void readManifest() throws Exception {

		File file = new File(
				getClass().getClassLoader().getResource("net/idea/i6/_5/substance/manifest_i5c.xml").getFile());
		Assert.assertTrue(file.exists());
		File folder = file.getParentFile();
		// File i5folder = new File(folder,
		// "/i6z/IUC5-a438545b-3c6c-403f-83e6-5cd2756d77d6");
		File i5folder = new File(folder, "/i6z/IUC5-541ccdba-0033-45ee-8136-406478deb0f4");
		try (InputStream in = new FileInputStream(file)) {
			I6ManifestReader r = new I6ManifestReader();
			Document manifest = r.read(in);

			Map<String, String> file2cjaxbcp = r.parseFiles(manifest, folder);
			System.out.println(file2cjaxbcp);

			// File test = new
			// File(folder,"IUC4-05eb6a0b-c37d-3a08-a9a3-718494b352ef_0.i6d");
			// File test = new File(folder,
			// "IUC5-10ca3210-3ac0-4b6f-9c00-b3790a20260e_0.i6d");
			// File test = new
			// File(folder,"IUC5-c533941d-3908-415d-93ff-e92bdde5ab01_0.i6d");
			// File test = new File(folder,
			// "IUC5-db3f935f-5a8e-42d2-be08-cd76afd0fc6a_0.i6d");

			// substance
			// File test = new File(folder,
			// "IUC5-541ccdba-0033-45ee-8136-406478deb0f4_0.i6d");
			// eyeirritation
			File test = new File(folder, "IUC5-11fb17d1-815c-42c6-bf07-153a0c7e1846_0.i6d");
			// File test = new
			// File(folder,"IUC5-848a57ae-94a6-436a-965c-d7d6bd3c1a1f_0.i6d");

			// Assert.assertEquals("eu.europa.echa.iuclid6.namespaces.endpoint_study_record_watersolubility._5",
			// file2cjaxbcp.get(test.getAbsolutePath()));
			System.out.println(file2cjaxbcp.get(test.getAbsolutePath()));
			Assert.assertNotNull(file2cjaxbcp.get(test.getAbsolutePath()));

			String jaxbcontextpath = "eu.europa.echa.iuclid6.namespaces.platform_container.v1:"
					+ "eu.europa.echa.iuclid6.namespaces.platform_fields.v1:"
					+ "eu.europa.echa.iuclid6.namespaces.platform_metadata.v1:"
					+ "eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._5:"
					+ file2cjaxbcp.get(test.getAbsolutePath());

			JAXBContext jaxbContext = JAXBContext.newInstance(jaxbcontextpath);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			System.out.println(jaxbcontextpath);

			Set<String> m = new HashSet<String>();
			m.add(I6_ROOT_OBJECTS.LITERATURE.name());
			// m.add(I6_ROOT_OBJECTS.TEST_MATERIAL_INFORMATION.name());
			m.add(I6_ROOT_OBJECTS.FLEXIBLE_RECORD_SubstanceComposition.name());

			List<File> libraryFiles = r.listFiles(manifest, i5folder, m);
			Map<String, eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document> library = I6ManifestReader
					.parseLinkedEntry(libraryFiles);
			Assert.assertNotNull(library);
			Assert.assertTrue(library.size() > 0);
			try (InputStream fileReader = new FileInputStream(test)) {
				I6DReader reader = new I6DReader(test.getAbsolutePath(), fileReader, jaxbContext, jaxbUnmarshaller,
						new QASettings(false), library);
				int c = 0;
				while (reader.hasNext()) {
					Object o = reader.next();
					Assert.assertNotNull(o);
					Assert.assertTrue(o instanceof SubstanceRecord);
					Assert.assertNotNull(((SubstanceRecord) o).getMeasurements());
					for (ProtocolApplication<Protocol, IParams, String, IParams, String> papp : ((SubstanceRecord) o)
							.getMeasurements()) {
						Protocol p = papp.getProtocol();
						System.out.println(papp);
						Assert.assertNotNull(I5_ROOT_OBJECTS.valueOf(p.getCategory()));
						Assert.assertNotNull(p.getEndpoint());
						Assert.assertNotNull(p.getGuideline());
						Assert.assertNotNull(p.getGuideline().get(0));

						Assert.assertNotNull(papp.getReliability());

					}
					c++;
				}
				Assert.assertEquals(1, c);
			} catch (Exception x) {
				x.printStackTrace();
			}

			Iterator<Entry<String, eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document>> e = library
					.entrySet().iterator();
			while (e.hasNext()) {
				Entry<String, eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document> entry = e.next();
				if (entry.getValue().getContent().getAny() instanceof SUBSTANCE) {
					SUBSTANCE tm = (SUBSTANCE) entry.getValue().getContent().getAny();
					SUBSTANCE.ReferenceSubstance rs = tm.getReferenceSubstance();
					System.out.println(">>>\t" + rs.getReferenceSubstance());
				} else if (entry.getValue().getContent().getAny() instanceof FLEXIBLERECORDSubstanceComposition) {
					FLEXIBLERECORDSubstanceComposition tm = (FLEXIBLERECORDSubstanceComposition) entry.getValue()
							.getContent().getAny();
					System.out.println(">>>\t" + tm.getGeneralInformation().getName());
					/*
					 * } else if (entry.getValue().getContent().getAny()
					 * instanceof TESTMATERIALINFORMATION) {
					 * TESTMATERIALINFORMATION tm = (TESTMATERIALINFORMATION)
					 * entry.getValue().getContent().getAny();
					 * System.out.println(entry.getKey());
					 * System.out.println(tm.getName()); Composition c =
					 * tm.getComposition();
					 * System.out.println(c.getCompositionPurityOtherInformation
					 * ().getValue());
					 * System.out.println(c.getOtherCharacteristics().
					 * getTestMaterialForm().getValue()); String offset = "\t";
					 * for (eu.europa.echa.iuclid6.namespaces.
					 * test_material_information._2.TESTMATERIALINFORMATION.
					 * Composition.CompositionList.Entry i : c
					 * .getCompositionList().getEntry()) {
					 * System.out.println(offset + i.getUuid());
					 * System.out.println(offset + "REFERENCE\t" +
					 * i.getReferenceSubstance()); System.out.println(offset +
					 * i.getConcentration().getUpperValue());
					 * System.out.println(offset + i.getType().getValue());
					 * System.out.println(); } System.out.println();
					 */
				}
			}

			/*
			 * SubstanceRecord substance = new SubstanceRecord();
			 * r.parseDocuments(manifest, substance);
			 * Assert.assertNotNull(substance.getSubstanceUUID());
			 * Assert.assertNotNull(substance.getContent()); //
			 * //Assert.assertEquals(
			 * "IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734",
			 * substance.getSubstanceUUID());
			 * Assert.assertNotNull(substance.getReferenceSubstanceUUID());
			 */

		}
	}

	@Test
	public void test_i6z_5_endpointstudyrecords() throws Exception {
		String test = "net/idea/i6/_5/substance/i6z/f63698f5-6751-4bca-9ca8-8388de4fdea9.i6z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertNotNull(url);
		Assert.assertEquals(603, unmarshall_i6z(new File(url.getFile()), 603));
		// all ???
	}

	@Test
	public void test_i6z_5() throws Exception {
		String test = "net/idea/i6/_5/substance/i6z/306f1166-e1b1-4300-bade-8f3729c6c638.i6z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertNotNull(url);
		Assert.assertEquals(32, unmarshall_i6z(new File(url.getFile()), 32));
		// all 52
	}

	@Test
	public void test_i6z_5_internal() throws Exception {
		String test = "net/idea/i6/_5/substance/i6z/f63698f5-6751-4bca-9ca8-8388de4fdea9.i6z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertNotNull(url);
		try (I6ZReader<IStructureRecord> reader = new I6ZReader<>(new File(url.getFile()))) {
			while (reader.hasNext()) {
				IStructureRecord record = (IStructureRecord) reader.next();
				if (record instanceof SubstanceRecord) {
					
					if (((SubstanceRecord) record).getMeasurements() != null)
						System.out.println(((SubstanceRecord) record).getMeasurements());
					else
						System.out.println(((SubstanceRecord) record).toJSON(null));
				}

			}
		} catch (Exception x) {
			// x.printStackTrace();
		}
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
