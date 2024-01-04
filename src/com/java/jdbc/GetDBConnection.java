package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetDBConnection {
	
	public Connection getConnection() {
		// JDBC driver name and database URL
		 String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		 String DB_URL = "jdbc:mysql://localhost:3306/testdb";
		// Database credentials
		 String USER = "root";
		 String PASS = "admin";
		Connection conn = null;
	
		try{
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}//end try
		
		return conn;
	}

}
