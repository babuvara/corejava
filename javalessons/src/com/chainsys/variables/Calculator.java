package com.chainsys.variables;
/**
 * 
 * @author babu3107
 * created on 25 mar 2022
 *
 */
public class Calculator {
/**
 * Add method:takes 2  integer values using the following parameters,
 * and will add  the values .the result  of totaling will be returned back to the caller
 //this the static  method object references is not required.
 * @param param1 of type int
 * @param param2 of type int
 * @return type in
 */
	public static int add(int param1,int param2)
	{
		int result=param1+param2;
		return result;
	}
	/**
	 * multiply method:takes 2  integer values using the following parameters,
	 * and will multiply  the values .the result  of totaling will be returned back to the caller
	 //this the static  method object references is not required.
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type in
	 */
	public static int multiply(int param1,int param2)
	{
		int result=param1*param2;
		return result;
	}
	/**
	 * subtract method:takes 2  integer values using the following parameters,
	 * and will subtract  the values .the result  of totaling will be returned back to the caller
	 //this the static  method object references is not required.
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type in
	 */
	public static int subtract(int param1,int param2)
	{
		int result=param1-param2;
		return result;
	}
	/**
	 * divide method:takes 2  integer values using the following parameters,
	 * and will divide  the values .the result  of totaling will be returned back to the caller
	 //this the static  method object references is not required.
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type in
	 */
	public static int divide(int param1,int param2)
	{
		int result=param1/param2;
		return result;
	}
	
}
