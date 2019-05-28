package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.AutomobileFactory;
import com.techlabs.simplefactory.IAutomobile;

public class TestAutomobileFactory {

	public static void main(String[] args) {
		AutomobileFactory factory = AutomobileFactory.getInstance();
		
		IAutomobile auto = factory.make(AutoType.AUDI);
		auto.start();
		auto.stop();
		
		//IAutomobile auto = factory.make(AutoType.AUDI);
		
		//IAutomobile auto = factory.make(AutoType.AUDI);
	}

}
