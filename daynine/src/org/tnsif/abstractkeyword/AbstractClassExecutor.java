package org.tnsif.abstractkeyword;
//driver class
//program to demonstrate to abstract keyword
public class AbstractClassExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can't create an object for an abstract class
		Addition a=new Addition();
		a.print(10,20);
		a.operation();

	}

}
