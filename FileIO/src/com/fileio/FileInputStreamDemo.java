package com.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamDemo {
        
	public static void main(String[] args) {
	     File file = new File("Files","abhi.txt");
	     try {
			FileInputStream fileInputStream = new FileInputStream(file);
			BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(fileInputStream));
			String line;
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
				//System.out.println
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
