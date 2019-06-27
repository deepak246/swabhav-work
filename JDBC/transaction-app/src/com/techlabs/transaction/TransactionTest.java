package com.techlabs.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	static Connection con;
	public static void main(String[] args) throws SQLException {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			con.setAutoCommit(false);  
			//ps.setString(1, deptno);
			PreparedStatement ps1 = con.prepareStatement("UPDATE customers SET balance = balance-1000 where id=1");
			ps1.executeUpdate();
			
			PreparedStatement ps2 = con.prepareStatement("UPDATE vendor SET balance = balance+1000 where id=101");
			ps2.executeUpdate();
			con.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			con.rollback();
		}

	}

}
