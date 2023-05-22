package com.oops.inheritance;

//inheritance concept
public class Animal {
   
	/*
	 * declare variables as private it is on of the oops concept datahiding
	 */
	private  Integer leges;
	private  Integer tail;
	private  Integer eyes ;
	
	public Animal (Integer leges,Integer tail,Integer eyes) {
	   this.leges=leges;
	   this.tail=tail;
	   this.eyes=eyes;
	}
	
	public Integer getLeges() {
		return leges;
	}

	public void setLeges(Integer leges) {
		this.leges = leges;
	}

	public Integer getEyes() {
		return eyes;
	}

	public void setEyes(Integer eyes) {
		this.eyes = eyes;
	}

	public String  eat() {
	  return	 "I eat vegetarian";
	}
	
	
	
}
