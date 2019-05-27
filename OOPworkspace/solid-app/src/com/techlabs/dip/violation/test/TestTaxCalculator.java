package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.LogType;
import com.techlabs.dip.violation.TaxCalculator;

public class TestTaxCalculator {

	public static void main(String[] args) {
		TaxCalculator tc = new TaxCalculator(LogType.DB);
		tc.calculate(0, 0);
	}

}
