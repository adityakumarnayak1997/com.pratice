package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementAvgInc {
	
	private final static String query="UPDATE STUDENT SET AVRAGE=(AVRAGE+(AVRAGE/10)) WHERE AVRAGE>? and ADRESS=?";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in);
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ash","cerner");
				PreparedStatement ps=con.prepareStatement(query);
				)
		{
			int count=0;
			if(sc!=null) {
				System.out.println("Enter no of Adress to be changed avg::");
				count=sc.nextInt();
				
			}
			if(sc!=null && ps!=null) {
				System.out.println("Enter the percentage ");
				float avg=sc.nextFloat();
				for(int i=1;i<=count;++i)
				{
					//read the name from keyboard
					
					System.out.println(i+" Enter Adress name to change the avg");
					String city=sc.next();
					//set city details
					ps.setFloat(1, avg);
					ps.setString(2, city);
					//execute query
					int result=ps.executeUpdate();
					//process resultset
					if(result!=0)
						System.out.println("Adress record updated");
					else
						System.out.println("No Adress record updated");
					
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
