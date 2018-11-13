package tutorialpackage;

public class Yeet12 {

	public static int factorial(int n) {	//This is a public static int which has  a variable called "factorial" 
		int b = 1;	//
		int a = 1;	//
		while (a <= n) { //While statement that will continue as long as y is less than or equal to n
			b = b * a;	//
			a = a + 1;	//
		}return b;
	}
	public static void main(String[] args) {
		int number = 5; //Creates a integer variable and contains the value 5
		System.out.println(factorial(number)); //Prints out the value returned by the "factorial" function


	}

}
