package com.techlabs.assignment;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		String str = "File Handling in Java using FileReader & FileWriter";
		FileWriter fw = new FileWriter("output.txt");

		for (int index = 0; index < str.length(); index++)
			fw.write(str.charAt(index));

		System.out.println("Writing successful");
		fw.close();

	}

}
