package net.idea.i5.cli;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import net.idea.opentox.cli.IIdentifiableResource;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.opentox.rest.RestException;

public class QueryToolClient extends I5AbstractClient{
	public enum PredefinedQuery {
		query_by_it_identifier
	}
	public QueryToolClient(HttpClient httpclient, String baseURL, String token) {
		super(httpclient, baseURL, token);
	}

	public List<IIdentifiableResource<String>> executeQuery(PredefinedQuery queryID,String... params) throws RestException,	IOException {
		return getByIdentifier(queryID.name(), "ExecuteQuery", params);
	}
	public List<IIdentifiableResource<String>> countQuery(PredefinedQuery queryID,String... params) throws RestException,IOException {
		return getByIdentifier(queryID.name(), "CountQuery", params);
	}	
	@Override
	protected List<IIdentifiableResource<String>> getByIdentifier(String queryID,String queryType, String... params) throws RestException,
			IOException {
		String xml = String.format(loadXML(String.format("net/idea/i5/cli/querytool/%s.xml",queryID)),token,params[0],params[1]);
		HttpEntity content = new StringEntity(xml,"UTF-8");
		HttpPost httpPOST = new HttpPost(baseURL+"/QueryToolEngine");
		if (headers!=null) for (Header header : headers) httpPOST.addHeader(header);
		httpPOST.addHeader("Accept-Encoding","gzip,deflate");
		httpPOST.addHeader("Content-type",
				String.format("application/soap+xml;charset=UTF-8;action=\"http://echa.europa.eu/iuclid5/i5webservice/service/QueryToolEngine/%s\"",queryType));
		httpPOST.setEntity(content);

		InputStream in = null;
		try {
			HttpResponse response = getHttpClient().execute(httpPOST);
			HttpEntity entity  = response.getEntity();
			in = entity.getContent();
			if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK) {
				return processPayload(in,queryID);

			} else if (response.getStatusLine().getStatusCode()== HttpStatus.SC_NOT_FOUND) {	
				return Collections.emptyList();
			} else if (response.getStatusLine().getStatusCode()== HttpStatus.SC_INTERNAL_SERVER_ERROR) { //AxisFault
				return processFault(in,queryType);
			} else throw new RestException(response.getStatusLine().getStatusCode(),response.getStatusLine().getReasonPhrase());
		
		} finally {
			try {if (in != null) in.close();} catch (Exception x) {}
		}
	
	}
	private enum supported_tag {
		executeQueryExpressionResponse,
		queryResult,
		items,
		QueryResultItem,
		values,
		QueryResultValue,
		countQueryExpressionResponse,
		count
		
	}

	@Override
	protected List<IIdentifiableResource<String>> processPayload(
			InputStream in, String identifier) throws RestException, IOException {
		List<IIdentifiableResource<String>> list = new ArrayList<IIdentifiableResource<String>>();
		XMLStreamReader reader = null;
    	try {
    		XMLInputFactory factory = XMLInputFactory.newInstance();
    		factory.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,Boolean.TRUE);
    		reader =   factory.createXMLStreamReader(in);
    		boolean queryResultItem = false;
    		while (reader.hasNext()) {
  		    	int type = reader.next();
  		    	switch (type) {
  		    	
 	            case XMLStreamConstants.START_ELEMENT: {
	            	String tag = reader.getName().getLocalPart();
	            	String parentTag = tags.size()==0?null:tags.peek();
	            	//stats
	            	tags.push(tag);	       
	            	try {
	            		supported_tag stag = supported_tag.valueOf(tag);
	            		switch (stag) {
	            		case QueryResultItem: {
	            			queryResultItem = true;
	            			String indexPk = reader.getAttributeValue("http://echa.europa.eu/schemas/iuclid5/i5webservice/types/", "indexPk");
	                		list.add(new Container(indexPk,null));
	            			break;
	            		}
	            		}
	            	} catch (Exception x) {}

 	            	break;
 	            } 
 	            case XMLStreamConstants.END_DOCUMENT: {
	            	break;
	            }
	            case XMLStreamConstants.END_ELEMENT: {
	            	String tag = tags.pop();
	            	try {
	            		supported_tag stag = supported_tag.valueOf(tag);
	            		switch (stag) {
	            		case QueryResultItem: {
	            			queryResultItem = false;
	            			break;
	            		}
	            		}
	            	} catch (Exception x) {}
	            	break;
	            }
  		    	}
    		}
	    	return list;
    	} catch (Exception x) {
    		x.printStackTrace();
    		throw new RestException(HttpStatus.SC_BAD_REQUEST);
    	} finally {
    		try {reader.close();} catch (Exception x) {}
    	}
	}
}
