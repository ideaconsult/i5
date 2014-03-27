package net.idea.i5.cli.test;

import java.io.File;
import java.util.List;

import junit.framework.Assert;
import net.idea.i5.cli.Container;
import net.idea.i5.cli.ContainerClient;
import net.idea.i5.cli.QueryToolClient;
import net.idea.i5.cli.QueryToolClient.PredefinedQuery;
import net.idea.opentox.cli.IIdentifiableResource;

import org.junit.Test;



public class QueryToolClientTest  extends ClientTest {
	
	@Test
	public void test() throws Exception {
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