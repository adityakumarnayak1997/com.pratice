package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC10 {
public static void main(String[] args)
{
	try(Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ash","cerner");
			Statement st=con.createStatement();
			)
	{
		int no=0;
		String name=null;
		String job=null;
		Double salary=0.0;
	
	if(sc!=null)
		System.out.println("Enter Employee no :");
	no=sc.nextInt();
	System.out.println("Enter Employee Name:");
	name=sc.next();
	System.out.println("Enter job:");
	job=sc.next();
	System.out.println("Enter salary:");
	salary=sc.nextDouble();
	//CONVERT THE STRING VALUES TO SQL QUERY TYPE
	name="'"+name+"'";
	job="'"+job+"'";
	
	//query to insert into table
	String query="INSERT INTO EMPLOYEE VALUES("+no+","+name+","+job+","+salary+")";
	System.out.println(query);
	//send the result to db
	
	int count=0;
	if(st!=null);
	count=st.executeUpdate(query);
	//process the resultset
	if(count==0)
	System.out.println("Data was not inserted to table");
	else
		System.out.println("Data was inserted into table");
	
	
		
	}
	
//try
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
