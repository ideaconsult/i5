package net.idea.i5.io.substance.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Assert;
import net.idea.i5.io.I5DReader;
import net.idea.i5.io.I5ObjectVerifier;
import net.idea.i5.io.I5ObjectVerifier.I5_ROOT_OBJECTS;
import net.idea.i5.io.I5ZReader;
import net.idea.i5.io.UnsupportedI5RootObject;

import org.junit.Test;
import org.openscience.cdk.io.IChemObjectReaderErrorHandler;

import ambit2.base.data.Property;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.interfaces.IStructureRelation;

public class SubstanceTest {
	protected static Logger logger = Logger.getLogger(SubstanceTest.class.getName());
	
	@Test
	public void test_i5d_5() throws Exception {
		String test = "net/idea/i5/_5/substance/i5d/IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734_0.i5d";
		I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
		InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
		I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
		if (rootObject!=null) {
			in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			test_i5d(in,rootObject.getContextPath());
		} else throw new UnsupportedI5RootObject();
	}	
	
	@Test
	public void test_i5d_4() throws Exception {
		String test = "net/idea/i5/_4/substance/i5z/formaldehyde.i5d";
		I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
		URL url =  SubstanceTest.class.getClassLoader().getResource(test);
		System.out.println(url.getFile());
		I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(new FileInputStream(new File(url.getFile())));
		if (rootObject!=null) {
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			test_i5d(in,rootObject.getContextPath());
		} else throw new UnsupportedI5RootObject();
	}	
	
	protected void test_i5d(InputStream in,String contextPath) throws Exception {

		Assert.assertNotNull(in);
		int count = 0;
		try {
			I5DReader reader = new I5DReader(in,contextPath);
			reader.setErrorHandler(new IChemObjectReaderErrorHandler() {
				
				public void handleError(String message, int row, int colStart, int colEnd,
						Exception exception) {
				}
				
				public void handleError(String message, int row, int colStart, int colEnd) {
				}
				
				public void handleError(String message, Exception exception) {
						exception.printStackTrace();
				}
				
				public void handleError(String message) {
				}
			});
			while (reader.hasNext()) {
				count++;
				Object object = reader.next();
				IStructureRecord record = reader.nextRecord();
				System.out.println(object);
				System.out.println(record);
				for (Property p : record.getProperties()) {
					System.out.print(p.getName());
					System.out.print("\t");
					System.out.print(p.getTitle());
					System.out.print("\t");
					System.out.println(record.getProperty(p));
				}
				Assert.assertTrue(record instanceof SubstanceRecord);
				for (IStructureRelation relation : ((SubstanceRecord)record).getRelatedStructures()) {
					System.out.print(relation.getRelationType());
					System.out.println(relation.getRelation());
					for (IStructureRecord rel : relation.getStructures()) {
						System.out.println(rel.getContent());
						System.out.println(rel.getProperty(Property.getI5UUIDInstance()));
					}
					System.out.println();
				}
			}
		} finally{
			in.close();
		}
		Assert.assertEquals(1,count);
	}
	
	@Test
	public void test_i5z_5() throws Exception {
		String test = "net/idea/i5/_5/substance/i5z/IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734.i5z";
		Assert.assertEquals(7,unmarshall_i5z(SubstanceTest.class.getClassLoader().getResourceAsStream(test)));		
	}
	@Test
	public void test_i5z_4() throws Exception {
		String test = "net/idea/i5/_4/substance/i5z/formaldehyde.i5z";
		Assert.assertEquals(1,unmarshall_i5z(SubstanceTest.class.getClassLoader().getResourceAsStream(test)));		
	}
	@Test
	public void test_i5z_0() throws Exception {
		//ReferenceSubstance support only!
		String test = "net/idea/i5/_0/substance/i5z/RefSub_030913110311.i5z";
		Assert.assertEquals(10,unmarshall_i5z(SubstanceTest.class.getClassLoader().getResourceAsStream(test)));		
	}
	
	protected int unmarshall_i5z(InputStream in) throws Exception {
		Assert.assertNotNull(in);
		FileOutputStream output = null; 
		try {
			I5ZReader reader = new I5ZReader(in) ;
			reader.setErrorHandler(new IChemObjectReaderErrorHandler() {
				public void handleError(String message, int row, int colStart, int colEnd,
						Exception exception) {
				}
				public void handleError(String message, int row, int colStart, int colEnd) {
				}
				public void handleError(String message, Exception exception) {
					logger.log(Level.SEVERE,message,exception);
				}
				public void handleError(String message) {
					logger.log(Level.SEVERE,message);
				}
			});
			int count = 0;
			while (reader.hasNext()) {
				Object next = reader.nextRecord();
				logger.info(next==null?"null entry":next.toString());
				count++;
			}
			return count;
		} catch (Exception x) {
			throw x;
		} finally {
	        if(output != null) output.close();
            if (in!=null) in.close();
		}	
	}
	
	
}
