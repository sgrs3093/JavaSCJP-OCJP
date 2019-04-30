package com.sgr.java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate functional interface we can use for Conditional check 
 * always return either true or false
 */
public class PredicateDemo // implements Predicate<Integer>
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Predicate#test(java.lang.Object)
	 * 
	 * Traditional way to call the interface method we will use lamda expression
	 * as it is Functional interface
	 * 
	 * Commenting this to use Lambda Expression
	 */
	/*
	 * @Override public boolean test(Integer t) {
	 * 
	 * if (t % 2 == 0) return true; else return false;
	 * 
	 * }
	 */

	public static void main(String[] args) {

		// As we use anonmous function so removing the return type etc
		// Below code we can optimize more
		/*
		 * Predicate<Integer> p = (t) -> {
		 * 
		 * if (t % 2 == 0) return true; else return false;
		 * 
		 * };
		 */

		Predicate<Integer> p = (t) -> t % 2 == 0;// we are using predicate for
													// conditional check
		System.out.println(p.test(8));

		/*
		 * Predicate<Integer> p = new PredicateDemo();
		 * 
		 * System.out.println(p.test(1));
		 */

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		list.stream().filter(p).forEach(t -> System.out.println("Print Even :" + t));//Or passing Predicate reference in filter method we can pass simply 
		//condition 
		System.out.println("After passing in One Line");
		list.stream().filter(t->t % 2 == 0).forEach(t->System.out.println("Print even :"+t));
	}

}
