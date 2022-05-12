package com.chainsys.introduction;

/**
 * 
 * @author babu3107
 *
 */
class A {
	public void myMethod() {
		System.out.println("Overridden Method");
	}
}

public class Test extends A {

	public void myMethod() {
		System.out.println("Overriding Method");
	}

	public static void main(String args[]) {
		A obj = new Test();
		obj.myMethod();
	}
}