package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ArrayList is implemention class of List interface list is child interface of Collection interface
 * when we want to put group of object in one entity  where duplicates are allow and insertion order are maintaine
 * we will use List 
 * 
 * ArrayList is best choice for reterving the data 
 */
public class ArrayListSDemo {
 
	private static int size;

	public static void main(String [] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		System.out.println(numbers);// out put[1,3,2,3,5]
		
		int size = numbers.size();
		System.out.println(size);//5
		
		boolean isNumbersEmpaty = numbers.isEmpty();//false
		System.out.println(isNumbersEmpaty);
		
		boolean isavailable = numbers.contains(7);
		System.out.println(isavailable);//false
		
		int indexOf = numbers.indexOf(4);
		System.out.println(indexOf);//-1
		
		Integer value = numbers.get(4);
		System.out.println(value);//5
		
		 numbers.set(4, 10);//[1,3,2,3,10]
		 System.out.println(numbers);
		 
		 numbers.remove(4);
		 System.out.println(numbers);//[1,3,2,3]
		 
		 // For Student object
		 
		 List<Student> students = Arrays.asList(new Student("abhi", 23),new Student("sachin",34),new Student("karan", 45));
		 System.out.println(students);
		 int  sizeOfStudents = students.size();
		  System.out.println(sizeOfStudents);//3
		 
	}
	
}
