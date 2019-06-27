package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;
import com.techlabs.repository.CustomerRepository;

public class CustomerService {

	// private Customer c1,c2,c3;
	private static CustomerService instance;
	private CustomerRepository cr;
	List<Customer> customers;

	private CustomerService() {
		cr = new CustomerRepository();
		customers = new ArrayList<Customer>();
//		Customer c1 = new Customer("deepak","gupta","1/1/19",1000,CardType.CREDIT);
//		addCustomers(c1);
//		//System.out.println("ID = "+c1.getId());
//		Customer c2 = new Customer("abhi","londhe","1/1/19",2000,CardType.DEBIT);
//		addCustomers(c2);
//		Customer c3 = new Customer("yo","more","1/1/19",100,CardType.CREDIT);
//		addCustomers(c3);
	}

	public static CustomerService getInstance() {
		if (instance == null) {
			instance = new CustomerService();
		}
		return instance;
	}

	public void addCustomers(Customer c) {
		// System.out.println("add customer called c1 = "+c1);
		cr.addCustomer(c);
		// customers.add(c);
	}

	public List<Customer> getCustomers() {
		customers = cr.getData();
		return customers;
	}

	public Customer getCustomerById(int id) {
		customers = cr.getData();
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}

	public void editCustomer(int id, Customer customer) {
		cr.editCustomer(id, customer);
	}

	public String getUsername(String role) {
		return cr.getUsername(role);
	}

	public String getPassword(String role) {
		return cr.getPassword(role);
	}

	public void deleteCustomerById(int id) {
		customers = cr.getData();
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				customers.remove(customer);
				cr.deleteCustomerById(id);
				return;
			}
		}
	}
}
