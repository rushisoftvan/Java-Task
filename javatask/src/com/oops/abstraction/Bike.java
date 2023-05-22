package com.oops.abstraction;

/*
 * we will use implements keyword for interface  
 */
public class Bike implements Vehicle {

	@Override
	public int getNoOfWheels() {
		
		return 2;
	}

	@Override
	public String useFuel() {
		// TODO Auto-generated method stub
		return "petrol";
	}

}
