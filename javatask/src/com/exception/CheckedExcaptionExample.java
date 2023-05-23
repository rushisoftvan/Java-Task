package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckedExcaptionExample {
    
	
	public static void main(String [] args) {
		CheckedExcaptionExample checkedExcaptionExample = new CheckedExcaptionExample();
		checkedExcaptionExample.writeDataInFile();
		
	}
	
	public void writeDataInFile() {
		String name= "rushikesh";
		
		
		try {
			Path path = Paths.get("sachin.txt");
			Files.write(path, name.getBytes());
		}
		catch(FileNotFoundException e){
			
			e.printStackTrace();
			System.out.println("rushikesh");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		  System.out.println("close connection");
		  
		}
	}
	
}
