package com.techlabs.dip.solution.test;

import com.techlabs.dip.solution.DBLog;
import com.techlabs.dip.solution.TaxCalculator;

public class TestTaxCalculator {

	public static void main(String[] args) {
		TaxCalculator tc = new TaxCalculator(new DBLog());
		System.out.println(tc.calculate(0, 0));
	}

}
