package edu.lessons.day8.exceptions.ex1;

public abstract class DemoB {

	
	    public abstract void echo();
	}
	// Abstract class must be inherited
	// abstract methods must be overriden
	class DemoBChild extends DemoB
	{
	    public void echo() {
	        System.out.println("Overriding the abstract method");
	    }

	public static void testDemoB() {
	    // abstract class can not be instantiated
//	    AbsDemoB objectDemob=new AbsDemoB();
	    DemoB objectDemob=new DemoBChild();
	    objectDemob.echo();
	}
	}
