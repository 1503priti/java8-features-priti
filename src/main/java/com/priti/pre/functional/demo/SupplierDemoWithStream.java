package com.priti.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemoWithStream {
	public static void main(String[] args) {

		//Supplier<String> supplier = () -> "Supplier example with lambda";

		// System.out.println(supplier.get());
		// List<String> list = Arrays.asList("a","b");
		//List<String> list = Arrays.asList(); // don't pass any string
		//System.out.println(list.stream().findAny().orElseGet(supplier));
		
		//System.out.println(list.stream().findAny().orElseGet(supplier));
		
		List<String> list = Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(() -> "Supplier example with stream"));
				
	}
}
