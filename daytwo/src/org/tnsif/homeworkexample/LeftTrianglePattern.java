
public class LeftTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-1;j++) 
			{
				System.out.println(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.println("*");
			}
			System.out.println(" ");
		}
				
	}

}
