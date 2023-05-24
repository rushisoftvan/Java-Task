package com.optional;

import java.util.Optional;

public class OptionalExampale1 {
    
	
	public static void main(String [] args) {
		
		
		String name=null ;
		Optional<String> ofNullable = Optional.ofNullable(name);
		System.out.println(ofNullable);// return Optional.empty
		
		
	}
	
	
	
	
}
