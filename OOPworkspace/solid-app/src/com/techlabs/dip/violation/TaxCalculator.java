package com.techlabs.dip.violation;

public class TaxCalculator {
	private LogType log;
	
	public TaxCalculator(LogType log) {
		this.log = log;
	}
	
	public void calculate(int amount1, int amount2) {
		try {
			int r = amount1/amount2;
		}
		catch(Exception e){
			if(log == log.FILE) {
				new FileLog().log(e.getMessage());
			}
			if(log == log.DB) {
				new DatabaseLog().log(e.getMessage());
			}
		}
	}
}
