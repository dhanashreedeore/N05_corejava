//program to demonstrate on method overriding
package org.tnsif.polymorphism;

import java.util.Scanner;

class Laptop
{
	//String generation1,generation2;
	void specification(String generation1,String generation2)
	{
		System.out.println("Laptop : "+generation1);
	}
}
class Asus extends Laptop
{
	//String generation1,generation2;
	 void specification(String generation1, String generation2)
	{
		super.specification(generation1,generation2);
		System.out.println("Asus : "+generation2);
	}
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asus a=new Asus();
		Scanner s=new Scanner(System.in);
		String generation1=s.next();
		String generation2=s.next();
		a.specification(generation1,generation2);
		
	}

}
