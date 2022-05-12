package com.chainsys.introduction;

/**
 * 
 * @author babu3107
 *
 */
class Demo {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class SimpleCalculator {
	public static void main(String args[]) {
		Demo obj = new Demo();

		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
	}
}
