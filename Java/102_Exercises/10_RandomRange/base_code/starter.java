/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    System.out.println("Enter 2 numbers to create a range for your random number:");
    System.out.println("Please enter an integer:"); 
    Scanner input = new Scanner(System.in);
	int num1 = input.nextInt();
   System.out.println("Please enter another integer (bigger than the first):");
   int num2 = input.nextInt();
  System.out.println();
  System.out.println(("Your range is "+num1+" to "+num2));
  System.out.println("Here are 5 numbers generated in that range:");
   int randomNum = (int)(Math.random() * (num2 - num1 + 1) + num1);
   System.out.print(randomNum + ", ");
   randomNum = (int)(Math.random() * (num2 - num1 + 1) + num1);
   System.out.print(randomNum + ", ");
   randomNum = (int)(Math.random() * (num2 - num1 + 1) + num1);
   System.out.print(randomNum + ", ");
   randomNum = (int)(Math.random() * (num2 - num1 + 1) + num1);
   System.out.print(randomNum + ", ");
   randomNum = (int)(Math.random() * (num2 - num1 + 1) + num1);
   System.out.print(randomNum);
  
   
		
	}
}
