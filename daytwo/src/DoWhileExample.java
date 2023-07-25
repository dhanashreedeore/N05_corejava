//program to demonstrate how many digit in given number using do----while loop
public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		{
			System.out.println("Enter the number : ");
		}
		int num=12345;
		do
		{
			num=num/10;
			count++;
		}while(num!=0);
		{
			System.out.println(+count);
		}
	}

}
