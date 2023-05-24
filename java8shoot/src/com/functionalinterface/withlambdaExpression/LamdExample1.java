package com.functionalinterface.withlambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LamdExample1 {
    
	public static void main(String [] args) {
		//example 1
		List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,10);
		//in comparator method int compare(T o1, T o2); now we will convert this function in lamda
		Collections.sort(numbers,(Integer number1,Integer number2)->number2.compareTo(number1));
		System.out.println(numbers);// output [10, 9, 8, 7, 6, 5, 4, 3, 2]
		
		//Example 2
		List<String> names = Arrays.asList("rushikesh","ranoji","malavdkar","abhishek","ketan");
		Collections.sort(names,(String name1,String name2)->  name2.compareTo(name1));
        System.out.println(names);//output [rushikesh, ranoji, malavdkar, ketan, abhishek]  		
		
	}
}
