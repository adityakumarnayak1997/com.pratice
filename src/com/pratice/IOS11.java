package com.pratice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class IOS11 {
public static void main(String[] args) throws FileNotFoundException,IOException
{
	try (//print stream object creation
	PrintStream ps = new PrintStream("ad.txt")) {
		ps.print("A");
		ps.print("B");
		ps.print("C");
	}
	System.out.println("Data Writen to ad.txt file pleach check");
	System.out.print("A");
	System.out.println();
	System.out.print("B");
	
	System.out.print("C");
}
}
