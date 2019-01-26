package com.techlabs.assignment;
import java.io.*;
public class AppendFile {

	public static void main(String[] args) {
		String text = "Added Text";

        try {
            FileWriter fw = new FileWriter("output.txt", true);
            fw.write(text);
            fw.close();
            System.out.println("Append successful");
        }
        catch(IOException e) {
        }
	}

}
