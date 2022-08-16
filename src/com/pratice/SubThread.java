package com.pratice;

class SubThread
{
	public static void main(String args[]) throws InterruptedException
	{
	MyThread t1=new MyThread();
	
	t1.start();
	System.out.println("my thread is: "+t1.getState());
	System.out.println("my thread is: "+t1.isAlive());
	Thread.sleep(3000);
	System.out.println("My Thread"+t1.getState());
	System.out.println("My Thread"+t1.isAlive());
}
}
