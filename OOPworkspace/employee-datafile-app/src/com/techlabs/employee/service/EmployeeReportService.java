package com.techlabs.employee.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlabs.employee.business.Employee;
import com.techlabs.employee.dataaccess.ILoadable;

public class EmployeeReportService {
	private Set<Employee> employees;
	
	public EmployeeReportService(ILoadable obj) {
		employees = obj.readData();
	}
	
	public Employee getMaxSalariedEmployee() {
		double max = 0;
		Employee tempEmployee = null;
		for(Employee employee: employees) {
			if(employee.getSalary() > max) {
				max = employee.getSalary();
				tempEmployee = employee;
			}
		}
		return tempEmployee;
	}


	public Map<String,Integer> getDesignationBasedCount() {
		
		HashMap<String, Integer> designationBasedEmployees = new HashMap<String, Integer>();
		for(Employee e: employees) {
			if(designationBasedEmployees.containsKey(e.getDesignation())) {
				designationBasedEmployees.put(e.getDesignation(), 
						designationBasedEmployees.get(e.getDesignation()) + 1);
			}
			else {
				designationBasedEmployees.put(e.getDesignation(), 1);
			}
		}
		return designationBasedEmployees;
	}

	public Map<Integer,Integer> getDepartmentBasedCount() {
		Map<Integer, Integer> deptNoBasedEmployees = new HashMap<Integer, Integer>();
		for(Employee e: employees) {
			if(deptNoBasedEmployees.containsKey(e.getDeptNo())) {
				deptNoBasedEmployees.put(e.getDeptNo() , 
						deptNoBasedEmployees.get(e.getDeptNo()) + 1);
			}
			else {
				deptNoBasedEmployees.put(e.getDeptNo(), 1);
			}
		}
		return deptNoBasedEmployees;	
	}
}
