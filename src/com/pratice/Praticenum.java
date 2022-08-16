package com.pratice;

public class Praticenum {

	
	
	static int a=10;
	int x=20;
	static void m1() {
		System.out.println("SM");
	}
	void m2()
	{
		System.out.println("NSM");
	}
	static {
		System.out.println("SB");
	}
	{
		System.out.println("NSB");
	}
	void m4(int x){
		System.out.println("no args constructor");
		this.x=x;
		
	}
	void color(int x){
		System.out.println("int arg constructor");
	}


}

