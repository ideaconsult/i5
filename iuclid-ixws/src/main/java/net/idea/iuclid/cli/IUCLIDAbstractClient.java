package net.idea.iuclid.cli;

import org.apache.http.client.HttpClient;

import net.idea.opentox.cli.AbstractClient;
import net.idea.opentox.cli.IIdentifiableResource;
import net.idea.opentox.cli.id.IIdentifier;

public abstract class IUCLIDAbstractClient<TOKEN>
		extends AbstractClient<IIdentifier, IIdentifiableResource<IIdentifier>> {
	protected String baseURL;
	protected TOKEN token;

	public IUCLIDAbstractClient(HttpClient httpclient, String baseURL, TOKEN token) {
		super(httpclient);
		this.baseURL = baseURL;
		this.token = token;
	}
}
