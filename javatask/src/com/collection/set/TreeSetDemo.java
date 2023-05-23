package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet is implemention of sortedSet
 * if we want to put group of object in one entity where duplicates are not allow and all object in sorting order
 * 
 */

public class TreeSetDemo {
    
	/*
	 * here when we add  object in TressSet objects should be same type and give the imple of comparable
	 * String and wrapper class give he imp of comparable
	 * It will add object natural sorting order
	 */
	
	public static void main(String[] args) {
		
		//Exampale 1
		Set<String> names = new TreeSet<>();
		names.add("rushi");
		names.add("sunita");
		names.add("abhi");
		names.add("ABHI");
		names.add("RUSHIKESH");
		System.out.println(names);//[ABHI, RUSHIKESH, abhi, rushi, sunita]
		
		
		//Exampale 2
		
		TreeSet<StringBuffer> states = new TreeSet<>();
		states.add(new StringBuffer("kalkata"));
		states.add(new StringBuffer("gujrat"));
		states.add(new StringBuffer("mharastra"));
		states.add(new StringBuffer("mp"));
		System.out.println(states);
		
		//Exampale 3
		 TreeSet t=new TreeSet();
		 t.add(new StringBuffer("A"));
		 t.add(new StringBuffer("Z"));
		 t.add(new StringBuffer("L"));
		 t.add(new StringBuffer("B"));
		 System.out.println(t);
		 
	}
	
	
	
}
