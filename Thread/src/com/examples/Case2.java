package com.examples;

public class Case2 {
    
	public static void main(String[] args) {
		// In overloading the run method which method we will be call
		Test2Thread test2Thread = new  Test2Thread();
		test2Thread.start();
		for(int i=0;i<3;i++) {
			System.out.println("rushikesh");
		}
	}
	/**
	 * output 1
	 * rushikesh
       rushikesh
       rushikesh
       test2Thread
       
       output 2
       test2Thread
       rushikesh
       rushikesh
       rushikesh


	 */
}

class Test2Thread extends Thread {
	
	public void run() {
		System.out.println("test2Thread");
	}
	
	public void run(int i) {
		System.out.println(i);
	}
}