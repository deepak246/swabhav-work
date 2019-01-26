package com.techlabs.employee.test;

import com.techlabs.employee.*;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("A","B");
		Employee e2 = new Employee("C","D");
		
		System.out.println(e1.getEmpno());
		System.out.println(e1.getEmpno());
		System.out.println(e2.getEmpno());
	}

}
