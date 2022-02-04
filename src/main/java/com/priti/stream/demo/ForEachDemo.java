package com.priti.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Murrit");
		list.add("john");
		list.add("peter");
		list.add("mark");
		list.add("mac");
		
		//iteration -traditional apporach
		 for(String s : list) {
			 System.out.println(s);
		 }
		 
		 System.out.println("\n");
		//iteration - forEach () from java stream api
		 list.stream().forEach(t->System.out.println(t));
		 System.out.println("\n");
		 Map<Integer, String> maps = new HashMap<>();
		 maps.put(1, "a");
		 maps.put(2, "b");
		 maps.put(3, "c");
		 maps.put(4, "d");
		 maps.put(5, "e");
		 
		 maps.forEach((key,value)->System.out.println(key+":"+value));// we cannot use pipelined method of stream
		 maps.entrySet().stream().forEach(obj-> System.out.println(obj));
		 
		 Consumer<String> consumer = (t)-> System.out.println(t);
		// consumer.accept("Hi Priti- demo for consumer");
		 for(String s1:list) {
			 consumer.accept(s1);
		 }
	}

}
