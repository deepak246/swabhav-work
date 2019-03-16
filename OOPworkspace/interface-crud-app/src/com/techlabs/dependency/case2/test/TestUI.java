package com.techlabs.dependency.case2.test;

import com.techlabs.dependency.case2.A;
import com.techlabs.dependency.case2.B;

public class TestUI {

	public static void main(String[] args) {
		A a = new A(new B());
		a.bar();
	}

}
