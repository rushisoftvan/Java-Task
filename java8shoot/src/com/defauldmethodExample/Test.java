package com.defauldmethodExample;

public class Test {
     public static void main(String[] args) {
    	 
		Jio jio = new Jio();
		 boolean is5gProvide = jio.is5gProvide();
		 System.out.println(is5gProvide);
		 
		 Bsnal bsnal = new Bsnal();
		  boolean is5gProverdForBsnal = bsnal.is5gProvide();
		  System.out.println(is5gProverdForBsnal);
		    
		  //static method in sim interface
		   Sim.getInternetSpeed();
	}
}
