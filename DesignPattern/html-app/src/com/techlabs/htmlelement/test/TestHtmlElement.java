package com.techlabs.htmlelement.test;

import com.techlabs.htmlelement.Control;
import com.techlabs.htmlelement.ControlGroup;

public class TestHtmlElement {

	public static void main(String[] args) {
		ControlGroup cg1 = new ControlGroup("form");
		cg1.addChild(new Control("text","input","firstname"));
		cg1.addChild(new Control("text","input","lastname"));
		cg1.addChild(new Control("submit","input","Submit"));
		System.out.println(cg1.buildHtml());
	}

}
