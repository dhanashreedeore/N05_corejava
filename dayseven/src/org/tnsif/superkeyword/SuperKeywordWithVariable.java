package org.tnsif.superkeyword;
class State
{
	String statename="Punjab";
	
	
}
 class Capital extends State
{
	String statename="Hariyana";
	String capital="Chandigarh";
	
	public  void display()
	{
		/*super keyword with variable is used to call parent class
		 * variable if and only if parent and child class variable name
		 * are same*/
		System.out.println(super.statename);//Punjab
		System.out.println(statename);//Hariyana
	}
}

//driver class
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Capital c=new Capital();
		c.display();
		//System.out.println(c.statename);
	}

}
