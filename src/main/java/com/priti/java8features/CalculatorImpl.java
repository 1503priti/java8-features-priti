package com.priti.java8features;

interface Calculator {
	void switchOn();

}

// no need to write implements here
public class CalculatorImpl {

	// Traditional way
	/*
	 * @Override public void switchOn() { System.out.println("Switched On");
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// () -> {body};

		Calculator calculator = () -> {
			System.out.println("Switched On");

		};
		calculator.switchOn();
	}
}