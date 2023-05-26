package com.thread;

public class YeildmethodExample {
   public static void main(String[] args) {
	
	   TestThread testThread = new TestThread();
	   DemoThread demoThread = new DemoThread();
	   testThread.setPriority(Thread.MAX_PRIORITY);
	   demoThread.setPriority(Thread.MAX_PRIORITY);
	 System.out.print(demoThread.getPriority());
	  System.out.println(Thread.currentThread().getPriority());                       
	   testThread.start();
	   demoThread.start();
	   //demoThread.yield();

	   
	   for(int i=0;i<2;i++) {
		   System.out.println("main");
	   }
	   
}
   
}

class TestThread  extends Thread{

	@Override
	public void run() {
       for(int i=0;i<4;i++) {
    	  System.out.println("TestThread");
       }
		
	}
	
}
 
class DemoThread  extends  Thread{

	@Override
	public void run() {
		Thread.yield();
		System.out.println("DemoThread");
		
	}
	
}
