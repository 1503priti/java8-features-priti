package com.priti.stream.sort.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.priti.stream.api.example.DataBase;
import com.priti.stream.api.example.Employee;

public class SortListNonPrimitiveCustomDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		list.add(7);
		
	
		List<Employee> employees = DataBase.getEmployees();
		
		//sort employee based on salary - traditional way
		Collections.sort(employees, new MyComparator());
		System.out.println(employees);
		
	}
	

}
class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		//return (int) (o1.getSalary()-o2.getSalary());//ascending
		return (int) (o1.getSalary()-o2.getSalary());//ascending 
	}
	
}
