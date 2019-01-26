package com.techlabs.assignment;

import java.io.*;

public class ReadFile {
	public static void main(String args[]) throws IOException {
		int character;

		FileReader fr = null;
		try {
			fr = new FileReader("output.txt");
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}

		while ((character = fr.read()) != -1)
			System.out.print((char) character);

		fr.close();
	}

}
