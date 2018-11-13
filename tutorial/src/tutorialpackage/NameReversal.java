package tutorialpackage;
import java.util.Scanner;
public class NameReversal {

		    public static void main(String[] args) {
		    	   System.out.println("Enter your name to reverse:");	// Ask user for what name/word they want to get reversed
		           
		           Scanner read = new Scanner(System.in);	// Makes a Scanner variable use to scan user input and put it inside a variable
		           String name = read.nextLine();	// Makes a String name variable and reads next line
		           String reverse = "";	// Makes a String reverse variable which will be printed when user has typed a name/word
		           
		           for(int i = name.length() - 1; i >= 0; i--)	// Makes a loop and counts how many letters are in the name and minus 1 until i is greater or equal than 0 and it minus
		           {
		               reverse = reverse + name.charAt(i);	// Makes a variable reverse and adds reverse and the name 
		           }// end for loop
		           
		           System.out.println("Reversed name is:\n" + reverse);	// Prints user the reversed name 

}
		    }//end main