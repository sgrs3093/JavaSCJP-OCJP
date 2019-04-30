package com.sgr.java8Feature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StreamAndForEachJava8Exp {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Peter");
		list.add("Shan");
		list.add("Mark");

		// using traditional foreach method

		for (String s : list) {
			System.out.println("Print Traditional ForEACH : " + s);
			// m1(s);
		}

		/*
		 * For Each Method in Java 8
		 */
		// using Java 8 for each

		list.forEach(t -> System.out.println("Lamda Exp :" + t));

		// Consumer<T> p=void accept(T t);
		list.forEach((t) -> {
			System.out.println("Print Traditional ForEACH : " + t);
			m1(t);
		});

		// Stream API in java 8
		list.stream().forEach(t -> System.out.println("From Stream : " + t));

		// Map iteration
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sagar");
		map.put(2, "Raj");
		map.put(3, "Shilpa");
		map.put(4, "suresh");

		// iterating map in traditional way
		for (Entry<Integer, String> string : map.entrySet()) {

			System.out.println("key :" + string.getKey() + " " + " value :" + string.getValue());
		}

		// using lambda expression
		// BiConsumer<T, U>
		map.forEach((k, v) -> System.out.println("Using Java 8 foreach :" + " key: " + k + " value: " + v));

		//
		map.entrySet().stream().forEach(obj -> System.out.println("From Map Stream :" + obj));

		/*
		 * Using Filter method --> conditional Check
		 * 
		 * if you want to filter based on some condition then we can go for
		 * Filter method
		 * 
		 */

		// Example for showing in traditional way to filter data from list and
		// then will check in lamda stream
		for (String string : list) {
			if (string.startsWith("J")) {
				System.out.println(string);
			}
		}
		/*
		 * Filter method is taking Predicate as method argument boolean test(T
		 * t); will write lambda expression on this
		 */
		// Now same above conditional check we will use using stream filter and
		// lambda api
		list.stream().filter(t -> t.startsWith("J")).forEach(t -> System.out.println(t)	);
		
		//for map we use filter for conditional or filter check 
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj -> System.out.println("From Map Stream :" + obj));

	}

	private static void m1(String s) {
		System.out.println("From m1() " + s);
	}

}
