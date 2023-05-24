package com.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptioanlExample2 {
     
	public static void main(String [] args) {
		List<OnlineClass> onlineClasses = Arrays.asList(new OnlineClass(1, "springboot"),
				new OnlineClass(2, "jpa"),
				new OnlineClass(3, "mysql"),
				new OnlineClass(4, "spring core"),
				new OnlineClass(5, "springdatajpa"),
		        new OnlineClass(6, "spring aop")
				);
		
		Optional<OnlineClass> findFirst = onlineClasses.stream().filter(onlineClass-> onlineClass.getTitle().startsWith("java")).findFirst();
	               boolean present = findFirst.isPresent();
	               System.out.print(present);// output : false
		
	}
	
}
