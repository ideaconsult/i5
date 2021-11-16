package net.idea.i5.cli.test;

import java.io.File;
import java.util.List;
import java.util.logging.Level;

import net.idea.i5.cli.ContainerClient;
import net.idea.iuclid.cli.Container;
import net.idea.opentox.cli.IIdentifiableResource;
import net.idea.opentox.cli.id.IIdentifier;
import net.idea.opentox.cli.id.Identifier;

import org.junit.Assert;
import org.junit.Test;

public class ContainerClientTest extends ClientTest {

	@Test
	public void test() throws Exception {
		long now = System.currentTimeMillis();
		File file = null;
		try {
			if (i5.login(PropertiesUtil.getUsername(),
					PropertiesUtil.getPassword())) {
				ContainerClient cli = i5.getContainerClient();

				IIdentifier identifier = new Identifier(
						"IUC5-6d15f057-c651-4399-9fb9-1dd7d39ee6fa/0");
				// String identifier =
				// "IUC4-567539b9-f1fc-3b07-a5ce-688fbe66f1b5/0";
				List<IIdentifiableResource<IIdentifier>> content = cli
						.get(identifier);
				// ("IUC4-7388635d-6cce-3f32-acab-6b081221b103/0"); linalool
				// ("IUC5-6d15f057-c651-4399-9fb9-1dd7d39ee6fa/0");

				Assert.assertNotNull(content);
				Assert.assertEquals(1, content.size());
				Assert.assertEquals(identifier, content.get(0)
						.getResourceIdentifier());
				Assert.assertTrue(content.get(0) instanceof Container);
				file = ((Container) content.get(0)).getIpzarchive();
				Assert.assertTrue(file.exists());
				unmarshall_i5z(file, -1);
			}
		} catch (Exception x) {
			throw x;
		} finally {
			try {
				i5.logout();
			} catch (Exception x) {
			}
			try {
				file.delete();
			} catch (Exception x) {
			}
			logger.log(Level.INFO,
					String.format("%s ms", (System.currentTimeMillis() - now)));
		}
	}

}