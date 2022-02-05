package com.priti.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.priti.stream.api.example.DataBase;
import com.priti.stream.api.example.Employee;

public class SortListNonPrimitiveCustomDemo2 {
	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmployees();
		//anonymous function
		/*
		 * Collections.sort(employees, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return (int) (o1.getSalary() - o2.getSalary());//asc order }
		 * 
		 * });
		 */
		
		
		//lambda functions
		Collections.sort(employees, ( o1,  o2)-> (int) (o1.getSalary() - o2.getSalary()));//asc order		
		System.out.println(employees);
		System.out.println();
		employees.stream().sorted(( o1,  o2)-> (int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);

	}

}
/*
 * class MyComparator implements Comparator<Employee> {
 * 
 * @Override public int compare(Employee o1, Employee o2) {
 * 
 * //return (int) (o1.getSalary()-o2.getSalary());//ascending return (int)
 * (o1.getSalary()-o2.getSalary());//ascending }
 * 
 * }
 */
