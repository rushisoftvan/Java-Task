package com.examples;

public class Case4 {
    
	public static void main(String[] args) {
		Test4Thread test4 = new Test4Thread();
		test4.start();
		System.out.println("main");
	}
	
}

class Test4Thread extends Thread {
	
  public void start() {
	  System.out.println("rushikesh");
	  }
  }	
	

