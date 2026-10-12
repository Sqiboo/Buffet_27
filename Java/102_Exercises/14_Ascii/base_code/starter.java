/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Goober Exhibit!"); 
		System.out.println("Please select what exhibit you'd like to view. ");
		System.out.println("1. Cartoons");
		System.out.println("2. Video Games");
		System.out.println("3. Food");
		String baka = sc.nextLine();
		if (baka.equals("cartoons")){
			System.out.println("--- Cartoons Exhibit ---");
			System.out.println ("1. South Park");
			System.out.println("2. The Simpsons");
			if (baka.equals("South Park") || baka.equals("south park")){
				System.out.println("         _          __________                              _,");
				System.out.println("     _.-(_)._     .\"          \".      .--\"--.          _.-{__}-._");
				System.out.println("   .'________'.   | .--------. |    .'        '.      .:-'`____`'-:.");
				System.out.println("  [____________] /` |________| `\\  /   .'``'.   \\    /_.-\"`_  _`\"-._");
				System.out.println("  /  / .\\/. \\  \\|  / / .\\/. \\ \\  ||  .'/.\\/.\\'.  |  /`   / .\\/. \\   `\\");
				System.out.println("  |  \\__/\\__/  |\\_/  \\__/\\__/  \\_/|  : |_/\\_| ;  |  |    \\__/\\__/    |");
				System.out.println("  \\            /  \\            /   \\ '.\\    /.' / .-\\                /-.");
				System.out.println("  /'._  --  _.'\\  /'._  --  _.'\\   /'. `'--'` .'\\/   '._-.__--__.-_.'   \\");
				System.out.println(" /_   `""""`   _\\/_   `""""`   _\\ /_  `-./\\.-'  _\\'.    `\"\"\"\"\"\"\"\"` .'`\\");
				System.out.println("(__/    '|    \\ _)_|           |_)_/            \\__)|        '       |   |");
				System.out.println("  |_____'|_____|   \\__________/   |              |;`_________'________`;-'");
				System.out.println("jgs'----------'    '----------'   '--------------'`--------------------`");
				System.out.println("     S T A N          K Y L E        K E N N Y         C A R T M A N");
				System.out.println("");
				System.out.println("South Park");
				System.out.println("Thanks for visiting the South Park exhibit!");
			}
			else if (baka.equals("The Simpsons") || baka.equals("the simpsons")){
				System.out.println("       _.._..,_,_");
				System.out.println("      (          )");
				System.out.println("       ]~,\"-.-~~[");
				System.out.println(".-----' \\__/ \"-, \\-----.");
				System.out.println("(  \"---...__..-\"._)     )");
				System.out.println(".=\\     `~-.     `-.'    /`.");
				System.out.println("(  `\"---....__..-\"`__..-'`\\_)");
				System.out.println(".='`---...__..-\"~_.-~~`---'`=.");
				System.out.println("(____________________________)");
				System.out.println("");
				System.out.println("");
				System.out.println("The Simpsons");
				System.out.println("Thanks for visiting The Simpsons exhibit!");
			}
		}
		else if (baka.equals("video games")){
			System.out.println("--- Video Games Exhibit ---");
			System.out.println("1. Sonic");
			System.out.println("2. Pac-Man");
			String nani = sc.nextLine();
			if (nani.equals("Sonic") || nani.equals("sonic")){
				System.out.println("          .,");
				System.out.println(".      _,'f----.._");
				System.out.println("|/ ,-'\"/  /|     ,'");
				System.out.println("|,_  ,--.      /");
				System.out.println("/,-. ,'`.     (_");
				System.out.println("f  o|  o|__     \"`-.");
				System.out.println(",-._.,--'_ `.   _.,-`");
				System.out.println("`\"' ___.,'` j,-'");
				System.out.println("  `-.__.,--'");
				System.out.println("Sonic the Speedy Hedgehog");
				System.out.println("Thanks for visiting the Sonic exhibit!");
			}
			else if (nani.equals("Pac Man") || nani.equals("pac man")){
				System.out.println("================================================.");
				System.out.println("     .-.   .-.     .--.                         |");
				System.out.println("    | OO| | OO|   / _.-' .-.   .-.  .-.   .''.  |");
				System.out.println("    |   | |   |   \\  '-. '-'   '-'  '-'   '..'  |");
				System.out.println("    '^^^' '^^^'    '--'                         |");
				System.out.println("===============.  .-.  .================.  .-.  |");
				System.out.println("               | |   | |                |  '-'  |");
				System.out.println("               | |   | |                |       |");
				System.out.println("               | ':-:' |                |  .-.  |");
				System.out.println("l42            |  '-'  |                |  '-'  |");
				System.out.println("==============='       '================'       |");
				System.out.println("Pac-Man");
				System.out.println("Thanks for visiting the Pac-Man exhibit!");

			}
			

			

		}
		else if (baka.equals("food")){
			System.out.println("--- Food Exhibit ---");
			System.out.println("1. Pizza");
			System.out.println("2. Chocolate");
			String foodChoice = sc.nextLine();
			if (foodChoice.equals("Pizza") || foodChoice.equals("pizza")){
				System.out.println("// \"\"--.._");
				System.out.println("||  (_)  _ \"-._");
				System.out.println("||    _ (_)    '-.");
				System.out.println("||   (_)   __..-'");
				System.out.println(" \\__..--\"\"\" ");
				System.out.println("Pizza");
				System.out.println("Thanks for visiting the Pizza exhibit!");
			}
			else if (foodChoice.equals("Chocolate") || foodChoice.equals("chocolate")){
				System.out.println("    __________________,.............,    ");
				System.out.println("   /_/_/_/_/_/_/_/_/,-',  ,. -,-,--/|");
				System.out.println("  /_/_/_/_/_/_/_/,-' //  /-| / /--/ /");
				System.out.println(" /_/_/_/_/_/_/,-' `-''--'  `' '--/ /");
				System.out.println("/_/_/_/_/_/_,:................../ /");
				System.out.println("|________,'                   hh|/");
				System.out.println("       \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
				System.out.println("");
				System.out.println("");
				System.out.println("Chocolate");
				System.out.println("Thanks for visiting the Chocolate exhibit!");
			}
		}
	
		





		
		else{
			System.out.println("That is not a valid exhibit.");
	
		}
	}
}



