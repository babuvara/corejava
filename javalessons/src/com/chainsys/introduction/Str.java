package com.chainsys.introduction;

/**
 * 
 * @author babu3107
 *
 */
public class Str {

	public static void main(String[] args) {

		java.util.Scanner babu = new java.util.Scanner(System.in);
		System.out.print("Enter KAMALAKANNAN:");
		String bab = babu.nextLine();
		babu.close();
		char[] ba = bab.toCharArray();
		int len = ba.length;                             //N
		for (int i = 0; i <= len - 1; i++) {   //i=0-k;i=1-A;I=2-M;I=3-A;I=4-L;I=5-A;I=6-K;I=7-A;I=8-N;
			if (ba[i] == 'A') {
				ba[i] = 'N';
				if(ba[i]=='N')
				{
					ba[i]='A';
				}
			}
			

			System.out.print(ba[i]);
		}
	}
}