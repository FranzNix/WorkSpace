package tutorialpackage;
import java.util.Scanner;	//Import a Scanner 
public class Store2 {

	public static void main(String[] args) {
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
		double Price = 0;	//Total prize of sale 
		final double Tax = 0.05;	// Final double Tax
		double totalCost;
		System.out.print("What is your name?");
		String name = scanWords.nextLine();	// Makes a string name 
		
		System.out.println("\nWelcome " + name + " to Danny Computer Shop.");	// This prints out "Welcome and the customer name and the shop
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
		int itemNum = scanNums.nextInt();	// Scans what the customer wants to buy
		
		while (itemNum != 0) {
			
		System.out.println("How many do you want?\n"	// Ask the customer how many they want
				+ "Quantity ");
		
		int qty = scanNums.nextInt();	// Scans how many they want to buy
		
		if(itemNum == 1) {	// Makes a if statement, if they picked a number
			Price = MonitorPrice * qty + Price;	// This will equal the price of the monitor and hpw many they want
		}
		else if(itemNum == 2) {
			Price += KeyboardPrice * qty;
		}
		else if(itemNum == 3) {
			Price += MousePrice * qty;
		}
		else if(itemNum == 4) {
			Price += CPUPrice * qty;
		}
		else if(itemNum == 5) {
			Price += HardDrivePrice * qty;
		}
		else if(itemNum == 6) {
			Price += GraphicCardsPrice * qty;
		}
		else if(itemNum == 7) {
			Price += AirDusterPrice * qty;
		}
		else if(itemNum == 8) {
			Price += ComputerCasesPrice * qty;
		}
		else if(itemNum == 9) {
			Price += LaptopsPrice * qty;
		}
		else if(itemNum == 10) {
			Price += GamingChairsPrice * qty;
		}
		else if(itemNum == 11) {
			Price += HeadsetsPrice * qty;
		}
		else {	// If they picked a different number from 1-11
			System.out.println("Sorry we dont have that.");	//This will be printed out 
		}
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
				} // End while
		
			
		System.out.println("Your total cost is: $" + Price);	// Prints out the total cost
		System.out.println("Tax is: " + Price * Tax);	// Prints out the tax
		double totalPrice = Price * Tax + Price;	// This will be adding the price and the tax
		System.out.println("Total with tax is: " + totalPrice);	// Prints out the total cost with tax
		System.out.println("Thanks for shopping at Danny's Computer Shop, Good Bye!");	// Prints out Goodbye to the customer
		
	}

}
