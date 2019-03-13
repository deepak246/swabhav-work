package com.techlabs.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.college.Branch;
import com.techlabs.college.Student;

public class TestStudent {
	@Test
	public void checkStudentIsGettingAddedUsingGetter() {
		Student student = new Student(101,"andheri","4/6/1990",Branch.CMPN);
		int actualId = student.getId();
		int expectedId = 101;
		assertEquals(actualId, expectedId);
	}
}
