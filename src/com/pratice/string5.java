package com.pratice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import oracle.net.aso.e;

public class string5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s1=new String("a");
String s2=new String("a");
String s3=new String("abc");
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s3.hashCode());
System.out.println();
String s4="b";
String s5="abc";
System.out.println(s4.hashCode());
System.out.println(s5.hashCode());
System.out.println();
System.out.println(System.identityHashCode(s4));
System.out.println(System.identityHashCode(s5));
System.out.println();
String e1="a";
String e2="b";
String e3="c";
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());
System.out.println(e3.hashCode());

System.out.println(e1.hashCode());
System.out.println(e2.hashCode());
System.out.println(e3.hashCode());
System.out.println();
System.out.println(System.identityHashCode(e1));
System.out.println(System.identityHashCode(e2));
System.out.println(System.identityHashCode(e3));}}
String s19="a";
String s20="A";
System.out.println("s19==s20"+(s19==s20));
System.out.println(s19.equals(s20));
System.out.println(s19.equalsIgnoreCase(s20));.out.println(e1==e2);
System.out.println(e2==e3);
Sample s1=new Sample();
//System.out.println(e1==s1);
System.out.println(e1.equals(s1));
System.out.println(s1.equals(e1));
System.out.println(s1==null);
System.out.println(s1.equals(null));*/
//String s1="a";
//String s2="a";
//String s3="A";
/*System.out.println(s1.equals(s2));
System.out.println(s1.compareTo(s2));
System.out.println();
System.out.println(s2.equals(s3));
System.out.println(s2.compareTo(s3));
System.out.println();
System.out.println(s3.equals(s1));
System.out.println(s3.compareTo(s1));
System.out.println();
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.compareToIgnoreCase(s3));*/
/*String s4="abc";
String s5="aZc";
System.out.println(s4.equals(s5));
System.out.println(s4.equalsIgnoreCase(s5));
System.out.println(s4.compareTo(s5));
System.out.println(s4.compareToIgnoreCase(s5));
String s6="abcdf";
System.out.println(s4.compareTo(s6));
System.out.println(s6.compareTo(s4));
System.out.println(s6.compareToIgnoreCase(s4));
String s10=new String("a");
StringBuilder s11=new StringBuilder("a");
StringBuffer s12=new StringBuffer("a");
System.out.println(s10.equals(s11));
System.out.println(s10.contentEquals(s11));
System.out.println();
System.out.println/(s11.equals(s12));
//System.out.println(s11.contentEquals(s12));
System.out.println();
//System.out.println(s12.contentEquals(s11));
//System.out.println(s11==s12);
Example1 s13=new Example1(10);
//System.out.println(s13.charAt(1));
//System.out.println(s13.charAt(3));
//System.out.println(s13.charAt(7));
//System.out.println(s13.charAt(-1));
System.out.println(s13.hashCode());
System.out.println(System.identityHashCode(s13));
System.out.println(s13.hashCode());
System.out.println();
String s1="a";

System.out.println(s1.toString().concat());
System.out.println();

String s1="a";
String s2="b";
String s3="c";
String s4="d";
System.out.println(s1.concat("-").concat(s2).concat("-").concat(s3).concat("-").concat(s4));
//String s=String.join("-","a","b","c","d");
String a=String.join("","-");
System.out.println(a);
String[] sa=new String[5];
System.out.println(sa[4].toString().toUpperCase());
String s="hari krishna     ";
System.out.println(s.length());
String s1=s.substring(2);

System.out.println("name is "+s1 );
System.out.println(s1.length());

A a1;
System.out.println("a1"+a1);
System.out.println();

	}
static String s5;
}

String s1=new String("   Hari   ");
String s2=s1.trim();
String s3=s2.intern();
System.out.println(s2);
System.out.println(s3);
System.out.println(s1==s2);
String s4="abc";
String s5="aBc";
String s6="abcdef";
System.out.println(s5.compareTo(s6));
System.out.println(s6.compareTo(s5));
String s1=new String("a");
String s2=new String("a");
StringBuffer s3=new StringBuffer("a");
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.contentEquals(s2));
System.out.println(s1==s3);

		
		
StringBuffer s1=new StringBuffer(99);
s1.append("abcderfe");
s1.setLength(98);
System.out.println(s1.capacity());
System.out.println(s1.length());
System.out.println(System.identityHashCode(s1));
System.out.println(s2););
System.out.println(s1.charAt(3));
System.out.println(s1.charAt(10));
System.out.println(s1.charAt(0));
//System.out.println(s1.charAt(-1));
System.out.println(s1.charAt('h'));
		String s1="java programmin Language";
		s1=s1.toUpperCase();
		System.out.println(s1.length());
		System.out.println(s1.indexOf("PROGRAM"));
		System.out.println();
		System.out.println(s1.lastIndexOf('a'));
		System.out.println();
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.indexOf(s1));
		System.out.println(s1.lastIndexOf('A'));
		
		String s1="abc bbc cbc";
		s1=s1.replace('a', 'A');
		System.out.println(s1.startsWith("Abc"));
		System.out.println(s1.startsWith("bbc"));
		System.out.println(s1.endsWith("abc"));
	
		
		
		
		String s1="Java Programming Language";
		
		
		int start=s1.indexOf("m");
		System.out.println(start);
		int end=start+9;
		System.out.println(s1.substring(start, end));
		
		String s1="aabc aabc";
		
		
	String[] s2=s1.split("a");
	System.out.println(s2.length);
	System.out.println(Arrays.toString(s2));
	System.out.println();
		
		StringTokenizer st=new StringTokenizer("naresh it is a institute in hydrabad","a");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
	
		
		String s1="Hari Krishna";
		char[] ch=s1.toCharArray();
		byte[] bt=s1.getBytes();
		System.out.println(s1);
		System.out.println(ch);
		System.out.println(bt);
		System.out.println(Arrays.toString(ch));
		System.out.println((Arrays.toString(bt)));	
		
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.77));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(new char[] {'a','b'}));
		
	System.out.println(Integer.toString(11));
	
	String s1="Hari";
	String s2=s1.concat("Krishna");
	System.out.println(s1);
	System.out.println(s2);
	String s3="a";
	s3=s3.concat("b");
	System.out.println(s3);
		
		
		String s8="p";
		String s10=s8.concat("b");
		
		String s11=s8.concat("b");
		System.out.println(""+s11==s10);
		String s1=String.join(" ","a","b","c","d","e");
		String s2=String.join("-","a",new StringBuffer("b"),new StringBuilder("c"));
		System.out.println(s1);
		System.out.println(s2);
		String s1="aBCd";
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1);
		String s4=s1.toUpperCase();
		String s5=s1.toUpperCase();
		System.out.println(""+(s4==s5));
		String[] sa=new String[5];
		System.out.println(sa[2].toUpperCase());
		
		String s1="abc abc abc";
		s1=s1.replace("a","d");
		System.out.println(s1);
		String s4=s1.replace("a", "e");
		System.out.println(s4);
		System.out.println(s1==s4);
		String s1="Ja.va.txt";
		s1=s1.replaceFirst("\\.", "#");
		System.out.println(s1);
			s1=s1.trim();
		String s1="   abcd e  ";
		System.out.println(s1.length());
		s1=s1.trim();
		System.out.println(s1);
		String s4=s1.replace(" ","");
		System.out.println(s4.length());
		String s3=s1.trim();

		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
	
String s1="Hari";
String s2=s1.intern();
System.out.println(s2);
System.out.println(s1==s2);
String s3=new String("NIT");
String s4=s3.intern();
String s5="NIT";
System.out.println(s3==s4);
System.out.println(s4==s5);
String s6=s1.trim();
String s7=s6.intern();
System.out.println(s6==s7);
String s8="HariNIT";
String s9=s1.concat(s5);
String s10=s9.trim();
System.out.println(s10);
System.out.println(s8==s10);


		StringBuffer sb=new StringBuffer();
	
		
		pqr p1=new pqr();
		sb.append(p1);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		
		
		StringBuffer sb=new StringBuffer("209876512");
		sb.insert(2,'-');
		System.out.println(sb);
		sb.insert(7,"-");
		System.out.println(sb);
		sb.insert(0,"b");
		System.out.println(sb);
		StringBuffer sb=new StringBuffer("abc abc abc");
		sb.setCharAt(1, 'd');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setCharAt(3,'-');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setCharAt(5,'B');
		System.out.println(sb);
		System.out.println(sb.length());
	sb.delete(2, 6);
	System.out.println(sb);
		
		StringBuffer sb=new StringBuffer("Welcome to naresh it");
		sb.deleteCharAt(5);
		sb.deleteCharAt(6);
		sb.deleteCharAt(70);
		System.out.println(sb);
		StringBuffer sb=new StringBuffer("How are you");
		sb.reverse();
		
		System.out.println(sb);
	
		
		StringBuffer sb=new StringBuffer(3);
		sb.append("a");
		sb.append("b");
		sb.append("c");
		sb.append("d");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" g");
		System.out.println(sb);
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.length());	
		
		
		StringBuffer sb=new StringBuffer("abcdefg");
	
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		sb.setLength(25);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		sb.append("hari");
		System.out.println(sb);
		System.out.println(sb.length());
		String sb1=("a");
		String sb2=("a");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
	
		
		public static String reverseStringword(String s) {
		String[] Stringword=s.split(" ");
	
		StringBuilder sb=new StringBuilder();
		
		for(int i=Stringword.length-1;i>=0;i--) {
			sb.append(Stringword[i]);
			
			sb.append(" ");
		}
		return sb.toString().trim();
		
		
		
		
		
		
	}
		public static void main(String args[])
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=scn.nextLine();
			String result=string5.reverseStringword(str);
			System.out.println(str);
			System.out.println(result);	*/
	
	
	String s1=new String("a");
	String s2=new String("b");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
			
		}
}

