package com.oops.datahidingandencapsulation;

/**
 * 
 * In data hiding declare all variable as private no any one get directly by
 * using getter and setter method any one get the over class data
 * all class in java flow the encapsulation Student related all variable and method in one unit
 */
public class Student {

	private String name;
	private String age;

	public Student(String name, String age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
