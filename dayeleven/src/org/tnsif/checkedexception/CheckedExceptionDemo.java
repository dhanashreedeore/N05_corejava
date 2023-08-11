//program to demonstrate on checked exception
package org.tnsif.checkedexception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try
		{
			FileInputStream f=new FileInputStream("C:\\Users\\Dhanashree\\Documents");
			System.out.println("File not found");
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not exist: "+e);
		}
	}

}
