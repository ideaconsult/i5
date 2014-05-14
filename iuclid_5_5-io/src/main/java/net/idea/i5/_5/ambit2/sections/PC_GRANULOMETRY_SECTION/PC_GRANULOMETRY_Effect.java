package net.idea.i5._5.ambit2.sections.PC_GRANULOMETRY_SECTION;

import net.idea.i5.io.I5CONSTANTS;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Value;

public class PC_GRANULOMETRY_Effect extends EffectRecord<String, PC_GRANULOMETRY_Conditions, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8071393917266038598L;
	public PC_GRANULOMETRY_Effect() {
		super();
		setConditions(new PC_GRANULOMETRY_Conditions());
	}
}

class PC_GRANULOMETRY_Conditions extends Params<Value> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 598787900965526797L;

	public PC_GRANULOMETRY_Conditions() {
		super();
		put(I5CONSTANTS.rSTD_DEV,new Value());
		setSEQ_NUM(new Value());
		setRemark(new Value());
	}
	
	public Value getRemark() {
		return get(I5CONSTANTS.Remark);
	}

	public void setRemark(Value value) {
		put(I5CONSTANTS.Remark,value);
	}

	public Value getSEQ_NUM() {
		return get(I5CONSTANTS.cSEQ_NUM);
	}

	public void setSEQ_NUM(Value value) {
		put(I5CONSTANTS.cSEQ_NUM,value);
	}
	
	public Value getPercentile() {
		return get(I5CONSTANTS.cPERCENTILE);
	}

	public void setPercentile(Value value) {
		put(I5CONSTANTS.cPERCENTILE,value);
	}
	

}