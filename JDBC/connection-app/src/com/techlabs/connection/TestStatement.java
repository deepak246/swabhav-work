package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:4040/swabhav?" + "user=root&password=root");
			Statement st = con.createStatement();
			System.out.println("Enter deptno");
			String deptno = sc.nextLine();
			ResultSet rs = st.executeQuery("select * from dept where deptno = "+deptno);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}	  
			con.close(); 
		} catch (Exception e) {

		}
	}

}
