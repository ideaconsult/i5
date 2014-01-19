package net.idea.i5._5.ambit2;

import ambit2.base.exceptions.AmbitException;

public class QACriteriaException extends AmbitException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5515003747334772795L;
	private static final String _msg = "Data transfer criteria not fullfilled : ";
	public QACriteriaException(String msg) {
		super(_msg + msg);
	}
}
