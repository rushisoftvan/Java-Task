package com.defauldmethodExample;

public class Jio implements Sim {

	@Override
	public void call() {
		
		System.out.println("we are provide goood network also in vilage area");
	}

	@Override
	public void freeMassage() {
		
		System.out.println("we are provide free message with good network");
	}

	@Override
	public boolean is4GProvide() {
		
		return true;
	}

}
