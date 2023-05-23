package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

import javax.xml.stream.events.Namespace;

public class ComparableDemoForSet {
	
 public static void main(String [] args) {
	 Set<String> names =new TreeSet<>();
	  names.add("rushikesh");
	  names.add("abhishek");
	  names.add("karan");
	  names.add("sachin");
	  names.add("sachin");
	  System.out.println(names);
	  
	  //comparable for Custome object
	  
	  Set<Employee> employees = new TreeSet<>();
	  employees.add(new Employee("karan", 34));
	  employees.add(new Employee("sachin", 33));
	  employees.add(new Employee("karan", 37));
	  employees.add(new Employee("karan", 37));
	  employees.add(new Employee("sachin", 33));
	  System.out.println(employees);//[Employee [name=sachin, salary=33], Employee [name=karan, salary=34], Employee [name=karan, salary=37]]
	  System.out.println(employees.size());
	 
 }	
  
}
