package com.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStProduct {
	private final static String query = "INSERT INTO PRODUCT VALUES(?,?,?)";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ash", "cerner");
				PreparedStatement ps = con.prepareStatement(query);) {
			int count = 0;
			if (sc != null) {
				System.out.println("no of rows insert into product");
				count = sc.nextInt();
			}
			if (sc != null && ps != null) {
				for (int i = 1; i <= count; ++i) {
					//read each product details
					System.out.println(i + " row inserted into product");
					System.out.println("insert product name");
					String pname = sc.next();
					System.out.println("Enter product no");
					int pno = sc.nextInt();
					System.out.println("Enter product price");
					float price = sc.nextFloat();
					//set each product details to pre compile 
					
					ps.setString(1, pname);
					ps.setInt(2, pno);
					ps.setFloat(3, price);

					// execute query
					int result = ps.executeUpdate();
					// process the result
					if (result == 0)

						System.out.println("no record entered to product");

					else
						System.out.println(i + " student record inserted into product");

				}//for

			}//if
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main

}//class
