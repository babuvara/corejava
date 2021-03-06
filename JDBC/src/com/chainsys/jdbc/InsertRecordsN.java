package com.chainsys.jdbc;

import java.io.*;

import java.sql.*;

public class InsertRecordsN {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "123");

		PreparedStatement ps = con.prepareStatement("insert into ANU values(?,?,?)"); 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("enter id:");
			int Sno = Integer.parseInt(br.readLine());
			System.out.println("enter name:");
			String Name_1 = br.readLine();
			System.out.println("enter salary:");
			float salary = Float.parseFloat(br.readLine());

			ps.setInt(1, Sno);
			ps.setString(2, Name_1);
			ps.setFloat(3, salary);
			int i = ps.executeUpdate("DELETE FROM ANU WHERE SNO >= 1");
			System.out.println(i + " records affected");

			System.out.println("Do you want to continue: y/n");
			String s = br.readLine();
			if (s.startsWith("n")) {
				break;
			}
		} while (true);
		/*
		 * try { Statement stmt = con.createStatement();
		 * stmt.execute("DELETE FROM ANU WHERE SNO >= 1");
		 * System.out.println("Table deleted successfully"); } catch (Exception e) {
		 * e.printStackTrace(); }finally { try { Statement stmt=con.createStatement();
		 * stmt.close(); con.close(); } catch (Exception e) { e.printStackTrace(); } }
		 */
	}
}