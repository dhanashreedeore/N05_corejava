//driver class
/*program to demonstrate on default and parameterized constructor*/
package org.tnsif.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		Citizen c=new Citizen();
		Citizen c1=new Citizen("Adult",123456789123L,"Female","Nashik");
		System.out.println(c1);

	}

}
