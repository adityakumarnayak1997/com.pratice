package com.pratice;

import java.io.*;

public class IOS1 {
public static void main(String[] args) throws IOException
{
	try(
	FileInputStream fis=new FileInputStream("abc.txt");
	FileOutputStream fos=new FileOutputStream("bbc.txt"))
	{	
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		
		System.out.println("data was save to file");
}
}
}
