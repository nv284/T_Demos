package com.org.tav.day5;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgreSQLJDBC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
	      Statement stmt = null;
	      try {
	    	  //step1
	         Class.forName("org.postgresql.Driver");
	         //step2
	         c = DriverManager
	        		 .getConnection("jdbc:postgresql://localhost:5432/dvdrental1",
	        		            "postgres", "postgre");
	         System.out.println("Opened database successfully");

	         //step3
	         stmt = c.createStatement();
	         String sql = "CREATE TABLE COMPANY1 " +
	            "(ID INT PRIMARY KEY     NOT NULL," +
	            " NAME           TEXT    NOT NULL, " +
	            " AGE            INT     NOT NULL, " +
	            " ADDRESS        CHAR(50), " +
	            " SALARY         REAL)";
	         //step4
	         stmt.executeUpdate(sql);
	         //step5
	         stmt.close();
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Table created successfully");

	}

}
