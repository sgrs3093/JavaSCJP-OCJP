package com.sgr.scjpExp;

import java.util.WeakHashMap;

public class HashMapExp {
	private boolean enable;

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public static void main(String[] args) {

		WeakHashMap<String, String> wh = new WeakHashMap<String, String>();
		String key = new String();
		wh.put(key, "hi");
		key = null;
		System.gc();
		System.out.println(wh.get(key));

	}
}
