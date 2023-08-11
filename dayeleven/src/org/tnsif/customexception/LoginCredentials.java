//program to demonstrate on user-defined exception
package org.tnsif.customexception;

public class LoginCredentials extends Exception{
	
	//private data member
	private String str;
	
	
	//getters and setters
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	//toString method
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
		
	

}
