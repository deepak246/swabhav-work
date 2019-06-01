package com.techlabs.organization.dataaccess;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import com.techlabs.organization.business.Employee;


public class DiskLoader implements ILoadable {

	private String filePath = "data\\datafile.csv";
	private Set<Employee> employees;

	public DiskLoader() {
		employees = new HashSet<Employee>();
	}

	public Set<Employee> readData() {
		Path pathToFile = Paths.get(filePath);
		try (BufferedReader br = Files.newBufferedReader(pathToFile)) {
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

	private static Employee createEmployee(String[] metadata) {

		int empId = Integer.parseInt(metadata[0]);
		String empName = metadata[1];
		String designation = metadata[2];
		int managerId = getAppropriateIntValue(metadata[3]);
		String dateOfJoining = metadata[4];
		double salary = Double.parseDouble(metadata[5]);
		String comission = metadata[6];
		metadata[7].replaceAll(" ", "");
		metadata[7].replaceAll("'", "");
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
