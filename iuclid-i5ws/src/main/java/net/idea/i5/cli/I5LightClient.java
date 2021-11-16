package net.idea.i5.cli;

import org.apache.http.HttpRequest;

import net.idea.iuclid.cli.IUCLIDLightClient;
import net.idea.opentox.cli.ApplicationClient;

public class I5LightClient extends ApplicationClient<String> implements IUCLIDLightClient {
	protected String baseURL;

	public I5LightClient(String baseURL) {
		this.baseURL = baseURL;
	}

	@Override
	protected void token2header(HttpRequest request, String token) {
	}

	@Override
	public boolean login(String username, String password) throws Exception {
		try {
			ssoToken = getSessionClient().login(username, password);
			return ssoToken != null;
		} catch (Exception x) {
			throw x;
		} finally {

		}
	}

	@Override
	public void logout() throws Exception {
		try {
			if (ssoToken != null)
				getSessionClient().logout(ssoToken);
		} catch (Exception x) {
			throw x;
		}
	}

	public SessionClient getSessionClient() {
		return new SessionClient(getHttpClient(), baseURL);
	}

	public ContainerClient getContainerClient() {
		return new ContainerClient(getHttpClient(), baseURL, ssoToken);
	}

	public QueryToolClient getQueryToolClient() {
		return new QueryToolClient(getHttpClient(), baseURL, ssoToken);
	}

}
