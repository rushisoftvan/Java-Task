package com.collection.list;

import java.util.Objects;

public class Student {
    private String name;
    private Integer age;
    
    public Student(String name,Integer age) {
    	this.name=name;
    	this.age=age;
    }

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name);
	}

	
     
}
