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
		System.out.println("Please enter second number");
		int y = sc.nextInt();
		System.out.println("Please enter your third number");
		int z = sc.nextInt();
		if (x > y && x > z) {
			System.out.println("The first number is the largest");
			System.out.println("Your number is " + x);
		}
		if (y > x && y > z) {
			System.out.println("The second number is the largest");
			System.out.println("Your number is " + y);
		}
		if (z > x && z > y) {
			System.out.println("The third number is the largest");
			System.out.println("Your number is " + z);
		}
		if (z < x && z < y) {
			System.out.println("The third number is the smallest");
			System.out.println("Your number is " + z);
		}
		if (y < x && y < z) {
			System.out.println("The second number is the smallest");
			System.out.println("Your number is " + y);
		}
		if (z < x && z < y) {
			System.out.println("The third number is the smallest");
			System.out.println("Your number is " + z);
		}
	}
		}
	
