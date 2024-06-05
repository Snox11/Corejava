package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static Connection getDbCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb","root","kritan123");
		}catch(Exception e) {			
		}
		return null;
		
	}

}
