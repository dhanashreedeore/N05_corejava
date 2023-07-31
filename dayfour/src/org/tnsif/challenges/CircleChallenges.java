/*there are n people standing in a circle waiting to be executed. 
*The counting out begins at some point in a circle and proxits around a circle in a fix direction.
*In each step a certain no. of people are skip and the next person is executed.
*The elimination proxits around the circle
* (which is becoming smaller and smaller as the executed people are remove),
*until only the last person remains who is given freedom.
*Given the total no. of person and number k which indicates that
*k-1 person are skip and the kth person is skilled in a circle .
*The task is to chose the person in the initial circle that survives
*/
package org.tnsif.challenges;

import java.util.Scanner;

public class CircleChallenges {

	static int survive(int n, int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
	}

}
