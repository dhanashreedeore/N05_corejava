package org.tnsif.superkeyword;
//parent class
class Sports
{
	String sportsName="Cricket";
	void display()
	{
		System.out.println("Sports name is : "+sportsName);
	}
	
}
//child class
class Cricket extends Sports
{
	
	int noOfPlayers=12;
	void display()
	{
		/* if parent and child class methods are same and if we want to
		 * call the parent class method include the child class then use 
		 * super.methodName();*/
		super.display();
		System.out.println("No. of players is : "+noOfPlayers);
	}
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricket c=new Cricket();
		c.display();

	}

}
