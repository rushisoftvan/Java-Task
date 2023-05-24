package com.functionalinterface.withlambdaExpression;
/**
 * 
 * If we will use the lambda expression  we do not need to create class and imp interface in this class and the where we have to use to create object and use method 
 * we can direct give the im
 */
public class Main {
    public static void main(String[] args) {
		LengthFinder withLamdaInterface =  (name)->name.length();//if we have only one line code then we dont need to use {} this and return
		int result = withLamdaInterface.findLengthOfName("rushikesh");
		System.out.println(result);
		
	}
}
