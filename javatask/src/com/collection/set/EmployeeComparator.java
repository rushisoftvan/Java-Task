package com.collection.set;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee2.getSalary().compareTo(employee1.getSalary());
	}

}
