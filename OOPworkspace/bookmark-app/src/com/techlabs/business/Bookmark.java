package com.techlabs.business;

public class Bookmark {
	private String name,url;
	
	public Bookmark(String name, String url) {
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public String getUrl() {
		return url;
	}
}
