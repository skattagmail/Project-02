package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdates {


	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		GetDBConnection gc = new GetDBConnection();
	
		try{

			conn = gc.getConnection();
			stmt = conn.createStatement();

			stmt.addBatch("update student set first='John' where id=100");
			stmt.addBatch("update student set first='Eric' where id=101");
			stmt.addBatch("update student set first='May'  where id=103");
			stmt.addBatch("INSERT INTO student VALUES (104, 'Chris', 'Soyars', 25)");
			
			stmt.executeBatch();

		    int[] recordsAffected = stmt.executeBatch();
		    for(int x : recordsAffected) {
		    	System.out.println("Query Update Status");
		    	System.out.println(x);
		    }
		    
		    System.out.println("Data updated Successfully as shown below");
		    
			 String sql = "select * from student where id in (100,101,103,104)";
	
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				//Retrieve by column name
				int id = rs.getInt("id");
				String first = rs.getString("first");
				String last = rs.getString("last");
				//Display values
				System.out.print("ID: " + id);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);	
			}
		    
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
		//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
				
			}// nothing can be done
			
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main

}
