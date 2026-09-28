/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    
		System.out.println("Please enter a number");
		int x = sc.nextInt();

		System.out.println("Please enter another number");
		int y = sc.nextInt();

		if (x != y) {
			System.out.println("The numbers are different");
		}
		if (x == y) {
			System.out.println("The numbers are the same");
			

		}
	}
}
