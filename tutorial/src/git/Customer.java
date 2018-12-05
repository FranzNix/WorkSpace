package git;
/**
 * 
 * @author FrancisM4
 *
 */
public class Customer {

	private String secretLairLocation;
	private String Name;
	private double evilFunds;
	public double amount;
	
	public Customer() {
		secretLairLocation = " ";
		Name = " ";
		evilFunds = 0;
		amount = 0;
	}
	
	public Customer(String secretLairLocation, String Name, double evilFunds, double amount) {
		this.secretLairLocation = secretLairLocation;
		this.Name = Name;
		this.evilFunds = evilFunds;
	}
	
	public String toString() {
		return "Name: " + Name + " Secret Lair Location: " + secretLairLocation + " Evil Funds: " + evilFunds;
	}
	
	//adds funds to customer’s evilFunds
	public void addFunds(double evilFunds) {
		this.evilFunds = evilFunds + amount;
	}
}
