package tutorialpackage;
import java.util.Scanner;
public class Assign5Translator {
	
	static Scanner scan = new Scanner(System.in);
	static String choice = "";
	
	public static void TranslatorOpt() {
		System.out.println("Would you like to:\n1. English to Swedish\n2. Swedish to English");	//Ask user to put in what they want to translate
		int userchoice = scan.nextInt();	//Takes in user's choice
		 if(userchoice == 1) {	//Runs when userchoice is equals to 1
			 EngtoSwed(); //Runs English to Swedish
		 }//end if choice 1
		 
		 else if(userchoice == 2) {	//Runs when userchoice is equals to 2
			 SwedtoEng(); //Runs Swedish to English
		 }//end else if choice 2
		 
		 else {
			 System.out.println("You entered an invalid number. Please enter between 1 and 2 only.");	//Tells user that they entered an Invalid Number
			 TranslatorOpt();	//Runs TranslatorOpt 
		 }//end else when user inputs a number other than 1 or 2
	}//end TranslotorOpt
		
	public static void EngtoSwed() {
		String[] English = {"Hello","Bye", "Out", "Helicopter", "School", "Books", "Computer", "Bedroom", "Car", "Bike", "Phone", "Glasses", "Money", "Wallet", "Shirt"};
		String[] Swedish = {"Hej", "Adjö", "Ut", "Helikopter", "Skola", "Böcker", "Dator", "Sovrum", "Bil", "Cykel", "Telefon", "Glasögon", "Pengar", "Plånbok", "Skjorta"};
		//Both arrays above are used to find translated version of chosen hard
		
		System.out.println("These are all the translatable words:"); 
		for(int i = 0; i < English.length; i++) {	//Lists all English word translatable to Swedish
			System.out.println(i + ". " + English[i]);
		}//end for
		
		System.out.println();
		
		System.out.println("What word would you like to be translated?(Please enter the word)");	//Ask user what word they would like translated
		scan.nextLine();	//Deletes hidden enter key
		choice = scan.next();	//Actual word input
		
		for(int i = 0; i < English.length; i++) {	//Checks every word, once found, prints out the word	
			boolean foundorNot = false;	//Checks if the word has been found and translated
			do {	//Does everything inside brackets
				if(choice.equalsIgnoreCase(English[i])) {	//Looks for chosen word by looking at each index of the English array, not case sensitive
					foundorNot = true;
					if(foundorNot == true) {	//If foundorNot is set true to continue
						System.out.println("English: " + English[i] + "\nSwedish: " + Swedish[i]);
					}//end if foundorNot == true
				}//end if choice English
				
			i++;	//Adds 1 to the "i" variable
			}while(i != English.length);	//While the "i" variable does not equal the length of the English array go back to the "do"
			
			if(foundorNot == false) {	//If foundorNot is set to false this continues
				System.out.println("Invalid word. Returning to Translator Option...");	
				TranslatorOpt();	//Calls TranslatorOpt
			}//end if foundorNot == false
		}//end for
		
		System.out.println();
		
		System.out.println("Would you like to continue translating? \n1. Yes\n2. No\nPick 1 or 2.");	//Ask user if they would like to translate again
		int numchoice = scan.nextInt();	//Stores user's num input
		if(numchoice == 1) {	//If user input is 1 this continues
			System.out.println("Returning to Translator Option...");
			TranslatorOpt();	//Calls TranslatorOpt
		}//end if user chose 1 
		
		else {	//If user input anything other than 1 this continues
			System.out.println("Exiting...");	
			System.exit(-1);	//Exits the program
		}//end else user chose 2
	}//end EngtoSwed
	
	public static void SwedtoEng() {
		String[] English = {"Hello","Bye", "Out", "Helicopter", "School", "Books", "Computer", "Bedroom", "Car", "Bike", "Phone", "Glasses", "Money", "Wallet", "Shirt"};
		String[] Swedish = {"Hej", "Adjö", "Ut", "Helikopter", "Skola", "Böcker", "Dator", "Sovrum", "Bil", "Cykel", "Telefon", "Glasögon", "Pengar", "Plånbok", "Skjorta"};
		//Both arrays above are used to find translated version of chosen hard
		
		System.out.println("These are all the translatable words:");
		for(int i = 0; i < Swedish.length; i++) {	//Lists all Swedish word translatable to English
			System.out.println(i + ". " + Swedish[i]);
		}//end for
		
		System.out.println("What word would you like to be translated?");		//Ask user what word they would like translated
		scan.nextLine();		//Deletes hidden enter key
		choice = scan.next();	//Actual word input
		
		for(int i = 0; i < Swedish.length; i++) {	//Checks every word, once found, prints out the word	
			boolean foundorNot = false;	//Checks if the word has been found and translated
			do {	//Does everything inside brackets
				if(choice.equalsIgnoreCase(Swedish[i])) {	//Looks for chosen word by looking at each index of the English array, not case sensitive
					foundorNot = true;
					if(foundorNot == true) {	//If foundorNot is set true to continue
						System.out.println("Swedish: " + Swedish[i] + "\nEnglish: " + English[i]);
					}//end if foundorNot == true
				}//end if choice English
			i++;	//Adds 1 to the "i" variable
			}while(i != Swedish.length);	//While the "i" variable does not equal the length of the Swedish array go back to the "do"
			
			if(foundorNot == false) {	//If foundorNot is set to false this continues
				System.out.println("Invalid word. Returning to Translator Option...");
				TranslatorOpt();	//Calls TranslatorOpt
			}//end if foundorNot == false
		}//end for
		
		System.out.println();
		
		System.out.println("Would you like to continue translating? \n1. Yes\n2. No");	//Ask user if they would like to translate again
		int numchoice = scan.nextInt();	//Stores user's num input
		if(numchoice == 1) {	//If user input is 1 this continues
			System.out.println("Returning to Translator Option...");
			TranslatorOpt();	//Calls TranslatorOpt
		}//end if user chose 1 
		
		else {	//If user input anything other than 1 this continues
			System.out.println("Exiting...");
			System.exit(-1);	//Exits program
		}//end else user chose 2
	}//end SwedtoEng
	
	public static void main(String[] args) {
		TranslatorOpt();	//Calls TranslatorOpt and runs the whole code
		
	}//end main
}//end class
