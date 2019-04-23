package com.sgr.scjpExp;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		append(l);

		System.out.println(l.get(0));
	}

	static void append(List list) {
		list.add("0052");

	}
}
