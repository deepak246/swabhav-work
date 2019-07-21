package com.techlabs.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int clgId;
	private String name, location;
	
	@OneToMany(mappedBy="clg", cascade = CascadeType.ALL)
	private Set<Department> departments;
	
	@OneToMany(mappedBy="clg", cascade = CascadeType.ALL)
	private Set<Student> students;

	public College() {
		departments = new HashSet<Department>();
		students = new HashSet<Student>();
	}
	
	public College(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public int getCollegeId() {
		return clgId;
	}

	public void setCollegeId(int collegeId) {
		this.clgId = collegeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
