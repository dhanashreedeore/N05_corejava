//driver class
/*program to demonstrate on class and objects*/
package org.tnsif.classandobjects;

public class SandwichExecutor {

	public static void main(String[] args) {
		
		//object creation 
		Sandwich s=new Sandwich();
		s.breadType="Brown bread";
		s.noofSlice=4;
		
		//method call
		s.display();
	}

}
