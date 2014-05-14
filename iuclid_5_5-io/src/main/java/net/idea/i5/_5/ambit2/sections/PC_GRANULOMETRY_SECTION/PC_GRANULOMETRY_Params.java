package net.idea.i5._5.ambit2.sections.PC_GRANULOMETRY_SECTION;

import net.idea.i5.io.I5CONSTANTS;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Value;

public class PC_GRANULOMETRY_Params extends Params<Value<String>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1489575931808096835L;

	public String getTESTMAT_FORM() {
		Value<String> o = get(I5CONSTANTS.pTESTMAT_FORM);
		return o==null?null:o.getLoValue();
	}

	public void setTESTMAT_FORM(String value) {
		put(I5CONSTANTS.pTESTMAT_FORM,new Value<String>(value));
	}

	public String getDISTRIBUTION_TYPE() {
		Value<String> o = get(I5CONSTANTS.pDISTRIBUTION_TYPE);
		return o==null?null:o.getLoValue();
	}

	public void setDISTRIBUTION_TYPE(String value) {
		put(I5CONSTANTS.pDISTRIBUTION_TYPE,new Value<String>(value));
	}
}
