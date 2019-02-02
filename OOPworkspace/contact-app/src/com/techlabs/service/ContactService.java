package com.techlabs.service;

import java.io.*;

import com.techlabs.business.Contact;

public class ContactService {
	private static String filePath = "Data\\Contact.csv";

	public static void storeContact(Contact contact) {
		try {
			FileWriter fw = new FileWriter(filePath, true);
			fw.write(" Contact name: " + contact.getName() + ", No: " + contact.getNo() + ", Email: "
					+ contact.getEmail() + "\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String[] retrieveContact() {
		BufferedReader reader = null;
		int size = countLines();
		String[] data = new String[size];
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();
			int i = 0;

			while (line != null) {
				data[i] = line;
				line = reader.readLine();
				i++;
			}
			reader.close();
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

	public static int countLines() {
		BufferedReader reader = null;
		int count = 0;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();

			while (line != null) {
				count++;
				line = reader.readLine();
			}

			reader.close();
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public static String searchedContact(String name) {
		BufferedReader reader = null;
		int size = countLines();
		String[] data = new String[size];
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();
			int i = 0;

			while (line != null) {
				data[i] = line;
				line = reader.readLine();
				i++;
			}
			reader.close();
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int j=0;j<size;j++) {
			if(data[j].contains(name)) {
				return data[j];
			}
		}
		return null;
	}

}
