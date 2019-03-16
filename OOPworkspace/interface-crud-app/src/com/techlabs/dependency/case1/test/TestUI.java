package com.techlabs.dependency.case1.test;

import com.techlabs.dependency.case1.A;
import com.techlabs.dependency.case1.B;

public class TestUI {

	public static void main(String[] args) {
		A a = new A(new B());
		a.bar();
	}

}
