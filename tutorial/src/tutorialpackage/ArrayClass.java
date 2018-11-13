package tutorialpackage;
import java.util.Random;
public class ArrayClass {

	public static void main(String[] args) {

		String [] nameArray = {"Francis ", "Tyrone ", "Marc ", "Daneel ", "Miguel ", "Mr. Trump "};
		int [] gradesArray = new int [nameArray.length];
		int avg = 0;
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + "Grade: " + gradesArray[i]);
		}//end for
		Random r = new Random(); //Creates random object
		
		for(int i = 0; i < gradesArray.length; i++) {
			gradesArray[i] = r.nextInt(101); //Random grades entry
			
		}//end for 
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + "Grade: " + gradesArray[i]);
		}//end for
		
		gradesArray[5] = 90; //Update index 5
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println("Name: " + nameArray[i] + "Grade: " + gradesArray[i]);
		}//end for loop
		
		for(int i = 0; i < nameArray.length; i++) {	//Avg
			avg += gradesArray[i];	//Summing grades
		}//end for loop
		avg = avg/gradesArray.length;	//Dividing by total number of grades
		System.out.println("Class Avg: " + avg);
		
	}//end main

}//end class
