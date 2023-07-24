//program to demonstrate the program using switch
package org.tnsif.decisionmakong;
import java.util.Scanner;
public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("Perfect");
			break;
			
		case 2:
			System.out.println("Oo Antava");
			break;
			
		case 3:
			System.out.println("Taki taki");
			break;
			
		case 4:
			System.out.println("Default");
		}

	}

}
