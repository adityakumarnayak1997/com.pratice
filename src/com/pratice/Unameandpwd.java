package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Unameandpwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc=new Scanner(System.in);
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ash","cerner");
		Statement st=con.createStatement();
		)
{
	String uname=null;
	String pwd=null;
	if(sc!=null) {
	System.out.println("Enter user name");
	uname=sc.nextLine();
	System.out.println("Enter password");
	pwd=sc.nextLine();
	}
	//convert uname and pwd to DB format
	uname="'"+uname+"'";
	pwd="'"+pwd+"'";
	//query
	String query="select count(*) from user_info where uname="+uname+"and Pwd="+pwd;
	System.out.println(query);
	//send and execute querry
	try(ResultSet rs=st.executeQuery(query)){
		if(rs!=null) {
		rs.next();
		int count=rs.getInt(1);
		if(count==0)
			System.out.println("Invalid credential");
		else
			System.out.println("valid credential");
		}
	}
			
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
