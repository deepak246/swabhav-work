package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;

public class CustomerService {
	
	//private Customer c1,c2,c3;
	private static CustomerService instance;
	List<Customer> customers;
	
	private CustomerService() {
		customers = new ArrayList<Customer>();
		Customer c1 = new Customer("deepak","gupta","1/1/19",1000,CardType.CREDIT);
		addCustomers(c1);
		//System.out.println("ID = "+c1.getId());
		Customer c2 = new Customer("abhi","londhe","1/1/19",2000,CardType.DEBIT);
		addCustomers(c2);
		Customer c3 = new Customer("yo","more","1/1/19",100,CardType.CREDIT);
		addCustomers(c3);
	}
	
	public static CustomerService getInstance() {
		if(instance==null) {
			instance = new CustomerService();
		}
		return instance;
	}
	
	public void addCustomers(Customer c) {
		//System.out.println("add customer called c1 = "+c1);
		customers.add(c);
	}
	
	public List<Customer> getCustomers(){
		return customers;
	}
	
	public Customer getCustomerById(String id) {
		for(Customer customer : customers) {
			if(customer.getId().equals(id)) {
				return customer;
			}
		}
		return null;
	}
	
	public void deleteCustomerById(String id) {
		for(Customer customer : customers) {
			if(customer.getId().equals(id)) {
				customers.remove(customer);
				return;
			}
		}
	}
}
