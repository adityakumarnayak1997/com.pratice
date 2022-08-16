package com.pratice;

import java.io.FileNotFoundException;

public class IOS4_1 {
public static void main(String args[])
{
	
	try {
		IOS4.copyfile(args[0],args[1]);
	}
	catch(ArrayIndexOutOfBoundsException aeiob)
	{
		System.out.println("please pass sourse and dest file name");
		
		
	}
	catch(FileNotFoundException fnfe) {
		System.out.println("Error the given file"+args[0]+","+args[1]+"are not found make sure hey are available");
	}
	catch(Exception e)
	{
		System.out.println("error reading and writing in file");
		e.printStackTrace();
	}
	
}
}
