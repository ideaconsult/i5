package net.idea.i5.io;

import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import net.idea.i5.io.I5ObjectVerifier.I5_ROOT_OBJECTS;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.processors.DefaultAmbitProcessor;


public class I5ObjectVerifier extends DefaultAmbitProcessor<InputStream,I5_ROOT_OBJECTS> {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4202446709497463805L;

	public enum I5_ROOT_OBJECTS {
		ReferenceSubstance {
			@Override
			public String getContextPath() {
				return "eu.europa.echa.schemas.iuclid5._20130101.referencesubstance:eu.europa.echa.schemas.iuclid5._20120101.referencesubstance:eu.europa.echa.schemas.iuclid5._20070330.referencesubstance";
			}
		},
		Substance {
			@Override
			public String getContextPath() {
				return "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101.substance";
			}
		}
		;
		public String getContextPath() {
			return null;
		}
	} 
	
	public I5ObjectVerifier() {
		super();
	}

	public I5_ROOT_OBJECTS process(InputStream in) throws AmbitException {
		XMLStreamReader reader = null;
    	try {
    		XMLInputFactory factory = XMLInputFactory.newInstance();
    		factory.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,Boolean.TRUE);
    		factory.setProperty(XMLInputFactory.IS_VALIDATING,Boolean.FALSE);
    		reader =   factory.createXMLStreamReader(in);
    		 while (reader.hasNext()) {
    			int type = reader.next();
 	            switch (type) {
 	            case XMLStreamConstants.START_ELEMENT: {
 	            	I5_ROOT_OBJECTS tag = null;
	    			try {
	    				tag = I5_ROOT_OBJECTS.valueOf(reader.getName().getLocalPart());
		    			switch (tag) {
		    			case ReferenceSubstance: {
		    				return tag;
		    			}
		    			case Substance: {
		    				return tag;
		    			}	
		    			default:
		    				throw new UnsupportedI5RootObject(tag.name());
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
