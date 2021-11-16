package net.idea.iuclid.cli;

public interface IUCLIDLightClient {
	boolean login(String username, String password) throws Exception;

	void logout() throws Exception;

	IContainerClient getContainerClient();

	IQueryToolClient getQueryToolClient();

	void close() throws Exception;
}
