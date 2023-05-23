package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    
	public static void main(String[] args) {
		Map<Integer,String > namesDetails = new HashMap();
	    namesDetails.put(1,"sunita");
		namesDetails.put(2,"abhi");
		namesDetails.put(3,"ketan");
		namesDetails.put(4,"sachin");
		namesDetails.put(1,"rushikesh");
		System.out.println(namesDetails);
	    
		String name = namesDetails.get(4);
		System.out.println(name);//sachin
		
		Set<Entry<Integer, String>> entrySet = namesDetails.entrySet();
		System.out.println(entrySet);
		
		Set<Integer> rollNumber = namesDetails.keySet();
		System.out.println(rollNumber);//[1, 2, 3, 4]
		
		Collection<String> names = namesDetails.values();
		
	    System.out.println(names);
	    
	    boolean isAvailableKey = namesDetails.containsKey(10);
	    System.out.println(isAvailableKey);//false
	    
	    Map<Manager,Integer> managerDetails = new TreeMap<>( new ManagerComparator());
	    
	    managerDetails.put(new Manager("sumit", 23), 2000);
	    managerDetails.put(new Manager("amit", 24), 3000);
	    managerDetails.put(new Manager("amit", 24), 5000);
	    managerDetails.put(new Manager("ketan", 28), 70000);
	    managerDetails.put(new Manager("naveen", 29), 2000);
	    
	    System.out.println(managerDetails);
		  
		
	}
	
}
