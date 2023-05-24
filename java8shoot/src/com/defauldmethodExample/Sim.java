package com.defauldmethodExample;


/**
 * 
 * Now we have to add new 
 * functionality in the sim interface like 5g come in the market  
 *
 */
public interface Sim {
   
	public void call();
	
	public void freeMassage();
	
	public boolean is4GProvide();
	
	default boolean is5gProvide() {
		return true;
	}
	
	public static void getInternetSpeed() {
		System.out.println("net spped available 200mb/sec");
	}
}
