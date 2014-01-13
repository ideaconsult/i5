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
		AttachmentDocument,
		LegalEntity,
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
		},
		EndpointRecord {
			@Override
			public String getContextPath() {
				return null;
			}
		},
		EndpointStudyRecord {
			@Override
			public String getContextPath() {
				return null;
			}			
		},
	    scientificPart {
			@Override
			public String getContextPath() {
				return null;
			}
		},
		//ecotox
		EC_FISHTOX,
		//env
		TO_PHOTOTRANS_AIR_SECTION,
		TO_HYDROLYSIS_SECTION,
		TO_BIODEG_WATER_SIM_SECTION,
		EN_BIOACCU_TERR_SECTION,
		EN_BIOACCUMULATION_SECTION,
		EN_STABILITY_IN_SOIL_SECTION,
		EN_ADSORPTION_SECTION,
		EN_HENRY_LAW_SECTION,
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
		    			case TO_ACUTE_ORAL: {
		    				return tag;
		    			}
		    			case TO_BIODEG_WATER_SCREEN: {
		    				return tag;
		    			}
		    			case TO_HYDROLYSIS_SECTION: {
		    				return tag;
		    			}
		    			case TO_BIODEG_WATER_SIM_SECTION: {
		    				return tag;
		    			}
		    			case TO_PHOTOTRANS_AIR_SECTION: {
		    				return tag;
		    			}
		    			case EN_BIOACCU_TERR_SECTION: {
		    				return tag;
		    			}		    			
		    			case EN_BIOACCUMULATION_SECTION: {
		    				return tag;
		    			}
		    			case EN_STABILITY_IN_SOIL_SECTION: {
		    				return tag;
		    			}
		    			case EN_ADSORPTION_SECTION: {
		    				return tag;
		    			}
		    			case EN_HENRY_LAW_SECTION: {
		    				return tag;
		    			}		    					    			
		    			case EC_FISHTOX: {
		    				return tag;
		    			}		    			
		    			case PC_BOILING: {
		    				return tag;
		    			}
		    			case PC_DISSOCIATION: {
		    				return tag;
		    			}
		    			case PC_MELTING: {
		    				return tag;
		    			}
		    			case PC_PARTITION: {
		    				return tag;
		    			}
		    			case PC_SOL_ORGANIC: {
		    				return tag;
		    			}
		    			case PC_VAPOUR: {
		    				return tag;
		    			}		    	
		    			case PC_WATER_SOL: {
		    				return tag;
		    			}		    				    			
		    			case TO_REPEATED_ORAL: {
		    				return tag;
		    			}
		    			case TO_REPRODUCTION: {
		    				return tag;
		    			}
		    			case TO_SENSITIZATION: {
		    				return tag;
		    			}
		    			case TO_SKIN_IRRITATION: {
		    				return tag;
		    			}
		    			case TO_EYE_IRRITATION: {
		    				return tag;
		    			}		    
		    			case TO_GENETIC_IN_VITRO: {
		    				return tag;
		    			}
		    			default:
		    				continue;
		    				//if (inSciPart || inStudyRecord) continue;
		    				//throw new UnsupportedI5RootObject(tag.name());
		    			}
		    		} catch (Exception x) {
		    			if (inSciPart || inStudyRecord) continue;
		    			System.out.println(reader.getName().getLocalPart());
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
