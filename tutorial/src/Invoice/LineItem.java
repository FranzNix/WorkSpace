package Invoice;

/**
 * 
 * @author FrancisM4
 *
 */
public class LineItem {
	
	private int qty;
	private Product theProduct;
	
	/**
	 * Constructor for LineItem, provides it with default values
	 */
	public LineItem() {
		qty = 0;
	}//end LineItem
	
	/**
	 * Constructor for LineItem, fills variables with parameter values
	 * @param qty - Quantity of product being bought
	 * @param theProduct - Product being bought
	 */
	public LineItem (Product theProduct, int qty) {
		this.qty = qty;
		this.theProduct = theProduct;
	}//ends Constructor
	
	/**
	 * Prints out the amount of the product being bought
	 * @return - value of qty
	 */
	public int getQty() {
		return qty;
	}//end getQty
	
	/**
	 * Prints out the product being bought
	 * @return - product being bought
	 */
	public Product getTheProduct() {
		return theProduct;
	}//end getTheProduct
	
	/**
	 * Prints out product info + how much of it is being bought
	 */
	public String toString() {
		return "Product " + theProduct+ "; Quantity: " + qty;
	}//end toString

}//end LineItem
