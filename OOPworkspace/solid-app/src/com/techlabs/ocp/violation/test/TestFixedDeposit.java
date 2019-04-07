package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.FestivalType;
import com.techlabs.ocp.violation.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit("101","deepak",100,2,FestivalType.HOLI);
		System.out.println(fd.calculateSimpleInterest());
	}

}
