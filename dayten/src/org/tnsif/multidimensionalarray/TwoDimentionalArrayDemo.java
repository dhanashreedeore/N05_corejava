package org.tnsif.multidimensionalarray;

import java.util.Scanner;

//program to demonstrate on two dimensional array
public class TwoDimentionalArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[3][2];
		
		//for initializing an array values
		//outside
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=s.nextInt();
				
			}
			
		}
		
		//for printing a values
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
				
		}
	}

}
