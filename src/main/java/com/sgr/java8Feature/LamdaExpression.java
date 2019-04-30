package com.sgr.java8Feature;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpression {

	public static void main(String[] args) {

		List<String> s = new ArrayList<String>();
		s.add("A");
		s.add("Bob");
		s.add("clob");

		List<String> s1 = new ArrayList<String>();
		s1.add("A");
		s1.add("Bob");
		s1.add("Glob");
		s1.add("clob");

		System.out.println(s.contains(1));

		s.retainAll(s1);
		System.out.println(s);

		s.forEach(p -> System.out.println(p));

		new Thread(() -> {
			System.out.println("hi");
		}).start();
	}

}
