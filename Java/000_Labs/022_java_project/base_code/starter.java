/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	   Scanner input = new Scanner(System.in);

	System.out.println("Slot Machine Rules: ");
	System.out.println("1. Each player starts with $100.");
	System.out.println("2. Input a wager amount less than or equal to your current balance.");
	System.out.println("3. The slot machine will generate three random numbers between 1 and 10.");
	System.out.println("    a. If two numbers match, you double your wager.");
	System.out.println("    b. If three numbers match, you triple your wager.");
	System.out.println("    c. If no numbers match, you lose your wager.");
	System.out.println("-----------------------------------------------");
	
    System.out.println("");
	System.out.println("Would you like to play the slot machine? (Yes/yes/Y/y)");
   String answer = input.nextLine();
   if (answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")) {
	   int balance = 100;
	   while (balance > 0) {
		   System.out.println("Your current balance is: $" + balance);
		   System.out.println("Please enter a wager amount: ");
		   int wager = input.nextInt();
		   if (wager > balance) {
	 
	}
}

