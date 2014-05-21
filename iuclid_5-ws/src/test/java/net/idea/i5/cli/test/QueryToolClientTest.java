package net.idea.i5.cli.test;

import java.io.File;
import java.util.List;
import java.util.logging.Level;

import junit.framework.Assert;
import net.idea.i5.cli.Container;
import net.idea.i5.cli.ContainerClient;
import net.idea.i5.cli.QueryToolClient;
import net.idea.i5.cli.QueryToolClient.PredefinedQuery;
import net.idea.opentox.cli.IIdentifiableResource;

import org.junit.Test;



public class QueryToolClientTest  extends ClientTest {
	
	@Test
	public void testUUID() throws Exception {
		long now = System.currentTimeMillis();
		try {
			if (i5.login(PropertiesUtil.getUsername(),PropertiesUtil.getPassword())) {
				QueryToolClient cli = i5.getQueryToolClient();
				ContainerClient ccli = i5.getContainerClient();				
				String[] identifier = {"IUC4-b128a38e-a298-3e99-b74e-2cee846cffc3/0","IUC4-79206c66-7a3a-3d66-a670-e1a693dc81cf/0"};
				List<IIdentifiableResource<String>> content = cli.executeQuery(PredefinedQuery.query_by_it_identifier,"IUCLID4","DSN 20");
				Assert.assertNotNull(content);
				Assert.assertEquals(2,content.size());
				int i = 0;
				for (String id : identifier)
					if (id.equals(content.get(0).getResourceIdentifier())) i++;
				Assert.assertEquals(1,i);
				Assert.assertTrue(content.get(0) instanceof Container);
				
				getContainer(ccli, content.get(0).getResourceIdentifier());
			}
		} catch (Exception x) {
			throw x;
		} finally {
			try {i5.logout();} catch (Exception x) {}
			System.out.println(System.currentTimeMillis()-now);
		}
	}
	
	@Test
	public void testCompTox() throws Exception {
		long now = System.currentTimeMillis();
		try {
			if (i5.login(PropertiesUtil.getUsername(),PropertiesUtil.getPassword())) {
				int expected = 3;
				QueryToolClient cli = i5.getQueryToolClient();
								
				String[] identifier = {"IUC5-a438545b-3c6c-403f-83e6-5cd2756d77d6/0",
									   "IUC5-eb8957ab-538b-48b6-a024-e9875fbd48b1/0",
									   "IUC5-541ccdba-0033-45ee-8136-406478deb0f4/0",
									   "IUC5-203e228e-7422-4f76-9068-82033f998d88/0"
									   };
				try {
					List<IIdentifiableResource<String>> content = cli.executeQuery(PredefinedQuery.query_by_it_identifier,"CompTox","Ambit Transfer");
					
					Assert.assertNotNull(content);
					for (int j=0; j < content.size(); j++) {
						System.out.println(content.get(j).getResourceIdentifier());
					}
					Assert.assertEquals(expected,content.size());
					int i = 0;
					
					for (int j=0; j < content.size(); j++) {
						boolean found = false;
						for (String id : identifier) 
							if (id.equals(content.get(j).getResourceIdentifier())) { found = true; break;}
						if (!found)
							System.err.println(content.get(j).getResourceIdentifier());
						else 
							i++;
					}	
					Assert.assertEquals(expected,i);
					
					for (int j=0; j < content.size();  j++) {
						Assert.assertTrue(content.get(j) instanceof Container);
						ContainerClient ccli = i5.getContainerClient();
						try {
							getCompToxContainer(ccli, content.get(j).getResourceIdentifier());
						} catch (Exception x) {
							logger.log(Level.SEVERE,content.get(j).getResourceIdentifier(),x);
						}
					}	
				} catch (Exception x) {
					System.err.println(x.getMessage());
				}
			}
		} catch (Exception x) {
			throw x;
		} finally {
			try {i5.logout();} catch (Exception x) {}
			try {i5.getHttpClient().getConnectionManager().shutdown();} catch (Exception x) {}
			System.out.println(System.currentTimeMillis()-now);
		}
	}
	
	protected void getCompToxContainer(ContainerClient cli,String identifier) throws Exception {
		File file = null;
		List<IIdentifiableResource<String>> content = cli.get(identifier);
		Assert.assertNotNull(content);
		System.out.println("Identifier "+identifier);
		System.out.println("Size "+content.size());
		Assert.assertNotNull(content);
//		Assert.assertEquals(1,content.size());
		//Assert.assertEquals(identifier,content.get(0).getResourceIdentifier());
		//Assert.assertTrue(content.get(0) instanceof Container);
		
		for (int i=0; i < content.size();i++) {
			file = ((Container)content.get(i)).getIpzarchive();
			Assert.assertTrue(file.exists());
			//Assert.assertTrue(file.length()>0);
			System.out.println(file);
			try {
				unmarshall_i5z(file,-1);
			} catch (Exception x) {
				x.printStackTrace();
			}
			file.deleteOnExit();
		}
		
	}
	
	protected void getContainer(ContainerClient cli,String identifier) throws Exception {
		File file = null;
		List<IIdentifiableResource<String>> content = cli.get(identifier);
		Assert.assertNotNull(content);
		Assert.assertEquals(1,content.size());
		Assert.assertEquals(identifier,content.get(0).getResourceIdentifier());
		Assert.assertTrue(content.get(0) instanceof Container);
		file = ((Container)content.get(0)).getIpzarchive();
		Assert.assertTrue(file.exists());
		unmarshall_i5z(file,-1);
	}
	
}