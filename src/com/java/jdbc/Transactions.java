package com.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactions {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		GetDBConnection gc = new GetDBConnection();

		try{

			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = gc.getConnection();
			
			conn.setAutoCommit(false);
		    try{
		    	stmt = conn.createStatement();
		    	stmt.executeUpdate("INSERT INTO student(id,first,last,age) VALUES (116, 'Srinivas', 'Katta', 21)");
		    } finally {
		        if(stmt != null) {
		        	stmt.close();
		        }
		    }

		   System.out.println("Updated First Record...");
		    Statement statement2 = null;
		    try{
		        statement2 = conn.createStatement();
		        statement2.executeUpdate(
		            "INSERT INTO studentmarks(id,Physics,Chemistry,Maths) VALUES (116, 88, 94, 100)");
		    } finally {
		        if(statement2 != null) {
		            statement2.close();
		        }
		    }
		    System.out.println("Updated Second Record...");

		    conn.commit();
		} catch(Exception e) {
			try {
				conn.rollback();
				System.out.println("Rolling Back the Changes");
				e.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
		    if(conn != null) {
		    	try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	    System.out.println("Goodbye...");


	}
}
