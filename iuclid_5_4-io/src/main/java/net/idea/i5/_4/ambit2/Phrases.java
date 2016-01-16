package net.idea.i5._4.ambit2;

import java.util.Hashtable;

import net.idea.i5.ambit2.phrases.Phrase;

/**
 * Hack to avoid generating classes for phrases.xsdwe only need few of them so far
 * @author nina
 *
 */
public class Phrases {
	public static final Hashtable<String, String> phrasegroup_N08 = initPhrasegroup_N08();
	public static final Hashtable<String, String> phrasegroup_N28 = initPhrasegroup_N28();
	public static final Hashtable<String, String> phrasegroup_N24 = phrasegroup_N24();
	public static final Hashtable<String, String> phrasegroup_A02 = phrasegroup_A02();
	public static final Hashtable<String, String> phrasegroup_A02_1 = phrasegroup_A02_1();
	public static final Hashtable<String, String> phrasegroup_A02_2 = phrasegroup_A02_2();
	public static final Phrase phrasegroup_E04 = phrasegroup_E04();
	public static final Phrase phrasegroup_TD340 = phrasegroup_TD340();
	
	private static Phrase phrasegroup_TD340() {
    	Phrase p = new Phrase();
    	p.put("8089", "ng/kg soil dw");
    	p.put("8088", "µg/kg soil dw");
    	p.put("2096", "mg/kg soil dw");
    	p.put("8126", "ng/kg soil ww");
    	p.put("8127", "µg/kg soil ww");
    	p.put("8128", "mg/kg soil ww");    	
    	
    	p.put("2077", "mg/cm²");
    	p.put("1930", "g/ha");
    	p.put("1342", "other:");    	    	
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
    private static Phrase phrasegroup_E04() {
    	Phrase p = new Phrase();
    	p.put("2113", "min");
    	p.put("1976", "h");
    	p.put("1839", "d");
    	p.put("2468", "wk");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	  	
    private static Hashtable<String, String> initPhrasegroup_N08() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2915", "mono constituent substance");
    	p.put("2923", "multi constituent substance");
    	p.put("3401", "UVCB");
    	p.put("3001", "polymer");
    	p.put("1342", "other:");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
    private static Hashtable<String, String> initPhrasegroup_N28() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2675", "absorbent");
    	p.put("2680", "adsorbent");
    	p.put("2693", "anticaking agent");
    	p.put("2694", "anticoagulant");
    	p.put("2721", "booster");
    	p.put("2728", "buffer");
    	p.put("2752", "coagulant");
    	p.put("2753", "coating agent");
    	p.put("2756", "colourant");
    	p.put("2761", "complexing agent");
    	p.put("2763", "conditioner");
    	p.put("2768", "controlled release agent");
    	p.put("2772", "crystal growth regulator");
    	p.put("2781", "dehydrating agent");
    	p.put("2783", "denaturant");
    	p.put("2794", "drying agent");
    	p.put("2795", "dye");
    	p.put("2802", "emulsifier");
    	p.put("2819", "filler");
    	p.put("2823", "flow aid agent");
    	p.put("2824", "fragrance");
    	p.put("2847", "hardener");
    	p.put("2895", "lubricant");
    	p.put("2918", "moisturiser");
    	p.put("2937", "neutraliser");
    	p.put("2976", "odour masking agent");
    	p.put("3442", "pH adjuster");
    	p.put("2999", "pigment");
    	p.put("3026", "propellant");
    	p.put("3342", "solvent");
    	p.put("3348", "stabiliser");
    	p.put("3350", "stiffener");
    	p.put("3400", "UV absorber");
    	p.put("3424", "viscosity modifier");
    	p.put("3426", "water repellent");
    	p.put("3429", "wetting agent");
    	p.put("1342", "other:");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    private static Hashtable<String, String> phrasegroup_N24() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2505", "% (w/w)");
    	p.put("2506", "% (v/v)");
    	p.put("2098", "mg/L");
    	p.put("3437", "mg/kg");
    	p.put("2283", "ppm");
    	p.put("3440", ">mg/m\u00B3");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }

    private static Hashtable<String, String> phrasegroup_A02() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("29", "&lt;");
    	p.put("30", "&lt;=");
    	p.put("32", "&gt;");
    	p.put("33", "&gt;=");
    	p.put("1779", "ca.");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
    private static Hashtable<String, String> phrasegroup_A02_1() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("32", "&gt;");
    	p.put("33", "&gt;=");
    	p.put("1779", "ca.");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
    private static Hashtable<String, String> phrasegroup_A02_2() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("29", "&lt;");
    	p.put("30", "&lt;=");
    	p.put("1779", "ca.");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
	private Phrases() {
	}
}
