package com.chainsys.jdbc;

import java.sql.*;

public class FirstjdbcDemo {
	
	    public static void main(String[] args) 
	         throws SQLException {
	        try {
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");

	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");

	        while (rs.next()) {
	            String x = rs.getString("first_name");
	            String s = rs.getString("last_name");
//	            float f = rs.getFloat("c");
	            Integer i = rs.getInt("Salary");
	            System.out.println(x+" "+s+" :"+i);
	        }
	       
	        }
	        catch(Exception e) {
	            System.out.println(e.toString());
	        }
	    }
	}

