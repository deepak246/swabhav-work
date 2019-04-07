package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.Holi;
import com.techlabs.ocp.solution.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {
		Holi holi = new Holi();
		
		FixedDeposit fd = new FixedDeposit("101","deepak",100,2,holi);
		System.out.println(fd.calculateSimpleInterest());
	}

}
