package com.synchronizationExample;

public class Example {
	
       public static void main(String[] args) {
		  TestDemo testDemo1= new TestDemo();
		  TestDemo testDemo2= new TestDemo();
		  testDemo1.start();
		  testDemo2.start();
		  
		  for(int i=0;i<2;i++) {
			  Display display = new Display();
			  display.wish("abhishek");
			  System.out.println("main");
		  }
	}
       
       /*
        * run
        good morning
       rushikesh
        good morning
         abhishek

         good morning
          abhishek

run
good morning
rushikesh

        */

}


class TestDemo extends Thread {
	
	public void run() {
		System.out.println("run");
		Display display = new Display();
		display.wish("rushikesh");
	}
}
