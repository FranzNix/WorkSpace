package Invoice;

public class TestInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create 3 additional invoice runs
		// add at least 5 items to invoice order for each invoice run
		// make sure in at least one of the runs the customer can not afford the purchase
				
				//invoice run 1
				Customer c = new Customer("Island", "Dr. Evil", 1230.0);
				Invoice in = new Invoice(c);
				in.addToOrder(new Product("Flame Thower",123.80), 3);
				in.addToOrder(new Product("Sharks", 105.22),2);
				in.addToOrder(new Product("Lasers",50.50),20);
				in.addToOrder(new Product("Island", 1000.20),1);
				in.addToOrder(new Product("Fireworks",5.22),20);
				runInvoice(c,in); //runs invoice				
				//invoice run 2
				Customer c1 = new Customer("Beach", "Dr. Doofenshmirtz", 6000000.00);
				Invoice in1 = new Invoice(c1);
				in1.addToOrder(new Product("Mirror", 232.10), 2);
				in1.addToOrder(new Product("Flashlight", 309.10), 1);
				in1.addToOrder(new Product("Magnifying Glass", 100.10), 4);
				in1.addToOrder(new Product("Time Machine", 30000.10), 1);
				in1.addToOrder(new Product("Tower", 1000000.10), 1);
				System.out.println();
				runInvoice(c1, in1);
				//invoice run 3
				Customer c2 = new Customer("Stark Tower", "Tony Stark", 12400000000.00);
				Invoice in2 = new Invoice(c2);
				in2.addToOrder(new Product("NanoTech", 1000000.00), 10);
				in2.addToOrder(new Product("Vibranium", 100000.00), 20);
				in2.addToOrder(new Product("Thrusters", 1000.00), 30);
				in2.addToOrder(new Product("Arc Reactor", 100000000.00), 1);
				in2.addToOrder(new Product("Paints", 100.00), 5);
				System.out.println();
				runInvoice(c2, in2);
				//invoice run 4
				Customer c3 = new Customer("Wakanda", "T'Challa", 90700000000000.00);
				Invoice in3 = new Invoice(c3);
				in3.addToOrder(new Product("Vibranium", 1000000.00), 10);
				in3.addToOrder(new Product("Sonic Weapons", 1000.00), 5);
				in3.addToOrder(new Product("Vibaranium Spear", 100000.00), 1);
				in3.addToOrder(new Product("Claws", 10000.00), 5);
				in3.addToOrder(new Product("Techs", 100000000.00), 5);
				System.out.println();
				runInvoice(c3, in3);
			}//end main
			
			//do not modify code below
			public static void runInvoice(Customer c, Invoice i) {
				i.printInvoice();

				if(c.getEvilFunds()- i.amountDue() < 0) {
					System.out.println("Evil villian credit union to the rescue!!");	
					c.addFunds(i.amountDue() - c.getEvilFunds());
					System.out.println("New funds total: " + c.getEvilFunds());
					i.printInvoice();
				}
				
			}//end runInvoice

		}//end TestInvoice
