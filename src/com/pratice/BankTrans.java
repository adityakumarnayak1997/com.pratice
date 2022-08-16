package com.pratice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BankTrans {
public  void bankDetails() throws IOException
{
	BankAccount acc=new BankAccount();
	
	acc.setAccHName("Aditya");
	acc.setAccNo(23213);
	acc.setAddress("Rameswar patana");
	acc.setBalance(1000000);
	acc.setUserName("oracle");
	acc.setPassword("Acer@123");
	System.out.println(acc);
	
//	ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream("Account.txt"));
//	oss.writeObject(acc);
//	System.out.println("object was written to the file");
//	oss.close();
}
}
