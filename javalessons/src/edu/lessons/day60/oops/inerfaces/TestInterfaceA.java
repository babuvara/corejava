package edu.lessons.day60.oops.inerfaces;

public class TestInterfaceA {

	public static void main(String[] args) 
	{
		InterfaceA.echo();
		InterfaceA a1=new InterfaceCImpl();
		a1.print();
		a1.print("Hello");
	}
}
