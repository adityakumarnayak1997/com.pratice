package com.pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOS4 {
public static void copyfile(String srcFile,String destFile)throws IOException,FileNotFoundException
{

	try(
	FileInputStream fis=new FileInputStream(srcFile);
	FileOutputStream fos=new FileOutputStream(destFile))
	{
		int i;
		while((i=fis.read())!=-1);
		{
			fos.write(i);
		}
		System.out.println("data was written to "+destFile);
	}
	
}
}

