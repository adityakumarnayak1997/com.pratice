package com.pratice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOS8 {
public static void main(String[] args) throws IOException
{
	ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream("IOSFile.txt"));
	IOS7 a=new IOS7();
	a.x=70;
	a.y=80;
	
	System.out.println("x and y value was changed to 70 and 80");
	oss.writeObject(a);
	System.out.println("object was save to file pleach check once");
			
}
}
