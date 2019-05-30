package com.techlabs.htmlelement;

public class Control implements IHtmlElement{
	private String type, tagName, value;

	public Control(String type, String tagName, String value) {
		this.type = type;
		this.tagName = tagName;
		this.value = value;
	}
	
	@Override
	public String buildHtml() {
		return "  <"+tagName+" type="+type+" name="+value+"> <br>";
	}

	public String getType() {
		return type;
	}

	public String getTagName() {
		return tagName;
	}

	public String getValue() {
		return value;
	}
	
}
