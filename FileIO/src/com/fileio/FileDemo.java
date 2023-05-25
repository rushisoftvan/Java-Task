package com.fileio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String [] args)  {
	  
		// File object represent the physical file
		
		File file = new File("rushi.txt");
		boolean isFileExists = file.exists();
		System.out.println(isFileExists);//output : false
		try {
			file.createNewFile();
			boolean isFileExistFinal = file.exists();// output : true
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// output : true
	    
           
			FileDemo.createFolderAndFile();
		
	}
	
	/*
	 * Exampale of File class wich is create folder and inside create file
	 */
	public static void createFolderAndFile()  {
		
		File file = new File("Files");
		//Create Folder
		boolean isDircteryCreated = file.mkdir();
		System.out.println(isDircteryCreated);
		File file2 = new File("Files", "abhi.txt" );
		File file3 = new File("Files","sachin.txt");
		try {
			file2.createNewFile();
			file3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/**
		 * to get the list of file in folder
		 */
		File[] listFiles = file.listFiles();
		for(File filex : listFiles) {
			System.out.println(filex);//Files/abhi.txt,Files/sachin.txt
			
		}
	}
  
		
	
}
