package com.defauldmethodExample;

public interface LeftInterface {
     
	default void  print() {
		System.out.println("print in colorfull");
	}
}
