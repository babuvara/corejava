package com.chainsys.introduction;
public class Second {

	public static void main(String[] args) {
	taskA();
		

	}
	public static void taskA()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the x value:");
		int x= sc.nextInt();
		System.out.println("ENter the y value:");
		int y= sc.nextInt();
		int z=x+y;
		System.out.println("Result="+z);
		sc.close();
	}

}
