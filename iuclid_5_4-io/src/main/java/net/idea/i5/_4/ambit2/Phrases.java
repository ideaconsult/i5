package net.idea.i5._4.ambit2;

import java.util.Hashtable;

/**
 * Hack to avoid generating classes for phrases.xsd - we only need few of them so far
 * @author nina
 *
 */
public class Phrases {
	public static final Hashtable<String, String> phrasegroup_N08 = initPhrasegroup_N08();
	public static final Hashtable<String, String> phrasegroup_N28 = initPhrasegroup_N28();
	public static final Hashtable<String, String> phrasegroup_N24 = phrasegroup_N24();
	
    private static Hashtable<String, String> initPhrasegroup_N08() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2915", "mono constituent substance - ");
    	p.put("2923", "multi constituent substance - ");
    	p.put("3401", "UVCB - ");
    	p.put("3001", "polymer - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", "Not specified - the value is not specified"); 
    	return p;
    }
    
    private static Hashtable<String, String> initPhrasegroup_N28() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2675", "absorbent - ");
    	p.put("2680", "adsorbent - ");
    	p.put("2693", "anticaking agent - ");
    	p.put("2694", "anticoagulant - ");
    	p.put("2721", "booster - ");
    	p.put("2728", "buffer - ");
    	p.put("2752", "coagulant - ");
    	p.put("2753", "coating agent - ");
    	p.put("2756", "colourant - ");
    	p.put("2761", "complexing agent - ");
    	p.put("2763", "conditioner - ");
    	p.put("2768", "controlled release agent - ");
    	p.put("2772", "crystal growth regulator - ");
    	p.put("2781", "dehydrating agent - ");
    	p.put("2783", "denaturant - ");
    	p.put("2794", "drying agent - ");
    	p.put("2795", "dye - ");
    	p.put("2802", "emulsifier - ");
    	p.put("2819", "filler - ");
    	p.put("2823", "flow aid agent - ");
    	p.put("2824", "fragrance - ");
    	p.put("2847", "hardener - ");
    	p.put("2895", "lubricant - ");
    	p.put("2918", "moisturiser - ");
    	p.put("2937", "neutraliser - ");
    	p.put("2976", "odour masking agent - ");
    	p.put("3442", "pH adjuster - ");
    	p.put("2999", "pigment - ");
    	p.put("3026", "propellant - ");
    	p.put("3342", "solvent - ");
    	p.put("3348", "stabiliser - ");
    	p.put("3350", "stiffener - ");
    	p.put("3400", "UV absorber - ");
    	p.put("3424", "viscosity modifier - ");
    	p.put("3426", "water repellent - ");
    	p.put("3429", "wetting agent - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", "Not specified - the value is not specified"); 
    	return p;
    }
    private static Hashtable<String, String> phrasegroup_N24() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2505", "% (w/w)");
    	p.put("2506", "% (v/v)");
    	p.put("2098", "mg/L");
    	p.put("3437", "mg/kg");
    	p.put("2283", "ppm");
    	p.put("3440", ">mg/m³");
    	p.put("NOT_SPECIFIED", "Not specified - the value is not specified"); 
    	return p;
    }
    	    
	private Phrases() {
	}
}
