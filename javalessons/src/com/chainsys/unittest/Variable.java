package com.chainsys.unittest;

import com.chainsys.variables.Demo;
/**
 * 
 * @author babu3107
 *
 */
public class Variable
{
	/**
	 * test static variable
	 */
	public static void testGlobalVariable()
	{
		//display the value of staic field
		System.out.println("DataA: "+Demo.DataA);
		//display the value  of immutable field
		//this is not possible without an object
		//System.out.println("DataB: "+Demo.DataB):
		//display the value of constant field
		//System.out.println("DataC: "Demo.DataC);
		Demo.DataA=2345;
	  System.out.println("DataA: "+Demo.DataA);
		//modifying value of the ststic field DataC
		//ERROR:The final field  demo.datac cannot be assaigned
		//demo.datac2345;
		
		
	}
	public static void testImmutableVariable()
	{
		
		//cannot make a static reference 	to the non-static field Demo.DataB
		//Demo.DataB=123
		//access the immutable instance field  using  the object  reference
		Demo firstObject=new Demo(123);
		System.out.println(firstObject.DataB);
	}
		/*
		 * value assigned to an immutable field  cannot be changed
		 * value for the immutable field  can be assigned only throw the constructer
		 */
		//firstObject.DataB=567;
		/**
		 * calling static method using class name
		 * without creating an object
		 * created on 25 mar 2022
		 * 
		 */
		
		public static void testStaticMethod()
		{
			Demo.sayHello();
		}
			/** 
			 * calling non static method using object reference
			 * without creating an object ,non static methods can not be called
			 * created on 25 mar 2022
			 */
			public static void testNonstaticMethod()
			{
				//ERROR
				//Demo.greetUser();
				Demo firstObject=new Demo(111);
				//call the non static method
				firstObject.greetUser();
			}
	

}
