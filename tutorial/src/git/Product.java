package git;
/**
 * 
 * @author FrancisM4
 *
 */
public class Product {
	
	private String name;
	private double price;
	
	/**
	 * constructor for Product to set default values
	 */
	public Product() {
		name = "null";
		price = 0;
	}//ends Product
	
	/**
	 * constructor to provide variables with values using parameter values
	 * @param name - name of product
	 * @param price - price of product
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}//ends Constructor
	
	/**
	 * prints out the price of the product
	 * @return - value of price
	 */
	public double getPrice() {
		return price;
	}//ends getPrice
	
	/**
	 * prints out product information
	 */
	public String toString() {
		return "Name: " + name + "; Price: $" + price;
	}//ends toString
}//ends Product
