package net.idea.i6.io.substance.test;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import org.openscience.cdk.io.IChemObjectReaderErrorHandler;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.relation.composition.CompositionRelation;
import junit.framework.Assert;
import net.idea.i5.io.QASettings;
import net.idea.i6.io.I6ZReader;

public class SubstanceTest {
	protected static Logger logger = Logger.getLogger(SubstanceTest.class
			.getName());
	@Test
	public void test_i6z_2() throws Exception {
		String test = "net/idea/i6/_2/substance/i6z/IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734.i6z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertNotNull(url);
		Assert.assertEquals(602, unmarshall_i6z(new File(url.getFile()), 602));
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
				}

				public void handleError(String message, int row, int colStart, int colEnd) {
				}

				public void handleError(String message, Exception exception) {
					logger.log(Level.SEVERE, message);
				}

				public void handleError(String message) {
					logger.log(Level.SEVERE, message);
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
