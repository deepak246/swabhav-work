package com.techlabs.assignment;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) {
		try {
	         File file = new File("myfile.html");
	         
	         if(file.createNewFile())
	        	 System.out.println("Success!");
	      }
	      catch(IOException ioe) {
	         ioe.printStackTrace();
	      }
	}

}
