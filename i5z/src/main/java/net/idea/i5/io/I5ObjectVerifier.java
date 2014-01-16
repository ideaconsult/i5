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
		AttachmentDocument {
			@Override
			public boolean isScientificPart() {
				return false;
			}
		},
		LegalEntity {
			@Override
			public boolean isScientificPart() {
				return false;
			}
		},
		ReferenceSubstance {
			@Override
			public String getContextPath() {
				return "eu.europa.echa.schemas.iuclid5._20130101.referencesubstance:eu.europa.echa.schemas.iuclid5._20120101.referencesubstance:eu.europa.echa.schemas.iuclid5._20070330.referencesubstance";
			}
			@Override
			public boolean isScientificPart() {
				return false;
			}
			
		},
		Substance {
			@Override
			public String getContextPath() {
				return "eu.europa.echa.schemas.iuclid5._20130101.substance:eu.europa.echa.schemas.iuclid5._20120101.substance";
			}
			@Override
			public boolean isScientificPart() {
				return false;
			}
			
		},
		EndpointRecord {
			@Override
			public String getContextPath() {
				return null;
			}
			@Override
			public boolean isScientificPart() {
				return false;
			}
			
		},
		EndpointStudyRecord {
			@Override
			public String getContextPath() {
				return null;
			}
			@Override
			public boolean isScientificPart() {
				return false;
			}
			
		},
	    scientificPart {
			@Override
			public String getContextPath() {
				return null;
			}
			@Override
			public boolean isScientificPart() {
				return false;
			}
		},
		//ecotox
		EC_FISHTOX,
		EC_CHRONFISHTOX,
		EC_DAPHNIATOX,		
		EC_CHRONDAPHNIATOX,
		EC_ALGAETOX,
		EC_BACTOX,
		EC_SEDIMENTDWELLINGTOX,
		EC_SOIL_MICRO_TOX,
		EC_PLANTTOX,		
		//env
		TO_PHOTOTRANS_AIR,
		TO_HYDROLYSIS,
		TO_BIODEG_WATER_SIM,
		EN_BIOACCU_TERR,
		EN_BIOACCUMULATION,
		EN_STABILITY_IN_SOIL,
		EN_ADSORPTION,
		EN_HENRY_LAW,
		TO_BIODEG_WATER_SCREEN,
		//tox
		TO_ACUTE_ORAL,		
		TO_REPEATED_ORAL,
		TO_REPRODUCTION,		
		TO_SENSITIZATION,		
		TO_SKIN_IRRITATION,
		TO_EYE_IRRITATION,	
		TO_GENETIC_IN_VITRO,
		//pc
		PC_MELTING,
		PC_BOILING,
		PC_DISSOCIATION,
		PC_PARTITION,
		PC_SOL_ORGANIC,
		PC_VAPOUR,
		PC_WATER_SOL,	
		;

		public String getContextPath() {
			return "eu.europa.echa.schemas.iuclid5._20130101.studyrecord."+name()+"_SECTION";
		}	
		public boolean isScientificPart() {
			return true;
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
    		boolean inStudyRecord = false;
    		boolean inSciPart = false;
    		 while (reader.hasNext()) {
    			int type = reader.next();
	            I5_ROOT_OBJECTS tag = null;
	            try {
	            	tag = I5_ROOT_OBJECTS.valueOf(reader.getName().getLocalPart());
	            } catch (Exception x) {
	            	if (inSciPart || inStudyRecord) continue;
	            	else throw x;
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
