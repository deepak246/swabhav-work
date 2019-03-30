package com.techlabs.employee.presentation;

import com.techlabs.employee.dataaccess.DiskLoader;
import com.techlabs.employee.dataaccess.WebLoader;
import com.techlabs.employee.service.EmployeeReportService;

public class TestEmployee {

	public static void main(String args[]) {
		DiskLoader diskLoader = new DiskLoader();
		WebLoader webLoader = new WebLoader();

		EmployeeReportService es = new EmployeeReportService(diskLoader);
		System.out.println("Maximum Salaried Employee: ");
		System.out.println(es.getMaxSalariedEmployee());
		
		System.out.println("Designation Count:");
		System.out.println(es.getDesignationBasedCount());

		System.out.println("Department Number Count:");
		System.out.println(es.getDepartmentBasedCount());
	}

}
