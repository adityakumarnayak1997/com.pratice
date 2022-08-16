package com.pratice;

class One {
static void m1()
{
	System.out.println("my theread"+Thread.currentThread().getName());
}
class Ex extends Thread
{

	public void run()
	{
		System.out.println("thread 2");
	}
}
}
