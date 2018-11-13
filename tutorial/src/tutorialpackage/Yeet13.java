package tutorialpackage;

public class Yeet13 {
	public static int yearsTilOneMillion(double initialBalance) {
		double percentage = initialBalance / 100 * 5; //Takes the input value and divides and multiplies it so that it contains 5% of its original value
		int years = 0;	//Define a year variable and a value of 0
		while (initialBalance < 1000000) { //While statement that checks if "initialBalance" is less than 1,000,000
			initialBalance = initialBalance * percentage;	//Defines the initialBalance variable and the value initialBalance multiply by percentage
			years = years + 1;	//Defines a variable years and has a value of years + 1
		} return years;}	//This returns the value of "years"
	public static void main(String[] args) {	//This helps run the code
		double balanceInitial = 50.00; //Double variable with the value 50.00
		System.out.println(yearsTilOneMillion(balanceInitial)); //Prints out the value returned by the "yearsTilOneMillion" function

	}

}
