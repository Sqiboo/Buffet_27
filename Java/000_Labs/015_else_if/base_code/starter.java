/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number between 0 and 1000: ");
	  int baka = sc.nextInt();
	  int randomNumber = (int)(Math.random() * 1000);
	  
	  if (baka > randomNumber){
	  	System.out.println("Your number is greater than the random number");
	  }
	  else if (baka < randomNumber){
	  	System.out.println("Your number is less than the random number");
	  }
	  else{
	  	System.out.println("Your number is equal to the random number");
	  }
	  System.out.println("The random number was: " + randomNumber);
	}
}
