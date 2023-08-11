package org.tnsif.singledimentionalarray;
//program to demonstrate on runtime array on to find out largest element in an array

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of elements in an array :");
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		//array initialization
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("Array element are :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The largest element of an array is :"+max);
		//Arrays is a class and sort is the built in the method
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
	}

}
