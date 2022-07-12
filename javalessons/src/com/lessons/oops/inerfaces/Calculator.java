package com.lessons.oops.inerfaces;

/**
 * 
 * @author babu3107
 *
 */

public class Calculator implements Cal {

	public int v1;
	public int v2;

	public int add(int v1, int v2) {
		System.out.println(v1 + v2);
		return v1 + v2;
	}

	public int multiply(int v1, int v2) {
		System.out.println(v1 * v2);
		return v1 * v2;

	}

	public int divide(int v1, int v2) {
		System.out.println(v1 / v2);
		return v1 / v2;
	}
}
