package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	
	static float salary;
	String companyName;
	
	/*static block is used to initialized the static variable
	 * we can't assign any value for any non-static variable inside
	 * the static method*/
	static
	{
		//companyName="Accenture";
		salary=57576.90f;
	}
	
	//static method
	static void print()
	{
		System.out.println(salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print();
	}

}
