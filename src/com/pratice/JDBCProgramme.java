package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCProgramme {
public static void main(String[] args) {
	Scanner sc=null;
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	int result=0;
try {
	//read input from keyboard
	sc=new Scanner(System.in);
	float startSalary = 0.0f,endSalary=0.0f;
	if(sc!=null)
	{
		System.out.println("Enter Start range salary");
		startSalary=sc.nextFloat();
		System.out.println("Enter end range salary");
		endSalary=sc.nextFloat();
	}
	//Load the jdbc driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//Establish the connection
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ash", "cerner");
	//create jdbc object
	if(con!=null)
		st=con.createStatement();
		//prepair SQL querry
		String query="SELECT EMPNO,ENAME,JOB,SAL FROM STUDENT WHERE SAL>="+startSalary+"AND SAL<="+endSalary;
        System.out.println(query);
        //send execute query in to DB s/w
        if(st!=null)
       rs=st.executeQuery(query);
        //process the result set
        if(rs!=null)
        {
        	while(rs.next()==true)
        	{
        	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));	
        	}//while
        }//if
}//try
catch(SQLException se)
{
	se.printStackTrace();
}
catch(ClassNotFoundException cfe) {
	cfe.printStackTrace();
}
catch(Exception e) {
	e.printStackTrace();
}
finally{
	try {
		if(rs!=null)
			rs.close();
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	try {
	if(st!=null)
	st.close();
	}
	catch(SQLException se) {
		se.printStackTrace();
		}
	try {
		if(con!=null)
		con.close();
		}
	catch(SQLException se)
	{
	se.printStackTrace();	
	}
	try {
		if(sc!=null)
		sc.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
  }//finally
 }//main
}//class
