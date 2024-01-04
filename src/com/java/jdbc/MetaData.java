package com.java.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MetaData {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "admin";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName(JDBC_DRIVER);
			
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			DatabaseMetaData databaseMetaData = conn.getMetaData();

			int    majorVersion   = databaseMetaData.getDatabaseMajorVersion();
			int    minorVersion   = databaseMetaData.getDatabaseMinorVersion();

			String productName    = databaseMetaData.getDatabaseProductName();
			String productVersion = databaseMetaData.getDatabaseProductVersion();

			int driverMajorVersion = databaseMetaData.getDriverMajorVersion();
			int driverMinorVersion = databaseMetaData.getDriverMinorVersion();

			System.out.println("Database Major Version...." + majorVersion);
			System.out.println("Database Minor Version...." + majorVersion);
			System.out.println("Database Product Name...." + productName);
			System.out.println("Database Product Version...." + productVersion);
			System.out.println("Database Driver Major Version...." + driverMajorVersion);
			System.out.println("Database Driver Minor Version...." + driverMinorVersion);
			
			 ResultSet rsCatalogs = databaseMetaData.getCatalogs();
			 System.out.println("---------------------------------\n");
	            System.out.println("Catologs\n---------------------------------\n");

	            while (rsCatalogs.next()) {
	                System.out.println(rsCatalogs.getString(1));
	            }
	            rsCatalogs.close();
	            
	            ResultSet tables = databaseMetaData.getTables("testdb", null, "%", null);

	            //Printing the column name and size
	            while (tables.next()) {
	               System.out.println("Table name: "+tables.getString("Table_NAME"));
	               System.out.println("Table type: "+tables.getString("TABLE_TYPE"));
	               System.out.println("Table schema: "+tables.getString("TABLE_SCHEM"));
	               System.out.println("Table catalog: "+tables.getString("TABLE_CAT"));
	               System.out.println(" ");
	            }
	            

			String catalog           = null;
			String schemaPattern     = null;
			String tableNamePattern  = "student";
			String   columnNamePattern = null;


			ResultSet result = databaseMetaData.getColumns("testdb", schemaPattern,  tableNamePattern, columnNamePattern);

			while(result.next()){
			    String columnName = result.getString(4);
			    String    columnType = result.getString(6);
			    System.out.println("Column Name : " + columnName);
			    System.out.println("Column Type : " + columnType);
			}

			catalog   = null;
			String   schema    = null;
			String   tableName = "student";

			result = databaseMetaData.getPrimaryKeys(
			    catalog, schema, tableName);

			while(result.next()){
			    String columnName = result.getString(4);
			    System.out.println("Primary Key...." + columnName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			
}
