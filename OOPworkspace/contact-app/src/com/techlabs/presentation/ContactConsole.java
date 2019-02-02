package com.techlabs.presentation;

import com.techlabs.business.Contact;

import com.techlabs.service.ContactService;
import java.util.*;
public class ContactConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter name of operation you want to perform");
			System.out.println("Contact Operations: 1.Add 2.Display 3.Search 4.Exit");
			choice = scanner.next();
			switch (choice) {
			case "add":
				System.out.println("Enter contact name");
				String name = scanner.next();
				System.out.println("Enter contact number");
				String no = scanner.next();
				System.out.println("Enter email");
				String email = scanner.next();
				Contact contact = new Contact(name, no, email);
				ContactService.storeContact(contact);
				break;
			case "display":
				String data[] = ContactService.retrieveContact();
				for(int i=0;i<data.length;i++)
					System.out.println(data[i]);
				break;
			case "search":
				String searchedContact = ContactService.searchedContact("deepak");
				System.out.println(searchedContact);
				break;
			default:
				System.out.println("Enter correct input");
			}
		}while(!choice.equalsIgnoreCase("exit"));
	}

}
