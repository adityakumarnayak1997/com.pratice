package com.pratice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IOS9 {
public static void main(String[] args)throws Exception
{
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IOSFile.txt"));
	System.out.println(ois.readObject());
	
}
}
