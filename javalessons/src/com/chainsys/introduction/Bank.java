package com.chainsys.introduction;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		deposite();
		
	}
		public static void deposite()
		{
			int balance=500;
			System.out.println("CURRENT BALANCE IS  "+balance);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a deposit amount:");
			int amount=sc.nextInt();
			balance=amount+balance;
			System.out.println("YOUR BALANCE IS:"+balance);
			System.out.println("Enter a withdraw amount:");
			int withdraw=sc.nextInt();
			sc.close();
			balance=balance-withdraw;
			System.out.println("YOUR BALANCE IS:"+balance);
			
		}
		
		

	}


