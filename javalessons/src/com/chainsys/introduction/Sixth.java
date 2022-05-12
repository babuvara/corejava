package com.chainsys.introduction;

public class Sixth {

	public static void main(String[] args) {
		Task();
	}

	public static void Task() {

		int n = 9;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(".");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		for (int i = 8; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(".");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

	public static void Task1() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}
}