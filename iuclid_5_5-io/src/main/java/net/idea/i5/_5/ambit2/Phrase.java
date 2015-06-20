package net.idea.i5._5.ambit2;

import java.util.Hashtable;

public class Phrase extends Hashtable<String,String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3946238655323929429L;

	@Override
	public synchronized String get(Object key) {
		return (key==null)?null:super.get(key);
	}
}