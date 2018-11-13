package tutorialpackage;

import java.util.Scanner;
import java.util.Random;
public class Tut1 {

	private  static void printName() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Hey Francis");
		}
			
		
	}
	
	public static void main(String[] args) {
		int varNum1;
		varNum1 = 18;
		
		int varNum2 = 81;
		
		int varNum3;
		varNum3 = varNum1 + varNum2;
		
		System.out.print(varNum3);
		System.out.println(varNum2);
		System.out.println(varNum1);
		
		printName(); 
		
if(varNum3 > 5) {
	System.out.println("Greater");
		}
else if (varNum3 > 6)
	System.out.println("bigger than 6");

else
	System.out.println("Less");

	String inData;
	Scanner scan = new Scanner( System.in );
	
	System.out.println("Enter the Data:");
	inData = scan.nextLine();
	
	System.out.println("You Entered:" + inData);
	
	int num;
	int square;
	System.out.println("Enter an Integer:");
	num = scan.nextInt();
	square = num * num ; // compute the square
		
	System.out.println("The square of " + num + " is " + square);
	
	Random rand = new Random();
	
	int randomNum = rand.nextInt(11);
	
	System.out.println(randomNum);
	}//end main

}//end class


