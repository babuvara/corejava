package com.chainsys.strings;

/**
 * 
 * @author babu3107
 *
 */
public class StringLessonA {
	public static void lessonOne() {
		// String is an array of characters
		String firstString = "chainsys";
		System.out.println(firstString);
		char dataOne[] = { 'c', 'h', 'a', 'i', 'n' };
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString = new String(new char[] { 'c', 'h', 'a', 'i', 'n' });
		System.out.println(thirdString);
	}

	public static void lessonTwo() {
		String firstString = "Hello";
		String secondString = "Hello";
		String thirdString = "Hello";
		int firstNumber = 100;
		int secondNumber = 100;
		int thirdNumber = 100;
		System.out.println(firstString);
		System.out.println(secondString);
		firstString = "Welcome";
		System.out.println(firstString);
		System.out.println(secondString);
	}

	public static void creatingStringInaForLoop() {
		for (int count = 0; count < 10; count++) {
			String s1 = "Hello";
		}
	}

	public static void stringToCharArray() {
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String firstString = Scanner.nextLine();
		Scanner.close();
		int Stringlength = firstString.length();
		System.out.println("Length" + Stringlength);
		char[] data = firstString.toCharArray();
		int dataarraylength = data.length;
		System.out.println("Length" + dataarraylength);

	}

	public static void stringUpperToLower()
	{
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String firstString = Scanner.nextLine();
		Scanner.close();
		System.out.println(firstString);
		String StringInUppercase = firstString.toUpperCase();
		System.out.println("toUpperCase=" + StringInUppercase);
		String StringInLowercase = firstString.toLowerCase();
		System.out.println("s1=" + firstString);
		System.out.println("toLowerCase=" + StringInLowercase);
		System.out.println("s1=" + firstString);
		
		  //substring //from the 4th char till end String
		  String subString=firstString.substring(3);
		  System.out.println(subString); //from 3rd char to 6th char (i.e excluding 7th char) from index 2 to index 5
		  subString=firstString.substring(2,6);
		  System.out.println(subString);
		  String replaceString=firstString.replace('a','e');
		  System.out.println(replaceString); //equals boolean flag1=firstString
		  boolean flag1=firstString.equals(StringInUppercase);
		  System.out.println(flag1);
		  boolean flag=firstString.equalsIgnoreCase(StringInUppercase);
	      System.out.println(flag);
	}

	public static void testSplit() {
		String firstString = "  Tom and Jerry are Good Friends  ";
		String trimmedString = firstString.trim();
		String[] data = trimmedString.split(" ");
		int count = data.length;
		System.out.println("Word count " + count);
		for (int index = 0; index < count; index++) {
			System.out.println(data[index]);
		}
	}

	public static void testSplitDays() {
		String weekdays = "  mon;tue;wed;thurs;fri,sat,sun  ";
		String[] data = weekdays.split(" ;");
		int count = data.length;
		System.out.println("days count " + count);
		for (int index = 0; index < count; index++) {
			System.out.println(data[index]);
		}
	}

	// write code to reverse a String
	public static void reverse() {
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = "";
		try {
			sentence = Scanner.nextLine();
                                                                                                                
		} finally {
			Scanner.close();
		}
		char[] reverseString = sentence.toCharArray();
		int Stringlength = reverseString.length;
		for (int index = Stringlength - 1; index >= 0; index--) {
			System.out.println(reverseString[index]);
		}							
	}
}
