package net.idea.i5.cli;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Stack;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.opentox.rest.RestException;

import net.idea.loom.common.DownloadTool;
import net.idea.opentox.cli.AbstractClient;
import net.idea.opentox.cli.IIdentifiableResource;

public abstract class I5AbstractClient extends AbstractClient<String, IIdentifiableResource<String>> {
	protected String baseURL;
	protected String token;
	protected Stack<String> tags = new Stack<String>();
	
	private enum fault_tag {
		Fault,
		Code,
		Reason,
		Detail,
		DocumentFault,
		SessionFault,
		errorMessage
	}
	
	public I5AbstractClient(HttpClient httpclient,String baseURL,String token) {
		super(httpclient);
		this.baseURL = baseURL;
		this.token = token;
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
	            	} else if (reason) {
	            		String value = reader.getText();
	            	} else if (details) {
	            		String value = reader.getText();
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
