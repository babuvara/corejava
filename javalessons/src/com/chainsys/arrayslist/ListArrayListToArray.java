package com.chainsys.arrayslist;

import java.util.ArrayList;

class ListArrayListToArray {
public static void main(String args[])
{
	ArrayList<Integer>a1=new ArrayList<Integer>();
	a1.add(1);   //boxing-will use wrappere class
	a1.add(2);
	a1.add(3);
	a1.add(4);
	System.out.println("Contents of a1: "+a1 );
	//object data[]=a1.toArray();
	int sum=0;
	//for(int i=0;i<data.length;i++)
	//sum +=((Integer)data[i]).intValue();
}
}
