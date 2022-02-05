package com.priti.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListNonPrimitiveDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		list.add(7);
		
		//traditional
		Collections.sort(list); //ascending
		System.out.println(list);
		Collections.reverse(list);//descending
		System.out.println(list);
		
		//by using stream-asc order
		list.stream().sorted().forEach(s->System.out.println(s));
		System.out.println();
		//by using stream-desc order
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
	}
	

}
