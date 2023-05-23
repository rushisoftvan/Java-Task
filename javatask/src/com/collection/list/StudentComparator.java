package com.collection.list;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		
		return student2.getAge().compareTo(student1.getAge()) ;
	}

}
