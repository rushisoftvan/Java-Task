package com.thread;

public class ThreadDemo {
    
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println(myThread.getName());
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			
			
			System.out.println("main");
		}
	}
	/**
	 * Output :  Thread-0 
main
rusikesh
rusikesh
rusikesh
rusikesh
rusikesh
main
main
main
main
main

	 */
}

