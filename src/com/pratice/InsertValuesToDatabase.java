package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertValuesToDatabase {
	public static void main(String[] args) {
		// input the details from keyboard
		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ash", "cerner");
				Statement st = con.createStatement();)

		{
			int newEmpno = 0;
			String newEname = null;
			String newJob = null;
			Float newSal = 0.0f;
			int newDeptno = 0;
			System.out.println("Enter Employe number: ");
			newEmpno = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			newEname = sc.next();
			System.out.println("Enter job profile: ");
			newJob = sc.next();
			System.out.println("Enter salaryr: ");
			newSal = sc.nextFloat();
			System.out.println("Enter Department Number: ");
			newDeptno = sc.nextInt();
			// convert Ename and Job into as required as sql format
			newEname = "'" + newEname + "'";
			newJob = "'" + newJob + "'";
			// load the class
			// connect to database
			// query is insert into student values(106,'Zakir','Testing',36000,6)
			String query = "insert into student values (" + newEmpno + "," + newEname + "," + newJob
					+ "," + newSal + "," + newDeptno+")";
			System.out.println(query);
			// send and execute the sql queryy in DB software
			int count=0;
			count=st.executeUpdate(query);
			// process the ResultSet
			if (count == 0)
				System.out.println("No record inserted");
			else
				System.out.println("record inserted = " + count);
		} // end of try
		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main
}// class
