package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRow {
public static void main(String[] args)
{
	try(Scanner sc=new Scanner(System.in);
			Connection con= DriverManager.getConnection("jdbc:mysql:///testDB","root","root");
			Statement st=con.createStatement();)
	{
	//Load jdbc class
		//Class.forName(oracle.jdbc.driver.OracleDriver)
		if(sc!=null)
		System.out.println("Enter Employee id:");
		int Eid=sc.nextInt();
		//query for delete the the data from table
		String query="DELETE FROM EMPLOYEE WHERE EID="+Eid;
		System.out.println(query);
		//execute the result
		int count=0;
		if(st!=null);
		count=st.executeUpdate(query);
		if(count==0)
			System.out.println("record was not found");
		else
			System.out.println("no of record was deleted"+count);
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
