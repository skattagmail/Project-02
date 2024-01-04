package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepStatement {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		GetDBConnection gc = new GetDBConnection();

		try{

			conn = gc.getConnection();
	
			// Update Student Record
			String sql = "update student set first=? , last=? where id=?";

			 preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setString(1, "Gary");
			preparedStatement.setString(2, "Larson");
			preparedStatement.setLong  (3, 100);

			int rowsAffected = preparedStatement.executeUpdate();
			
			System.out.println("Update Query Execution Status :" + rowsAffected);
			
			//Verifying if Student has been Updated successfully
			 sql = "select * from student where id=?";

			 preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setInt(1, 100);

			ResultSet rs = preparedStatement.executeQuery();
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
				if(preparedStatement!=null)
					preparedStatement.close();
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
