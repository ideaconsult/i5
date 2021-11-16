package net.idea.i6.cli;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.opentox.rest.RestException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import net.idea.iuclid.cli.Container;
import net.idea.iuclid.cli.IQueryToolClient;
import net.idea.iuclid.cli.IUCLIDAbstractClient;
import net.idea.opentox.cli.IIdentifiableResource;
import net.idea.opentox.cli.id.IIdentifier;
import net.idea.opentox.cli.id.Identifier;

public class I6QueryToolClient extends IUCLIDAbstractClient<I6Credentials> implements IQueryToolClient<I6Query> {

	public I6QueryToolClient(HttpClient httpclient, String baseURL, I6Credentials token) {
		super(httpclient, baseURL, token);
	}

	@Override
	public List<IIdentifiableResource<IIdentifier>> executeQuery(I6Query queryID, String... params)
			throws RestException, IOException {
		return getByIdentifier(queryID, queryID.toString(), params);
	}

	@Override
	protected List<IIdentifiableResource<IIdentifier>> get(IIdentifier url, String mediaType, String... params)
			throws RestException, IOException {
		return null;
	}

	@Override
	protected List<IIdentifiableResource<IIdentifier>> getByIdentifier(IIdentifier queryID, String queryURI,
			String... params) throws RestException, IOException {

		HttpGet get = new HttpGet(String.format("%s%s", baseURL, queryURI));
		get.addHeader("Accept", I6LightClient.MediaTypeI6Doc);
		get.addHeader("Content-type", I6LightClient.MediaTypeI6Doc);
		logger.log(Level.INFO, get.getURI().toString());
		if (headers != null)
			for (Header header : headers)
				get.addHeader(header);
		HttpResponse response = getHttpClient().execute(get);
		try (InputStream in = response.getEntity().getContent()) {
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				return processPayload(in, queryID.toString());

			} else
				throw new RestException(response.getStatusLine().getStatusCode(),
						response.getStatusLine().getReasonPhrase());
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage());
			throw x;
		}

	}

	/**
	 * <pre>
	{
		"limit": 10,
		"totalCount": 1,
		"results": [{
			"uri": "iuclid6:/0/SUBSTANCE/IUC5-a525a5ae-f129-4df8-a043-8fb1db490d62/SUBSTANCE/IUC5-a525a5ae-f129-4df8-a043-8fb1db490d62",
			"representation": null
		}]
	}
	 * </pre>
	 */
	@Override
	public List<IIdentifiableResource<IIdentifier>> processPayload(InputStream in, String mediaType)
			throws RestException, IOException {

		List<IIdentifiableResource<IIdentifier>> list = new ArrayList<IIdentifiableResource<IIdentifier>>();
		ObjectMapper m = new ObjectMapper();
		JsonNode node = m.readTree(in);
		//System.out.println(node);
		if (node.get("totalCount").asInt()==0) throw new RestException(HttpStatus.SC_NOT_FOUND,"Not found");
		ArrayNode results = (ArrayNode) node.get("results");
		for (JsonNode result : results) {
			JsonNode rep = result.get("representation");
			if (!"SUBSTANCE".equals(rep.get("definition").asText()))
				continue;
			list.add(new Container(new Identifier(rep.get("key").asText()),null,result.asText()));
		}
		
		//File tmpFile = File.createTempFile("i6ws_", ".json");
		//net.idea.loom.common.DownloadTool.download(in, tmpFile);
		//logger.log(Level.INFO, tmpFile.getAbsolutePath());
		return list;
	}
}
