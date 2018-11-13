package tutorialpackage;

public class Yeet8 {
	public static double farenheitToCelsius(double temperature) {
		double fahrenheit = temperature;
		double celsius = (fahrenheit - 32) * 5/9;
		return celsius;
	}
	public static void printTemperature(double temperature) {
		double fahrenheit = temperature;
		System.out.println("F: " + fahrenheit);
		double celsius = fahrenheitToCelsius(fahrenheit);
		System.out.println("C: " + celsius);
	}
	public static void main (String[] args) {
		printTemperature(60);
	}
		
		

	}


