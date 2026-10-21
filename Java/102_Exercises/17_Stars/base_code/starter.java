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
	}
}
