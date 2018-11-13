package tutorialpackage;
import java.util.Scanner;
public class HangmanProper {

	public static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water" };
	public static String word = words[(int) (Math.random() * words.length)];
	public static String emptySpaces = new String(new char[word.length()]).replace("\0", "_");
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Tells user to guess a letter	
		while (count < 6 && emptySpaces.contains(" _ ")) {
			System.out.println("Guess any letter in the word.");
			System.out.println(emptySpaces);	
			String guess = sc.next();
			hang(guess);
		}//end whi;e
		sc.close();
		
	}//end main
	
	public static void hang(String guess) {
		String newEmptySpace = " _ ";
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == guess.charAt(0)) {
				newEmptySpace += guess.charAt(0);
			}else if(emptySpaces.charAt(i) != '_') {
				newEmptySpace += word.charAt(i);
			}else {
				newEmptySpace += "_";
			}//end else
		}//end for
		
		if (emptySpaces.equals(newEmptySpace)) {
			count++;
			Image();
		} else {
			emptySpaces = newEmptySpace;
		}if (emptySpaces.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}//end if
	}//end hangman
	
	public static void Image() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------");

		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------");
			System.out.println("        |        ");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------");
			System.out.println("        |        ");
			System.out.println("       O       ");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------");
			System.out.println("        |        ");
			System.out.println("       O       ");
			System.out.println("     // | \\     ");

		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------");
			System.out.println("        |        ");
			System.out.println("       O       ");
			System.out.println("     // | \\    ");
			System.out.println("        |        ");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------");
			System.out.println("        |        ");
			System.out.println("       O       ");
			System.out.println("     // | \\    ");
			System.out.println("        |        ");
			System.out.println("      // \\      ");
			System.out.println("GAME OVER! The word was " + word);
		}
	}//end Image
	
	
}//end class
