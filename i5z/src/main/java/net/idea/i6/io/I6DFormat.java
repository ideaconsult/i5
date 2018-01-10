package net.idea.i6.io;

import java.util.List;

import org.openscience.cdk.io.formats.IChemFormatMatcher;
import org.openscience.cdk.io.formats.IResourceFormat;
import org.openscience.cdk.tools.DataFeatures;

public class I6DFormat implements IChemFormatMatcher {

	private static IResourceFormat myself = null;
	
    private I6DFormat() {}
    
    public static synchronized IResourceFormat getInstance() {
    	if (myself == null) myself = new I6DFormat();
    	return myself;
    }
    
    public String getFormatName() {
        return "IUCLID6 I6D";
    }

    public String getMIMEType() {
        return "application/xml";
    }
    public String getPreferredNameExtension() {
        return getNameExtensions()[0];
    }

    public String[] getNameExtensions() {
        return new String[]{".i6d"};
    }

    public String getReaderClassName() { 
    	return "net.idea.i6.io.I6DReader";
    }
    /**
     * TODO I5DWriter
     */
    public String getWriterClassName() { 
    	return "net.idea.i6.io.I6DWriter";
    }
    /**
     * TODO i5d Matcher
     */
    public boolean matches(int lineNumber, String line) {
        return false;
    }

    public boolean isXMLBased() {
		return true;
	}

	/**
	 * TODO : i5d Substance and ReferenceSubstance may have SMILES and InChI, but not mandatory
	 */
	public int getSupportedDataFeatures() {
		return getRequiredDataFeatures();
	}

    public int getRequiredDataFeatures() {
		return DataFeatures.NONE;
	}

	@Override
	public MatchResult matches(List<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}