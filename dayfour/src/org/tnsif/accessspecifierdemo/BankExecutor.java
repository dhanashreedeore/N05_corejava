package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifier.bank;
public class BankExecutor {
	
	public static void main(String[] args)
	{
		bank b=new bank();
		b.bankName="SBI";
		b.displayPublic();
		
		/*pinNo and displayPrivate() method are private ,
		*so we can't access into another class and
		*another package, anly we can access private 
		*data members inside the same class*/
		
		//b.pinNo;
		//b.displayPrivate();
		
		/*accountNo and displaydefault() method are default that's why,
		 * we are not able to access into another package,
		 * on;y we can access within the same package*/
		//b.accountNo;
		//b.displaydefault();	}
	}
}
