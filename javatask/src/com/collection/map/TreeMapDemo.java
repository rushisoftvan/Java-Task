package com.collection.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	//natural sorting order
    
	public static void main(String[] args) {
		 Map<Integer,String> namesDetails = new TreeMap<>();
	     namesDetails.put(5,"kishan");
	     namesDetails.put(2, "sunita");
	     namesDetails.put(7, "abhi");
	     namesDetails.put(8, "karam");
	     System.out.print(namesDetails);// {2=sunita, 5=kishan, 7=abhi, 8=karam}
	     
	     //
	     
	     
	}
	
         
}
