package com.techlabs.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.techlabs.business.Bookmark;

public class BookmarkService {
	private static String filePath = "Data\\Bookmark.html";

	private static void storeBookmark(Bookmark bookmark) {
		try {
			FileWriter fw = new FileWriter(filePath, true);
			fw.write(" <a href=\"" + bookmark.getUrl() + "\">" + bookmark.getName() 
						+ "</a><br>\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void addBookmark(Bookmark bookmark) {
		storeBookmark(bookmark);
		System.out.println("Bookmark Added successfully :)");
	}
	public static void displayBookmark() {
		int character;
		FileReader fr = null;
		try {
			fr = new FileReader(filePath);
			while ((character = fr.read()) != -1)
				System.out.print((char) character);
			fr.close();
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	public static void displayFilePath() {
		File file = new File(filePath);
		System.out.println(file.getAbsolutePath());
	}

}
