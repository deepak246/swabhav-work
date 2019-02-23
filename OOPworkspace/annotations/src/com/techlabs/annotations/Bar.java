package com.techlabs.annotations;

public class Bar {
	
	@ProUnitTest
	public boolean m1() {
		return true;
	}
	
	@ProUnitTest
	public boolean m2() {
		return true;
	}
	
	@ProUnitTest
	public boolean m3() {
		return false;
	}
	
	public boolean m4() {
		return false;
	}

}
