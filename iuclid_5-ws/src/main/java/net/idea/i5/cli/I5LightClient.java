package net.idea.i5.cli;

import net.idea.opentox.cli.ApplicationClient;

import org.apache.http.HttpRequest;

public class I5LightClient extends ApplicationClient<String> {

	@Override
	protected void token2header(HttpRequest request, String token) {
		
		
	}

	@Override
	public boolean login(String username, String password) throws Exception {

		return false;
	}

	@Override
	public void logout() throws Exception {

		
	}
	
	public SessionClient getDatasetClient() {
		return new SessionClient(getHttpClient());
	}

	public ContainerClient getContainerClient() {
		return new ContainerClient(getHttpClient(),"http://192.168.1.13:8080/i5wsruntime/services","AF1D1A8DCA39DA9F8EB09D47CB76ABFFC1464FAE");
	}
}
