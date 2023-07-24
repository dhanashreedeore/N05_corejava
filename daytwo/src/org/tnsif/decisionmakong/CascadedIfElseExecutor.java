package org.tnsif.decisionmakong;

import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age1=s.nextInt();
		int age2=s.nextInt();
		int age3=s.nextInt();
		if(age1>age2 && age1>age3)
		{
			System.out.println("Age is greater :"+age1);
		}
		else if(age2>age1 && age2>age3)
		{
			System.out.println("Age2 is greater :"+age2);
		}

	}

}
