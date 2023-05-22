package com.collection.set;

import java.util.Set;

import javax.print.attribute.standard.NumberUpSupported;

import com.collection.list.Student;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 
 * if we want to put group of object in one entity where duplicates are not allow and insertion order is not maintain
 *HashSet and LinkedHashSet are the implemention of set interface.
 *Set interface is child interface of collection interface
 *if over frequent operation is seraching then we will use HashSet
 *HashSet and Linked HashSet are same but one defferencebetween them
 *In HashSet order is not maintaine	
 *In LinkedHashSet order is maintaine
 */
public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		numbers.add(10);
		numbers.add(8);
		numbers.add(9);
		System.out.println(numbers);//[1, 5, 7, 8, 9, 10]
		
		int size = numbers.size();
		System.out.println(size);//6
		
		boolean contains = numbers.contains(5);
		System.out.println(contains);//true
		
		Set<Student> students  = new HashSet<>();
		students.add(new Student("karan", 23));
		students.add(new Student("karan", 23));
		students.add(new Student("karan", 24));
		students.add(new Student("sumit", 23));
		students.add(new Student("abhi", 28));
		students.add(new Student("karan", 30));
		
		System.out.println(students);//[Student [name=karan, age=23], Student [name=karan, age=24], Student [name=abhi, age=28], Student [name=sumit, age=23], Student [name=karan, age=30]]
		int sizeOfStudent = students.size();
		System.out.println(sizeOfStudent);//5
		
		//LinkedHashSet exampale
		
		Set<String> names = new LinkedHashSet<>();
		names.add("rushikesh");
		names.add("abhishek");
		names.add("rushikesh");
		names.add("karan");
		System.out.println(names);//[rushikesh, abhishek, karan]
	}
	
			
 
}
