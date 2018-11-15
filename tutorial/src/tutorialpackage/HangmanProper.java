package tutorialpackage;
import java.util.Scanner;
public class HangmanProper {

	private static String[] words = {"dictionary", "jacket", "shirt", "glasses", "juice", "water"};
	private static String word = words[(int) (Math.random() * words.length)];
	private static String dash = new String(new char[word.length()]).replace("\0", "-");
	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count < 7 && dash.contains("-")) {
			System.out.println("Guess any letter in the word");
			System.out.println(dash);
			String guess = sc.next();
			hang(guess);
		}
		sc.close();
	}

	public static void hang(String guess) {
		String newDash = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newDash += guess.charAt(0);
			} else if (dash.charAt(i) != '-') {
				newDash += word.charAt(i);
			} else {
				newDash += "-";
			}
		}

		if (dash.equals(newDash)) {
			count++;
			Image();
		} else {
			dash = newDash;
		}
		if (dash.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}

	public static void Image() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------------");
		}//end first count 1
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------------");
			System.out.println("          |           ");
		}
		if (count == 3) {
			System.out.println("----------------------");
			System.out.println("          |           ");
			System.out.println("          O          ");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------------");
			System.out.println("          |           ");
			System.out.println("          O          ");
			System.out.println("         /|\\        ");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------------");
			System.out.println("          |           ");
			System.out.println("          O          ");
			System.out.println("         /|\\        ");
			System.out.println("          |           ");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("----------------------");
			System.out.println("          |           ");
			System.out.println("          O          ");
			System.out.println("         /|\\        ");
			System.out.println("          |           ");
			System.out.println("         / \\          ");
			System.out.println("GAME OVER! The word was " + word);
		}
	}
}
