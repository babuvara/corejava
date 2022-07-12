package com.lessons.oops.usingfinal;

public class ShapeAPrivateConstructor{
public int height;
public int width;

private ShapeAPrivateConstructor()
{
	System.out.println("ShapeA createdA "+hashCode());
}
private ShapeAPrivateConstructor(int x)
{
	height=x;width=x;
	System.out.println("ShapeA createdB "+hashCode());
}
public void echo()
{
	System.out.println("VERAMARI");
}
public static ShapeAPrivateConstructor getObject() //factory method
{
	return new ShapeAPrivateConstructor();  //call to private constructor
}
}
