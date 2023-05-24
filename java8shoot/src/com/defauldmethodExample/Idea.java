package com.defauldmethodExample;

public class Idea implements Sim {

	@Override
	public void call() {
		
		System.out.println("we are provide the service of good network call");
		
	}

	@Override
	public void freeMassage() {
		System.out.println("We are provide service of free message");
		
	}

	@Override
	public boolean is4GProvide() {
		
		return true;
	}

	
}
