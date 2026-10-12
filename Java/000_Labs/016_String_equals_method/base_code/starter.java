/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
	 String character = sc.nextLine();
	 if (character.equals("Wizard")){
		 System.out.println("You have chosen to be a Wizard!");
	 }
	 if (character.equals("Warrior")){
		 System.out.println("You have chosen to be a Warrior!");
	 }
	 if (character.equals("Rogue")){
		 System.out.println("You have chosen to be a Rogue!");
	 }
	
	}
}
