package com.priti.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemoWithStream {

	public static void main(String[] args) {

		/*
		 * Predicate<Integer> predicate = t -> t % 2 == 0 ;
		 * System.out.println(predicate.test(9));
		 * 
		 * 
		 * //example using stream List<Integer> list = Arrays.asList(1,2,3,4,5);
		 * list.stream().filter(predicate).forEach(t ->
		 * System.out.println("print even : " + t));// we can pass directly lambda
		 * Consumer FI
		 */

		// example using stream
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print even : " + t));// we can pass
																									// directly lambda
																									// Consumer FI

	}
}