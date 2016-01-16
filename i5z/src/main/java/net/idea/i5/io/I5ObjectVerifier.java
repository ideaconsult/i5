package net.idea.i5.io;

import java.io.InputStream;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import net.idea.modbcum.i.exceptions.AmbitException;
import net.idea.modbcum.p.DefaultAmbitProcessor;


public class I5ObjectVerifier extends DefaultAmbitProcessor<InputStream,I5_ROOT_OBJECTS> {
	protected XMLInputFactory factory;

	/**
	 * 
	 */
	private static final long serialVersionUID = 4202446709497463805L;


	
	public I5ObjectVerifier() {
		super();
		factory = XMLInputFactory.newInstance();
		factory.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,Boolean.TRUE);
		factory.setProperty(XMLInputFactory.IS_VALIDATING,Boolean.FALSE);
	}

	public I5_ROOT_OBJECTS process(InputStream in) throws AmbitException {
		XMLStreamReader reader = null;
    	try {
    		reader =   factory.createXMLStreamReader(in);
    		boolean inStudyRecord = false;
    		boolean inSciPart = false;
    		 while (reader.hasNext()) {
    			int type = reader.next();
    			if (type == XMLStreamConstants.SPACE) continue;
	            I5_ROOT_OBJECTS tag = null;
	            QName qname = null;
	            try {
	            	qname = reader.getName();
	            	tag = I5_ROOT_OBJECTS.valueOf(qname.getLocalPart());
	            } catch (Exception x) {
	            	if (inSciPart || inStudyRecord) continue;
	            	else throw new UnsupportedI5RootObject(qname==null?"":qname.getLocalPart() + x.getMessage());
	            }
 	            switch (type) {
 	            case XMLStreamConstants.START_ELEMENT: {
	    			try {
		    			switch (tag) {
		    			case AttachmentDocument: {
		    				return null;
		    			}
		    			case LegalEntity: {
		    				return null;
		    			}		    
		    			case EndpointRecord: {
		    				return null;
		    			}
		    			case ReferenceSubstance: {
		    				return tag;
		    			}
		    			case Substance: {
		    				return tag;
		    			}
		    			case scientificPart: {
		    				inSciPart = true; 
		    				continue;
		    			}		    			
		    			case EndpointStudyRecord: {
		    				inStudyRecord = true;
		    				continue;
		    			}
		    			default: {
		    				if (tag.isScientificPart()) return tag;
		    				continue;
		    			}	
		    			}
		    		} catch (Exception x) {
		    			if (inSciPart || inStudyRecord) continue;
		    			throw new UnsupportedI5RootObject(reader.getName().getLocalPart());
		    		}
 	            }
 	           case XMLStreamConstants.END_ELEMENT: {
	    			try {
		    			switch (tag) {
		    			case scientificPart: {
		    				throw new UnsupportedI5RootObject();
		    			}		    			
		    			case EndpointStudyRecord: {
		    				throw new UnsupportedI5RootObject();
		    			}
		    			default : {
		    				if (!tag.isSupported()) throw new UnsupportedI5RootObject();
		    			}
		    			}
		    		} catch (Exception x) {
		    			throw new UnsupportedI5RootObject(reader.getName().getLocalPart());
		    		}
	            } 	            
 	            default: {
 	            	//skip
 	            }
 	            }
    		 }
    		 throw new UnsupportedI5RootObject();
    	} catch (AmbitException x) {
    		throw x;
    	} catch (Exception x) {
    		throw new AmbitException(x.getMessage(),x);
    	} finally {
    		try { in.close(); } catch (Exception x) {}
    		try { reader.close(); } catch (Exception x) {}
    		
    	}
	}
	

}
