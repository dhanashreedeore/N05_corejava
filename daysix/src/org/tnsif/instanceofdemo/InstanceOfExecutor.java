package org.tnsif.instanceofdemo;

//program to demonstrate on instanceof operator
//parent class
class Flower
{
	String name="Rose";
}

//child class
class Rose extends Flower

{
	String color="Red";
}
public class InstanceOfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rose r=new Rose();
		System.out.println(r instanceof Flower);
		
		/*if(r instanceof Flower)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		*/

	}

}
