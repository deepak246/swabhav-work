package com.techlabs.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTransaction;

@Repository
public class BankRepository {

	private static Connection con;
	private List<BankTransaction> transactions;

	public BankRepository() {
		System.out.println("Bank Repo created");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			con.setAutoCommit(false);
		} catch (Exception e) {

		}
	}

	public void registerClient(BankMaster bm, BankTransaction bt) throws SQLException {
		String name = bm.getName();
		String password = bm.getPassword();
		double balance = bm.getBalance();
		String date = bt.getDate();
		String type = bt.getType();
		double amount = bt.getAmount();

		try {
			System.out.println("repo called");

			String sql1 = "INSERT INTO BANK_MASTER (name, password, balance)" + "VALUES (?,?,?)";

			String sql2 = "INSERT INTO BANK_TRANSACTION (name, date, type, amount)" + "VALUES (?,?,?,?)";

			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, name);
			ps1.setString(2, password);
			ps1.setDouble(3, balance);
			ps1.executeUpdate();

			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setString(1, name);
			ps2.setString(2, date);
			ps2.setString(3, type);
			ps2.setDouble(4, amount);
			ps2.executeUpdate();

			con.commit();
			System.out.println("commit");

		} catch (Exception e) {
			System.out.println("rollback");
			con.rollback();
		}
	}

	public BankMaster getClientDetails(String username) throws Exception {
		BankMaster bm = null;
		String name = "", password = "";
		double balance = 0;

		try {
			System.out.println("repo called");
			String sql = "SELECT * FROM BANK_MASTER WHERE NAME=?";
			System.out.println("connection" + con);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				name = rs.getString(1);
				password = rs.getString(2);
				balance = rs.getDouble(3);
			}
			bm = new BankMaster(name, password, balance);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bm;
	}

	public List<BankTransaction> getpassbook(String username) {
		BankTransaction bt = null;
		transactions = new ArrayList<BankTransaction>();

		try {
			System.out.println("repo called");
			String sql = "SELECT * FROM BANK_TRANSACTION WHERE NAME=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				String date = rs.getString(2);
				String type = rs.getString(3);
				double amount = rs.getDouble(4);
				System.out.println("name = " + name);
				bt = new BankTransaction(name, date, type, amount);
				transactions.add(bt);
				System.out.println("name = " + transactions.get(0).getName());
			}
			System.out.println("trans called " + rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactions;
	}

	public void addTransaction(BankTransaction bt) throws SQLException {
		String name = bt.getName();
		String date = bt.getDate();
		String type = bt.getType();
		double amount = bt.getAmount();
		String sql1;

		try {
			System.out.println("add trans repo called");

			if (type.equals("D")) {
				sql1 = "UPDATE BANK_MASTER SET BALANCE = BALANCE + ? WHERE NAME = ?";
			}
			else {
				sql1 = "UPDATE BANK_MASTER SET BALANCE = BALANCE - ? WHERE NAME = ?";
			}

			String sql2 = "INSERT INTO BANK_TRANSACTION (name, date, type, amount)" + "VALUES (?,?,?,?)";

			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setDouble(1, amount);
			ps1.setString(2, name);
			ps1.executeUpdate();

			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setString(1, name);
			ps2.setString(2, date);
			ps2.setString(3, type);
			ps2.setDouble(4, amount);
			ps2.executeUpdate();

			con.commit();
			System.out.println("commit");

		} catch (Exception e) {
			System.out.println("rollback");
			con.rollback();
		}
	}

	public double getClientBalance(String username) {
		BankMaster bm = null;
		double amount = 0;

		try {
			System.out.println("repo called");
			String sql = "SELECT BALANCE FROM BANK_MASTER WHERE NAME=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				amount = rs.getDouble(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return amount;
	}

}
