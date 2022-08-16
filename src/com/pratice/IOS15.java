package com.pratice;


class P
{
	String s="parent";
	String s2="Paren 2";
}
class C extends P{
	String s="child";
	String s4="child2";
}
public class IOS15 {
	public static void main(String[] args)
	{
		P p=new P();
		System.out.println(p.s);
		C c=new C();
		System.out.println(c.s);
	C p2=new C();
	System.out.println(p2.s2);
		
		
	}
}