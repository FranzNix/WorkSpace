package git;
/**
 * @author FrancisM4
 */
import java.util.ArrayList;
public class Invoice {
	
	private Customer theCustomer;
	private ArrayList<LineItem> item = new ArrayList<>(); 
	
	public Invoice(Customer theCustomer) {
		this.theCustomer = theCustomer;
	}
	
	//creates a new lineItem and adds the new lineItem to the items ArrayList
	public void addToOrder(Product theProduct , int qty ) {
		item.add(new LineItem(theProduct, qty));
	}//ends addToOrder
	
	//Prints out all LineItems in the items ArrayList.
	//If customer can afford the purchase also print out that order is approved or 
	//else if they can’t afford the order show how much they are short by.
	public void printInvoice() {
		System.out.println("Products");
		for(int i = 0; i < item.size(); i++) {
			System.out.printf(item.get(i) + " Total: $%.2f", (item.get(i).getTheProduct().getPrice() * item.get(i).getQty()));
			System.out.println("");
		}
		if(amountDue() <= theCustomer.getEvilFunds()) {
			System.out.println();
		}
		
	}//ends printInvoice
	
	//Returns true if customer can afford all purchase. 
	public boolean canAfford(Customer theCustomer) {
		return true;
		
	}//end canAfford
	
	//returns the total amount due for this order
	public double amountDue() {
		return amountDue();
		
	}//end amountDue
	
	
	
	

}
