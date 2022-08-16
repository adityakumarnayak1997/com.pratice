package com.pratice;

import java.io.IOException;
import java.util.Scanner;

public class Withdrawal extends BankAccount{
public static void main(String[] args) throws IOException
{
	BankAccount bankAccount = new BankAccount();	
	bankAccount.setAccHName("Aditya");
	bankAccount.setAccNo(23213);
	bankAccount.setAddress("Rameswar patana");
	bankAccount.setBalance(1000);
	bankAccount.setUserName("oracle");
	bankAccount.setPassword("Acer@123");
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter withdrawal amount");
	double d=scn.nextDouble();
	if(bankAccount.getBalance()>=d)
	{
		double balance=bankAccount.getBalance()-d;
		bankAccount.setUpdateBalance(balance);
		System.out.println("Remaining balance"+bankAccount.getBalance());
	}
	System.out.println("Enter amount to deposit");
	double depositeAmount = scn.nextDouble();
	if(depositeAmount>0) {
		bankAccount.setBalance(depositeAmount);
		System.out.println("Balance after deposite"+bankAccount.getBalance());
	}
	
	System.out.println(bankAccount.getBalance());
}
}
