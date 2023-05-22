package com.oops.inheritance;

public class Teacher {
     private String designation;
     private String collegeName;
     
    public Teacher(String designation,String collegeName ) {
    	this.designation=designation;
    	this.collegeName=collegeName;
    }
   
   public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

public void does() {
	  System.out.println("Teaching");
	  
   } 
}




