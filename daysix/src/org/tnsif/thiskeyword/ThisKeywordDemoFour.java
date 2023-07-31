package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	
	int x;
	//Default Constructor
	ThisKeywordDemoFour()
	{
		//invoking current parameterized constructor
		this(34);
		System.out.println("Default constructor");
	}
	
	ThisKeywordDemoFour(int x)
	{
		//invoking current parameterized constructor
		this.x=x;
		System.out.println("Parameterized constructor :"+x);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywordDemoFour t=new ThisKeywordDemoFour();
		
	}

}
