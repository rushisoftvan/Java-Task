package com.oops.abstraction;

public class Car implements Vehicle {

	@Override
	public int getNoOfWheels() {
		
		return 4;
	}

	@Override
	public String useFuel() {
		
		return "deisel";
	}
   
}
