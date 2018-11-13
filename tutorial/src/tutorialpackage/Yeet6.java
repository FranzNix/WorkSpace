package tutorialpackage;

public class Yeet6 {
	public static String nameTagText(String x) {	//Public static string named "nameTagText", takes a string value
		return ("Hello my name is " + x);}	//Returns a string, along with the inputed string value
	public static void main(String[] args) {
		String name = ("Francis Mapanao");	//String variable with the value "Francis Mapanao"
		String nameTag = nameTagText(name);	//String variable with the function name "nameTagText" and take a variable "name" as input
		System.out.println(nameTag);	//Prints out the value of the nameTag

	}

}
