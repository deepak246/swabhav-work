package com.techlabs.organization.dataaccess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import com.techlabs.organization.business.Employee;

public class WebLoader implements ILoadable {
	private Set<Employee> employees;

	public WebLoader() {
		employees = new HashSet<Employee>();
	}

	public Set<Employee> readData() {
		try {
			URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");

			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = br.readLine();

			while (line != null) {
				line = line.replaceAll("\\s+", "");
				String[] attributes = line.split(",");
				Employee employee = createEmployee(attributes);
				employees.add(employee);
				line = br.readLine();
			}
			br.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return employees;

	}

	private Employee createEmployee(String[] metadata) {
		int empId = Integer.parseInt(metadata[0]);
		String empName = metadata[1];
		String designation = metadata[2];
		int managerId = getAppropriateIntValue(metadata[3]);
		String dateOfJoining = metadata[4];
		double salary = Double.parseDouble(metadata[5]);
		String comission = metadata[6];
		int deptNo = Integer.parseInt(metadata[7]);
		return new Employee(empId, empName, designation, managerId, dateOfJoining, 
				salary, comission, deptNo);
	}
	
	private static int getAppropriateIntValue(String str) {
		if(str.equalsIgnoreCase("null")) {
			return -1;
		}
		return Integer.parseInt(str);
	}
}
