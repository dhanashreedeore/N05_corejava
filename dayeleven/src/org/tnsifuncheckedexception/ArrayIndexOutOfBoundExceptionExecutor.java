//program to demonstrate on ArrayIndexOutOfBoundExceptionExecutor
package org.tnsifuncheckedexception;

public class ArrayIndexOutOfBoundExceptionExecutor {
	
	static void print(int arr[])
	{
		try
		{
			System.out.println(arr[4]);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled:"+e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any Ststement outside the block is always executed");
	}
	public static void main(String[] args) {
		
		int arr[]= {12,4,5};
		print(arr);
	}

}
