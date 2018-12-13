package Invoice;
/**
 * @author FrancisM4
 */
import java.util.ArrayList;
public class Invoice {
	
	private Customer theCustomer;//Variable using Customer method
	private ArrayList<LineItem> item = new ArrayList<>(); //ArrayList to hold the items  being bought and quantity 

	/**
	 * Constructor for customer Invoice
	 * @param theCustomer - the customer for which the invoice is meant for
	 */
	public Invoice(Customer theCustomer) {
		this.theCustomer = theCustomer;//fills theCustomer variable with parameter values 
	}//ends Invoice
	
	/**
	 * Adds a desired product to the customer's order
	 * @param product - product being added to the order
	 * @param qty - amount of the product that customer wants to buy
	 */
	public void addToOrder(Product theProduct , int qty ) {
		item.add(new LineItem(theProduct, qty)); //adds an item to the ArrayList
	}//ends addToOrder
	
	/**
	 * prints out the total price of the customer's order + if they can buy it with their current funds or not
	 */
	public void printInvoice() {
		System.out.println("Products");
		for(int i = 0; i < item.size(); i++) {
			System.out.printf(item.get(i) + " Total: $%.2f", (item.get(i).getTheProduct().getPrice() * item.get(i).getQty()));
			System.out.println("");
		}//end for
		if(amountDue() <= theCustomer.getEvilFunds()) {
			System.out.println("ORDER APPROVED");
		}//end if
		else {
			double funds = theCustomer.getEvilFunds() - amountDue();//calculates the difference in funds
			funds = funds * -1;//converts negative number to positive number
			System.out.printf("You can't afford this order at this time. You are short by: $%.2f", funds);
			System.out.println("");
		}//end else
	}//ends printInvoice
	
	/**
	 * checks if the customer can afford their entire order
	 * @param theCustomer - customer and their order
	 * @return - true if the customer can afford the order, false otherwise
	 */
	public boolean canAfford(Customer theCustomer) {
		if(amountDue() <= theCustomer.getEvilFunds()) {
			return true;
		}//end if
		else {
			return false;
		}//end else
		
	}//end canAfford
	
	/**
	 * calculates the total price of the customer's order
	 * @return - total value of all items in customer's order
	 */
	public double amountDue() {
		double totalPrice = 0;
		for(int i = 0; i < item.size(); i++) {
			totalPrice = totalPrice + item.get(i).getTheProduct().getPrice() * item.get(i).getQty();
		}//end for
		return totalPrice;
		
	}//end amountDue
}//ends Invoice
