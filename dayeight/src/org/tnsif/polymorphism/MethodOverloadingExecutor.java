//program to demonstrate on compile time polymorphism
package org.tnsif.polymorphism;

import java.util.Scanner;

class Bollywood
{
	String str1,str2,str3;
	//method overloading 
	static void display(String str1,String str2)
	{
		System.out.println(str1+"loves"+str2);
	}
	
	static void display(String str1,String str2,String str3)
	{
		System.out.println(str1+"loves"+str2 +" as well as"+str3);
	}
}
//driver class
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three strings : ");
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		Bollywood.display(str1,str2);
		Bollywood.display(str1,str2,str3);
		
		
	}

}
