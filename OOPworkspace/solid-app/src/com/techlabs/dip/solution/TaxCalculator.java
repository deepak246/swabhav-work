package com.techlabs.dip.solution;

import com.techlabs.dip.solution.*;

public class TaxCalculator {
	private ILogger logger;
	public TaxCalculator(ILogger logger) {
		 this.logger = logger;
	}
	
	public int calculate(int amount1, int amount2) {
		int r;
		try {
			r = amount1/amount2;
		}
		catch(Exception e){		
			logger.log(e.getMessage());
			return -1;
		}
		return r;
	}
}
