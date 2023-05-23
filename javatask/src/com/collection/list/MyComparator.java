package com.collection.list;

import java.util.Comparator;

public class MyComparator  implements Comparator<Integer>{

	@Override
	public int compare(Integer number1, Integer number2) {
		
		return number2.compareTo(number1);
	}



	

}
