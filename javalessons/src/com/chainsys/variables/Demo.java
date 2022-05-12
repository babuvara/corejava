package com.chainsys.variables;

public class Demo {

		public static int DataA;
		public final int DataB;  //immutable
		public final static int DataC=300;  //constructor
		private int dataD;
		//constructor
		public Demo(int dataB)
		{
			this.DataB=dataB;
		}
		/**
		 * constructer is a special method
		 * the name of the constructer and the name of the class will be same
		 * constructer dont have return type
		 * constructers can take parameters
		 */
		public static void sayHello()
		{
			System.out.println("Hello Developer!!!");
			
		}
		public void greetUser()
		{
			System.out.println("Greetings User!!!");
			
		}

	

}
