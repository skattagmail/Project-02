package com.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableOut {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/training";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "admin";
	
	public static void main(String[] args) {
		Connection conn = null;
		try{
			Class.forName(JDBC_DRIVER);
			
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			CallableStatement callableStatement =
					conn.prepareCall("{call display_max_age(?)}");

				callableStatement.registerOutParameter(1, java.sql.Types.INTEGER);

				ResultSet result = callableStatement.executeQuery();
				int  out2 = callableStatement.getInt   (1);
				
				System.out.println("The Highest Age: " + out2);

			
		} catch (Exception e) {
			
		}
	}

}
