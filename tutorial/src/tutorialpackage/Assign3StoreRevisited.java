package tutorialpackage;
import java.util.Scanner;
public class Assign3StoreRevisited {

	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in);
		Scanner scanNum = new Scanner(System.in);
		
		double secretDiscount = 0; //Secret discount, will be updated if user inputs -1 on product choice
		String[] Products = {"Orange Juice", "Apple Juice","Strawberry Juice", "Lime Juice", "Lemon Juice", "Apples", "Oranges", "Strawberry", "Lime", "Lemon"}; //An array of product choices
		double[] Prices = {6, 2, 5, 3, 1, .76, 1, .78, 1, 2}; //Prices of products
		int[] Quantities = {0,0,0,0,0,0,0,0,0,0}; //Quantity of products bought
		int contShop; //Used to put product choice back up if user wants to buy more items
		double finalPrice = 0;//Use to calculate the final price of all the products bought
		
		do { //Runs the code inside brackets as long as the while statement is not fulfilled
		for(int i = 0; i < Products.length; i++) { //Lists all products w/ their prices
		System.out.println(i + ". " + Products[i] + " $" + Prices[i]);
		}//end for
		
		System.out.println("Please enter the number of the product you want to purchase."); //Tells user to type in the number of the product they would like to buy
		int productChoice = scanNum.nextInt(); //Updates user's input 
		if(productChoice == -1) { //Unlocks secret discount
			secretDiscount = 0.10; //Sets secret discount to 0.10
			System.out.println("Secret discount is now being used."); //Tells user that secret discount is used
		}//end if
		
		if(productChoice != -1) { //If product choice is not -1 continue
		System.out.println("How many of " + Products[productChoice] + ", would you like to buy?"); //Asks user how much of the product they would like to buy
		int qty = scanNum.nextInt(); //Updates user's input 
		Quantities[productChoice] = qty; //Stores quantity value inside the specified index of the quantities array
		}//end if
		
		System.out.println("Would you like to continue shopping? \n1 = Yes\n2 = No"); //Asks user if they want to continue shopping
		contShop = scanNum.nextInt(); //Updates user's input
		
		} while(contShop != 2); //A while statement that continues if user input 1 (continue shopping), it will run all the code inside the "do"
		for(int i = 0; i < Products.length; i++) { //Shows bill to user after exiting
			if(Quantities[i] > 0) { //If user bought more than 0 of the product this continues
				double totalPrice = Prices[i] * Quantities[i]; //Calculates sum of price
				finalPrice += Prices[i] * Quantities[i];//Updates final price
				if(secretDiscount == 0.10) { //If user used the secret discount this continues
					double discount = totalPrice * secretDiscount; //Multiples total price by discount
					totalPrice = totalPrice - discount; //Updates price, subtracts price by discount value
					finalPrice = finalPrice - discount; //Updates final price, subtracts final price by discount value
				}//end if
				
				System.out.println("Product: " + Products[i] + " Price: $" + Prices[i] + " Num Bought: " + Quantities[i] + " Total: $" + totalPrice); //Displays bill
			}//end if 
		}//end for
		
		System.out.println("Final Price: $" + finalPrice );//Prints out the final price

	}//end main

}//end class
