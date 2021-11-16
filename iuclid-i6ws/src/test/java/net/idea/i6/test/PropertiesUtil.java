package net.idea.i6.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <code>PropertiesUtil</code> is helper class for properties values located in
 * iuclid5client.properties file.
 */
public class PropertiesUtil {

	private static Properties properties;
	private static Logger logger = Logger.getLogger(PropertiesUtil.class.getName());

	/** properties file name **/
	private final static String PROPERTIES_FILE = "net/idea/i6/cli/iuclid6client.properties";

	/** property key **/
	private final static String USERNAME_KEY = "i6.user";
	/** property key **/
	private final static String PASSWORD_KEY = "i6.pass";
	/** property key **/
	private final static String TARGET_KEY = "i6.server";

	/**
	 * Initialize properties
	 */
	static {
		properties = new Properties();
		properties.setProperty(USERNAME_KEY, "webservice");
		properties.setProperty(PASSWORD_KEY, "webservice");
		properties.setProperty(TARGET_KEY, "http://localhost:8080/iuclid6-ext/api/ext/v1/");
		try {
			logger.fine("Loading properties from configuration file");
			InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE);

			if (inputStream == null) {
				logger.info("Configuration file iuclid6client.properties not found.");
				StringBuilder sb = new StringBuilder();
				sb.append("\nUsing default properties:\n");
				Set<Object> prpetiesKeys = properties.keySet();
				for (Object key : prpetiesKeys) {
					sb.append("          ");
					sb.append(key);
					sb.append("=");
					sb.append(properties.getProperty(key.toString()));
					sb.append("\n");
				}
				logger.info(sb.toString());
			} else {
				properties.load(inputStream);
			}
		} catch (IOException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	/**
	 * 
	 * @return the username for iuclid5 {@link SessionEngine} service
	 */
	public static String getUsername() {
		return properties.getProperty(USERNAME_KEY);
	}

	/**
	 * 
	 * @return the password for iuclid5 {@link SessionEngine} service
	 */
	public static String getPassword() {
		return properties.getProperty(PASSWORD_KEY);
	}

	/**
	 * 
	 * @return the target url for iuclid5 services
	 */
	public static String getTarget() {
		return properties.getProperty(TARGET_KEY);
	}

}
