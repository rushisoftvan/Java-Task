package com.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
  * when our requirment  duplicates are not allow and we have to maintaine order we will use LinkedHashSet 
 *
 */
public class LinkedHashSetDemo {
	
	public static void main(String [] args) {
		
		Set<String> names = new LinkedHashSet<>();
		names.add("rushikesh");
		names.add("karan");
		names.add("suraj");
		names.add("deepak");
		
		System.out.println(names);//[rushikesh, karan, suraj, deepak]
		
		
	}
	

}
