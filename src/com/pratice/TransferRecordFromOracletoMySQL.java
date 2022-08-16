package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransferRecordFromOracletoMySQL {
	// write the query for get value from oracle and insert into MySQL
	private static final String Oracle_Select_Query = "SELECT * FROM EMPLOYEE";
	private static final String MySQL_Table_Data = "INSERT INTO EMPLOYEE VALUES(?,?,?,?)";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection oracon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ash", "cerner");
				Connection MySQLcon = DriverManager.getConnection("jdbc:mysql:///testDB", "root", "root");
				Statement st = oracon.createStatement();
				PreparedStatement ps = MySQLcon.prepareStatement(MySQL_Table_Data);) {
			// process the ResultSet
			if (st != null)
				try (ResultSet rs = st.executeQuery(Oracle_Select_Query)) {// pocess the resultSet and insert the data
					int count=0;														// into mysql Table
					if (rs != null && ps != null) {
						while (rs.next()) {
							// get each record from oracle database
							int EMPNO = rs.getInt(1);
							String ENAME = rs.getString(2);
							String JOB = rs.getString(3);
							int SALARY = rs.getInt(4);
							// insert into mysql database
							ps.setInt(1, EMPNO);
							ps.setString(2, ENAME);
							ps.setString(3, JOB);
							ps.setFloat(4, SALARY);
							// process the resultset
							int result = ps.executeUpdate();
							if (result == 0)
								System.out.println("record was not inserted");
							else
								System.out.println("record was inserted");
							count++;
						} // while
						System.out.println(count+"no of record was updated");
					} // if

				} // try2

		} // try
		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main

}
