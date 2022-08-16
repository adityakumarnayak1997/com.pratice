package com.pratice;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOS3 {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		// TODO Auto-generated method stub
		try(
		DataInputStream dis=new DataInputStream(new FileInputStream("abc.txt")))
				{
		System.out.println(dis.read());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
				}
	}

}
