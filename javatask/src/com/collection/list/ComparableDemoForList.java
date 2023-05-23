package com.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ComparableDemoForList {
   
	public static void main(String [] args) {
		
		List<String> names = Arrays.asList("rushi","abhi","ketan","kisan");
		System.out.println(names);//[rushi, abhi, ketan, kisan]
		Collections.sort(names);
		System.out.println(names);//[abhi, ketan, kisan, rushi]
		
		/**
		 * natural sorting order for our custom object
		 * here I have given the impl of Comparable in our Student class
		 */
		//List<Student> students = Arrays.asList(new Student("sachin",23),new Student("karan",22),new Student("kisan", 35));
		List<Student> students =  Arrays.asList(new Student("sachin",23),new Student("karan",22),new Student("kisan", 35));
		Collections.sort(students);
		System.out.println(students);//Student [name=karan, age=22], Student [name=sachin, age=23], Student [name=kisan, age=35]]

		
	}
	
}
