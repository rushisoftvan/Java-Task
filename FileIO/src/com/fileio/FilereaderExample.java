package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilereaderExample {
   
	public static void main(String [] args)  {
		/*
		 * Note when we use FileReader to read the data from file it will read data character by character
		 */
		FileReader fileReader;
		try {
			fileReader = new FileReader("rushi.txt");
			int x;
			while((x=fileReader.read())!=-1) {
				System.out.println((char)x);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
