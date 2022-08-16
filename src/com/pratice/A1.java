package com.pratice;

import java.util.Scanner;

class A1
{
public static void main(String[] args)
{
	int i=0;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=scn.nextLine();
	String[] splitArray=str.split(" ");
	for(i=splitArray.length-1;i>=0;i--);
	{
	System.out.println(splitArray[i]+" ");	
	}
}
}
