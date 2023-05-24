package com.defauldmethodExample;

public interface RightInterface {
  
	default void print() {
		System.out.println("print in black paper");
	}
}
