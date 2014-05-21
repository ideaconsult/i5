package net.idea.i5.cli;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import net.idea.loom.common.DownloadTool;
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

public class ContainerClient extends I5AbstractClient{
	
	public ContainerClient(HttpClient httpclient,String baseURL,String token) {
		super(httpclient,baseURL,token);

	}
	
	@Override
	protected List<IIdentifiableResource<String>> getByIdentifier(String identifier,
			String mediaType, String... params) throws RestException,
			IOException {
		String xml = String.format(loadXML("net/idea/i5/cli/container/request.xml"),token,identifier);
		//System.out.println(xml);
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
		StringBuilder report = new StringBuilder();
		File tmpFile = File.createTempFile("i5ws_",".i5z");
		Writer dataContentFile = new OutputStreamWriter(new Base64OutputStream(
      			new BufferedOutputStream(new FileOutputStream(tmpFile)),false
		   ));
		XMLStreamReader reader = null;
		InputStream xmlin = null;
		String resultFlag= "";
    	try {
    		XMLInputFactory factory = XMLInputFactory.newInstance();
    		factory.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,Boolean.TRUE);
    		
    		File xmlFile = new File(tmpFile.getAbsoluteFile().toString().replace(".i5z",".xml"));
    		DownloadTool.download(in, xmlFile);
    		xmlin = new FileInputStream(xmlFile);
    		reader =   factory.createXMLStreamReader(xmlin);
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
	            			resultFlag = reader.getAttributeValue("http://echa.europa.eu/schemas/iuclid5/i5webservice/types/", "resultFlag");
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
	            		report.append(value.substring(0,reader.getTextLength()));
	            	}
	            	break;
	            }

  		    	}
    		}
    		List<IIdentifiableResource<String>> list = new ArrayList<IIdentifiableResource<String>>();
    		if ("SUCCESS".equals(resultFlag)) {
    			list.add(new Container(identifier,tmpFile));
    			try {dataContentFile.flush();} catch (Exception x)  {}
    			try {xmlin.close();xmlin=null;} catch (Exception x) {}
    			try {xmlFile.delete();} catch (Exception x) {}
    		} else {	
    			try {if (dataContentFile!=null) dataContentFile.close();tmpFile.delete();} catch (Exception x) {}
    			tmpFile = xmlFile; //return the xml output
    			throw new RestException(HttpStatus.SC_BAD_GATEWAY,
    					String.format("Error when retrieving document %s from %s : %s. Response at %s", identifier,baseURL,resultFlag,xmlFile.getAbsolutePath()));
    		}	
	    	return list;
    	} catch (RestException x) {
    		throw x;
    	} catch (Exception x) {
    		throw new RestException(HttpStatus.SC_BAD_REQUEST);
    	} finally {
    		try {in.close();} catch (Exception x) {}
    		try {reader.close();} catch (Exception x) {}
    		try {if (xmlin!=null) xmlin.close();} catch (Exception x) {}
    		try {if (dataContentFile!=null) dataContentFile.close();} catch (Exception x) {}
    	}
	}


}
