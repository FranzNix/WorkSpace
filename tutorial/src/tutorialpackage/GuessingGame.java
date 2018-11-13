package tutorialpackage;
import java.util.Random;	
import java.util.Scanner;	

public class GuessingGame {	
	static Scanner scan = new Scanner(System.in);	// Makes a static Scanner variable use to scan user input and put it inside a variable
	static Random rand = new Random();	// Makes a static Random variable that generates a random number 
	public static void ageGuessGame() {	// This function the code
	System.out.println("Welcome to the age guessing game!");	// Prints out the welcome message
	String name;	//Make a string name variable which stores the users name
	System.out.println("What is your name?");	// Ask the user for there name
	name = scan.nextLine();	// Takes the user input	
	System.out.println("Welcome, " + name + "!"); // Prints out Welcome message with name
	System.out.println("Do you want to play the game?\n1. Yes\n2. No");	// Ask user if they would like to play
	int choice = scan.nextInt();	// Takes the user input
	if(choice == 1) {	// If user chose 1 continue
	System.out.println("Creating a random number...");	// This prints out for the user to know that a random number is generating
	int number = rand.nextInt(80) + 1;	// Create a random number between 1-80
	System.out.println("Number created! Guess away, loser! \nHint: The age is between 1 and 80."); // Prints to the user that the number has been generated and gives a hint
	int guess = scan.nextInt();	// Take the users guess
	int counterToLoss = 0;	// Creates a counter on how many times they guessed
		do {	// Do 
			if(guess < number) {	// Continues is user's guess is lower than the number 
			counterToLoss = counterToLoss + 1;	// Add on how many times they have guessed wrong 
			System.out.println("Guess again! Hint: Your guess is less than the number.");	// Gives user another hint
			guess = scan.nextInt();	// Takes another guess made by the user
			}//end if
			
			else if(guess > number) {	// Continues if user's guess is higher than the number
			counterToLoss = counterToLoss + 1; // Adds on how many times they have guessed wrong
			System.out.println("Guess again! Hint: Your guess is more than the number.");	// Gives user another hint
			guess = scan.nextInt();	// Takes another guess made by user
			}//end else if
			
			else if(guess == number) {
				System.out.println("Congrats, you win :(");
				System.out.println("Would you like to play again?\n1. Yes\n2. No\nIf this keeps looping, just type in a letter instead. :)");	// Ask user if they would like to play again
				int choice2 = scan.nextInt();	// Takes user's answer
				
				if(choice2 == 1) {	// Continues if player would like to play again
				ageGuessGame();	// Restarts the game
				}//end if
				
				else {	// If player does not want to play again this will function
				System.out.println("Thanks for playing.");	// Prints out thanks for playing
				}//end else
				
			}// end else if
			
		}while(counterToLoss != 5);	// While statement, continues to run code inside "do" while counterToLoss does not equal 5
			System.out.println("You lose! :)");	// Prints out to the user if they lose	
			System.out.println("The number you were trying to guess was: " + number);	// Prints out the random number user was trying to guess 
			System.out.println("Would you like to play again?\n1. Yes\n2. No");	// Ask user if they would like to play again
			int choice3 = scan.nextInt();	// Takes user's answer
			
			if(choice3 == 1) {	// Continues if player would like to play again
			ageGuessGame();	// Restarts the game
			}//end if
			
			else {	// If player does not want to play again this will function
			System.out.println("Thanks for playing.");	// Prints out thanks for playing
			}//end else
			
		
	}//IDK
	
	else {	// If user does not want to play the game this will function
	System.out.println("Why'd you even run this program then?");	// Prints out why the user run this code if they will not want to play
	}//end else
	}//end game

	public static void main(String[] args) {
		ageGuessGame();	// Runs the function 

	}

}
