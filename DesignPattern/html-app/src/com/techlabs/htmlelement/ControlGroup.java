package com.techlabs.htmlelement;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtmlElement {

	private String tagName;
	private List<IHtmlElement> children;
	
	public ControlGroup(String tagName) {
		this.tagName = tagName;
		children = new ArrayList<IHtmlElement>();
	}
	
	public String getTagName() {
		return tagName;
	}

	public List<IHtmlElement> getChildren() {
		return children;
	}

	@Override
	public String buildHtml() {
		String str = "<"+tagName+">";
		for(IHtmlElement ele : children) {
			str = str + "\n"+ele.buildHtml();
		}
		return str + "\n</"+tagName+">";
	}
	
	public void addChild(IHtmlElement ele) {
		children.add(ele);
	}
	
}
