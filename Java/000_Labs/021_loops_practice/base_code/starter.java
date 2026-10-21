/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   int target = (int)(Math.random() * 1000) + 1;
	   System.out.println("Welcome to the guessing game!");
	   System.out.println("Please enter a number between 1 and 1000: ");
	   int dodo = sc.nextInt();

	   while (dodo!= target) {
	      if (dodo > target) {
	         System.out.println("Your guess is too high, please try again: ");
	         dodo = sc.nextInt();
	      } if (dodo < target) {
	         System.out.println("Your guess is too low, please try again: ");
	         dodo = sc.nextInt();
	      } if (dodo == target) {
	         System.out.println("Congratulations! You guessed the correct number!");
	         break;

	      }
	   }
	}
}
