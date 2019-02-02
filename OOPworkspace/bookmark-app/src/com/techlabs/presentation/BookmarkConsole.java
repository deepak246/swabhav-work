package com.techlabs.presentation;

import com.techlabs.business.Bookmark;
import com.techlabs.service.BookmarkService;

import java.util.*;

public class BookmarkConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter name of operation you want to perform");
			System.out.println("Bookmark Operations: 1.Add 2.Display 3.Filepath 4.Exit");
			choice = scanner.next();
			switch (choice) {
			case "add":
				System.out.println("Enter bookmark name");
				String name = scanner.next();
				System.out.println("Enter the URL");
				String url = scanner.next();
				Bookmark bookmark = new Bookmark(name, url);
				BookmarkService.addBookmark(bookmark);
				break;
			case "display":
				BookmarkService.displayBookmark();
				break;
			case "filepath":
				BookmarkService.displayFilePath();
				break;
			case "exit":
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Please enter the correct name of operation");
			}
		}while(!choice.equalsIgnoreCase("exit"));
	}

}
