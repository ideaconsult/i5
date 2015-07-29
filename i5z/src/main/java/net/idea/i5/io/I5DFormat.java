package net.idea.i5.io;

import java.util.List;

import org.openscience.cdk.io.formats.IChemFormatMatcher;
import org.openscience.cdk.io.formats.IResourceFormat;
import org.openscience.cdk.tools.DataFeatures;

public class I5DFormat implements IChemFormatMatcher {

	private static IResourceFormat myself = null;
	
    private I5DFormat() {}
    
    public static synchronized IResourceFormat getInstance() {
    	if (myself == null) myself = new I5DFormat();
    	return myself;
    }
    
    public String getFormatName() {
        return "IUCLID5 I5D";
    }

    public String getMIMEType() {
        return "application/xml";
    }
    public String getPreferredNameExtension() {
        return getNameExtensions()[0];
    }

    public String[] getNameExtensions() {
        return new String[]{".i5d"};
    }

    public String getReaderClassName() { 
    	return "net.idea.i5.io.I5DReader";
    }
    /**
     * TODO I5DWriter
     */
    public String getWriterClassName() { 
    	return "net.idea.i5.io.I5DWriter";
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