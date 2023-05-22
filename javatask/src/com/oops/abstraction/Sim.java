package com.oops.abstraction;

public abstract class  Sim {
    
	public void provide4g() {
		System.out.println("We provide 4g");
	}
	public abstract void provide5g();
	
}


class Jio extends Sim{

	@Override
	public void provide5g() {
         System.out.print("we are provide 5g");		
	}
	
}

