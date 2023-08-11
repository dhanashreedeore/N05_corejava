//program to demonstrate on throw and throws keyword
package org.tnsifuncheckedexception;

import java.io.IOException;

public class ThrowExecutor {
	
	//Throws keyword is used to declared an execution
	static void isEligible(int age,int weight)throws IOException
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			//throw keyword is used to throw an exception explicitly 
			throw new IOException("Age and weight criateria is not fulfilled");
		}
	}

	public static void main(String[] args) throws IOException {
		
		isEligible(12,54);		
		
	}

}
