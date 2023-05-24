package com.defauldmethodExample;

public class LeftAndRightImp implements LeftInterface , RightInterface {
	
	public void print() {
		LeftInterface.super.print();
		RightInterface.super.print();
	}
	
	public static void main(String [] args) {
		LeftAndRightImp leftAndRightImp = new LeftAndRightImp();
	     leftAndRightImp.print();
	}

}
