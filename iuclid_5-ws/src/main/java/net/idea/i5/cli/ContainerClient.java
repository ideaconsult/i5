package net.idea.i5.cli;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import net.idea.loom.common.DownloadTool;
import net.idea.opentox.cli.AbstractClient;
import net.idea.opentox.cli.IIdentifiableResource;

import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.opentox.rest.RestException;

public class ContainerClient extends AbstractClient<String, IIdentifiableResource<String>> {
	protected Stack<String> tags = new Stack<String>();
	protected String baseURL;
	protected String token;
	
	public ContainerClient(HttpClient httpclient,String baseURL,String token) {
		super(httpclient);
		this.baseURL = baseURL;
		this.token = token;
	}
	
	@Override
	protected List<IIdentifiableResource<String>> getByIdentifier(String identifier,
			String mediaType, String... params) throws RestException,
			IOException {
		String xml = String.format(loadXML("net/idea/i5/cli/container/request.xml"),token,identifier);
		HttpEntity content = new StringEntity(xml,"UTF-8");
		HttpPost httpPOST = new HttpPost(baseURL+"/ContainerEngine");
		if (headers!=null) for (Header header : headers) httpPOST.addHeader(header);
		httpPOST.addHeader("Accept-Encoding","gzip,deflate");
		httpPOST.addHeader("Content-type","application/soap+xml;charset=UTF-8;action=\"http://echa.europa.eu/iuclid5/i5webservice/service/ContainerEngine/DownloadContainer\"");
		httpPOST.setEntity(content);

		InputStream in = null;
		try {
			HttpResponse response = getHttpClient().execute(httpPOST);
			HttpEntity entity  = response.getEntity();
			in = entity.getContent();
			if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK) {
				return processPayload(in,identifier);

			} else if (response.getStatusLine().getStatusCode()== HttpStatus.SC_NOT_FOUND) {	
				return Collections.emptyList();
			} else if (response.getStatusLine().getStatusCode()== HttpStatus.SC_INTERNAL_SERVER_ERROR) { //AxisFault
				return processFault(in,mediaType);
			} else throw new RestException(response.getStatusLine().getStatusCode(),response.getStatusLine().getReasonPhrase());
		
		} finally {
			try {if (in != null) in.close();} catch (Exception x) {}
		}
	
	}
	private enum supported_tag {
		dataContent,
		resultReport,
		message
	}
	
	@Override
	protected List<IIdentifiableResource<String>> processPayload(
			InputStream in, String identifier) throws RestException, IOException {
		File tmpFile = File.createTempFile("i5ws_",".i5z");
		Writer dataContentFile = 	new OutputStreamWriter(new Base64OutputStream(
			      			new BufferedOutputStream(new FileOutputStream(tmpFile))
			      			,false
			   ));
		XMLStreamReader reader = null;
    	try {
    		XMLInputFactory factory = XMLInputFactory.newInstance();
    		factory.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,Boolean.TRUE);
    		reader =   factory.createXMLStreamReader(in);
    		boolean dataContent = false;
    		boolean resultReport = false;
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
	            		case dataContent: {
	            			dataContent = true;
	            			break;
	            		}
	            		case resultReport: {
	            			resultReport = true;
	            			String resultFlag = reader.getAttributeValue("http://echa.europa.eu/schemas/iuclid5/i5webservice/types/", "resultFlag");
	            			System.out.println(resultFlag);
	            			break;
	            		}
	            		case message : {
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
	            		case dataContent: {
	            			dataContent = false;
	            			break;
	            		}
	            		case resultReport: {
	            			resultReport = false;
	            			break;
	            		}
	            		}
	            	} catch (Exception x) {}
	            	break;
	            }
	            case XMLStreamConstants.CHARACTERS: {
	            	if (dataContent) {
	            		String value = reader.getText();
	            		dataContentFile.write(value.substring(0,reader.getTextLength()));
	            	} else if (resultReport) {
	            		String value = reader.getText();
	            		System.out.print(value.substring(0,reader.getTextLength()));
	            	}
	            	break;
	            }

  		    	}
    		}
    		List<IIdentifiableResource<String>> list = new ArrayList<IIdentifiableResource<String>>();
    		list.add(new Container(identifier,tmpFile));
	    	return list;
    	} catch (Exception x) {
    		x.printStackTrace();
    		throw new RestException(HttpStatus.SC_BAD_REQUEST);
    	} finally {
    		try {reader.close();} catch (Exception x) {}
    		try {dataContentFile.close();} catch (Exception x) {}
    	}
	}
	private enum fault_tag {
		Fault,
		Code,
		Reason,
		Detail,
		DocumentFault,
		SessionFault,
		errorMessage
	}
	protected List<IIdentifiableResource<String>> processFault(
			InputStream in, String mediaType) throws RestException, IOException {
		
		XMLStreamReader reader = null;
    	try {
    		XMLInputFactory factory = XMLInputFactory.newInstance();
    		factory.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,Boolean.TRUE);
    		reader =   factory.createXMLStreamReader(in);
    		boolean code = false;
    		boolean reason = false;
    		boolean details = false;
    		while (reader.hasNext()) {
  		    	int type = reader.next();
  		    	switch (type) {
  		    	
 	            case XMLStreamConstants.START_ELEMENT: {
	            	String tag = reader.getName().getLocalPart();
	            	//stats
	            	tags.push(tag);	       
	            	try {
	            		fault_tag stag = fault_tag.valueOf(tag);
	            		switch (stag) {
	            		case Code: {
	            			code = true;
	            			break;
	            		}
	            		case Reason: {
	            			reason = true;
	            			break;
	            		}
	            		case Detail: {
	            			details = true;
	            			break;
	            		}
	            		case DocumentFault: {
	            			String errorCode = reader.getAttributeValue("http://echa.europa.eu/schemas/iuclid5/i5webservice/types/", "errorCode");
	            			System.out.println(errorCode);
	            			break;
	            		}
	            		case SessionFault: {
	            			String errorCode = reader.getAttributeValue("http://echa.europa.eu/schemas/iuclid5/i5webservice/types/", "errorCode");
	            			System.out.println(errorCode);
	            			break;
	            		}	            		
	            		case errorMessage : {
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
	            		fault_tag stag = fault_tag.valueOf(tag);
	            		switch (stag) {
	            		case Code: {
	            			code = false;
	            			break;
	            		}
	            		case Reason: {
	            			reason = false;
	            			break;
	            		}
	            		case Detail: {
	            			details = false;
	            			break;
	            		}
	            		case errorMessage : {
	            			break;
	            		}
	            		}
	            	} catch (Exception x) {}
	            	break;
	            }
	            case XMLStreamConstants.CHARACTERS: {
	            	if (code) {
	            		String value = reader.getText();
	            		System.out.println(value);
	            	} else if (reason) {
	            		String value = reader.getText();
	            		System.out.println(value);
	            	} else if (details) {
	            		String value = reader.getText();
	            		System.out.println(value);
	            	}
	            	break;
	            }

  		    	}
    		}
	    	return null;
    	} catch (Exception x) {
    		throw new RestException(HttpStatus.SC_BAD_REQUEST,x.getMessage());
    	} finally {
    		try {reader.close();} catch (Exception x) {}
    	}
	}

	protected String loadXML(String resourceName) throws IOException {
		InputStream stream = null;
		try {
			stream = this.getClass().getClassLoader().getResourceAsStream(resourceName);
			if (stream==null) throw new IOException("Error loading "+resourceName);
			return loadXML(stream);
		} catch (IOException x) {
			throw x;
		} finally {
			try {stream.close(); } catch (Exception x) {}
		}
	}
	protected String loadXML(InputStream stream) throws IOException {
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			DownloadTool.download(stream,out);
			return out.toString();
		} catch (IOException x) {
			throw x;
		}
	}

	@Override
	protected List<IIdentifiableResource<String>> get(String identifier,
			String mediaType, String... params) throws RestException,
			IOException {
		return getByIdentifier(identifier, mediaType, params);
	}	
	@Override
	public List<IIdentifiableResource<String>> get(String identifier) throws Exception {
		return get(identifier,"application/soap+xml");
	}

}
