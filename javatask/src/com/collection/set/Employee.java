package com.collection.set;

import com.collection.list.Student;

public class Employee implements Comparable<Employee> {
    
	private String name;
	private Integer salary;
	
	public Employee(String name,Integer salary) {
		this.name=name;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee employee) {
	  return	this.salary.compareTo(employee.getSalary());
	}

	
}
