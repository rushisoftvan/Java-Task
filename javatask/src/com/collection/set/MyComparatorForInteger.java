package com.collection.set;

import java.util.Comparator;

public class MyComparatorForInteger implements Comparator<Integer> {

	@Override
	public int compare(Integer number1, Integer number2) {
		
		return number2.compareTo(number1);
	}
  
}
