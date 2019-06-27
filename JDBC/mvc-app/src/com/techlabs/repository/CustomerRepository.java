package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;

public class CustomerRepository {
	
	private List<Customer> customers;
	private CardType card;
	
	public void loadData() {
		customers =  new ArrayList<Customer>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM customers");
			//ps.setString(1, deptno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String cardtype = rs.getString(6);
				if(cardtype.equalsIgnoreCase("credit")) {
					card = CardType.CREDIT;
				}
				else {
					card = CardType.DEBIT;
				}
				Customer customer = new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getDouble(5),card);
				customers.add(customer);
			}
			con.close();
		} catch (Exception e) {

		}
	}
	
	public void addCustomer(Customer customer) {
		try {
			String firstname = customer.getFirstname();
			String lastname = customer.getLastname();
			String dob = customer.getDob();
			double bal = customer.getBalance();
			CardType cardtype = customer.getCard();
			String card = "";
			if(cardtype == CardType.CREDIT) {
				card = "CREDIT";
			}
			else {
				card = "DEBIT";
			}
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			Statement st = con.createStatement();
			String sql = "insert into customers (firstname,lastname,dob,balance,cardtype)"
					+ "values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, dob);
			ps.setDouble(4, bal);
			ps.setString(5, card);
			ps.executeUpdate();
			con.close();
		} catch (Exception e) {

		}

	}
	
	public void deleteCustomerById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			String sql = "delete from customers where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			con.close();
		}
		catch(Exception e) {
			
		}
	}
	
	public void editCustomer(int id, Customer customer) {
		try {
			String firstname = customer.getFirstname();
			String lastname = customer.getLastname();
			String dob = customer.getDob();
			double bal = customer.getBalance();
			CardType cardtype = customer.getCard();
			String card = "";
			if(cardtype == CardType.CREDIT) {
				card = "CREDIT";
			}
			else {
				card = "DEBIT";
			}
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			Statement st = con.createStatement();
			String sql = "Update customers set firstname=?,lastname=?,dob=?,balance=?,cardtype=?"
					+ "where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, dob);
			ps.setDouble(4, bal);
			ps.setString(5, card);
			ps.setInt(6, id);
			ps.executeUpdate();
			con.close();
		} catch (Exception e) {

		}

	}
	
	public List<Customer> getData() {
		loadData();
		return customers;
	}
	
	public String getUsername(String role) {
		String username = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement ps = con.prepareStatement("SELECT username FROM users where role=?");
			ps.setString(1, role);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				username = rs.getString(1);
			}
			con.close();
		} catch (Exception e) {

		}
		return username;
	}

	public String getPassword(String role) {
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement ps = con.prepareStatement("SELECT pwd FROM users where role=?");
			ps.setString(1, role);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				password = rs.getString(1);
			}
			con.close();
		} catch (Exception e) {

		}
		return password;
	}


}
