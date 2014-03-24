package net.idea.i5.cli;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.opentox.rest.RestException;

import net.idea.opentox.cli.AbstractClient;
import net.idea.opentox.cli.IIdentifiableResource;

public class SessionClient extends AbstractClient<String, IIdentifiableResource<String>> {

	public SessionClient(HttpClient httpclient) {
		super(httpclient);
	}
	
	@Override
	protected List<IIdentifiableResource<String>> get(String url,
			String mediaType, String... params) throws RestException,
			IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
