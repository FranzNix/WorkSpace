package tutorialpackage;
import java.util.Random;	 
public class Yeet10 {
	public static int monopolyRoll() {
	Random rand = new Random();
	int num1 = rand.nextInt(7);
	int num2 = rand.nextInt(7);
	int num3;
	int num4;
	if (num1 == num2) {
		return num1 + num2;
	}
	else {
		num3 = rand.nextInt(7);
		num4 = rand.nextInt(7);
	}return num1 + num2 + num3 + num4;	
}
	public static void main(String[] args) {
		System.out.println(monopolyRoll());

	}

}
