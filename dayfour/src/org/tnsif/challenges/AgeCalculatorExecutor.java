//Asks a user for that their birth year encoded as two digit (like "62") and for the current year 
package org.tnsif.challenges;

import java.util.Scanner;

public class AgeCalculatorExecutor {
	
	static void agealculator(int by, int cy)
	{
		if(cy>by)
		{
			System.out.println(cy-by);
		}
		else
		{
			System.out.println((100-by)+cy);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Birth Year and Current Year");
		int by=s.nextInt();
		int cy=s.nextInt();
		agealculator(by,cy);
		
	}

}
