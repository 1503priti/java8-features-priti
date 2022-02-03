package com.priti.java8features;

interface Calculator {
//	void switchOn();
//	void sum(int input);
	int substract(int i1, int i2);
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

		/*
		 * Calculator calculator = () -> System.out.println("Switched On");
		 * 
		 * calculator.switchOn();
		 */
		/*
		 * Calculator calculator = (input) -> System.out.println("Sum : " + input);
		 * 
		 * calculator.sum(4);
		 */

		/*
		 * Calculator calculator = (i1, i2) ->{ return i2-i1; };
		 */
		Calculator calculator = (i1, i2) -> i2 - i1;

		System.out.println(calculator.substract(5, 18));
	}
}