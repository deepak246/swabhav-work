package com.techlabs.employee.business;

public class Employee {
	private int empId, deptNo;
	private String empName, designation, dateOfJoining, comission, managerId;
	private double salary;

	public Employee() {
	}

	public Employee(int empId, String empName, String designation, String managerId, 
			String dateOfJoining, double salary, String comission, int deptNo) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.comission = comission;
		this.deptNo = deptNo;
	}

	public int getEmpId() {
		return empId;
	}

	public String getManagerId() {
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
		return "Employee [id=" + this.empId + ", name=" + this.empName + ", designation=" + this.designation
				+ ", managerid=" + this.managerId + ", dateofJoining=" + this.dateOfJoining + ", salary=" + this.salary
				+ ", deptNo=" + this.deptNo;
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
}
