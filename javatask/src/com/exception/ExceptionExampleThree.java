package com.exception;

public class ExceptionExampleThree {
	
	public static void main(String [] args) {
		ExceptionExampleThree exceptionExampleThree = new ExceptionExampleThree();
		exceptionExampleThree.checkRechargeAvailable(23);
	}
	
	public void  checkRechargeAvailable(Integer price) {
		if(price>100) {
			System.out.println("recharge available");
		}
		throw new RechargeNotAvailableException("recharge not available");
	}

}
