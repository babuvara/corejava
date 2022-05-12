package com.chainsys.unittest;
import com.chainsys.variables.Calculator;
public class Calculatortest{
	 void TestAdd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.add(arg1,arg2);
		System.out.println("Result of Add is:"+output);
	}
	 void testMultiply()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.multiply(arg1,arg2);
		System.out.println("Result of multuply is:"+output);
	}
	 void testDivide()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.divide(arg1,arg2);
		System.out.println("Result of Divide is:"+output);
	}
	 void testSubtract()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.subtract(arg1,arg2);
		System.out.println("Result of Subtract is:"+output);
	}
}
	



