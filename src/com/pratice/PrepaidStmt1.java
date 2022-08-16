package com.pratice;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepaidStmt1 {
	private final static String query="INSERT INTO STUDENT VALUES(?,?,?,?)";
public static void main(String[] args)
{
	try(Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ash","cerner");
			PreparedStatement ps=con.prepareStatement(query);)
	{
		int count=0;
		if(sc!=null)
		{
			System.out.println("Ennter no of student data to be enter into DB table");
			count=sc.nextInt();
		}
		if(sc!=null && ps!=null)
		{
			for(int i=1;i<=count;++i) {
				System.out.println("Enter"+i+"Student details");
				System.out.println("Enter Student number ");
				int no=sc.nextInt();
				System.out.println("Enter Student name");
				String name=sc.next();
				System.out.println("Enter Student address");
				String add=sc.next();
				System.out.println("Enter Student avrage");
				Double avg=sc.nextDouble();
				//set each query to precompaile query
				ps.setInt(1, no);
				ps.setString(2, name);
				ps.setString(3, add);
				ps.setDouble(4, avg);
				//execute update
			int result=ps.executeUpdate();
				//process the resultset
				if(result==0)
				
					System.out.println(i+"  Student record is not inserted");
				else
					System.out.println(i+"Student record is inserted");
				
				
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
