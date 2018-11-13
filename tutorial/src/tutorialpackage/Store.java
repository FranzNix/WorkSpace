package tutorialpackage;
import java.util.Scanner;	//Import a Scanner 
public class Store {
	
	static double Price = 0;	//Total prize of sale 
	static final double Tax = 0.05;	// Final double Tax
	static int totalQty = 0; // Accumulator 
	static int MonitorQty = 0;
	static int KeyboardQty = 0;
	static int MouseQty = 0;
	static int CPUQty = 0;
	static int HardDriveQty = 0;
	static int GraphicCardQty = 0;
	static int AirDusterQty = 0;
	static int CompCasesQty = 0;
	static int LaptopsQty = 0;
	static int GamingChairsQty = 0;
	static int HeadsetsQty = 0;
	
	public static void menu() {
	
		Scanner scanWords = new Scanner(System.in);	// This Scanner object takes in Words
		Scanner scanNums = new Scanner(System.in);	// This Scanner object takes in Nums
		double MonitorPrice = 60.0;	// Makes a double variable called MonitorPrice and the value of its Price
		double KeyboardPrice = 70.0;
		double MousePrice = 50.0;
		double CPUPrice = 250.0;
		double HardDrivePrice = 100.0;
		double GraphicCardsPrice  = 150.0;
		double AirDusterPrice = 20.0;
		double ComputerCasesPrice = 120.0;
		double LaptopsPrice = 900.0;
		double GamingChairsPrice = 230.0;
		double HeadsetsPrice = 130.0; 
		int itemNum;
		System.out.print("What is your name?\n");	// Ask user what their name is 
		String name = scanWords.nextLine();	// Makes a string name 

		System.out.println("\nWelcome " + name + " to Danny Computer Shop.");	// This prints out "Welcome and the customer name and the shop
			do {	// Do loop T-T
		System.out.println("\nWhat would you like to buy?\n" +	// Prints out the menu
				"0. Exit\n"
			+  "1. Monitor = $60.0\n" 
			+ "2. Keyboard = $70.0\n" 
			+ "3. Mouse = $50.0\n" 
			+ "4. CPU = $250.0\n" 
			+ "5. Hard Drives = $100.0 \n" 
			+ "6. Graphic Cards = $150.0\n" 
			+ "7. Air Dusters = $20.0\n" 
			+ "8. Computer Cases = $120.0\n" 
			+ "9. Laptops = $900.0\n" 
			+ "10. Gaming Chairs = $230.0\n"
			+ "11. HeadSets = $130.0\n"
			+ "Option: ");
		
		itemNum = scanNums.nextInt();	// Scans what the customer wants to buy
		if (itemNum != 0) {
			System.out.println("How many do you want?\n"	// Ask the customer how many they want
										+ "Quantity "); 
		
			int qty = scanNums.nextInt();	// Scans how many they want to buy
			totalQty += qty;
		
		if(itemNum == 1) {	// Makes a if statement, if they picked a number
			Price =calcCost(MonitorPrice, qty);	// This will equal the price of the monitor and how many they want
			MonitorQty += qty;	// Calculates how many the user bought
		}
		else if(itemNum == 2) {
			Price += calcCost(KeyboardPrice, qty);
			KeyboardQty += qty;
		}
		else if(itemNum == 3) {
			Price += calcCost(MousePrice, qty);
			MouseQty += qty;
		}
		else if(itemNum == 4) {
			Price += calcCost(CPUPrice, qty);
			CPUQty += qty;
		}
		else if(itemNum == 5) {
			Price += calcCost(HardDrivePrice, qty);
			HardDriveQty += qty;
		}
		else if(itemNum == 6) {
			Price += calcCost(GraphicCardsPrice, qty);
			GraphicCardQty += qty;
		}
		else if(itemNum == 7) {
			Price += calcCost(AirDusterPrice, qty);
			AirDusterQty += qty;
		}
		else if(itemNum == 8) {
			Price += calcCost(ComputerCasesPrice, qty);
			CompCasesQty += qty;
		}
		else if(itemNum == 9) {
			Price += calcCost(LaptopsPrice, qty);
			LaptopsQty += qty;
		}
		else if(itemNum == 10) {
			Price += calcCost(GamingChairsPrice, qty);
			GamingChairsQty += qty;
		}
		else if(itemNum == 11) {
			Price += calcCost(HeadsetsPrice, qty);
			HeadsetsQty += qty;
		}
		else {	// If they picked a different number from 1-11
			System.out.println("Sorry we dont have that.");	//This will be printed out 
			}
			}	// End is statement
		}while (itemNum != 0); // End while/do loop
	
			printSum();	// Prints Sum
			
	}	// End Menu

	public static double calcCost (double itemPrice, int qty ) {	// Makes a public static variabe "calcCost" and its value
		return itemPrice * 2 * qty;	// Returns Tax, multiply by 2 and quantity
	} // End calcCost
	
	public static double calcTax(double Tax, double Price) {	// Makes a variable for the Tax
		return Tax * Price;	// Returns Tax, and mutiply by 2
	} // End calcTax
	
	public static void printSum() {	// Makes a variable for Sum
		System.out.println("Total items bought: " + totalQty);	// Prints the user how many of the item they bought
		System.out.println("Total Monitors bought: " + MonitorQty);
		System.out.println("Total Keyboards bought: " + KeyboardQty);
		System.out.println("Total Mouse bought: " + MouseQty);
		System.out.println("Total CPUs bought: " + CPUQty);
		System.out.println("Total Hard Drives bought: " + HardDriveQty);
		System.out.println("Total Graphic Cards bought: " + GraphicCardQty);
		System.out.println("Total Air Dusters bought: " + AirDusterQty);
		System.out.println("Total Computer Cases bought: " + CompCasesQty);
		System.out.println("Total Laptops bought: " + LaptopsQty);
		System.out.println("Total Gaming Chairs bought: " + GamingChairsQty);
		System.out.println("Total Headsets bought: " + HeadsetsQty);
		
		System.out.println("You bought: " + totalQty + " items");	// Prints the user the overall thing they bought
		System.out.println("Your total cost is: $" + Price + " CAD");	// Prints out the total cost
		System.out.printf("Tax is: %.2f \n", + calcTax(Tax, Price));	// Prints out the tax
		
		double totalPrice = calcTax(Tax, Price) + Price;	// This will be adding the price and the tax
		System.out.printf("Total with tax is: %.2f \n", totalPrice);	// Prints the user the total price with tax
		System.out.println("Thanks for shopping at Danny's Computer Shop, Good Bye!");	// Prints out Goodbye to the customer
	}
	public static void main(String[] args) {	// Runs everything
		menu();	// Calls the menu function

	}	//End main

}
