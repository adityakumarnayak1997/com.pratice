package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSSelect {
	private final static String Select_query="SELECT * FROM STUDENT ORDER BY SNAME";
	public static void main(String[] args)
	{//create the connection
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ash","cerner");
				//create the prepared statement for precopiled sql query
				PreparedStatement ps=con.prepareStatement(Select_query);
				//execute the precomplied sqlquery
				ResultSet rs=ps.executeQuery();
				)
		{
			if(rs!=null) {
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
			}//while
			
			}//if
			
		}//try
		//catch the Exceptions
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
		
	}

}
