package com.pratice;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOS2 {
public static void main(String[] args) throws IOException,FileNotFoundException
{
	try(
	DataOutputStream dos=new DataOutputStream(new FileOutputStream("abc.txt")))
	{
	 dos.write(97);
	dos.writeChar('b');
	dos.writeFloat(3.14f);
	dos.writeBoolean(true);
	dos.writeUTF("Aitya");
	System.out.println("Data was inserted to the file");
	}
}
}
