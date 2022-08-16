package com.pratice;
class MyThread extends Thread {
public void run()
{
	System.out.println("Status check");
	try {
		Thread.sleep(2000);
		System.out.println("Run Method is alive or not: "+Thread.currentThread().isAlive());
	} catch (InterruptedException e) {
		
	}

	}
}
