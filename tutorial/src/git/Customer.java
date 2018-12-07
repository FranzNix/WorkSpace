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
	
	public Customer() {
		Name = "null";
		secretLairLocation = "null";
		evilFunds = 0;
	}//ends Custome
	
	public Customer(String secretLairLocation, String Name, double evilFunds) {
		this.secretLairLocation = secretLairLocation;
		this.Name = Name;
		this.evilFunds = evilFunds;
	}//ends Customer(String, String, double)
	
	//adds funds to customer’s evilFunds
	public void addFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}//ends addFunds
	
	public void setEvilFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}//ends setEvilFunds
	
	public double getEvilFunds() {
		return evilFunds;
	}//ends getEvilFunds
	
	public String toString() {
		return "Location: " + secretLairLocation + "; Name: " + Name + "; Funds: $" + evilFunds;
	}
}
