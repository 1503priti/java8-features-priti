package com.priti.pre.functional.demo;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Printing : "+t);
		
	}
	public static void main(String[] args) {
		ConsumerDemo c1 = new ConsumerDemo();
		c1.accept(12);
		
	}

}
