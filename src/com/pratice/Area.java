package com.pratice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
class Area{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ash","cerner");
if(con==null)
	System.out.println("connection not establish");
else
	System.out.println("connection is establish");
	}

}
