package com.exception;


public class ExceptionExample {
   
	
	public static void main(String [] args) {
		ExceptionExample exceptionExample = new ExceptionExample();
		
		exceptionExample.checkEligibleForVote(20);
		
		exceptionExample.findlengthOfName(null);
		System.out.println("rushikesh");
	}
	
	//eligible
	public void checkEligibleForVote(Integer age) {
		
		if(age>18) {
          		System.out.println("You are eligible for vote");	
		}
		else {
			throw new NotEligibleForVoteException("you are not eligible for vote");
		}
	}
	
	public int findlengthOfName(String name) {
		if(name!=null) {
			return name.length();
		}
		throw new NullPointerException("name should not be null");
	}
	
	
}
