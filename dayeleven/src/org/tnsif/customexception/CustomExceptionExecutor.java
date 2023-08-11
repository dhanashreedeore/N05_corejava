//program to demonstrate on User-defined exception
package org.tnsif.customexception;

import java.util.Scanner;

//driver class
public class CustomExceptionExecutor {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an email id and password");
		String email=s.nextLine();
		String password=s.nextLine();
		try
		{
			if(email.equals("abcdram@efg.org")&& password.equals("Pass@123"))
			{
				System.out.println("Credential Matched");
				
			}
			else
			{
				throw new Exception("Invalid Credentials");
				
			}
		
		}
		catch(LoginCredentials e)
		{
			System.out.println(e);
		}
	}

}
