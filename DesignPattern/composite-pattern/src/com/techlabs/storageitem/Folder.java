package com.techlabs.storageitem;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.storageitem.test.TestStorageItem;

public class Folder implements IStorageItem {

	private int level;
	private static int tempLevel = 0;
	
	private String name;
	private List<IStorageItem> items;
	
	public Folder(String name) {
		this.name = name;
		items = new ArrayList<IStorageItem>();
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getName() {
		return name;
	}

	public List<IStorageItem> getFiles() {
		return items;
	}

	public void addItem(IStorageItem item) {
		items.add(item);
	}
	
	public List<IStorageItem> getItems() {
		return items;
	}

	@Override
	public void display() {
		if(tempLevel > level) {		
			TestStorageItem.compositeBuilder.setLength(
					TestStorageItem.compositeBuilder.length() - 5);
			System.out.println(TestStorageItem.compositeBuilder + "==>" + name);
		}
		if(tempLevel <= level) {
			System.out.println(TestStorageItem.compositeBuilder + "==>" + name);
			tempLevel++;
		}
		TestStorageItem.compositeBuilder.append("     ");
		for(IStorageItem item: this.getItems()) {
			item.display();						
		}
	}
		
		
		
}

	

