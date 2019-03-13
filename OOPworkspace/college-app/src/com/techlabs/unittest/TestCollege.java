package com.techlabs.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.college.Branch;
import com.techlabs.college.College;
import com.techlabs.college.Student;

public class TestCollege {
	@Test
	public void checkIfNoOfStudentsIsEqualToNoOfAddedStudents() {
		College clg = new College();
		Student students[] = new Student[3];
		students[0] = new Student(101,"andheri","4/6/1990",Branch.CMPN);
		students[1] = new Student(102,"thane","2/5/1998",Branch.BIOM);
		students[2] = new Student(103,"wadala","5/1/2005",Branch.ETRX);
		clg.addStudent(students);
		
		int actualCount = clg.getStudentCount();
		int expectedCount = 3;
		
		assertEquals(actualCount, expectedCount);
	}
}
