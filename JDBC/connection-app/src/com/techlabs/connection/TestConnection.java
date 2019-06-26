package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" +
				                                   "user=root&password=root");
			System.out.println("Class = "+con.getClass());
			System.out.println("Server = "+con.getMetaData().getURL());
			System.out.println("DB = "+con.getCatalog());
			System.out.println("User = "+con.getMetaData().getUserName());
			con.close();
		}catch(Exception e) {
			
		}
	}

}
