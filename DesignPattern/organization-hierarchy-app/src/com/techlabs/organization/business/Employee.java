package com.techlabs.organization.business;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int level;
	private List<Employee> subordinates;
	private int spaces = 6;
	private int deptNo, empId, managerId;;
	private String empName, designation, dateOfJoining, comission;
	private double salary;
	
	public Employee(int empId, String empName, String designation, int managerId, 
		String dateOfJoining, double salary, String comission, int deptNo) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.comission = comission;
		this.deptNo = deptNo;
		subordinates = new ArrayList<Employee>();
	}

	public int getEmpId() {
		return empId;
	}

	public int getManagerId() {
		return managerId;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public String getEmpName() {
		return empName;
	}

	public String getDesignation() {
		return designation;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public String getComission() {
		return comission;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + this.empId + ", name=" + this.empName + ", designation=" 
				+ this.designation + ", managerid=" + this.managerId + ", dateofJoining=" 
				+ this.dateOfJoining + ", salary=" + this.salary+ ", deptNo=" + this.deptNo;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Employee employee = (Employee) obj;

		return ((employee.empId == this.empId) && (employee.empName.equals(this.empName)));
	}

	@Override
	public int hashCode() {
		return this.empId;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	
	public void addSubordinates(Employee emp) {
		subordinates.add(emp);
	}
	
	public String display() {
		for(int i = 0; i < spaces * level; i++) {
			System.out.print(" ");
		}
		//System.out.print("==>");
		System.out.println("<EmpId:"+empId+" Name:"+empName+" designation:"+designation+">");
		for(Employee employee : this.getSubordinates()) {
			employee.display();
		}
		return "hello";
	}
	
}
