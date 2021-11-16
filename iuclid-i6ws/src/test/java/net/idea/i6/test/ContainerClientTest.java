package net.idea.i6.test;

import java.io.File;
import java.util.List;
import java.util.logging.Level;

import org.junit.Assert;
import org.junit.Test;

import net.idea.iuclid.cli.Container;
import net.idea.iuclid.cli.IContainerClient;
import net.idea.opentox.cli.IIdentifiableResource;
import net.idea.opentox.cli.id.IIdentifier;
import net.idea.opentox.cli.id.Identifier;

public class ContainerClientTest extends ClientTest {

	@Test
	public void test() throws Exception {
		long now = System.currentTimeMillis();
		File file = null;
		try {
			if (i6.login(PropertiesUtil.getUsername(), PropertiesUtil.getPassword())) {
				IContainerClient cli = i6.getContainerClient();

				IIdentifier identifier = new Identifier("IUC4-efdb21bb-e79f-3286-a988-b6f6944d3734");
				List<IIdentifiableResource<IIdentifier>> content = cli.get(identifier);

				Assert.assertNotNull(content);
				Assert.assertEquals(1, content.size());
				Assert.assertEquals(identifier, content.get(0).getResourceIdentifier());
				Assert.assertTrue(content.get(0) instanceof Container);
				file = ((Container) content.get(0)).getIpzarchive();
				Assert.assertTrue(file.exists());
				unmarshall_i6z(file, -1);
			}
		} catch (Exception x) {
			throw x;
		} finally {
			try {
				i6.logout();
			} catch (Exception x) {
			}
			try {
				file.delete();
			} catch (Exception x) {
			}
			logger.log(Level.INFO, String.format("%s ms", (System.currentTimeMillis() - now)));
		}
	}

}