package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateSqlquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql:///testDB", "root", "root");
				Statement st = con.createStatement();) 
		{
			String newEname = null;
			int newEid = 0;
			Double newSalary = 0.0;
			//convert string to sql type
			

			// Enter the eid by using keyboard
			if (sc != null)	
			System.out.println("Enter the eid no:");
			newEid = sc.nextInt();
			System.out.println("Enter Nmae");
			newEname = sc.next();
			System.out.println("Enter salary=");
			newSalary = sc.nextDouble();
			newEname="'"+newEname+"'";
			// prepair sql query
			String query = "UPDATE EMPLOYEE SET ENAME=" + newEname + ",Salary=" + newSalary + "WHERE EID=" + newEid;

			System.out.println(query);
			// send and execute sql query into database
			int count = 0;
			if (st != null)
				
			count = st.executeUpdate(query);
			// process the result
			if (count == 0)
				System.out.println("No record found for updatation");
			else
				System.out.println("no of Record found" + count);
		}//try

		 catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
