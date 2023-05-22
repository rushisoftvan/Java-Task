package com.oops.polymorphism;

public class Main {
    
	public static void main(String [] args) {
		//Overloading concept
	     OverlodingExampale overlodingExampale = new OverlodingExampale();
	     int resultForTwoValue = overlodingExampale.add(2, 2);
	     System.out.println(resultForTwoValue);
	     
	    int resultForThreeValue = overlodingExampale.add(2, 5, 7);
	    System.out.println(resultForThreeValue);
	    
	    /*
	     * overriding concepent
	     * 
	     */
	    
	          Bank bank = new Sbi();
	          int intrest = bank.getrateOfIntrest();//In overridng run time object method call
	          System.out.println(intrest);
	}
}
