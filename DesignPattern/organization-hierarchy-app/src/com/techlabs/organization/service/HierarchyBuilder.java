package com.techlabs.organization.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlabs.organization.business.Employee;
import com.techlabs.organization.dataaccess.ILoadable;

public class HierarchyBuilder {
	private Set<Employee> empSet;
	private Employee CEO;
	private List<Employee> CEOSubordinates;
	private List<Employee> managerSubordinates;
	private List<Employee> reporteesOfManagerSubordinates;
	private static int count = 1;
	
	public HierarchyBuilder(ILoadable load) {
		empSet = load.readData();
		CEOSubordinates = new ArrayList<Employee>();
		managerSubordinates = new ArrayList<Employee>();
		reporteesOfManagerSubordinates = new ArrayList<Employee>();
	}
	
	public void findCEO() {
		for(Employee emp : empSet) {
			if(emp.getManagerId()==-1) {
				CEO = emp;
				CEO.setLevel(0);
			}
		}
		findCEOSubordinates();
	}
	
	private void findCEOSubordinates() {
		for(Employee emp : empSet) {
			if(emp.getManagerId()==CEO.getEmpId()) {
				CEO.addSubordinates(emp);
				emp.setLevel(1);
				//count++;
			}
		}
		findManagerSubordinates();
	}

	private void findManagerSubordinates() {
		for(Employee manager : CEO.getSubordinates()) {
			for(Employee emp : empSet) {
				if(emp.getManagerId()==manager.getEmpId()) {
					manager.addSubordinates(emp);
					emp.setLevel(2);
					//count++;
				}
			}
		}
		findReporteesOfManagerSubordinates();
	}

	private void findReporteesOfManagerSubordinates() {
		for(Employee manager : CEO.getSubordinates()) {
			for(Employee managerSubordinate : manager.getSubordinates()) {
				for(Employee emp : empSet) {
					if(emp.getManagerId()==managerSubordinate.getEmpId()) {
						managerSubordinate.addSubordinates(emp);
						emp.setLevel(3);
						//count++;
					}
				}
			}
		}
	}

	public void displayHierarchy() {
		findCEO();
		CEO.display();
		//System.out.println("count = "+count);
	}
	
}
