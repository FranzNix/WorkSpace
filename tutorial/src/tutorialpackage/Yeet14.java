package tutorialpackage;
import java.util.Random;
public class Yeet14 {
	public static int monopolyRoll() {
		Random rand = new Random();
		int num1 = rand.nextInt(6) + 1; //rand.nextInt creates a random number between a set paramter
		int num2 = rand.nextInt(6) + 1;	//rand.nextInt creates a random number between a set parameter 
		int num3;	//This defines a variable num3
		int num4;	//This defines a variable num4
		int num5;	//This defines a variable num5
		int num6;	//This defines a variable num6
		int numHolder2 = 0;
		int numHolder1 = 0;
		if (num1 == num2) { //If statement that checks if num1 is equal to num2
			num3 = rand.nextInt(6) + 1;
			num4 = rand.nextInt(6) + 1;
		if (num3 == num4) { //If statement that checks if num3 is equal to num4
			num5 = rand.nextInt(6) + 1;
			num6 = rand.nextInt(6) + 1;
		while (num5 == num6) { //While statement that continues to run while the "rolled" values of num5 and num6 are the same
			numHolder1 = numHolder1 + num5;
			numHolder2 = numHolder2 + num6;
			num5 = rand.nextInt(6) + 1;
			num6 = rand.nextInt(6) + 1;}
		return num1 + num2 + num3 + num4 + numHolder1 + numHolder2;
		}else {
			return num1 + num2 + num3 + num4;}
		}else {
			return num1 + num2;}}
	public static void main(String[] args) {

	 	System.out.println(monopolyRoll()); //Prints out the value returned by the "monopolyRoll" function


	}

}
