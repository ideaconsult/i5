package net.idea.i5.io;

import net.idea.modbcum.i.exceptions.AmbitException;

public class QACriteriaException extends AmbitException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5515003747334772795L;
	private static final String _msg = "Data transfer criteria not fullfilled : ";
	
	public QACriteriaException(String msg) {
		super(_msg +  msg);
	}
	
	public QACriteriaException(String type, String code,String msg) {
		super(_msg + type + " " + (code==null?"":code) + " " + msg);
	}
}
