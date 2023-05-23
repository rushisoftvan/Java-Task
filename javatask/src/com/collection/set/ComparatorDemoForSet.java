package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemoForSet {
	
	public static void main(String [] args) {
		
		Set<Integer> numbers =  new TreeSet<>(new MyComparatorForInteger());
		numbers.add(12);
		numbers.add(13);
		numbers.add(34);
		numbers.add(6);
		numbers.add(5);
		numbers.add(3);
		System.out.println(numbers);// output : [34, 13, 12, 6, 5, 3]
		
		
		
		Set<Employee> employees = new TreeSet<>(new EmployeeComparator());
		  employees.add(new Employee("rushi",89));
		  employees.add(new Employee("sachin", 33));
		  employees.add(new Employee("karan", 37));
		  employees.add(new Employee("sachin", 33));
		  System.out.println(employees);
	}
     
	
	  
}
