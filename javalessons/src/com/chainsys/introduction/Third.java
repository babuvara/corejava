package com.chainsys.introduction;

public class Third {

	public static void main(String[] args) {
		//primitive types
		//signed data types
		//(2^8)/2=256/2
		byte b1=-128;  //less 128, greater than -129(-128...127)
		System.out.println("b1: "+b1);
		short shortMaxvalue=32767; //2^16
		System.out.println("s1: "+shortMaxvalue);
		short shortMinvalue=-32768; //2^16
		System.out.println("s2: "+shortMinvalue);
		int intMaxvalue=217483647; //2^32
		System.out.println("Maxvalue: "+intMaxvalue);
		int intMinvalue=-217483648; //2^32
		System.out.println("Minvalue: "+intMinvalue);
		long longMaxvalue=9223372036854775807L; //2^64
		System.out.println("Maxvalue: "+longMaxvalue);
		long longMinvalue=-9223372036854775808L; //2^64
		System.out.println("Minvalue: "+longMinvalue);
		float floatMaxvalue=2147483648.5432f; //2^32
		System.out.println("Maxvalue: "+floatMaxvalue);
		float floatMinvalue=2147483648.11111f; //2^32
		System.out.println("Minvalue: "+floatMinvalue);
		char c1='A';
		System.out.println("c1: "+c1);
		char c2='a';
		System.out.println("c2: "+c2);
		double doubleMaxvalue=2147483648.5432d;
		System.out.println("Maxvalue: "+doubleMaxvalue);
		double doubleMinvalue=-2147483648.11111d;
		System.out.println("Minvalue: "+doubleMinvalue);
		int asciivalueofc1= (int) c1;
		System.out.println(asciivalueofc1);
		char c3= (char) 89;
		System.out.println(c3);
		boolean flag;
	}
	

}
