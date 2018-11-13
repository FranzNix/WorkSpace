package tutorialpackage;

public class Yeet2 {

	public static void main(String[] args) {
		
		boolean isSnowing = false;	// Creates a boolean variable called isSnowing and set its value to false
		boolean isRaining = false;	// Creates a boolean variable called isRaining and set its value to false
		double temperature = 60.0;	// Creates a double variable called temperature and its value to 60.0 
		
		if (isSnowing == true || isRaining == true || temperature < 50.0)	// If statement the checks whether any of the parameter being true.
		{System.out.println("Let's stay home.");}	// Prints out "Let's stay home" if the statement above is true.
		else {System.out.println("Let's go out!");}	// Else statement and prints out "Let's go out!" if its false

	}

}
