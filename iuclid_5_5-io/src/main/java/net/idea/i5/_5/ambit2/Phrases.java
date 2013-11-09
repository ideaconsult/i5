package net.idea.i5._5.ambit2;

import java.util.Hashtable;

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
	/*
	 * Endpoint study records
	 */
	public static final Hashtable<String, String> phrasegroup_N64 = phrasegroup_N64();
	public static final Hashtable<String, String> phrasegroup_N78 = phrasegroup_N78();
	public static final Hashtable<String, String> phrasegroup_Y14_3 = phrasegroup_Y14_3(); //name="phrasegroup_Y14-3"
	public static final Hashtable<String, String> phrasegroup_Z02 = phrasegroup_Z02();
	public static final Hashtable<String, String> phrasegroup_Z05 = phrasegroup_Z05();
	public static final Hashtable<String, String> phrasegroup_A36 = phrasegroup_A36();
	public static final Hashtable<String, String> phrasegroup_Z31 = phrasegroup_Z31();
	public static final Hashtable<String, String> phrasegroup_Z03 = phrasegroup_Z03();
	public static final Hashtable<String, String> phrasegroup_Z30 = phrasegroup_Z30();
	public static final Hashtable<String, String> phrasegroup_Z06 = phrasegroup_Z06();
	public static final Hashtable<String, String> phrasegroup_E03_1 = phrasegroup_E03_1();
	public static final Hashtable<String, String> phrasegroup_Z08 = phrasegroup_Z08();
	public static final Hashtable<String, String> phrasegroup_Z40 = phrasegroup_Z40();
	public static final Hashtable<String, String> phrasegroup_Z38 = phrasegroup_Z38();
	public static final Hashtable<String, String> phrasegroup_A101 = phrasegroup_A101();
	public static final Hashtable<String, String> phrasegroup_Z36 = phrasegroup_Z36();
	public static final Hashtable<String, String> phrasegroup_A03 = phrasegroup_A03();
	
	private static Hashtable<String, String> phrasegroup_A03() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_Z36() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("2203", "not required - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_A101() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2682", "aerosol - ");
    	p.put("1808", "compact - ");
    	p.put("1825", "crystalline - ");
    	p.put("2787", "dispersion - ");
    	p.put("2816", "fibre - ");
    	p.put("2818", "filaments - ");
    	p.put("1910", "flakes - ");
    	p.put("2892", "liquified gas - ");
    	p.put("8051", "nanomaterial - ");
    	p.put("2991", "particulates - ");
    	p.put("3886", "paste - ");
    	p.put("2260", "pellets - ");
    	p.put("3167", "refrigerated liquid - ");
    	p.put("3356", "suspension - ");
    	p.put("2452", "viscous - ");
    	p.put("1342", "other: - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	private static Hashtable<String, String> phrasegroup_Z39() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("4174", "CAS name - ");
    	p.put("4175", "CAS number - ");
    	p.put("4176", "common name - ");
    	p.put("4177", "EC name - ");
    	p.put("4178", "EC number - ");
    	p.put("3452", "IUPAC name - ");
    	p.put("3451", "TSCA name - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_Z38() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
	private static Hashtable<String, String> phrasegroup_Z40() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("4179", "yes (incl. certificate) - ");
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    
	private static Hashtable<String, String> phrasegroup_Z08() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("2158", "no - ");
    	p.put("1173", "no data - ");
    	p.put("2193", "not applicable - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
	
	private static Hashtable<String, String> phrasegroup_E03_1() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1201", "OECD Guideline 203 (Fish, Acute Toxicity Test) - ");
    	p.put("1202", "OECD Guideline 204 (Fish, Prolonged Toxicity Test: 14-day Study) - ");
    	p.put("706", "EU Method C.1 (Acute Toxicity for Fish) - ");
    	p.put("399", "EPA OPP 72-1 (Fish Acute Toxicity Test) - ");
    	p.put("461", "EPA OPPTS 850.1075 (Freshwater and Saltwater Fish Acute Toxicity Test) - ");
    	p.put("462", "EPA OPPTS 850.1085 (Fish Acute Toxicity Test mitigated by humic acid) - ");
    	p.put("579", "EPA OTS 797.1400 (Fish Acute Toxicity Test) - ");
    	p.put("580", "EPA OTS 797.1460 (Fish Acute Toxicity Test mitigated by humic acid) - ");
    	p.put("870", "ISO 7346-1 (Determination of the Acute Lethal Toxicity of Substances to a Freshwater Fish [Brachydanio rerio Hamilton-Buchanan (Teleostei, Cyprinidae)] - Part 1: Static Method) - ");
    	p.put("871", "ISO 7346-1 (Determination of the Acute Lethal Toxicity of Substances to a Freshwater Fish [Brachydanio rerio Hamilton-Buchanan (Teleostei, Cyprinidae)] - Part 2: Semi-static method) - ");
    	p.put("872", "ISO 7346-1 (Determination of the Acute Lethal Toxicity of Substances to a Freshwater Fish [Brachydanio rerio Hamilton-Buchanan (Teleostei, Cyprinidae)] - Part 3: Flow-through method) - ");
    	p.put("873", "ISO 7346/1-3 (Determination of the Acute Lethal Toxicity of Substances to a Freshwater Fish [Brachydanio rerio Hamilton-Buchanan (Teleostei, Cyprinidae)]) - ");
    	p.put("2246", "other guideline: -"); 
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    
	private static Hashtable<String, String> phrasegroup_Z06() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1680", "according to - ");
    	p.put("1880", "equivalent or similar to - ");
    	p.put("2172", "no guideline followed - ");
    	p.put("2172", "no guideline followed - ");
    	p.put("2175", "no guideline required - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    
    private static Hashtable<String, String> phrasegroup_Z30() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2480", "yes - ");
    	p.put("4161", "yes, but willing to share - ");
    	p.put("4162", "yes, but not willing to share - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    	
	
    private static Hashtable<String, String> phrasegroup_Z03() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1838", "data submitter is data owner - ");
    	p.put("1837", "data submitter has Letter of Access - ");
    	p.put("1835", "data no longer protected - ");
    	p.put("1836", "data published - ");
    	p.put("2193", "not applicable - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
    
    private static Hashtable<String, String> phrasegroup_Z31() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1586", "study report - ");
    	p.put("266", "other company data - ");
    	p.put("1433", "publication - ");
    	p.put("1486", "review article or handbook - ");
    	p.put("1542", "secondary source - ");
    	p.put("811", "grey literature - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
	
    private static Hashtable<String, String> phrasegroup_A36() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1", "1 (reliable without restriction) - ");
    	p.put("18", "2 (reliable with restrictions) - ");
    	p.put("22", "3 (not reliable) - ");
    	p.put("24", "4 (not assignable) - ");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }		
	
    private static Hashtable<String, String> phrasegroup_Z05() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1895", "experimental result - ");
    	p.put("1896", "experimental study planned - ");
    	p.put("1885", "estimated by calculation - ");
    	p.put("2303", "read-across based on grouping of substances (category approach) - ");
    	p.put("2304", "read-across from supporting substance (structural analogue or surrogate) - ");
    	p.put("14", "(Q)SAR - ");
    	p.put("1342", "other: - ");
    	p.put("1173", "no data - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }	
	
    private static Hashtable<String, String> phrasegroup_Z02() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("1588", "study technically not feasible - ");
    	p.put("1587", "study scientifically unjustified - ");
    	p.put("982", "exposure considerations - ");
    	p.put("2533", "other justification - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
    private static Hashtable<String, String> phrasegroup_Y14_3() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("921", "key study - ");
    	p.put("1590", "supporting study - ");
    	p.put("1661", "weight of evidence - ");
    	p.put("8108", "disregarded study - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
    
    private static Hashtable<String, String> phrasegroup_N78() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("733", "EU: BPD - Biocidal Products Directive 98/8/EC or EU: BPR - Biocidal Products Regulation 528/2012/EC");
    	p.put("9000", "EU: CLP - Classification, Labelling and Packaging");
    	p.put("735", "EU: REACH - Registration, Evaluation and Authorisation of Chemicals");
    	p.put("209", "CA: CEPA - Existing Substances Program under CEPA");
    	p.put("210", "CA: PCPA - Pest Control Products Act");
    	p.put("919", "JP: CSCL - Chemical Substances Control Law");
    	p.put("1313", "OECD - Cooperative Chemicals Assessment Programme");
    	p.put("1646", "US: EPA HPVC - HPV Chemical Challenge Programme");
    	p.put("1647", "US: FIFRA - Federal Insecticide, Fungicide, and Rodenticide Act");
    	p.put("1648", "US: TSCA - Toxic Substances Control Act");
    	p.put("1342", "other: - ");
    	p.put("NOT_SPECIFIED", ""); 
    	return p;
    }
	
    private static Hashtable<String, String> phrasegroup_N64() {
    	Hashtable<String, String> p = new Hashtable<String,String>();
    	p.put("2732", "CBI - confidential business information");
    	p.put("2859", "IP - intellectual property");
    	p.put("3441", "no PA - not public available");
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
