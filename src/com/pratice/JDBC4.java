package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// Load the JDBC class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Establish the connection

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ash", "cerner");
//create Statement
			if (con != null)
				st = con.createStatement();
//Prepare query
			String query = "select * from student where SAL=(select AVG(SAL) from student)";
//send and execute the SQL query to the DB software
			if (st != null)
				rs = st.executeQuery(query);
			
//process the ResultSet
			if (rs != null) {
				rs.next();

				System.out.println("Minimum salary from the student DB table is :" + rs.getInt(4));

			} // if

		} // try
		catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (st != null)
					st.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();

			}

		} // finally
	}// main


	
	
}// class
