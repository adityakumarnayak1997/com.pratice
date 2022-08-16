package com.pratice;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class IOS10 {
public static void main(String[] args) throws IOException,FileNotFoundException
{
	FileInputStream f1=new FileInputStream("abc.txt");
	FileInputStream f2=new FileInputStream("Account.txt");
	FileInputStream f3=new FileInputStream("IOSFile.txt");
	Vector<FileInputStream> v =new Vector<FileInputStream>();
	v.add(f1);
	v.add(f2);
	v.add(f3);
	//create enumeration object
	Enumeration<FileInputStream> e=v.elements();
	SequenceInputStream sis=new SequenceInputStream(e);
	int i;
	while((i=sis.read())!=-1)
	{
		System.out.println((char)i);
	}
	

}
}
