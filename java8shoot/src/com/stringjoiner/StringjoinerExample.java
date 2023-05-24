package com.stringjoiner;

import java.util.StringJoiner;

/*
 * String joiner is use for join thw
 */
public class StringjoinerExample {
	
	public static  void main (String [] args) {
		StringJoiner stringJoinerResult = new StringJoiner("-");
		stringJoinerResult.add("rushikesh");
		stringJoinerResult.add("malavdkar");
		stringJoinerResult.add("abhi");
		stringJoinerResult.add("kishan");
		
		System.out.println(stringJoinerResult);// output :  rushikesh-malavdkar-abhi-kishan
	}

}
