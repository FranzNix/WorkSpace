package git;
/**
 * 
 * @author FrancisM4
 *
 */
public class Product {
	
	private String name;
	private double price;
	
	public Product() {
		name = "null";
		price = 0;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void totalPrice(Product theProduct) {
		theProduct.setPrice(price *)
	}
	
	public String toString() {
		return "Name: " + name + "; Price: $" + price;
	}
}
