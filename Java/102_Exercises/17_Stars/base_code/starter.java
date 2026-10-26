/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a width: ");
		int width = sc.nextInt();
		System.out.println("Please enter a height: ");
		int height = sc.nextInt();

		while (height > 0) {
			int i = 0;
			while (i < width) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			height--;
		}

        System.out.println("Please enter a integer: ");
        int integer = sc.nextInt();

       int i = 1;
	while (integer > i+1) {
	
		
		while (integer > 0) {
			System.out.print("*");
			integer--;
		}
		i++;
		System.out.println();
		
     

	}

	} 
}
