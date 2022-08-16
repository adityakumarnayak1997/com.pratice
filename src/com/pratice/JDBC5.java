package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC5 {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// load jdbc class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Establish the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ash", "cerner");

			// create statement
			if (con != null)
				st = con.createStatement();
			// create the query
			String query = "SELECT COUNT(*) FROM STUDENT";
			// send and execute SQL query in DB software
			if (st != null)
				rs = st.executeQuery(query);
			// process the resultset
			if (rs != null) {
				rs.next();
				System.out.println("Record count ::" + rs.getInt("COUNT(*)"));
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
