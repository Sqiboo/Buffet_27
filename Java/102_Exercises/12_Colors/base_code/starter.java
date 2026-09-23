/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);
        System.out.println("Random Color: rgb(" + red + ", " + green + ", " + blue + ")");
        System.out.println("Complementary Color: rgb(" + (255-red) + ", " + (255-green) + ", " + (255-blue) + ")");
        getColor(red, green, blue);
        getColor(255-red, 255-green, 255-blue);
        System.out.println("Triadic Colors ");
        getColor(red, green, blue);
        getColor(blue, green, red);
        getColor(green, red, blue);
        System.out.println("Dark Color: rgb(" + (127-red) + ", " + (127-green) + ", " + (127-blue) + ")");
        getColor(red-127, green-127, blue-127);

		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
