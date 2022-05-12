package com.chainsys.introduction;
import java.util.Scanner;
public class Eight {

	public static void main(String[] args) {
	checkUsername();	
	}
	public static void checkUsername()
	{
		Scanner sc=new Scanner(System.in);  //input stream
		//promote a message in the displayed console
		System.out.println("Enter your name");
		//get name from the keyboard(input stream), and store the name in a local variable
		String username=sc.nextLine();
		sc.close();  //close the input stream
		//stream are created  and managed by the os.scanner is just a handle
		System.out.println("Name is"+username);  //display the input value received
		char[] nameAsCharacters=username.toCharArray();
		int lengthOfCharArray=nameAsCharacters.length;
		System.out.println("Length of your name is"+lengthOfCharArray);
		for(int index=0;index<lengthOfCharArray;index++)
		{
			System.out.println(index+" "+nameAsCharacters[index]);
		}
	}
}
