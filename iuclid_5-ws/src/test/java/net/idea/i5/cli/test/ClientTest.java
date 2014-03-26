package net.idea.i5.cli.test;

import java.util.logging.Logger;

import net.idea.i5.cli.I5LightClient;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ClientTest {
	protected static Logger logger = Logger.getLogger(ClientTest.class.getName());
	static I5LightClient i5 ;
	@BeforeClass
	public static void init() throws Exception {
		i5 = new I5LightClient(PropertiesUtil.getTarget());
	}
	
	@AfterClass
	public static void done() throws Exception {
		i5.close();
	}
}
