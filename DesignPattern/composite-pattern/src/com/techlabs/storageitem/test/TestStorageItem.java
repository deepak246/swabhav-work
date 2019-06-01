package com.techlabs.storageitem.test;

import com.techlabs.storageitem.File;
import com.techlabs.storageitem.Folder;

public class TestStorageItem {

	public static StringBuffer compositeBuilder = new StringBuffer();
	
	public static void main(String[] args) {
		Folder root = new Folder("Movies");
		Folder folder2 = new Folder("Hollywood");
		Folder folder3 = new Folder("NEW");
		Folder folder4 = new Folder("cartoon");
		Folder folder5 = new Folder("test123");
		File file1 = new File("KGF","mp4",1.10f);
		File file2 = new File("ABCD","mp4",2.40f);
		File file3 = new File("Inception","mp4",1.5f);
		File file4 = new File("Avengers","mp4",3.0f);
		File file5 = new File("Detective-Pikachu","mp4",1.8f);
		File file6 = new File("Pokemon","mp4",2.5f);
		root.addItem(file1);
		root.addItem(file2);
		root.addItem(folder2);
		folder2.addItem(file3);
		
		folder2.addItem(folder4);
		//folder4.addItem(file5);
		folder2.addItem(folder5);
		folder2.addItem(folder3);
		
		
		folder3.addItem(file4);
		folder3.addItem(file5);
		
		folder4.addItem(file6);
		
		root.setLevel(0);
		folder2.setLevel(1);
		folder3.setLevel(2);
		folder4.setLevel(2);
		folder5.setLevel(2);
		//System.out.println(folder3.getLevel());
		root.display();
	}

}
