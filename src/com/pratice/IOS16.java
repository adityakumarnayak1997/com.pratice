package com.pratice;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class IOS16 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ash", "cerner");
				Statement st = con.createStatement()) {

			// input from keyboard

			int EMPNO = 0;
			if (sc != null)
				System.out.println("Enter EMPNO");
			EMPNO = sc.nextInt();
			// load the class
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish the conneection
			String query = "DELETE FROM STUDENT WHERE EMPNO=" + EMPNO;
			System.out.println(query);
			int count = 0;
			count = st.executeUpdate(query);
			if (count == 0)
				System.out.println("No record found");
			else

				System.out.println("No of record that are affected ::" + count);

		} // try
		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main
}// class
