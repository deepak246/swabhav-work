package com.techlabs.employee.test;

import java.text.SimpleDateFormat;  
import java.util.Date;  

import com.techlabs.employee.*;

public class TestEmployee {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date();  
		
		Developer d = new Developer("Deepak",100,formatter.format(date));
		printDetails(d);
		Manager m = new Manager("XYZ",100,formatter.format(date));
		printDetails(m);
		Analyst a = new Analyst("ABC",100,formatter.format(date));
		printDetails(a);
	}
	public static void printDetails(Employee e) {
		System.out.println("Employee Id="+e.getEmpId()+" Employee name="+e.getname()
			+" Date of Joining="+e.getDate()+" Employee Salary="+e.calculateTotalSalary());
	}

}
