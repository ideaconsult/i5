package net.idea.i6.cli;

import java.io.InputStream;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicHeader;

import net.idea.iuclid.cli.IContainerClient;
import net.idea.iuclid.cli.IQueryToolClient;
import net.idea.iuclid.cli.IUCLIDLightClient;
import net.idea.opentox.cli.ApplicationClient;

public class I6LightClient extends ApplicationClient<I6Credentials> implements IUCLIDLightClient {

	final static String MediaTypeI6Doc = "application/vnd.iuclid6.ext+json;type=iuclid6.Document";
	final static String MediaTypeI6Job = "application/vnd.iuclid6.ext+json; type=iuclid6.Iuclid6Job";
	final static String MediaTypeI6Export = "application/vnd.iuclid6.ext+json; type=iuclid6.FullExport";

	protected String baseURL;

	public I6LightClient(String baseURL) {
		this.baseURL = baseURL;
	}

	@Override
	protected void token2header(HttpRequest request, I6Credentials token) {
		if (token != null) {
			request.addHeader("iuclid6-user", token.getUser());
			request.addHeader("iuclid6-pass", token.getPass());
		}
	}

	/**
	 * IUCLID6 REST services do not have "session"
	 */
	@Override
	public boolean login(String username, String password) throws Exception {
		if (ssoToken == null)
			ssoToken = new I6Credentials(username, password);
		else {
			ssoToken.setUser(username);
			ssoToken.setPass(password);
		}
		return username != null && password != null;
	}

	public boolean ping(String username, String password) throws Exception {
		if (login(username, password)) {
			HttpGet get = new HttpGet(String.format("%s/query/iuclid6/bySubstance", baseURL));
			token2header(get, ssoToken);
			try {
				HttpResponse response = getHttpClient().execute(get);
				int statuscode = response.getStatusLine().getStatusCode();
				try (InputStream in = response.getEntity().getContent()) {

				}
				if (HttpStatus.SC_UNAUTHORIZED == statuscode || HttpStatus.SC_FORBIDDEN == statuscode)
					return false;
				if (HttpStatus.SC_OK == statuscode || HttpStatus.SC_NOT_FOUND == statuscode
						|| HttpStatus.SC_BAD_REQUEST == statuscode)
					return true;

				throw new Exception(response.getStatusLine().toString());
			} catch (Exception x) {
				throw x;
			}

		} else
			return false;

	}

	@Override
	public void logout() throws Exception {

	}

	public IContainerClient getContainerClient() {
		I6ContainerClient cli = new I6ContainerClient(getHttpClient(), baseURL, ssoToken);
		cli.setHeaders(new Header[] { new BasicHeader("iuclid6-user", ssoToken.getUser()),
				new BasicHeader("iuclid6-pass", ssoToken.getPass()) });
		return cli;
	}

	public IQueryToolClient getQueryToolClient() {
		return new I6QueryToolClient(getHttpClient(), baseURL, ssoToken);
	}

}

class I6Credentials {
	public I6Credentials(String user, String pass) {
		setUser(user);
		setPass(pass);
	}

	protected String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	protected String pass;
}
