package com.examples;

/*
 * what will happen whem we override start method
 * 
 * result : no new thread will be created here only one thread will be craetd it will main
 */
public class Case3 {
  
	public static void main(String[] args) {
		Test3Thraed test3 = new Test3Thraed();
		  test3.start();
		  System.out.println("abhisehk");
	}
	
}

class  Test3Thraed{
	
	public void start() {
		System.out.println("rushikesh");
	}
	
}
