package git;
/**
 * 
 * @author FrancisM4
 *
 */
public class LineItem {
	
	private int qty;
	private Product theProduct;
	
	public LineItem() {
		qty = 0;
	}
	
	public LineItem (Product theProduct, int qty) {
		this.qty = qty;
		this.theProduct = theProduct;
	}
	
	public String toString() {
		return "Product " + theProduct+ "; Quantity: " + qty;
	}

}
