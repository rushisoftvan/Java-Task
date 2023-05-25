package com.fileio;

public class Student {
  private String name;
  private Integer age;
  
  public Student(String name, Integer age) {
	  this.name=name;
	  this.age=age;
  }

@Override
public String toString() {
	return "name : "+this.name+" age :"+ age;
}
  
}
