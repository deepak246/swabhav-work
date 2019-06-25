package com.techlabs.organization.presentation;

import java.util.Set;

import com.techlabs.organization.business.Employee;
import com.techlabs.organization.dataaccess.DiskLoader;
import com.techlabs.organization.dataaccess.WebLoader;
import com.techlabs.organization.service.HierarchyBuilder;
import com.techlabs.organization.service.HierarchyMap;

public class TestOrganization {
	
	private Set<Employee> employees;
	public static StringBuffer compositeBuilder = new StringBuffer();

	public static void main(String[] args) {
		DiskLoader diskLoader = new DiskLoader();
		WebLoader webLoader = new WebLoader();

		HierarchyBuilder hb = new HierarchyBuilder(diskLoader);
		hb.displayHierarchy();
		
	}

}
