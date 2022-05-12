package com.chainsys.introduction;

/**
 * 
 * @author babu3107
 *
 */
interface Hi {
	void hello();
}

interface Fine {
	void venkat();
}

class Hello implements Hi, Fine {
	public void hello() {
		System.out.println("Hello");
	}

	public void venkat() {
		System.out.println("venkat");
	}
}

public class level {
	public static void main(String args[]) {
		Hello h = new Hello();
		h.hello();
		h.venkat();
	}
}