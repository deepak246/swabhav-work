package com.techlabs.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


import com.techlabs.college.Professor;


public class TestProfessor {
	@Test
	public void checkProfessorIsGettingAddedUsingGetter() {
		Professor professor = new Professor(1,"dadar","24/5/2000");
		int actualId = professor.getId();
		int expectedId = 1;
		assertEquals(actualId, expectedId);
	}
}
