package com.chainsys.introduction;

import java.util.Scanner;

/**
 * 
 * @author babu3107
 *
 */

public class FirstTest {

	public static void main(String[] args) {
		int num, rem, val = 0, a;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 3 digit number:");
		int ref = 0;
		num = sc.nextInt();
//		sc.close();
		
		while(true) {
			a=num;
		if (num < 1000 && num >= 100) {
			while (num > 0) {
				rem = num % 10;
				val = val + rem * rem * rem;
				num = num / 10;
			}
			if (a == val) {
				System.out.println(val + " is same number");
			}  
			else {
				System.out.println(val + " is different number");
			}
			break;
		}

		else{
			System.out.println("please enter only 3 digit number");
			
			num=sc.nextInt();
			
		}
		}
	}
}
