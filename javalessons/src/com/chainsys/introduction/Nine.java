package com.chainsys.introduction;
import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		checkUserName();
	}
	public static void checkUserName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String userName = sc.nextLine();
        sc.close();
        System.out.println("Name is " + userName);
        char[] nameAsCharacters = userName.toCharArray();
        int lengthOfCharArray = nameAsCharacters.length;
        System.out.println("Length of your name is:" + lengthOfCharArray);
        if(lengthOfCharArray<3)
        {
                System.out.println("Name must have atleast 3 chars");
                return;
        }
        if(lengthOfCharArray>15)
        {
                System.out.println("Name must NOT have MORE than 15 chars");
                return;
        }
        String nameInUppercase=userName.toUpperCase();
        nameInUppercase = nameInUppercase.trim();
        char[] uppercaseCharArray=nameInUppercase.toCharArray();
        lengthOfCharArray = uppercaseCharArray.length;
        int asciiValue=0;
        for(int index=0;index<lengthOfCharArray;index++)
        {
                asciiValue=(int)uppercaseCharArray[index];
                System.out.println("ASCII : "+asciiValue);
                if(asciiValue<65||asciiValue>90)
                {
                        if(asciiValue!=32)
                        {
                                System.out.println("IN Valid Character in Name: ");
                                return;
                        }
                }
        }
        
        
        
        
        

}

}

