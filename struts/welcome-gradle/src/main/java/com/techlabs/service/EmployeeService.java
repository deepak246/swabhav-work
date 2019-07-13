package com.techlabs.service;

import java.util.List;

import com.techlabs.model.Employee;
import com.techlabs.repository.EmployeeRepository;

public class EmployeeService {
	EmployeeRepository repo = new EmployeeRepository();
	
	public List<Employee> getEmployees(){
		return repo.getData();
	}
}
