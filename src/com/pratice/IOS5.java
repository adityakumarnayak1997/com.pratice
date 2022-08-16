package com.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOS5 {
public static void main(String[] args) throws ClassNotFoundException, IOException
{
	ObjectInputStream obj=new ObjectInputStream(new FileInputStream("Account.txt"));
	System.out.println(obj.readObject());
	
}
}
