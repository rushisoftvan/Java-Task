package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo {
  
	public static void main(String[] args) {
		
		/*
		 * FileOutStream and FileInputStream are use for read and write data in bytes from
		 */
		File file = new File("Files","abhi.txt");
		Student student = new Student("abhi", 3);
		
		byte[] studentInByte = student.toString().getBytes();
		  
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file,true);
			fileOutputStream.write(studentInByte);
			fileOutputStream.write(10);
			//fileOutputStream.write(10);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
