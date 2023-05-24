package com.defauldmethodExample;

public class Bsnal implements Sim {

	@Override
	public void call() {
	 
		System.out.println("we are provide good network for call");
		
	}

	@Override
	public void freeMassage() {
		
	  System.out.println("we are not provide service of free message");	
	}

	@Override
	public boolean is4GProvide() {
		
		return true;
	}
	
	public boolean is5gProvide() {
		return false;
	}

}
