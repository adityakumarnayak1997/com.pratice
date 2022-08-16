package com.pratice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOS14 {
public static void main(String[] args)
{
	try {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the fno");
		String fno= bf.readLine();
		System.out.println("Enter second number");
		String sno=bf.readLine();
		int i= Integer.parseInt(fno);
		int j= Integer.parseInt(sno);
		int k=i+j;
		System.out.println("result="+k);
	}
	catch(NumberFormatException nfe) {//checked Exception
		System.out.println("please pass only integer number");
	}
	catch(Exception e)//unchecked exception
	{
		e.printStackTrace();
	}
}
}
