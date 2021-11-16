package net.idea.i6.cli;

import java.net.URLEncoder;

import net.idea.iuclid.cli.AbstractPredefinedQuery;

public class I6Query extends AbstractPredefinedQuery {
	protected _QUERYTYPE querytype;
	protected String param = null;

	public _QUERYTYPE getQuerytype() {
		return querytype;
	}

	public void setQuerytype(_QUERYTYPE querytype) {
		this.querytype = querytype;
	}

	public enum _QUERYTYPE {
		bySubstance {
			public String[] getParams() {
				return new String[] { "sub.chemical", "sub.owner", "sub.other", "ref_sub.name",
						"ref_sub.inv.cas_number", "ref_sub.inv.name", "ref_sub.inv.number", "ref_sub.cas_number",
						"ref_sub.cas_name", "ref_sub.iupac_name", "ref_sub.smiles_notation", "ref_sub.mol_formula",
						"ref_sub.in_chl", "sub.reg_prog_id", "sub.reg_prog", "sub.it_system_id" };
			}
		};

		public abstract String[] getParams();

		public String getURI() {
			return String.format("/query/iuclid6/%s", name());
		}
	}

	public I6Query() {
		this(_QUERYTYPE.bySubstance, "sub.it_system_id", null);
	}
	
	public I6Query(String id) {
		this(_QUERYTYPE.bySubstance, "sub.it_system_id", id);
	}

	public I6Query(_QUERYTYPE querytype, String param, String id) {
		super(id);
		this.querytype = querytype;
		this.param = param;
	}

	@Override
	public String toString() {
		return String.format("%s?o=0&l=100&count=true&doc.type=SUBSTANCE&%s=%s&formatter=iuclid6.DocumentSecuredRepresentation", querytype.getURI(), param, URLEncoder.encode(id));
	}

}
