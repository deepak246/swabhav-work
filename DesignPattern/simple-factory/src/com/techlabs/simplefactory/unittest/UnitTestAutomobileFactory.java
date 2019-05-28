package com.techlabs.simplefactory.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.AutomobileFactory;
import com.techlabs.simplefactory.IAutomobile;

public class UnitTestAutomobileFactory {

	@Test
	public void checkWhetherCorrectInstanceIsGettingCreated() {
		AutomobileFactory factory = AutomobileFactory.getInstance();
		
		IAutomobile auto = factory.make(AutoType.AUDI);
		String expected = "Audi";
		String actual = auto.getClass().getSimpleName();
		assertEquals(expected.toLowerCase(),actual.toLowerCase());
	}
}
