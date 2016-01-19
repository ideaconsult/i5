package net.idea.i5.io.substance.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Assert;
import net.idea.i5.io.I5DReader;
import net.idea.i5.io.I5ObjectVerifier;
import net.idea.i5.io.I5ZReader;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QASettings;
import net.idea.i5.io.UnsupportedI5RootObject;

import org.junit.Test;
import org.openscience.cdk.io.IChemObjectReaderErrorHandler;

import ambit2.base.data.Property;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import ambit2.base.interfaces.IStructureRelation;
import ambit2.base.relation.composition.CompositionRelation;

/*
 * http://stackoverflow.com/questions/6285995/jaxb-generating-classes-for-two-xsds-which-share-a-common-xsd
 */
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
	public void test_i5d_5_acutetox() throws Exception {
		String[] tox = new String[] {
				"acutetox/IUC5-69f39568-46e4-45ba-94f6-f0070482f8f2_0.i5d",
				"IUC4-0ea9b324-e60b-3649-b7f5-d17c2774d96d_0.i5d",
				"IUC4-ae64fc3b-22a4-3173-9362-9cce1ff622ae_0.i5d",
				"IUC4-3739ad75-f8a9-36c5-8e39-df46e4ea061b_0.i5d",
				"IUC4-03745268-897c-393a-bfb4-0295a48b50e0_0.i5d",
				"IUC4-5041bd66-f808-3291-bb2a-fb41c5d118b8_0.i5d"
			};
		for (String f : tox) {

			String test = String.format("net/idea/i5/_5/substance/i5d/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			Assert.assertNotNull(in);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}
	
	@Test
	public void test_i5d_5_rtd_oral() throws Exception {

		String[] pc = new String[] {
				"IUC4-953e0e9f-c417-3bc3-999c-011f4f097b4d_0.i5d"
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/rtd_oral/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}
	@Test
	public void test_i5d_5_repro() throws Exception {

		String[] pc = new String[] {
				"IUC4-dbbac947-303e-3a99-be66-9b39d429a138_0.i5d"
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/repro/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}
	
	@Test
	public void test_i5d_skinsens() throws Exception {

		String[] pc = new String[] {
				"IUC4-aa3469aa-5a18-3b40-a217-ea5a468aebc5_0.i5d"
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/skinsens/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}
	
	@Test
	public void test_i5d_gentox_invitro() throws Exception {

		String[] pc = new String[] {
				"IUC4-2dc334eb-c0a6-36bd-8412-a6b20d80d912_0.i5d"
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/gentox_invitro/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}	
	
	@Test
	public void test_i5d_skinirritation() throws Exception {

		String[] pc = new String[] {
				"IUC4-de71a66c-3f4d-3439-ac91-1ddbdf461793_0.i5d"
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/skinirritation/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}
	
	
	@Test
	public void test_i5d_5_physchem() throws Exception {

		String[] pc = new String[] {
				"IUC4-2f64ab27-d2be-352e-b9d8-4f0274fd6633_0.i5d",
				"IUC4-d07a337c-8a51-383d-9f24-1d648139fc3a_0.i5d",
				"IUC4-ad5ffc45-8cc4-3b97-a9e4-98c9780e4257_0.i5d"
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/physchem/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			Assert.assertNotNull(in);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}
	
	@Test
	public void test_i5d_5_meltingpoint() throws Exception {

		String[] pc = new String[] {
				"IUC4-82dbd0ed-4c85-3bcc-b3a2-19822ccd099b_0.i5d"
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/melting/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}	
	
	
	@Test
	public void test_i5d_5_watersol() throws Exception {

		String[] pc = new String[] {
				"IUC4-05eb6a0b-c37d-3a08-a9a3-718494b352ef_0.i5d",
				"IUC4-57f71a91-361e-34bf-9a0c-4ab78d607605_0.i5d"
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/watersol/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}	
	
	@Test
	public void test_i5d_5_phototrans() throws Exception {

		String[] pc = new String[] {
				"IUC4-14c2318c-52b5-33d6-bec8-c8d0f264d694_0.i5d",
				"IUC4-14c2318c-52b5-33d6-bec8-c8d0f264d694_0.i5d",
				"IUC4-742ff7d7-e742-354a-a776-24e17cb7a047_0.i5d",
				"IUC4-ef349381-6c6c-35fd-8f4c-29510542d266_0.i5d"
				
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/phototrans/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}		
	@Test
	public void test_i5d_5_biodegsoil() throws Exception {

		String[] pc = new String[] {
				"IUC4-86107d3d-828b-39e1-9d13-b97694826100_0.i5d",
				"IUC4-9bce7fc2-0470-3cf3-a1ce-dbd2f40d9591_0.i5d"
			};
		for (String f : pc) {

			String test = String.format("net/idea/i5/_5/substance/i5d/biodeg_soil/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}	
	
 	
	/*
>>>>>	net/idea/i5/_5/substance/i5z/IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734/IUC4-d5f14d83-b2b5-38ac-9f2a-8134ce000cc8_0.i5d
Endpoint	Short-term toxicity to fish, IUC4#1/Ch.4.1
Document UUID	IUC4-d5f14d83-b2b5-38ac-9f2a-8134ce000cc8/0
Substance UUID (company specific)	IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734/0
Substance description	formaldehyde (IUC4 DSN 52)
Guideline	according to	EU Method C.1 (Acute Toxicity for Fish)
Organism	302	Cyprinus carpio
Endpoint	926	LC50
Qualifier	null	null
Value	2	1976	h
	 */
	@Test
	public void test_i5d_5_fishtox() throws Exception {
		String[] fish = new String[] {
				"fish/IUC5-7b8d664f-5a95-4d41-901e-48767a427434_0.i5d"
				,"fish/IUC5-bdbfc124-346f-468a-bc74-a5f61f45db93_0.i5d"
			};
		for (String f : fish) {
			String test = String.format("net/idea/i5/_5/substance/i5d/%s",f);
			System.out.println("\n>>>>>\t"+test);
			I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
			if (rootObject!=null) {
				in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
				test_i5d(in,rootObject.getContextPath(),false);
			} else throw new UnsupportedI5RootObject();
		}
	}	
	

	
		@Test
		public void test_i5d_5_biodeg() throws Exception {
			String[] fish = new String[] {
					"IUC4-1d75f01c-3b2b-35f5-84f1-ce23e22b6c73_0.i5d"
				};
			for (String f : fish) {
				String test = String.format("net/idea/i5/_5/substance/i5d/biodeg/%s",f);
				System.out.println("\n>>>>>\t"+test);
				I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
				URL url = SubstanceTest.class.getClassLoader().getResource(test);
				File file = new File(url.getFile());
				System.out.println(file);
				Assert.assertTrue(file.exists());
				InputStream in = new FileInputStream(url.getFile());
				I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(in);
				in.close();
				if (rootObject!=null) {
					in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
					test_i5d(in,rootObject.getContextPath(),false);
				} else throw new UnsupportedI5RootObject();
			}
		}	
	 


	@Test
	public void test_i5d_4() throws Exception {
		String test = "net/idea/i5/_4/substance/i5z/formaldehyde.i5d";
		I5ObjectVerifier rootObjectVerifier = new I5ObjectVerifier();
		URL url =  SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertNotNull(url);
		Assert.assertNotNull(url.getFile());
		I5_ROOT_OBJECTS rootObject = rootObjectVerifier.process(new FileInputStream(new File(url.getFile())));
		if (rootObject!=null) {
			InputStream in = SubstanceTest.class.getClassLoader().getResourceAsStream(test);
			test_i5d(in,rootObject.getContextPath());
		} else throw new UnsupportedI5RootObject();
	}	
	
	
	protected void test_i5d(InputStream in,String contextPath) throws Exception {
		test_i5d(in, contextPath, true);
	}
	protected void test_i5d(InputStream in,String contextPath, boolean substance) throws Exception {

		Assert.assertNotNull(in);
		int count = 0;
		try {
			I5DReader reader = new I5DReader("test",in,contextPath,new QASettings());
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
				if (record==null) continue;
				for (Property p : record.getRecordProperties()) {
					System.out.print(p.getName());
					System.out.print("\t");
					System.out.print(p.getTitle());
					System.out.print("\t");
					System.out.println(record.getRecordProperty(p));
				}
				Assert.assertTrue(record instanceof SubstanceRecord);
				SubstanceRecord substanceRecord = ((SubstanceRecord)record);
				if (substance) {
					for (IStructureRelation relation : substanceRecord.getRelatedStructures()) {
						System.out.print(relation.getRelationType());
						System.out.println(relation.getRelation());
						
							System.out.println(relation.getFirstStructure().getContent());
							System.out.println(relation.getFirstStructure().getRecordProperty(Property.getI5UUIDInstance()));
							System.out.println(relation.getSecondStructure().getContent());
							System.out.println(relation.getSecondStructure().getRecordProperty(Property.getI5UUIDInstance()));						
						System.out.println();
					}
					System.out.println(substanceRecord.toJSON("http://localhost:8080/ambit2"));
					if (substanceRecord.getMeasurements()!=null)
						for (ProtocolApplication papp : substanceRecord.getMeasurements()) {
							System.out.println(papp.toString());
						}
					
				} else {
					Assert.assertNotNull(((SubstanceRecord)record).getSubstanceUUID());
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
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertEquals(404,unmarshall_i5z(new File(url.getFile()),404));		
	}
	
	@Test
	public void test_i5z_5_fishtox() throws Exception {

		String test = "net/idea/i5/_5/substance/i5z/IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734.i5z";
		//String test = "F:/nina/Ideaconsult/Projects/2013 - LRI AMBIT/AMBIT-LRI/IUCLID example for 4 endpoints.i5z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		//Assert.assertEquals(7,unmarshall_i5z(new File(test),25));
		Assert.assertEquals(404,unmarshall_i5z(new File(url.getFile()),404));
	}		
	@Test
	public void test_i5z_4() throws Exception {
		String test = "net/idea/i5/_4/substance/i5z/formaldehyde.i5z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertNotNull(url);
		File file = new File(url.getFile());
		Assert.assertTrue(file.exists());
		Assert.assertEquals(1,unmarshall_i5z(file,1));		
	}
	@Test
	public void test_i5z_0() throws Exception {
		//ReferenceSubstance support only!
		String test = "net/idea/i5/_0/substance/i5z/RefSub_030913110311.i5z";
		URL url = SubstanceTest.class.getClassLoader().getResource(test);
		Assert.assertEquals(10,unmarshall_i5z(new File(url.getFile()),10));		
	}
	@Test
	public void test_i5z_2016() throws Exception {

		String file = "F:/nina/Ideaconsult/Projects/ECHA_DISSEMINATION/echa_dissemination_i5z_export_files/5000/ECHA-9ea0077b-c4a1-4706-bf07-f14aba4fc4d4.i5z";
		Assert.assertEquals(1018,unmarshall_i5z(new File(file),1354));		
	}
	
	protected int unmarshall_i5z(File in,int nfiles) throws Exception {
		Assert.assertNotNull(in);
		FileOutputStream output = null; 
		I5ZReader reader = null;
		try {
			reader = new I5ZReader(in) ;
			QASettings qa = new QASettings(true);
			qa.setAll();
			Assert.assertEquals(nfiles,reader.getFiles().length);
			reader.setErrorHandler(new IChemObjectReaderErrorHandler() {
				public void handleError(String message, int row, int colStart, int colEnd,
						Exception exception) {
				}
				public void handleError(String message, int row, int colStart, int colEnd) {
				}
				public void handleError(String message, Exception exception) {
					logger.log(Level.SEVERE,message);
				}
				public void handleError(String message) {
					logger.log(Level.SEVERE,message);
				}
			});
			int count = 0;
			while (reader.hasNext()) {
				Object next = reader.nextRecord();
				if (next instanceof SubstanceRecord) {
					Assert.assertNotNull(((SubstanceRecord)next).getSubstanceUUID());
					if (((SubstanceRecord) next).getRelatedStructures()!=null) 
						for (CompositionRelation r : ((SubstanceRecord) next).getRelatedStructures()) {
							Assert.assertNotNull(r.getCompositionUUID());
						}
				} else if (next instanceof IStructureRecord) {
					System.out.println(((IStructureRecord)next).getContent());
				}
				logger.info(next==null?"null entry":next.toString());
				count++;
			}
			return count;
		} catch (Exception x) {
			throw x;
		} finally {
	        if(output != null) output.close();
            if (reader!=null) reader.close();
		}	
	}
	
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		if (args.length==0) System.exit(-1);
		File dir = new File(args[0]);
		System.out.println("Listing .i5z files in '"+dir.getAbsolutePath()+"'");
		int ok = 0;
		int err = 0;
		for (File file : dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".i5z");
			}
		})) {
			System.out.println("Reading "+file.getAbsolutePath());
			I5ZReader reader = null;
			long started = System.currentTimeMillis();
			int records = 0;
			try {
				reader = new I5ZReader(file);
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
					IStructureRecord record = reader.nextRecord();
					records++;
				}
				ok ++;
				//break;
			} catch (Exception x) {
				err ++;
				x.printStackTrace();
				//return;
			} finally {
				try { reader.close(); reader = null;} catch (Exception x) {}
				System.out.println(String.format("Read %d in %d msec",records,(System.currentTimeMillis()-started)));
			}
			
		}
		System.out.println(String.format("OK %d\tErrors %d\t%d",ok,err,System.currentTimeMillis()-now));
		System.exit(0);
	}
}
