package com.pratice;

import java.text.NumberFormat;
import java.util.Locale;

public class JDBC9 {
public static void main(String args[])
{
	double d=123245.98;
	NumberFormat nf= NumberFormat.getInstance(Locale.ITALY);
	String s=nf.format(d);
	System.out.println("ITALIAN NUMBER"+s);
}
}


