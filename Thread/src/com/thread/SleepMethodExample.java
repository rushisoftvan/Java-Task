package com.thread;

public class SleepMethodExample {
   
	public static void main(String[] args) {
	    SleepTestexample sleepTestexample = new  SleepTestexample();
	    sleepTestexample.start();
	    //sleepTestexample.interrupt();
	    for(int i=0;i<3;i++) {
	    	System.out.println("main");
	    }
	}
	
}

class SleepTestexample extends Thread {
	
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("rushikesh");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * main
      main 
     main
     	rushikesh
	 */
}
