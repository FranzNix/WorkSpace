package Invoice;
/**
 * 
 * @author FrancisM4
 *
 */
public class Customer {
	private String secretLairLocation;
	private String Name;
	private double evilFunds;
	
	/**
	 * Constructor for a customer
	 */
	public Customer() {
		Name = "null";
		secretLairLocation = "null";
		evilFunds = 0;
	}//ends Customer
	
	/**
	 * Constructor for customer
	 * @param evilLairLocation - lair location of customer
	 * @param name - name of customer
	 * @param evilFunds - amount of money customer has
	 */
	public Customer(String secretLairLocation, String Name, double evilFunds) {
		this.secretLairLocation = secretLairLocation;
		this.Name = Name;
		this.evilFunds = evilFunds;
	}//ends Customer(String, String, double)
	
	/**
	 * adds funds to evilFunds
	 * @param amt - amount being added to evilFunds
	 */
	public void addFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}//ends addFunds
	
	public void setEvilFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}//ends setEvilFunds
	
	/**
	 * shows the amount of money the customer has
	 * @return - value of evilFunds
	 */
	public double getEvilFunds() {
		return evilFunds;
	}//ends getEvilFunds
	
	/**
	 * prints out the customer's information
	 */
	public String toString() {
		return "Location: " + secretLairLocation + "; Name: " + Name + "; Funds: $" + evilFunds;
	}//ends toString 
}//ends Customer
