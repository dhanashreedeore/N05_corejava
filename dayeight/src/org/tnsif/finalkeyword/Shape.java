package org.tnsif.finalkeyword;
//program to demonstrate on final method

//we can't inherit the final class
//public final class shape
public class Shape {
	final String shapename="Circle";
	//final method
	void printShapeType()
	{
		System.out.println(shapename);
	}

}
