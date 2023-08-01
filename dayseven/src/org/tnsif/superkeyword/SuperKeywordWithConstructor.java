package org.tnsif.superkeyword;
//parent class
class Nationality
{
	
	String nationName="Germany";

	//parameterized constructor
	public Nationality(String nationName) {
		this.nationName = nationName;
		System.out.println(nationName);
	}
	
}
//child class
class Person extends Nationality
{
	
	String language="German";

	//parameterized constructor
	public Person(String nationName, String language) {
		//calling to parent class constructor
		super(nationName);
		this.language = language;
		System.out.println(language);
		
	}
	
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person("Germany","German");

	}

}
