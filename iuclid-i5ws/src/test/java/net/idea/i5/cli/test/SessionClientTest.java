package net.idea.i5.cli.test;


import org.junit.Assert;
import org.junit.Test;

import net.idea.i5.cli.SessionClient;

public class SessionClientTest extends ClientTest {

	@Test
	public void test() throws Exception {
		SessionClient cli = i5.getSessionClient();
		String token = null;
		long now = System.currentTimeMillis();
		try {
			token = cli.login(PropertiesUtil.getUsername(),
					PropertiesUtil.getPassword());
			Assert.assertNotNull(token);
		} catch (Exception x) {
			throw x;
		} finally {
			try {
				cli.logout(token);
			} catch (Exception x) {
			}
			System.out.println(System.currentTimeMillis() - now);
		}
	}

	@Test
	public void testEncryptPassword() throws Exception {
		System.out.println(SessionClient.encryptPassword(PropertiesUtil
				.getPassword()));
	}
}
