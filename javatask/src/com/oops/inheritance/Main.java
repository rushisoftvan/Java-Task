package com.oops.inheritance;

public class Main {
    
	public static void main(String [] args) {
		
		/**
		 * inheritance concept check
		 *   
		 */
		Cow cow = new Cow(4,1,2);
		String eat = cow.eat();
		System.out.println(eat);
		Integer eyes = cow.getEyes();
		System.out.println(eyes);
		  
	  	 /*
	  	  * second exampale of  inheritance
	  	  * 
	  	  */
		MathsTeacher mathsTeacher = new MathsTeacher("Teacher","sal" );
		 mathsTeacher.does();
		 mathsTeacher.getCollegeName();
	  	 
		   
	}
}
