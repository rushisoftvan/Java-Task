package com.thread;

public class JoinMethodExample {
      public static void main(String[] args) throws InterruptedException {
		
    	  TestThreadForJoin myThread = new TestThreadForJoin();
    	  myThread.start();
    	  myThread.join();
    	  for(int i=0;i<4;i++) {
    		  System.out.print("main");
    	  }
	}
}

class TestThreadForJoin extends Thread{
	
	public void run() {
		
		System.out.println("rushikeh");
	}
}


class NewThread  extends Thread{
	
	public void run() {
		new Thread();
	}
}

