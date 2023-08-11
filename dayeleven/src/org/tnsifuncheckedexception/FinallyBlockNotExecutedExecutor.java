//program to demonstrate on FinallyBlockNotExecuted 
package org.tnsifuncheckedexception;

import java.util.Scanner;

public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int x=s.nextInt();
		int y=s.nextInt();
		
		//try blocks contains exceptional code
		try
		{
			System.out.println(x/y);
			//When we use System.exit(0), then finally block does not executed
			//System.exit(0);
		}
		//catch block is used to handle an exception
		catch(Exception e)
		{
			System.out.println("Exception handle"+e);
			//when we used System.exit(0), then finally block does not executed
			//System.exit(0);
		}
		finally
		{
			/*When finally block contains an exception then 
			 * finally block does not executed*/
			//System.out.println(4/0);
			System.out.println("Finally block is always executed");
		}
		
	}

}
