package com.pratice;

class Addition extends Thread {
public void run()
{
int num=20,sum=0;
for(int i=1;i<=num;++i)
{
	sum+=i;
}
System.out.println("Sum= "+sum);
}
}
