package tutorialpackage;
import java.util.Scanner;
public class CeasarsCipher {

	public static Scanner scanLine = new Scanner(System.in);	//Takes in a scan Line
	public static Scanner scanNum = new Scanner(System.in);	//Takes in a scan Num

	public static void chose(){	//Makes a public static void for chose
		System.out.println("What would you like to do:\n"	//Ask user is they want to Encrypt or Decrypt
				+ "1. Encrypt\n"
				+ "2. Decrypt\n" );
		int choice = scanNum.nextInt();	//Takes in user's input 
		if(choice == 1) {	//An if statement when user puts in a number
			encrypt(null, choice);	//When user picks 1 this will call the code for encrypt
		}//end if choice
		
		else if(choice == 2) {	//An else if statement when user outs in a number
			decrypt(null, choice);	//When user picks 2 this will call the code for decrypt
		}//end else if choice
		
	}//end chose
	
	public static void encrypt(String plainText, int shiftValue) {	//Makes a static void encrypt variable and a String plainText and an integer shiftValue
		char ch;	//Puts a char ch variable
		System.out.println("Enter a Plain Text: ");	//Tells user to put a Plain Text they want to be encrypted
		plainText  = scanLine.nextLine();	//Takes in user's Text
		
		System.out.println("Enter Shift Value (Between 1-25): ");	//Tells user to put a Shift Value
		shiftValue = scanNum.nextInt();	//Takes in user's value
 
		String encryptedMessage = "";	//Makes a string variable for the encrypted message
		for(int i = 0; i < plainText.length(); i++){		//A for loop which runs as long a "i" is less than the amount of letters
			ch = plainText.charAt(i);	//Shifts letter to user's Shift Value
			
			if(ch >= 'a' && ch <= 'z'){		//An if statement that will run for the small letters
	            ch = (char)(ch + shiftValue);	//Shifts the letter
	            
	            if(ch > 'z'){	//An if statement that runs until ch is greater than z
	                ch = (char)(ch - 'z' + 'a' - 1);	//ch variable that shifts small letter 	
	            }//end second if 
	            
	            encryptedMessage += ch;	//Takes in the small letters and shift them until the shift value
	        }//end first if
	        else if(ch >= 'A' && ch <= 'Z'){	//An else if that will run for the Big Letters
	            ch = (char)(ch + shiftValue);	//Shifts the letter forwards	
	            
	            if(ch > 'Z'){	//An if statement that runs until ch is greater than big letter Z
	                ch = (char)(ch - 'Z' + 'A' - 1);	//ch variable that shifts big letters
	            }//end other if
	            
	            encryptedMessage += ch;	//Takes in big letter and shifts them
	        }//end else if
	        else {
	        	encryptedMessage += ch; //Takes in the rest of the letter like , . " ' and shifts them
	        }//end else
		}//end for loop
		
		System.out.println("Encrypted Message = " + encryptedMessage);}	//Tells user the encrypted message
	
	public static void decrypt(String encryptedText, int shiftValue) {
		char ch; //Puts in char ch variable
		System.out.println("Enter a Encrypted Message: "); //Ask user to type an encrypted message to be encrypted
		encryptedText = scanLine.nextLine();	//Takes in user's encryted message
		
		System.out.println("Enter Shift Value(Between 1-25): ");	//Ask user for a shift value
		shiftValue = scanNum.nextInt();	//Takes in user's shift value

		String decryptedMessage = "";	//Makes a string variable for the decrypted message and stores it
		for(int i = 0; i < encryptedText.length(); i++){	//A for loop which runs as long a "i" is less than the amount of letters
			ch = encryptedText.charAt(i); //Shifts letter to user's Shift Value
			
			if(ch >= 'a' && ch <= 'z'){ 	//An if statement that will run for the small letters
	            ch = (char)(ch - shiftValue); //Shifts letter backwards
	            
	            if(ch < 'a'){ //An if statement that runs until ch is lesser than a
	                ch = (char)(ch + 'z' - 'a' + 1); 	//ch variable that shifts small letter backwards
	            }//end second if
	            
	            decryptedMessage += ch;	//Takes in the small letters and shift them until the shift value
	        }//end first if
	        else if(ch >= 'A' && ch <= 'Z'){	//An else if that will run for the Big Letters
	            ch = (char)(ch - shiftValue);	//ch variable that shifts big letters
	            
	            if(ch < 'A'){	 //An if statement that runs until ch is lesser than a for big letters
	                ch = (char)(ch + 'Z' - 'A' + 1);	 //ch variable that shifts big letter backwards
	            }//end other if
	            
	            decryptedMessage += ch;	//Takes in big letter and shifts them
	        }//end else if
	        else {
	        	decryptedMessage += ch;	//Takes in the rest of the letter like , . " ' and shifts them
	        }//end else
		}//end for
		
		System.out.println("Decrypted Message = " + decryptedMessage); //Tells user what the decryted message is
		return;
	}//end decrypt
	public static void main(String[] args) {
		chose(); //Runs the chose code
	}

}//end main
