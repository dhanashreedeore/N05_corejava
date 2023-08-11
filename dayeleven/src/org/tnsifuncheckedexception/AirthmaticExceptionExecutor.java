package org.tnsifuncheckedexception;

import java.util.Scanner;

//program to demonstrate on arithmetic exception

public class AirthmaticExceptionExecutor {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		
		//try blocks contains exceptional code
		try
		{
			System.out.println(x/y);
			
		}
		
		//catch block is used to handle an exception
		catch(Exception e)
		{
			System.out.println("Exception handled"+e);
		}
	}

}
