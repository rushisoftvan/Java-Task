package com.examples;

public class GenerateThradWithRunnableExample {
	
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		thread.setPriority(10);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		 for(int i=0;i<4;i++) {
			 System.out.println("main");
		 }
	}
  
}
class MyRunnable implements Runnable{

	@Override
	public void run() {
	
		for(int i=0;i<4;i++) {
			System.out.println("runnable");
		}
	}
	
}


