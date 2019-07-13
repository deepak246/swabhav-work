package com.techlabs.organization.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
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
	private List<Employee> managerSubordinates;

	public HierarchyBuilder(ILoadable load) {
		empSet = load.readData();
		managerSubordinates = new ArrayList<Employee>();
	}

	public void findCEO() {
		for (Employee emp : empSet) {
			if (emp.getManagerId() == -1) {
				CEO = emp;
				CEO.setLevel(0);
			}
		}
		findCEOSubordinates();
	}

	private void findCEOSubordinates() {
		for (Employee emp : empSet) {
			if (emp.getManagerId() == CEO.getEmpId()) {
				CEO.addSubordinates(emp);
				emp.setLevel(1);
			}
		}
		findManagerSubordinates();
	}

	private void findManagerSubordinates() {
		for (Employee manager : CEO.getSubordinates()) {
			for (Employee emp : empSet) {
				if (emp.getManagerId() == manager.getEmpId()) {
					manager.addSubordinates(emp);
					managerSubordinates.add(emp);
					emp.setLevel(2);
				}
			}
		}
		findReporteesOfManagerSubordinates();
	}

	private void findReporteesOfManagerSubordinates() {
		for (Employee managerSubordinate : managerSubordinates) {
			findReportees(managerSubordinate);
		}
	}

	private void findReportees(Employee subordinate) {
		for(Employee emp : empSet) {
			if(emp.getManagerId() == subordinate.getEmpId()) {
				subordinate.addSubordinates(emp);
				emp.setLevel(3);
			}
		}
	}

	public void displayHierarchy() {
		findCEO();
//		generateXMLFile();
		//CEO.display();
	}
	
//	public void generateXMLFile() {
//		File file = new File("data\\OrganizationHierarchy.txt");
//		try {
//			FileOutputStream fos = new FileOutputStream(file);
//			OutputStreamWriter osw = new OutputStreamWriter(fos);
//			Writer w = new BufferedWriter(osw);
//			String text = CEO.display();
//			w.write(text);
//		}catch(IOException e){
//			System.out.println("error");
//		}		
//	}

}
