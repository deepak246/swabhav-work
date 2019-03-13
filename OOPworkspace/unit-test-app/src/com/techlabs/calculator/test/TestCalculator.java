package com.techlabs.calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.calculator.Calculator;

public class TestCalculator {
	@Test
	public void shouldBeCubing2WithResult8() {
		Calculator calculator = new Calculator();
		int num = 2;
		long actual = calculator.cubeEvenNo(num);
		long expected = 8;
		assertEquals(expected, actual);
	}
}
