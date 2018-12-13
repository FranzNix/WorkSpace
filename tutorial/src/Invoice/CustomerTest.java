package Invoice;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer theCustomer = new Customer();
		System.out.println(theCustomer.toString());
		Customer theCustomer1 = new Customer("Basement", "Joseph", 56);
		System.out.println(theCustomer1.toString());
		
		System.out.println();
		
		Product theProduct = new Product();
		System.out.println(theProduct.toString());
		Product theProduct1 = new Product("Laser", 60);
		System.out.println(theProduct1.toString());
		Product theProduct2 = new Product("Gun", 50);
		System.out.println(theProduct2.toString());
		
		System.out.println();
		
		LineItem Item = new LineItem();
		System.out.println(Item.toString());
		LineItem Item2 = new LineItem(new Product("Vegetables", 30), 3);
		System.out.println(Item2.toString());

	}

}
