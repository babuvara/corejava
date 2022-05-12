package com.chainsys.introduction;

public class Fourth {

	public static void main(String[] args) {
	taskA();
	taskB();
	}
	public static void taskA()
	{
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("What is your name?");
			String name=sc.next();
		//sc.close();
		System.out.println(name);
	}
	public static void taskB()
	{
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int firstvalue=sc.nextInt();
		int result=firstvalue * 100;
		System.out.println(result);
		sc.close();
	}
}