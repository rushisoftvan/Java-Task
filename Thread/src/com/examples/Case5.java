package com.examples;



/*
 * here we will see what will be happen if i will override 
 * the start method and in over start method if wee call super.start() method what will happen let' see
 */
public class Case5 {
	
	public static void main(String[] args) {
		Test5Thread test5 = new Test5Thread();
		test5.start();
		System.out.println("main");
	}

}
 class Test5Thread extends Thread {
	 
	 public void start() {
		 super.start();
		 System.out.println("override start");
	 }
	 
	 public void run() {
		 System.out.println("run method");
	 }
	 
 }
