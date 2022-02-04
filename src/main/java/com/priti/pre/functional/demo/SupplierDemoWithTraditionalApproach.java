package com.priti.pre.functional.demo;

import java.util.function.Supplier;

public class SupplierDemoWithTraditionalApproach implements Supplier<String> {

	@Override
	public String get() {
		return "Supplier example with tradition approach";
	}

	public static void main(String[] args) {
		Supplier<String> supplierDemo = new SupplierDemoWithTraditionalApproach();
		System.out.println(supplierDemo.get());
	}
}
