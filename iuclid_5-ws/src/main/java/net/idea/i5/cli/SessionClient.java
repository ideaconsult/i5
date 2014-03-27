package net.idea.i5.cli;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

public class SessionClient extends I5AbstractClient {

	public SessionClient(HttpClient httpclient,String baseURL) {
		this(httpclient,baseURL,null);
	}
	public SessionClient(HttpClient httpclient,String baseURL,String token) {
		super(httpclient,baseURL,token);
	}
	
	@Override
	protected List<IIdentifiableResource<String>> get(String url,
			String mediaType, String... params) throws RestException,
			IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String login(String username, String password) throws Exception {
		String xml = String.format(loadXML("net/idea/i5/cli/session/login.xml"),username, encryptPassword(password) );
		return post(xml,"Login");
	}	

	public void logout(String token) throws Exception {
		String xml = String.format(loadXML("net/idea/i5/cli/session/logout.xml"),token );
		post(xml,"Logout");
	}
	
	protected String post(String xml,String command) throws Exception {		
		HttpEntity content = new StringEntity(xml,"UTF-8");
		HttpPost httpPOST = new HttpPost(baseURL+"/SessionEngine");
		if (headers!=null) for (Header header : headers) httpPOST.addHeader(header);
		httpPOST.addHeader("Accept-Encoding","gzip,deflate");
		httpPOST.addHeader("Content-type",
				String.format("application/soap+xml;charset=UTF-8;action=\"http://echa.europa.eu/iuclid5/i5webservice/service/SessionEngine/%s\"",command));
		httpPOST.setEntity(content);

		InputStream in = null;
		try {
			
			HttpResponse response = getHttpClient().execute(httpPOST);
			HttpEntity entity  = response.getEntity();
			in = entity.getContent();
			if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK) {
				return processXML(in);

			} else if (response.getStatusLine().getStatusCode()== HttpStatus.SC_NOT_FOUND) {	
				return null;
			} else if (response.getStatusLine().getStatusCode()== HttpStatus.SC_INTERNAL_SERVER_ERROR) { //AxisFault
				processFault(in,null);
				return null;
			} else throw new RestException(response.getStatusLine().getStatusCode(),response.getStatusLine().getReasonPhrase());
		
		} finally {
			try {if (in != null) in.close();} catch (Exception x) {}
		}
	
	}
	private enum supported_tag {
		loginResponse,
		session,
		emptyResponse
	}
	
	protected String processXML(InputStream in) throws RestException, IOException {
		String session = null;
		XMLStreamReader reader = null;
    	try {
    		XMLInputFactory factory = XMLInputFactory.newInstance();
    		factory.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,Boolean.TRUE);
    		reader =   factory.createXMLStreamReader(in);
    		while (reader.hasNext()) {
  		    	int type = reader.next();
  		    	switch (type) {
  		    	
 	            case XMLStreamConstants.START_ELEMENT: {
	            	String tag = reader.getName().getLocalPart();
	            	try {
	            		supported_tag stag = supported_tag.valueOf(tag);
	            		switch (stag) {
	            		case loginResponse: {
	            			break;
	            		}
	            		case emptyResponse: {
	            			break;
	            		}
	            		case session: {
	            			session = reader.getAttributeValue("http://echa.europa.eu/schemas/iuclid5/i5webservice/types/", "id");
	            			break;
	            		}
	            		}
	            	} catch (Exception x) {}

 	            	break;
 	            } 
 	          
  		    	}
    		}
	    	return session;
    	} catch (Exception x) {
    		x.printStackTrace();
    		throw new RestException(HttpStatus.SC_BAD_REQUEST);
    	} finally {
    		try {reader.close();} catch (Exception x) {}
    	}
	}	
	
	
	public static String encryptPassword(String decryptedPassword) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte pwdByte[] = decryptedPassword.getBytes("UTF-8");
			byte md5Byte[] = md5.digest(pwdByte);
			return encodeHex(md5Byte);
		} catch (NoSuchAlgorithmException ex) {
			throw new RuntimeException(ex);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	private static String encodeHex(byte hash[]) {
		int currenLength = hash.length;
		char out[] = new char[currenLength * 2];
		int i = 0;
		int j = 0;
		for (; i < currenLength; i++) {
			int high = hash[i] >>> 4 & 0xf;
			int low = hash[i] & 0xf;
			out[j++] = DIGITS[high];
			out[j++] = DIGITS[low];
		}

		return new String(out);
	}
	private static final char DIGITS[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',	'D', 'E', 'F' };	
}
