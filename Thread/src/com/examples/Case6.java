package com.examples;


/*
 * let see if we have started one thread and if we will start this thread again whai will be happen
 * we will be get java.lang.IllegalThreadStateException this type of error
 */
public class Case6 {
    
	public static void main(String[] args) {
		
		Test6Thread test6Thread = new Test6Thread();
		test6Thread.start();
		test6Thread.start();
		
		for(int i=0;i<4;i++) {
			System.out.println("main");
		}
	}
}

class Test6Thread extends Thread {
	
	public void run() {
		
		for(int i=0;i<4;i++) {
			System.out.println("run");
		}
	}
}
