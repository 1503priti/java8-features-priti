package com.priti.pre.functional.demo;

import java.util.function.Consumer;

public class ConsumerDemo {

	/*
	 * @Override public void accept(Integer t) {
	 * System.out.println("Printing : "+t);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		/*
		 * ConsumerDemo c1 = new ConsumerDemo(); c1.accept(12);
		 */
		Consumer<Integer> c = t -> System.out.println("Printing : " + t);

		c.accept(10);
	}

}
