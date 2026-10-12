/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
     System.out.println("What is your name?");
     String name = sc.nextLine();
     System.out.println("What is your title?");
	 String title = sc.nextLine();
	 System.out.println("Woul you like to be a Wizard, Warrior, or a Rogue?");
	 String character = sc.nextLine();
	 if (character.equals("Wizard") || character.equals("wizard")){
		 System.out.println("You have chosen to be a Wizard!");
	 }
	 if (character.equals("Warrior") || character.equals("warrior")){
		 System.out.println("You have chosen to be a Warrior!");
	 }
	 if (character.equals("Rogue") || character.equals("rogue")){
		 System.out.println("You have chosen to be a Rogue!");
	 }

	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely!");
	System.out.println("Strength (1-10): ");
	int remainingPoints = 20;
	int strength = sc.nextInt();
	if (strength <= 10) {
			remainingPoints = remainingPoints - strength;
		System.out.println("You have " + remainingPoints + " skill points left.");
	}
	else {
		System.out.println("Please input a smaller number.");
    int strength2 = sc.nextInt();
		 remainingPoints = remainingPoints - strength2;

		 System.out.println("You have " + remainingPoints + " skill points left.");

		
	}

	System.out.println("Dexterity (1-10): ");
	int dexterity = sc.nextInt();
	if (dexterity <= 10) {
		remainingPoints = remainingPoints - dexterity;
		System.out.println("You have " + remainingPoints + " skill points left.");
	}
	else {
		System.out.println("Please input a smaller number.");
		 int dexterity2 = sc.nextInt();
		 remainingPoints = remainingPoints - dexterity2;
		 System.out.println("You have " + remainingPoints + " skill points left.");
	}
	System.out.println("Intelligence (1-10): ");
	int intelligence = sc.nextInt();
		remainingPoints = remainingPoints - intelligence;
	if (intelligence <= 10) {
		remainingPoints = remainingPoints - intelligence;
		System.out.println("You have " + remainingPoints + " skill points left.");
	}
	else {
		System.out.println("Please input a smaller number.");
		 int intelligence2 = sc.nextInt();
		 remainingPoints = remainingPoints - intelligence2;
		 System.out.println("You have " + remainingPoints + " skill points left.");
	}
	System.out.println("Charisma (1-10): ");
	int charisma = sc.nextInt();
	remainingPoints = remainingPoints - charisma;
	if (charisma <= 10) {
		remainingPoints = remainingPoints - charisma;
		System.out.println("You have " + remainingPoints + " skill points left.");
	}
	else {
		System.out.println("Please input a smaller number.");
		 int charisma2 = sc.nextInt();
		 remainingPoints = remainingPoints - charisma2;
		 System.out.println("You have " + remainingPoints + " skill points left.");
	}

	if(remainingPoints > 0){
		System.out.println("You have " + remainingPoints + " skill points left to spend next time.");
	}
	else {}
		System.out.println("                                         ");
		System.out.println("                                        ");
		System.out.println("----------------------------------------");
		System.out.println("You are "+ name + ", the " + title + " of CVHS.");
		System.out.println("You are a " + character + " with the following stats:");
		System.out.println("Strength: " + strength);
	System.out.println("Dexterity: " + dexterity);
	System.out.println("Intelligence: " + intelligence);
	System.out.println("Charisma: " + charisma);
    System.out.println("                                         ");
	System.out.println("                                         ");
	System.out.println("Good luck on your quest, " + name + "!");



	}
	}

