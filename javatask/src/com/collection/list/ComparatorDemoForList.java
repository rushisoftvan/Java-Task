package com.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Comparator use for customized sorting order
public class ComparatorDemoForList {
    
	public static  void main(String [] args) {
	      List<Integer> numbers = Arrays.asList(3,2,1,7,5,5);
	      Collections.sort(numbers,new MyComparator());
	      System.out.println(numbers);
	      
	      
	      List<Student> students = Arrays.asList(new Student("rushikesh",45),new Student("sachin",47),new Student("abhi",48),new Student("abhi",48));
	      Collections.sort(students, new StudentComparator());
	      System.out.println(students);//[Student [name=abhi, age=48], Student [name=abhi, age=48], Student [name=sachin, age=47], Student [name=rushikesh, age=45]]

	}
	
	
	
	
}
