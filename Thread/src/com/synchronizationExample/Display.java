package com.synchronizationExample;

public class Display {
     
	public synchronized void wish(String name) {
		System.out.println("good morning");
		System.out.println(name);
	}
}
