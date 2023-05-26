package com.examples;

public class Case1  {
   
	//IN this case we will see if we will not override run method
	
public static void main(String[] args) {
		
		Test1Thread test1 = new Test1Thread();
		test1.start();
		System.out.println(test1.getName());
		
		for(int i=0;i<4;i++) {
			System.out.println("main");
		}
	}
}

class  Test1Thread  extends Thread {
	
	
}
