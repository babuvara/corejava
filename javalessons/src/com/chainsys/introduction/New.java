package com.chainsys.introduction;
/**
 * 
 * @author babu3107
 *
 */
public class New {

	public static void main(String[] args) {
		   int i;
	         for (i = 1;i <= 100;i++) 
	                {
	                 if(i%3==0||i%5==0)
	                 {
	                         if(i%3==0&&i%5==0)
	                                {
	                        System.out.println("FizzBuzz"+" "+i);
	                                }
	                else if(i%3==0)
	                {
	        System.out.println("Fizz"+" " +i);
	                }
	                else if(i%5==0) 
	                {
	        System.out.println("Buzz"+" "+i);
	        }
	        
	                }
	                 else
	                 {
	                         System.out.println(i);
	                 }
	                }
	        
	        }
	

	

}
