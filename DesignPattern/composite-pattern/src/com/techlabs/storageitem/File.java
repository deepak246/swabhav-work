package com.techlabs.storageitem;

import com.techlabs.storageitem.test.TestStorageItem;

public class File implements IStorageItem{

	private String name, extension;
	private float size;
	
	public File(String name, String extension, float size) {
		this.name = name;
		this.extension = extension;
		this.size = size;
	}
	
	
	public String getName() {
		return name;
	}

	public String getExtension() {
		return extension;
	}

	public float getSize() {
		return size;
	}

	@Override
	public void display() {
		//System.out.println("File Name:"+name+" size:"+size+" extension:"+extension);
		System.out.println(Folder.compositeBuilder + name+" "+size);
	}
	
	
}
