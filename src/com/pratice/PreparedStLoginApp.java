package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStLoginApp {
private final static String query="SELECT COUNT(*) FROM USER_INFO WHERE UNAME=? AND PWD=?";
public static void main(String[] args)
{
	try(Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ash","cerner");
			PreparedStatement ps=con.prepareStatement(query);
			)
	{
		if(sc!=null) {
			System.out.println("Enter login id");
			String loginid=sc.next();
			System.out.println("Enter password");
			String pass=sc.next();
			//set the value
			if(ps!=null) {
		 ps.setString(1, loginid);
		 ps.setString(2, pass);
			}
		 //send and execute query
			try(ResultSet rs=ps.executeQuery()){
				if(rs!=null) {
					rs.next();
					int count=rs.getInt(1);
					if(count!=0)
						System.out.println("valid crendential");
					else
						System.out.println("Invalid credintial");
				}
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
