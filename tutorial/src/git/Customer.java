package git;
/**
 * 
 * @author FrancisM4
 *
 */
public class Customer {
	private String Name;
	private String secretLairLocation;
	private double evilFunds;
	
	public Customer() {
		Name = "null";
		secretLairLocation = "null";
		evilFunds = 0;
	}
	
	public Customer(String Name, String secretLairLocation, double evilFunds) {
		this.Name = Name;
		this.secretLairLocation = secretLairLocation;
		this.evilFunds = evilFunds;
	}
	
	//adds funds to customer’s evilFunds
	public void addFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}
	
	public void setEvilFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}
	
	public double getEvilFunds() {
		return evilFunds;
	}
	
	public String toString() {
		return "Name: " + Name + "; Lair Location: " + secretLairLocation + "; Funds: $" + evilFunds;
	}
}
