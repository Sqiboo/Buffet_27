/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.print("How many times should I print your name? ");
		int count = input.nextInt();

		int i = 0;
		while (true) {
			if (i >= count) {
				break;
			}
			System.out.println(name);
			i++;9
		}

		
	}
}
