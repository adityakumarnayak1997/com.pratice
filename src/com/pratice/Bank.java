package com.pratice;
class Bank
{
	public static void main(String args[])
	{
		BankAccount10 acc1=new BankAccount10();
		System.out.println(acc1.isActive());
		if(acc1.isActive())
		
			System.out.println("Account is Active");
	
		else
		
	     System.out.println("Account is not Activet");
		
		acc1.setActive(true);
		{
			System.out.println(acc1.isActive()?"active":"!active");
		}
	}
}
