package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC7 {
public static void main(String[] args)
{
	try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ash","cerner");
			Statement st=con.createStatement();
				
			)
	{
		//load the jdbc class
		//class.forName(oracle.jdbc.driver.OracleDriver);
		//connect to DB software
		//prepare the query for update salary increase by 10 percent
	
	
		
		String query="UPDATE STUDENT SET SAL=SAL+(SAL*10/100)";
		String selectQuery = "select ENAME,SAL from student";
	
	    st.executeQuery(query);
	    ResultSet rs= st.executeQuery(selectQuery);
	    
		//process the resultset
		System.out.println(query);
		if(rs!=null) {
			while(rs.next()==true)
			{
				System.out.println(rs.getString(1)+" "+rs.getFloat(2));
			}//while
		}//if
	
		
	}//try
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
			
}//main
}//class
