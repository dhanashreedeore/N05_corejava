package org.tnsif.statickeyword;

public class StaticMethod {
	
	int x=2;
	static String collegeName="MET";
	/*if any method outside the main function and if you want to 
	 * access that method inside main function, we want to make that 
	 * method as a static*/
	
	//static method
	public static void print()
	{
		System.out.println(collegeName);
		/*we can't use non static variable inside any static method*/
		//System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print();
	}

}
