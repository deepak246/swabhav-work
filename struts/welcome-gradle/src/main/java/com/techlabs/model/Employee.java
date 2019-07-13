package com.techlabs.model;

import java.sql.Date;

public class Employee {
	private int empno, deptno;
	private String ename, job, mgr, comm;
	private double sal;
	private String hiredate;
	
	public Employee(int empno,String ename,String job,String mgr, String hiredate,
			double sal, String comm, int deptno) {
		System.out.println("EMP created");
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public String getMgr() {
		return mgr;
	}

	public int getDeptno() {
		return deptno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public double getSal() {
		return sal;
	}

	public String getComm() {
		return comm;
	}

	public String getHiredate() {
		return hiredate;
	}
}
