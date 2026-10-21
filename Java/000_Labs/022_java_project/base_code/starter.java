/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   int dodo = (int)(Math.random() * 1000) + 1;
	   System.out.println("Welcome to the guessing game!");
	   System.out.println("Please enter a number between 1 and 1000: ");

	   int guess = sc.nextInt();
	   while (guess != dodo) {
		   if (guess < dodo) {
			   System.out.println("The number is higher.");
		   } else {
			   System.out.println("The number is lower.");
		   }
		   System.out.println("Please enter another number: ");
		   guess = sc.nextInt();
	   }
	   System.out.println("You guessed the number!");
	}
}
