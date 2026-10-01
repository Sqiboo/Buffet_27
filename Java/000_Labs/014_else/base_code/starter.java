/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int target = (int)(Math.random() * 1000) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 1000:");
		int number = sc.nextInt();
		if (number == target) {
			System.out.println("Congratulations! You guessed the number.");
		} else {
			System.out.println("Sorry, your number wasn't the random number. The random number was " + target);
		}
	}
}
