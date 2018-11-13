package tutorialpackage;

public class Yeet9 {
	public static double fahrenheitToCelsius(double temperature) {	//This public static double function fahrenheitToCelsius with a variable "double temperature"
		double fahrenheit = temperature;	//The double defines fahrenheit and it equals to "temperature"
		double celsius = (fahrenheit - 32) * 5/9;	//The double function defines celsius and it equals to "(fahrenheit - 32) * 5/9"
		return celsius;}	//Returns the variable "celsius"
	public static void printTemperature(double temperature) {	//The public static void "printTemperature"and it take the value double temperature
		double fahrenheit = temperature;	//This double fahrenheit equals to temperature
		System.out.println("F: " + fahrenheit);	//This will print out the fahrenheit temperature
		double celsius = fahrenheitToCelsius(fahrenheit);	//This double function defines celsius with a value of "fahrenheitToCelsius(fahrenheit)"
		System.out.println("C: " + celsius);}	//This prints out the "fahrenheitToCelsius(fahrenheit) value
		
	public static void main(String[] args) {	//Runs everything in the code
		printTemperature(60);}	//Prints out the temperature value in fahrenheit and in celsius

}
