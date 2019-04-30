package com.sgr.java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo // implements Supplier<String>
{

	/*
	 * @Override public String get() { return "Hi From get"; }
	 */
	public static void main(String[] args) {
		/*
		 * Supplier<String> s = new SupplierDemo(); System.out.println(s.get());
		 */

		// By using lambda expression
		Supplier<String> s = () -> {
			return "Hi From get";
		};

		// more optimization
		Supplier<String> s1 = () -> "Hi From get";

		System.out.println(s1.get());

		// List list = Arrays.asList("a", "b");
		List list = Arrays.asList();

		System.out.println(list.stream().findAny().orElseGet(s1));

	}

}
