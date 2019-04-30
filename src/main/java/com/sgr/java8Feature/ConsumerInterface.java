package com.sgr.java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/*
 * Stream API in java 8

why we need Stream api

1) Functional Programming 
2) Code Reduce
3) Bulk operation 

Methods:
Filter and ForEach method 


Java 8 Consumer ,Predicate ,Supplier 
---
If you want to play with Stream api then its importent 

Consumer Interface:
Consumer<T> is an inbuilt functional interface introduce in java 8
Consumer can be used in all contexts where an object needs to 
be consumed i.e taken as input , and some operation is to be performed on object
without returning any result .

when you need object as input and want to perform some operation and dont want
to return anything 

void accept (T t);

Predicate Functional Interface 
----------

we use this for conditional check 
if you want to check like true and false returning function in day to day 
Programming we should use Prdicate 

/* Evalutes the Predicate on given argument .

boolean test(T t);

3) Supplier Functional interface 

it can be used in all context where there is no input but an output is expected .

T get();

in Supplier method will not have any argument but always expect one return type

 * 
 * 
 */
public class ConsumerInterface // implements Consumer<String>
{

	/*
	 * @Override public void accept(String t) { System.out.println(t); }
	 */

	public static void main(String[] args) {

		Consumer c = t -> System.out.println(t);

		c.accept("hii");

		List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7);
		// System.out.println(list);

		// For Each method is taking consumer interface so we are passing
		// Consumer reference type
		// list.stream().forEach(c);

		list.stream().forEach(t -> System.out.println("print :" + t));

		/*
		 * ConsumerInterface c = new ConsumerInterface(); c.accept("sagar");
		 */

	}

}
