package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeRepository {
	private List<Employee> employees;
	
	public void loadData() {
		employees =  new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM emp");
			//ps.setString(1, deptno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String mgr = rs.getString(4);
				String hiredate = rs.getString(5);
				double sal = rs.getDouble(6);
				String comm = rs.getString(7);
				int deptno = rs.getInt(8);
				Employee emp = new Employee(empno,ename,job,mgr,hiredate,
						sal,comm,deptno);
				employees.add(emp);
			}
			con.close();
		} catch (Exception e) {

		}
	}
	
	public List<Employee> getData() {
		loadData();
		return employees;
	}
}
