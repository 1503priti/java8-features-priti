package com.priti.pre.functional.demo;

import java.util.function.Supplier;

public class SupplierDemoWithLambdaExp {
	public static void main(String[] args) {
		/*
		 * Supplier<String> supplier = () -> { return "Supplier example with lambda"; };
		 */
		//concise the code
		Supplier<String> supplier = () ->  "Supplier example with lambda";

		System.out.println(supplier.get());
	}
}
