package com.techlabs.storageitem;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.storageitem.test.TestStorageItem;

public class Folder implements IStorageItem {

	private int level;
	private static int tempLevel = 0;
	public static StringBuffer compositeBuilder = new StringBuffer();
	
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

	@Override
	public void display() {
		System.out.println(compositeBuilder + name);
		//TestStorageItem.compositeBuilder.append("   ");
		
		int x = 0;
		for(IStorageItem item: items) {
			if(item instanceof Folder) {
				Folder folder = (Folder)item;
				x = folder.getLevel();
			}
			if(tempLevel == x) {
				item.display();
			}
			else {
				tempLevel++;
				compositeBuilder.append("   ");
				item.display();
			}
					
		}
	}
}
	

