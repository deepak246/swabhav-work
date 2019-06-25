package com.techlabs.organization.service;

import java.util.List;
import java.util.Map;

import com.techlabs.organization.business.Employee;
import com.techlabs.organization.business.EmployeeDTO;
import com.techlabs.organization.dataaccess.ILoadable;

public class HierarchyMap {
	private Map<Integer, List<Employee>> empMap;
	private Employee CEO;
	private EmployeeDTO empDTO;
	
	public HierarchyMap(ILoadable load) {
		empDTO = new EmployeeDTO(load);
		empMap = empDTO.toMap();
	}
	
	public void displayEmployee() {
		for(Map.Entry<Integer, List<Employee>> emp : empMap.entrySet()){
			System.out.println("key: "+emp.getKey()+" Value: "+emp.getValue());
		}
	}
}
