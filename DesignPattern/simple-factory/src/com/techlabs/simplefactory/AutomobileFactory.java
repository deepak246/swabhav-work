package com.techlabs.simplefactory;

public class AutomobileFactory {
	
	private static AutomobileFactory instance = new AutomobileFactory();
	
	private AutomobileFactory() {
		
	}
	
	public IAutomobile make(AutoType autotype) {
		if(autotype == AutoType.AUDI) {
			return new Audi();
		}
		if(autotype == AutoType.BMW) {
			return new BMW();
		}
		if(autotype == AutoType.TESLA) {
			return new Tesla();
		}
		return null;
	}
	
	public static AutomobileFactory getInstance() {
		return instance;
	}
}
