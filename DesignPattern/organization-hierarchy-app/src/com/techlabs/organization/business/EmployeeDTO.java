package com.techlabs.organization.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlabs.organization.dataaccess.ILoadable;

public class EmployeeDTO {
	private Set<Employee> empSet;
	private List<Employee> reportees;
	private Map<Integer , List<Employee>> empDetails;
	
	public EmployeeDTO(ILoadable load){
		empSet = load.readData();
		reportees = new ArrayList<Employee>();
		
	}
	
	public Map<Integer, List<Employee>> toMap() {
		empDetails = new HashMap<Integer,List<Employee>>();
	    empSet.forEach(emp -> empDetails.put(emp.getEmpId() , reportees));
	    return empDetails;
	}

	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}

	public List<Employee> getReportees() {
		return reportees;
	}
	
	
	
	
}
