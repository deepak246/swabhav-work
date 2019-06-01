package com.techlabs.organization.dataaccess;

import java.util.Set;

import com.techlabs.organization.business.Employee;

public interface ILoadable {
	public Set<Employee> readData();
}
