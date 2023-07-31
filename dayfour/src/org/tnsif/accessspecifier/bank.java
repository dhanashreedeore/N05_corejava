//program to demonstrate on access specifier
package org.tnsif.accessspecifier;

public class bank {
	
	//different access specifier
	public String bankName;
	private int pinNo;
	long accountNo=1234567891234L;
	
	//private method
	public void displayPublic()
	{
		System.out.println("Bank Name is : "+bankName);
	
	}
	
	//default method
	 void displayPrivate()
	{
		System.out.println("Account No. is : "+accountNo);
	}

}
