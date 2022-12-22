package com.bookproject.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	public static Connection makeConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","Vinayaka@123");
	}
}
