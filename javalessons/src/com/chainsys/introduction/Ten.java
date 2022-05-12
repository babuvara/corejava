package com.chainsys.introduction;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		// findEvenNumbers();
		findEvenNumbers();
	}


	public static void findEvenNumbers()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 10 digit number");
		long value = sc.nextLong();
		sc.close();
		long num = value;
		long remainder = 0;
		while (num > 0) {
			remainder = num % 10;
			if (remainder % 2 == 0) {
				System.out.println(remainder);
			}
			num = num / 10;
		}

	}
	
	public static void swapNumbers() {
		int x = 67;
		int y = 79;
		System.out.println("X:" + x + " Y:" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("X:" + x + " Y:" + y);
	}

}
