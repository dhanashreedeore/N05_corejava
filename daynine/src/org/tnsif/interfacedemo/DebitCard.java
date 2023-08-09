package org.tnsif.interfacedemo;

public interface DebitCard {
	
	/*by default all the variable inside an interface is public 
	 * static final and if it final then we must have to initialize
	 * value for that variable.*/
	
	long cardno=1234567891234L;
	
	//we can't use concrete method inside an interface 
	//by default , method inside an interface is an abstract
	
	void displayCardDetails();
	
	/*default method and static method is the new features of java8
	which can we use as an interface*/
	
	default void display()
	{
		System.out.println("Default Method");
	}
	
	//static method
	static void print()
	{
		System.out.println("static method");
	}
	

}
