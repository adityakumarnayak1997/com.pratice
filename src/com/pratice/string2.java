package com.pratice;

import java.util.Scanner;

public class string2 {
public static void main(String args[])
{
	String s1="";
	String s2=" ";
	String s3="ab";
	String s4=new String();
	String s5=new String("");
	String s6=new String(" ");
	String s7=new String("ab");
	System.out.println("S1 length"+s1.length());
	System.out.println("S2 length"+s2.length());
	System.out.println("S3 length"+s3.length());
	System.out.println("S4 length"+s4.length());
	System.out.println("S5 length"+s5.length());
	System.out.println("S6 length"+s6.length());
	System.out.println("S7 length"+s7.length());
	//String s8=null;
	//System.out.println("s8 length:"+s8.length());
	//String s9="null";
	//System.out.println("S9 length:"+s9.length());
	//String s10;
	//System.out.println("s10 length"+s10.length());
	//System.out.println("s11 length"+s11.length());
	//System.out.println("s12 length"+s12.length());
	Scanner scn=new Scanner(System.in);
	System.out.println("\n Enter String1");
	System.out.println("You entered"+scn.nextLine().length()+" characters");
	System.out.println("\n Enter String2");
	System.out.println("you enteres"+scn.nextLine().length()+" characters");
	System.out.println("\n Enter String3");
	System.out.println("you entered"+scn.nextLine()+" characters");
	
	
}
}
