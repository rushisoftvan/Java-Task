package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleOfFileWriter {
  
	public static void main(String[] args)  {
	/*
	 * Note : if we will use FileWriter we can write only character and string type of data
	 * If you are dealing with binary data (e.g. an image) use Streams.
       2.If you are using non-ASCII Unicode characters, use Readers/Writers.
3.If you are using ordinary ASCII text you can (usually) use either.
	 * we cant not primitive data to add in file 	
	 */
		String sentence = "I my name is rushikesh";
		try( FileWriter fileWriter = new FileWriter("rushi.txt",true)){
			fileWriter.write(sentence);
			 fileWriter.write("\n");
			 //System.out.println();
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
